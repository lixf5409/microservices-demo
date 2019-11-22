#microservices-demo
##工程结构
* eureka-server 服务注册中心
* gateway-service 网关服务
* service-dept 部门服务
* service-user 用户服务

##数据库脚本
    service-dept/src/main/etc
    service-user/src/main/etc

##启动顺序
    1、eureka-server
    2、gateway-service
    3、service-dept
    4、service-user
    eureka-server必须最先启动，其他三个顺序没有强制要求，但要保证被请求的时候，三个服务均已启动。

##配置说明
    eureka-server的端口默认为8761，由于其他服务均会调用eureka-server，所以不建议修改端口，如需修改请记得将其他三个服务的eureka配置地址同时修改。
    `eureka:
      client:
        service-url:
          defaultZone: http://localhost:8761/eureka/`
          
##API文档访问地址
    http://ip + gateway-port/swagger-ui.html
    可以通过右上角下拉框切换服务
      