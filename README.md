![](https://i.imgur.com/0D5106S.png)



# OpenOSRS injected RuneLite for AlterRSPS

[![Build Status](https://github.com/open-osrs/runelite/workflows/OpenOSRS%20-%20CI%20(push)/badge.svg)](https://github.com/open-osrs/runelite/actions?query=workflow%3A%22OpenOSRS+-+CI+%28push%29%22)
[![HitCount](http://hits.dwyl.com/open-osrs/runelite.svg?style=flat)](http://hits.dwyl.com/open-osrs/runelite)

[OpenOSRS](https://openosrs.com) is a fully open-source client with no restrictions. We are not affiliated with Jagex or RuneLite.  
  
This is a special branch that uses the upstream client (RuneLite) with the OpenOSRS injector. (bundled)  

From the root module, run the following gradle tasks:  
```clean build run```
  
This branch is still in bringup but most functionality works as intended.  
This branch uses upstreams PlayerManager/OverlayManager etc so keep that in mind if porting a plugin.  
  
Contributions are welcome, but there should be no changes made to runelite-client unless necessary/minor. Mould the api around the client.

## How to setup
* First clone this repository
* Open it in Intellij (Or what ever IDE you have)
  * Make sure to use JDK 11
* Wait for it to fully load
* You should see Gradle button on your right side by default open that tab
* Expand OpenOSRS -> Tasks -> openosrs -> (Right click) on run -> and choose modify run configuration
* Inside Run textarea copy and paste: `run --args="--developer-mode --debug --jav_config "https://raw.githubusercontent.com/AlterRSPS/Runelite/master/jav_config.ws"" -x checkStyleMain -x checkStyleTest -x test`
* Apply and Done now couple times press on that run task in gradle tab
* When the client fully loads you should see: `You have to change the Key(Modulus) to RSPS that you wish to connect. After it loads and you changed the Key just re-enable the Private Server plugin.`
* Click ok and go to plugins menu search for Private Server click the settings icon enter your RSA Key that you received from your server when doing install process.
  * In case you lost the RSA Key: Just do install task in your server to gain new RSA Key.
* Disable and Enable the private server plugin and done you can login.


* Side note: make sure your server is running. Otherwise, the clients screen will be black.

## Discord  

[![Discord](https://img.shields.io/discord/373382904769675265.svg)](https://discord.gg/openosrs)

## Project Layout  

- [cache](cache/src/main/java/net/runelite/cache) - Libraries used for reading/writing cache files, as well as the data in it
- [deobfuscator](deobfuscator/src/main/java/net/runelite/deob) - Can decompile and cleanup gamepacks as well as map updates to newer revs
- [http-api](http-api/src/main/java/net/runelite/http/api) - API for runelite and OpenOSRS
- [injector](injector/src/main/java/com/openosrs/injector) - Bytecode weaver that allows us to add code to the obfuscated gamepack
- [runelite-api](runelite-api/src/main/java/net/runelite/api) - RuneLite API, interfaces for accessing the client
- [runelite-mixins](runelite-mixins/src/main/java/net/runelite) - Classes containing the Objects to be injected using the injector-plugin
- [runescape-api](runescape-api/src/main/java/net/runelite) - Mappings correspond to these interfaces, runelite-api is a subset of this
- [runelite-client](runelite-client/src/main/java/net/runelite/client) - Game client with plugins
- [wiki-scraper](wiki-scraper/src/main/java/net/runelite/data) - Scrapes the runescape wiki https://oldschool.runescape.wiki for the latest npc data

## Building  

We have migrated the project to Gradle. Information on how to setup and build the project can be found at https://github.com/open-osrs/runelite/wiki/Building-with-IntelliJ-IDEA

## Install from Pre-built Binaries 

Installers for Windows, Mac and Linux can be found at https://github.com/open-osrs/launcher/releases

## License  

OpenOSRS is licensed under the BSD 2-clause license. See the license header in the respective file to be sure.

## Contribute and Develop  

We've set up a separate document for our [contribution guidelines](https://github.com/open-osrs/runelite/blob/master/.github/CONTRIBUTING.md).

## Supported By  

OpenOSRS uses profiling tools provided by [YourKit](https://www.yourkit.com/)

Thanks [JetBrains](https://www.jetbrains.com/idea/download/) for providing our developers with IntelliJ IDEA Ultimate Edition.

## Wiki

Check out the [OpenOSRS wiki to learn more](https://github.com/open-osrs/runelite/wiki)
