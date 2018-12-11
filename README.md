# Spring-boot
Spring-Boot常用开发技术整合
1 spring-boot 接口返回Jason

2 spring-boot 热部署 (2.1)热部署未生效 当我们修改了java类后，IDEA默认是不自动编译的，而spring-boot-devtools又是监测classpath下的文件发生变化才会重启应用，所以需要设置IDEA的自动编译：

（1）File-Settings-Compiler-Build Project automatically

（2）ctrl + shift + alt + /,选择Registry,勾上 Compiler autoMake allow when app running
