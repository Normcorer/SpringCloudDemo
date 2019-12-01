# SpringCloudDemo  2019-12-1

SpringCloud Config+SpringCloud Feign+Hystrix熔断机制+Layui的一个简单商品溯源系统（微服务集群）

#配置中心和文件地址

https://gitee.com/hizyj/configdemo.git

#配置中心搭建教程

https://app.yinxiang.com/shard/s37/nl/26049350/d7bbd25e-913a-495c-a1af-7df350830ec3

#Feign搭建教程

https://app.yinxiang.com/shard/s37/nl/26049350/2e92c1a3-9a79-4172-9ddc-30323d7640a0

#SpringBoot解决跨域请求

https://app.yinxiang.com/shard/s37/nl/26049350/2f94c443-5485-4fbe-8587-005df38f187e

#项目文件

clouddemo 静态资源layui
common pojo
product 商品服务
search 溯源查询服务
EurekaServer 注册中心
ConfigServer 配置中心

#项目运行流程

创建数据库，导入sql文件
配置配置中心的yml文件
依次打开服务

#项目概述

项目融合了配置中心文件，来配置微服务集群，配置了Config客户端的动态刷新，Feign中的ribbon实现了微服务集群的负载均衡调用，Feign中的熔断机制来防止微服务雪崩的现象发生，通过设置Feign中熔断的超时时间来提高客户体验。待完善 消息总线，zuul，Nginx等
