# caramelServerPingEditor

[![License](https://img.shields.io/github/license/LemonCaramel/caramelServerPingEditor)](https://github.com/LemonCaramel/caramelServerPingEditor/blob/master/LICENSE)
[![Latest Release](https://img.shields.io/github/v/release/LemonCaramel/caramelServerPingEditor)](https://caramel.moe/)
[![GitHub issues](https://img.shields.io/github/issues/LemonCaramel/caramelServerPingEditor)](https://github.com/LemonCaramel/caramelServerPingEditor/issues)
[![CodeFactor](https://www.codefactor.io/repository/github/lemoncaramel/caramelserverpingeditor/badge/master)](https://www.codefactor.io/repository/github/lemoncaramel/caramelserverpingeditor/overview/master)
[![Discord](https://img.shields.io/badge/caramel.moe-%20discord-blue.svg)](https://discord.gg/f9qGtYF)

*Read this in other languages: [English](README.md), [한국어](README.ko.md).*

--------

Introduction
--------
- This plugin helps you easily modify server list pings.


Command & Permission
--------
- `/caramelserverpingeditor` (`/cspe`, `/spe`)
    - Permission: `caramel.spe`
    - Reload Config.


Config
--------
```yaml
# This will be displayed as online players on the client.
sample-player-list:
  - '&bHello, World! %max_player%'
  - ''
  - 'Sample List!'
  - ''
  - 'Change Me!'

# When this option is enabled, the player list and player count are invisible.
hide-players: false

# This is the maximum number of players. (-1, disable)
max-players: -1
# This is the current player count. (-1, disable)
current-players: -1

# This is the version name of the server that will be displayed on the client. (null, disable)
server-version-name: null

# WARNING!!!
# If you don't know what it is, don't touch this. (-1, disable)
server-protocol-version: -1
```
- Placeholder "%max_player%" and "%current_player%" are available in the sample-player-list.


License
--------
- MIT License, see [LICENSE](https://github.com/LemonCaramel/caramelProtocolAPI/blob/master/LICENSE) for more details.