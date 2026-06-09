🔍  **ESP** - WallHack для Minecraft 1.21.11

🎮 Возможности

- Подсветка всех игроков 
- Работает через стены и препятствия
- Включение/выключение на клавишу **Z**
- Никакого интерфейса 
- Не показывается в настройках управления
- Скрытность - не создает лишних файлов
- Успешность прохождения проверки на читы ≈90% *
- Маскируется под безобидную библиотеку FabricC++

* - Вы должны изменить fabric_mod.json в name:
ESP -> FabricLanguageCpp

⚙️ Требования

| Компонент | Версия | Ссылка |
|-----------|--------|--------|
| Minecraft | 1.21.11 | — |
| Fabric Loader | 0.16.7+ | [fabricmc.net](https://fabricmc.net/use/) |
| Fabric API | 0.141.4+ для 1.21.11 | [modrinth.com](https://modrinth.com/mod/fabric-api) |
| Java | 21+ | [oracle.com](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html) |

📥 Установка

1. Установи Fabric Loader
2. Скачай [Fabric API](https://modrinth.com/mod/fabric-api/versions) и положи в папку `mods`
3. Скачай ESP из [Releases](https://github.com/0as01ds/fabric-language-cpp/releases) и положи в папку `mods`
4. Запускай игру

🕹️ Управление

| Клавиша |        Действие          |
|  **Z**  | Включить / выключить ESP |

🔧 Сборка из исходников

```bash
( скачиваем сурсы )
cd fabric-language-cpp
./gradlew build

```

Включение / выключение работает через раз из-за того, что я только начал разбираться в программирование на JAVA.

⚠️ Дисклеймер

Мод создан в образовательных целях. Использование на серверах может нарушать их правила. Автор не несёт ответственности.
