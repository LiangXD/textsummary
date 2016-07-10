# textsummary
## 自动摘要
[![Build Status](https://drone.io/github.com/XHao/textsummary/status.png)](https://drone.io/github.com/XHao/textsummary/latest)
[![Join the chat at https://gitter.im/XHao/textsummary](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/XHao/textsummary?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
## 开发环境
* maven
* java 8

开发中依赖IKAnalyzer这个分词lib，它不是maven项目，./lib下可以看到这个jar包。

便于在maven中使用，可以先`mvn clean`安装这个lib到maven的本地仓库中。（在clean阶段，maven会将本地lib安装到本地maven仓库中）

之后在`mvn compile`或者`mvn package`进行编译和打包。
## 使用
