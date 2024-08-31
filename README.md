


## 一、项目简介

PmHub 包括认证、流程、项目管理、用户、网关等服务。包含了 Redis 缓存、RocketMQ 消息队列、Docker 容器化、Jenkins 自动化部署、Spring Security 安全框架、Nacos 服务注册和发现、Sentinel 熔断限流、Seata 分布式事务、Spring Boot Actuator 服务监控、SkyWalking 链路追踪、OpenFeign 服务调用，Vue3 前端框架等互联网开发中需要用到的主流技术栈，可以帮助同学们快速掌握微服务/分布式项目的核心知识点。

并且同时 PmHub 也是一套企业工作流的开发框架，您可以根据自身需求，快速定制出适合自己公司的企业工作流系统。



>如果对开源项目感兴趣，可以关注来个 offer 的另外一个实战项目：技术派，一个前后端分离的社区项目。[GitHub](https://github.com/itwanger/paicoding) 上已经星标 1.5k+，不少同学就是靠这个项目在往年的校招中拿到了不错的 offer。


为了方便大家循序渐进式的学习，我们已经推出两个版本：

- 单体架构版本：适合初学者，直接运行 pmhub-boot 模块下的 pmhub-admin 中的 PmhubApplication 类即可。
- 微服务架构版本：适合有一定基础，想进阶学习微服务/分布式的同学，可以分别启动网关、认证、流程、项目管理、代码生成等多个服务。

可以根据自己的实际情况选择合适的版本进行学习，我们将会倾其所有，在第一时间帮助大家解决所有学习过程遇到的问题，让你的学习曲线变得非常丝滑😁。

* 项目文档教程：https://laigeoffer.cn/
* 在线体验地址：https://pmhub.laigeoffer.cn/

![pmhub-业务架构图](https://cdn.tobebetterjavaer.com/stutymore/laigeoffer-pmhub-%E4%B8%9A%E5%8A%A1%E5%A4%A7%E5%9B%BE.png)

此为 PmHub 微服务版本说明文档！单体版本说明文档请移步：[单体版本说明](https://github.com/laigeoffer/pmhub/blob/master/pmhub-boot/README.md)



### 3.4、代码结构

```
com.laigeoffer.pmhub     
├── pmhub-ui              // 前端框架 [1024]
├── pmhub-gateway         // 网关模块 [6880]
├── pmhub-auth            // 认证中心 [6800]
├── pmhub-api             // 接口模块
│       └── pmhub-api-system                          // 系统接口
│       └── pmhub-api-workflow                        // 流程接口
├── pmhub-base          // 通用模块
│       └── pmhub-base-core                           // 核心模块组件
│       └── pmhub-base-datasource                     // 多数据源组件
│       └── pmhub-base-seata                          // 分布式事务组件
│       └── pmhub-base-security                       // 安全模块组件
│       └── pmhub-base-swagger                        // 系统接口组件
│       └── pmhub-base-notice                         // 消息组件组件
├── pmhub-modules         // 业务模块
│       └── pmhub-system                              // 系统模块 [6801]
│       └── pmhub-gen                                 // 代码生成 [6802]
│       └── pmhub-job                                 // 定时任务 [6803]
│       └── pmhub-project                             // 项目服务 [6806]
│       └── pmhub-workflow                            // 流程服务 [6808]
├── pmhub-monitor             						  // 监控中心 [6888]                 
├──pom.xml                                            // 公共依赖
```


### 4.2、后端项目启动

#### 第一步，下载项目源码

①、使用 Git 命令

网络比较通畅的小伙伴可以直接从 GitHub 上拉取，命令如下：

```
git clone git@github.com:laigeoffer/pmhub.git
```

国内的小伙伴也可以直接使用码云 Gitee 上的镜像仓库地址拉取：

```
git clone https://gitee.com/laigeoffer/pmhub.git
```

②、直接下载压缩包

也可以直接下载 GitHub 上的压缩包，然后解压到本地。

- GitHub 地址：[https://github.com/laigeoffer/pmhub](https://github.com/laigeoffer/pmhub)
- 码云地址：[https://gitee.com/laigeoffer/pmhub](https://gitee.com/laigeoffer/pmhub)

![下载项目源码压缩包](https://cdn.tobebetterjavaer.com/images/20240324/76023993f091417a800ec7da19989e88.png)

③、直接通过 GitHub 桌面版

我个人一直比较喜欢实用 GitHub 桌面版来管理仓库，图形化界面操作起来也比较舒服。

![](https://cdn.tobebetterjavaer.com/images/20240324/27136b6558d84edb861461ca5452021d.png)

#### 第二步，使用 Intellij IDEA 导入项目

这一步应该就不需要我多讲了，相信大家都能搞定。

![](https://cdn.tobebetterjavaer.com/stutymore/20240601234905.png)
#### 第三步，导入数据库

推荐大家使用 [Navicat](https://javabetter.cn/nice-article/itmind/navicatmacyjpx.html) 这款图形化数据库管理工具。


数据库文件路径在 pmhub/sql/,在Navicat中导入所有数据库文件（每一个微服务对应一个数据库）

![](https://cdn.tobebetterjavaer.com/stutymore/20240629223138.png)

可以直接右键在 terminal 终端中打开，然后通过 pwd 和 ls 命令查看文件的绝对路径。

![](https://cdn.tobebetterjavaer.com/images/20240324/24f0cbafe1fb4995827015c294196eb2.png)

拿到绝对路径后，就可以在 Navicat 中导入数据库文件了。

![](https://cdn.tobebetterjavaer.com/images/20240324/aa4cb8f705aa4f46a7d4835c9d26a596.png)

导入完成后，刷新一下就可以看到最新的数据库表了。
（当然你也可以直接复制sql，然后在Navicat执行）

#### 第四步，基础环境准备
* 1、启动 MySQL（必须）

可以选择本机直接安装 MySQL，也可以通过 Docker 的方式，但需要做好磁盘挂载，推荐本机安装！


* 2、启动 Redis（必须）

①、如果你是 macOS 用户，可以直接在终端输入`redis-server`启动 Redis。

![](https://cdn.tobebetterjavaer.com/images/README/1711692102829.png)

②、如果你是 Windows 用户，可以直接双击 redis-server.exe 启动 Redis。

③、当然也可以直接通过 Docker 启动 Redis。
```shell
# 拉取 Redis 镜像:
docker pull redis
# 启动 Redis 容器:
docker run --name my-redis -d redis
```

* 3、启动 Nacos（必须）

[官网](https://nacos.io/download/nacos-server/)下载 Nacos，找到 /conf/application.properties 文件，修改数据库连接信息。可以直接复制 pmhub/docker/nacos/conf/application.properties 内容。

修改下数据库配置信息为你自己的数据库，本地启动可以把鉴权关了。

```
1. 如果数据库名也是 pmhub-nacos，那么只需要修改用户名和密码即可。
2. 如果用户名也是 root，那么只需要修改密码即可。
3. 如果密码也一样，那么就不需要修改了（不可能，绝对不可能这么巧😂）。
```

![修改nacos配置文件](https://cdn.tobebetterjavaer.com/stutymore/20240529173446.png)

①、如果你是 macOS 用户，可以直接在终端输入`sh startup.sh -m standalone`启动 Nacos。

②、如果你是 Windows 用户，可以直接双击 startup.cmd 启动 Nacos。

启动成功后访问 http://localhost:8848/nacos 即可看到 Nacos 控制台。默认用户名密码都是 nacos。

![nacos启动成功界面](https://cdn.tobebetterjavaer.com/stutymore/20240529173621.png)

* 4、启动 SkyWalking 分布式链路追踪（非必须）

参考手册：[SkyWalking 启动手册](https://laigeoffer.cn/pmhub/interview/skywalking/)

* 5、启动 Sentinel 分布式熔断和降级（非必须）

参考手册：[Sentinel 启动手册](https://laigeoffer.cn/pmhub/interview/feign-sentinel/)


* 6、启动 Seata 分布式事务（非必须）

参考手册：[Seata 启动手册](https://laigeoffer.cn/pmhub/interview/seata/)

* 7、启动 Rocketmq 消息队列（非必须）

参考手册：[Rocketmq 启动手册](https://laigeoffer.cn/pmhub/interview/rocketmq/)



#### 第五步，启动各个微服务

> 注意：如果遇到服务启动失败，可自行查看 nacos 配置是否做了修改，如数据库连接信息等。

①、启动 pmhub-gateway 网关服务

找到 pmhub-gateway 项目，右键 Run PmHubGatewayApplication.main()。

![pmhub-gateway启动成功](https://cdn.tobebetterjavaer.com/stutymore/20240529174025.png)

②、启动 pmhub-auth 认证服务

找到 pmhub-auth 项目，右键 Run PmHubAuthApplication.main()。

③、启动 pmhub-system 系统服务

找到 pmhub-system 项目（在pmhub-modules 下），右键 Run PmHubSystemApplication.main()。
pmhub-system 启动前需要修改 nacos 中的 pmhub-system-dev.yml 配置文件，修改数据库连接信息为你自己的数据库。


![修改pmhub-system配置](https://cdn.tobebetterjavaer.com/stutymore/img.png)

④、启动 pmhub-project 项目管理服务

找到 pmhub-project 项目（在pmhub-modules 下），右键 Run PmHubProjectApplication.main()。

启动前需要修改 nacos 中的 pmhub-project-dev.yml 配置文件，修改数据库连接信息为你自己的数据库。

⑤、启动 pmhub-workflow 流程管理服务

找到 pmhub-workflow 项目（在pmhub-modules 下），右键 Run PmHubWorkflowApplication.main()。

启动前需要修改 nacos 中的 pmhub-workflow-dev.yml 配置文件，修改数据库连接信息为你自己的数据库。

⑥、启动 pmhub-gen 代码生成服务

找到 pmhub-gen 项目（在pmhub-modules 下），右键 Run PmHubGenApplication.main()。

启动前需要修改 nacos 中的 pmhub-gen-dev.yml 配置文件，修改数据库连接信息为你自己的数据库。

⑦、启动 pmhub-job 定时任务调度服务

找到 pmhub-job 项目（在pmhub-modules 下），右键 Run PmHubJobApplication.main()。

启动前需要修改 nacos 中的 pmhub-job-dev.yml 配置文件，修改数据库连接信息为你自己的数据库。

⑧、启动 pmhub-monitor 监控服务

找到 pmhub-monitor 项目，右键 Run PmHubMonitorApplication.main()。

启动前需要修改 nacos 中的 pmhub-monitor-dev.yml 配置文件，修改监控后台的用户名和密码，以及首页展示标题。

启动成功后可访问：http://localhost:6888/wallboard

可以在线实时查案各个服务的状态以及日志：

![主界面](https://cdn.tobebetterjavaer.com/stutymore/image.webp)




### 4.3、前端项目启动

请参考 pmhub-ui 项目的 README.md 文档，[前端工程结构说明](pmhub-ui/README.md)

> 注意：微服务版本直接启动 pmhub-ui 即可，如果是单体版本的前端需要到 pmhub-boot下的 pmhub-ui 启动。

### 4.4、Swagger 地址

http://localhost:1024/dev-api/swagger-ui/index.html

### 4.5、服务器部署（Docker 方式）

请参考 [云容器部署系统](https://laigeoffer.cn/pmhub/quickstart/docker/)


### 开发工具

|        工具        | 说明           | 官网                                                                                                                       | 
|:----------------:|--------------|--------------------------------------------------------------------------------------------------------------------------|
|       IDEA       | java开发工具     | [https://www.jetbrains.com](https://www.jetbrains.com)                                                                   |
|   visualstudio   | web开发工具      | [https://code.visualstudio.com/](https://code.visualstudio.com/)                                                         |
|      Chrome      | 浏览器          | [https://www.google.com/intl/zh-CN/chrome](https://www.google.com/intl/zh-CN/chrome)                                     |
|   ScreenToGif    | gif录屏        | [https://www.screentogif.com](https://www.screentogif.com)                                                               |
|     SniPaste     | 截图           | [https://www.snipaste.com](https://www.snipaste.com)                                                                     |
|     PicPick      | 图片处理工具       | [https://picpick.app](https://picpick.app)                                                                               |
|     MarkText     | markdown编辑器  | [https://github.com/marktext/marktext](https://github.com/marktext/marktext)                                             |
|       curl       | http终端请求     | [https://curl.se](https://curl.se)                                                                                       |
|     Postman      | API接口调试      | [https://www.postman.com](https://www.postman.com)                                                                       |
|     draw.io      | 流程图、架构图绘制    | [https://www.diagrams.net/](https://www.diagrams.net/)                                                                   |
|      Axure       | 原型图设计工具      | [https://www.axure.com](https://www.axure.com)                                                                           |
|     navicat      | 数据库连接工具      | [https://www.navicat.com](https://www.navicat.com)                                                                       |
|     DBeaver      | 免费开源的数据库连接工具 | [https://dbeaver.io](https://dbeaver.io)                                                                                 |
|      iTerm2      | mac终端        | [https://iterm2.com](https://iterm2.com)                                                                                 |
| windows terminal | win终端        | [https://learn.microsoft.com/en-us/windows/terminal/install](https://learn.microsoft.com/en-us/windows/terminal/install) |
|   SwitchHosts    | host管理       | [https://github.com/oldj/SwitchHosts/releases](https://github.com/oldj/SwitchHosts/releases)                             |


### 开发环境

|      工具       | 版本        | 下载                                                                                                                     |
|:-------------:|:----------|------------------------------------------------------------------------------------------------------------------------|
|      jdk      | 1.8+      | [https://www.oracle.com/java/technologies/downloads/#java8](https://www.oracle.com/java/technologies/downloads/#java8) |
|     maven     | 3.4+      | [https://maven.apache.org/](https://maven.apache.org/)                                                                 |
|     mysql     | 5.7+/8.0+ | [https://www.mysql.com/downloads/](https://www.mysql.com/downloads/)                                                   |
|     redis     | 5.0+      | [https://redis.io/download/](https://redis.io/download/)                                                               |
| elasticsearch | 8.0.0+    | [https://www.elastic.co/cn/downloads/elasticsearch](https://www.elastic.co/cn/downloads/elasticsearch)                 |
|     nginx     | 1.10+     | [https://nginx.org/en/download.html](https://nginx.org/en/download.html)                                               |
|   rocketmq    | 5.0.4+    | [https://www.rabbitmq.com/news.html](https://www.rabbitmq.com/news.html)                                               |
|    ali-oss    | 3.15.1    | [https://help.aliyun.com/document_detail/31946.html](https://help.aliyun.com/document_detail/31946.html)               |
|      git      | 2.34.1    | [http://github.com/](http://github.com/)                                                                               |
|    docker     | 4.10.0+   | [https://docs.docker.com/desktop/](https://docs.docker.com/desktop/)                                                   |
|    freessl    | https证书   | [https://freessl.cn/](https://freessl.cn/)                                                                             |

### 搭建步骤

#### 本地部署教程

> [本地开发环境手把手教程](https://laigeoffer.cn/pmhub/quickstart/environment/)

### 云服务器部署教程

> [环境搭建 & 基于源码的部署教程](docs/安装环境.md)

> [服务器docker启动教程](https://laigeoffer.cn/pmhub/quickstart/docker/)

## 八、内置功能
> 内置功能我们使用了若依的框架，为什么要用若依，一来我们觉得基础的后台功能没有必要再重复造轮子，我们需要节省时间花力气在项目核心业务上，二来我们希望站在巨人的肩膀上，若依是后台系统中很优秀的框架，我们基于其做的二次开发，相信也能再创辉煌！

1.  用户管理：用户是系统操作者，该功能主要完成系统用户配置。
2.  部门管理：配置系统组织机构（公司、部门、小组），树结构展现支持数据权限。
3.  岗位管理：配置系统用户所属担任职务。
4.  菜单管理：配置系统菜单，操作权限，按钮权限标识等。
5.  角色管理：角色菜单权限分配、设置角色按机构进行数据范围权限划分。
6.  字典管理：对系统中经常使用的一些较为固定的数据进行维护。
7.  参数管理：对系统动态配置常用参数。
8.  通知公告：系统通知公告信息发布维护。
9.  操作日志：系统正常操作日志记录和查询；系统异常信息日志记录和查询。
10. 登录日志：系统登录日志记录查询包含登录异常。
11. 在线用户：当前系统中活跃用户状态监控。
12. 定时任务：在线（添加、修改、删除)任务调度包含执行结果日志。
13. 代码生成：前后端代码的生成（java、html、xml、sql）支持CRUD下载 。
14. 系统接口：根据业务代码自动生成相关的api接口文档。
15. 服务监控：监视当前系统CPU、内存、磁盘、堆栈等相关信息。
16. 缓存监控：对系统的缓存信息查询，命令统计等。
17. 在线构建器：拖动表单元素生成相应的HTML代码。
18. 连接池监视：监视当前系统数据库连接池状态，可进行分析SQL找出系统性能瓶颈。



