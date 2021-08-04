# caramelServerPingEditor

[![License](https://img.shields.io/github/license/LemonCaramel/caramelServerPingEditor)](https://github.com/LemonCaramel/caramelServerPingEditor/blob/master/LICENSE)
[![Latest Release](https://img.shields.io/github/v/release/LemonCaramel/caramelServerPingEditor)](https://caramel.moe/)
[![GitHub issues](https://img.shields.io/github/issues/LemonCaramel/caramelServerPingEditor)](https://github.com/LemonCaramel/caramelServerPingEditor/issues)
[![CodeFactor](https://www.codefactor.io/repository/github/lemoncaramel/caramelserverpingeditor/badge/master)](https://www.codefactor.io/repository/github/lemoncaramel/caramelserverpingeditor/overview/master)
[![Discord](https://img.shields.io/badge/caramel.moe-%20discord-blue.svg)](https://discord.gg/f9qGtYF)

*다른 언어로 읽기: [English](README.md), [한국어](README.ko.md).*

--------

소개
--------
- 이 플러그인은 서버 리스트 핑을 쉽게 수정할 수 있도록 도와줍니다.


명령어 & 권한
--------
- `/caramelserverpingeditor` (`/cspe`, `/spe`)
    - 권한: `caramel.spe`
    - config를 다시 불러옵니다.


Config
--------
```yaml
# 클라이언트에 표시 될 온라인 플레이어 목록
sample-player-list:
  - '&bHello, World! %max_player%'
  - ''
  - '샘플 리스트!'
  - ''
  - '변경 해주세요!'

# 이 옵션을 활성화 할 경우 플레이어 목록과 플레이어 수가 표시되지 않습니다.
hide-players: false

# 최대 플레이어 수를 변경합니다. (-1일 경우 비활성화)
max-players: -1
# 현재 플레이어 수를 변경합니다. (-1일 경우 비활성화)
current-players: -1

# 클라이언트에 표시 될 서버 버전의 이름입니다. (null일 경우 비활성화)

# server-version-name: "Test 1.16.5" 
# 예시) 위와 같이 설정 할 경우 버전이 맞지 않는 클라이언트 또는
# 서버 추천 페이지에서 "Test 1.16.5"로 표시됩니다.
server-version-name: null

# 경고!!!
# 서버 프로토콜 버전이 무엇인지 모른다면, 수정하지 마세요! (-1일 경우 비활성화)
server-protocol-version: -1
```
- sample-player-list에서 "%max_player%" 및 "%current_player%" 플레이스 홀더를 사용할 수 있습니다.



라이선스
--------
- MIT License를 사용하며, 자세한 사항은 [LICENSE](https://github.com/LemonCaramel/caramelProtocolAPI/blob/master/LICENSE) 를 참조해주세요.