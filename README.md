# KigPaper ![CI Status](https://github.com/ProjectKig/KigPaper/actions/workflows/docker.yml/badge.svg)
KigPaper is a fork of 1.8.8 [Paper](https://github.com/PaperMC/Paper) focused on improving stability, fixing bugs, and increasing security.

## Production-readiness
KigPaper aims to be a stable, yet performant, server software. It fixes many vanilla and CraftBukkit inconsistencies, though any patches that alter vanilla
gameplay are made configurable.

No guarantees are made regarding plugin compatibility. For the best experience, consider modeling your server stack
around KigPaper.

KigPaper is currently being used in a production environment on [KIG Network](https://playkig.com).

## Building
After cloning the project, run
```shell
./build.sh
```
to generate the server JAR.  
Once it's done, you'll have a `paper.jar` file in the project directory.

### Running benchmarks
To run benchmarks, first build the server normally, then run these commands:
```shell
# Run these two commands sequentially, not together
mvn compile -P benchmarks
mvn package -P benchmarks

java -jar Benchmarks/target/paper-benchmarks.jar
```

## License
We do not own the original Minecraft server code, and we're not affiliated with Microsoft or Mojang.  
All patches (including the ones from the original Spigot and Paper) are licensed under the [GPLv3](https://www.gnu.org/licenses/gpl-3.0.html).

## Special Thanks
This project includes some patches from:
+ [SportPaper](https://github.com/Electroid/SportPaper)
+ [FlamePaper](https://github.com/2lstudios-mc/FlamePaper)