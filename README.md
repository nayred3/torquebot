# TorqueBot

Discord bot for Torque

## Build

*Uses Maven, this must be installed*\
On MacOS you can use Homebrew to install it:

```sh
brew install maven
```

To build to a .jar run

```sh
mvn package
```

The .jar will be generated under `target`. It can be run like

```sh
# java -jar target/<name>.jar
java -jar target/torquebot-0.1.0.jar
```

To clean the targets directory run

```sh
mvn clean
```

To install dependencies in advance, run

```sh
mvn install
```

*All of these shell commands have VSCode options*
You can find them in the command pallet using: ctrl/command + shift + p: Maven: Execute Commands: command you want.
