# COLA 项目简介

## 项目概述

COLA（Clean Object-Oriented and Layered Architecture）全称为整洁面向对象分层架构，它融合了分层架构、DDD（领域驱动设计）和CQRS（命令查询职责分离）等核心软件设计思想。

## 项目地址

- GitHub: [alibaba/COLA](https://github.com/alibaba/COLA)
- Gitee: [jasonsang/COLA](https://gitee.com/jasonsang/COLA)

## 修改点

本项目基于COLA官方 4.4.0-SNAPSHOT 脚手架，并进行了以下修改：

1. 包路径中加入了模块名称以增强可读性。
2. 在`start`模块中加入了`artifactId`以区分项目。
3. 实现了领域分包（在COLA3.1中已经提出了横向进行功能维度的划分、纵向领域维度的划分，只不过没有修改脚手架）。
4. 领域实体类名称后加上了`Entity`后缀，以统一命名规范。
5. `controller`的出参统一改为`CO`（Client Object）。
6. `controller`的入参避免直接在`cmd`中使用`CO`，而是使用具体的字段。
7. 依赖精简，下层服务已依赖的依赖项，上层不再重复依赖。

## 贡献指南

欢迎任何形式的贡献，包括但不限于：

- 代码改进
- 文档补充
- 问题反馈

希望这份文档能帮助您快速了解和使用COLA项目。如果您有任何疑问或建议，请随时联系。