# mos-parent

## 注意

### 1、注册中心高可用
    ①同机器,在hosts中增加IP1、IP2指向IP地址，例如127.0.0.1 master salve
    ②两个项目的spring.application.name必须相同，eureka.instance.hostname必须不同，否则都会失败