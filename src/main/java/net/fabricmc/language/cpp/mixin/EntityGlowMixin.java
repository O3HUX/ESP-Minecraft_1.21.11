package net.fabricmc.language.cpp.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public class EntityGlowMixin {
    @Unique
    private static boolean espOn = true;

    @Inject(method = "isGlowing", at = @At("RETURN"), cancellable = true)
    private void onIsGlowing(CallbackInfoReturnable<Boolean> cir) {
        if (!espOn) return;
        Entity self = (Entity) (Object) this;
        if (self instanceof PlayerEntity) {
            MinecraftClient client = MinecraftClient.getInstance();
            if (client.player != null && client.player != self) {
                cir.setReturnValue(true);
            }
        }
    }

    @Inject(method = "tick", at = @At("HEAD"))
    private void onTick(CallbackInfo ci) {
        Entity self = (Entity) (Object) this;
        if (!(self instanceof ClientPlayerEntity)) return;
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.player == null) return;
        long handle = client.getWindow().getHandle();
        if (GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_Z) == GLFW.GLFW_PRESS) {
            espOn = !espOn;
        }
    }
}