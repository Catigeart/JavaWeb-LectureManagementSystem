/*
Navicat MySQL Data Transfer

Source Server         : Mysql
Source Server Version : 80022
Source Host           : localhost:3306
Source Database       : uma_lecture

Target Server Type    : MYSQL
Target Server Version : 80022
File Encoding         : 65001

Date: 2021-01-23 02:05:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `email_model`
-- ----------------------------
DROP TABLE IF EXISTS `email_model`;
CREATE TABLE `email_model` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `format` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of email_model
-- ----------------------------

-- ----------------------------
-- Table structure for `expert`
-- ----------------------------
DROP TABLE IF EXISTS `expert`;
CREATE TABLE `expert` (
  `id` int NOT NULL AUTO_INCREMENT,
  `organization_id` int DEFAULT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sex` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `job` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `area` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_expert_org` (`organization_id`),
  CONSTRAINT `fk_expert_org` FOREIGN KEY (`organization_id`) REFERENCES `organization` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of expert
-- ----------------------------
INSERT INTO `expert` VALUES ('1', '1', '毕福剑', '男', '教授', '123', '123', '123', '123');
INSERT INTO `expert` VALUES ('2', '1', '宋祖英', '女', '院长', '123', '123', '123', '123');
INSERT INTO `expert` VALUES ('3', '1', '123', '12', 'tttttttttttttttttttt', '123', '123', '1123', '12313');

-- ----------------------------
-- Table structure for `lecture`
-- ----------------------------
DROP TABLE IF EXISTS `lecture`;
CREATE TABLE `lecture` (
  `id` int NOT NULL AUTO_INCREMENT,
  `plan_id` int NOT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `expert_id` int NOT NULL,
  `topic` varchar(30) NOT NULL,
  `location` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `host` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `introduction` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `stu_cnt` int(10) unsigned zerofill NOT NULL,
  `stu_limit` int NOT NULL,
  `begin_time` datetime NOT NULL,
  `end_time` datetime NOT NULL,
  `latest_time` datetime NOT NULL,
  `work_year` int DEFAULT NULL,
  `job` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`,`topic`),
  KEY `fk_lecture_expert` (`expert_id`),
  KEY `fk_lecture_plan` (`plan_id`),
  CONSTRAINT `fk_lecture_expert` FOREIGN KEY (`expert_id`) REFERENCES `expert` (`id`),
  CONSTRAINT `fk_lecture_plan` FOREIGN KEY (`plan_id`) REFERENCES `plan` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of lecture
-- ----------------------------
INSERT INTO `lecture` VALUES ('1', '1', '123', '1', '', '123', '123', '123', '0000000100', '123', '2038-01-20 00:00:00', '2038-01-20 00:00:00', '2038-01-20 00:00:00', '1', '1');
INSERT INTO `lecture` VALUES ('2', '1', '1', '1', '1', '123', null, '123', '0000000000', '123', '2021-01-01 08:00:00', '2021-01-01 08:00:00', '2021-01-01 00:00:00', '12313', '3123');
INSERT INTO `lecture` VALUES ('3', '1', '123', '1', '123', '1', null, '1', '0000000000', '1', '2021-01-01 08:00:00', '2021-01-01 08:00:00', '2021-01-01 00:00:00', '1', '1');
INSERT INTO `lecture` VALUES ('4', '1', '1', '1', '1232', '1', null, '1', '0000000000', '3', '2021-01-01 08:00:00', '2021-01-01 08:00:00', '2021-01-01 00:00:00', '1', '3');
INSERT INTO `lecture` VALUES ('5', '1', '1', '1', '1231312', '3', null, '1', '0000000000', '4', '2021-01-01 08:00:00', '2021-01-01 08:00:00', '2021-01-01 00:00:00', '5', '2');
INSERT INTO `lecture` VALUES ('6', '1', '1', '1', '33222', '2', null, '1', '0000000000', '5', '2021-01-01 08:00:00', '2021-01-01 08:00:00', '2021-01-01 00:00:00', '4', '2');
INSERT INTO `lecture` VALUES ('7', '1', '1', '1', '123123', '42', null, '2', '0000000000', '1', '2021-01-01 08:00:00', '2021-01-01 08:00:00', '2021-01-01 00:00:00', '2', '3');
INSERT INTO `lecture` VALUES ('8', '1', '1', '1', '1233', '2', null, '1', '0000000000', '4', '2021-01-01 08:00:00', '2021-01-01 08:00:00', '2021-01-01 00:00:00', '1', '3');
INSERT INTO `lecture` VALUES ('9', '1', '443', '1', '1123', '12', null, '1', '0000000000', '4', '2021-01-01 08:00:00', '2021-01-01 08:00:00', '2021-01-01 00:00:00', '5', '2');
INSERT INTO `lecture` VALUES ('10', '1', '13213', '1', '2334', '4', null, '1', '0000000000', '3', '2021-01-01 08:00:00', '2021-01-01 08:00:00', '2021-01-01 00:00:00', '2', '1');
INSERT INTO `lecture` VALUES ('11', '1', '234', '1', '3344', '22', '1', '2', '0000000000', '3', '2021-01-01 08:00:00', '2021-01-01 08:00:00', '2021-01-01 00:00:00', '1', '4');

-- ----------------------------
-- Table structure for `notice`
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `is_sent` enum('false','true') NOT NULL DEFAULT 'false',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of notice
-- ----------------------------

-- ----------------------------
-- Table structure for `organization`
-- ----------------------------
DROP TABLE IF EXISTS `organization`;
CREATE TABLE `organization` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `type` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of organization
-- ----------------------------
INSERT INTO `organization` VALUES ('1', 'University', '教育机构', '火星');

-- ----------------------------
-- Table structure for `plan`
-- ----------------------------
DROP TABLE IF EXISTS `plan`;
CREATE TABLE `plan` (
  `id` int NOT NULL AUTO_INCREMENT,
  `topic` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `location` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `time` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `description` text,
  `expert` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `expert_description` text CHARACTER SET utf8 COLLATE utf8_general_ci,
  `done` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT 'false',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of plan
-- ----------------------------
INSERT INTO `plan` VALUES ('1', '123', '123', '123', '123', '123', '123', '1');
INSERT INTO `plan` VALUES ('2', '', '', '', '', '', '', '0');

-- ----------------------------
-- Table structure for `rlease`
-- ----------------------------
DROP TABLE IF EXISTS `rlease`;
CREATE TABLE `rlease` (
  `id` int NOT NULL AUTO_INCREMENT,
  `worker_username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `lecture_id` int NOT NULL,
  `time` datetime NOT NULL,
  `sent_website` int NOT NULL DEFAULT '0',
  `sent_email` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `fk_release_lecture` (`lecture_id`) USING BTREE,
  KEY `fk_rlease_user` (`worker_username`),
  CONSTRAINT `fk_rlease_user` FOREIGN KEY (`worker_username`) REFERENCES `user` (`username`),
  CONSTRAINT `rlease_ibfk_1` FOREIGN KEY (`lecture_id`) REFERENCES `lecture` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of rlease
-- ----------------------------
INSERT INTO `rlease` VALUES ('1', 'ww', '6', '2021-01-19 21:00:51', '1', '1');
INSERT INTO `rlease` VALUES ('2', 'ww', '6', '2021-01-19 21:00:51', '1', '1');
INSERT INTO `rlease` VALUES ('3', 'ww', '8', '2021-01-19 21:03:42', '1', '1');
INSERT INTO `rlease` VALUES ('4', 'ww', '8', '2021-01-19 21:03:42', '1', '1');
INSERT INTO `rlease` VALUES ('5', 'ww', '10', '2021-01-19 21:08:10', '1', '1');
INSERT INTO `rlease` VALUES ('6', 'ww', '10', '2021-01-19 21:08:10', '1', '1');
INSERT INTO `rlease` VALUES ('7', 'ww', '11', '2021-01-19 21:11:17', '1', '1');
INSERT INTO `rlease` VALUES ('8', 'ww', '11', '2021-01-19 21:11:17', '1', '1');

-- ----------------------------
-- Table structure for `sms_model`
-- ----------------------------
DROP TABLE IF EXISTS `sms_model`;
CREATE TABLE `sms_model` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `format` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sms_model
-- ----------------------------

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int NOT NULL AUTO_INCREMENT,
  `organization_id` int NOT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sex` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `job` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `work_year` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_stu_org` (`organization_id`),
  CONSTRAINT `fk_stu_org` FOREIGN KEY (`organization_id`) REFERENCES `organization` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------

-- ----------------------------
-- Table structure for `stu_lec`
-- ----------------------------
DROP TABLE IF EXISTS `stu_lec`;
CREATE TABLE `stu_lec` (
  `id` int NOT NULL AUTO_INCREMENT,
  `stu_id` int NOT NULL,
  `lecture_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_stulec_stu` (`stu_id`),
  KEY `fk_stulec_lec` (`lecture_id`),
  CONSTRAINT `fk_stulec_lec` FOREIGN KEY (`lecture_id`) REFERENCES `lecture` (`id`),
  CONSTRAINT `fk_stulec_stu` FOREIGN KEY (`stu_id`) REFERENCES `student` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stu_lec
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `type` varchar(20) NOT NULL,
  `sex` varchar(8) NOT NULL,
  `nickname` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `email` varchar(30) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('mm', '123456', '管理人员', '男', 'mm', '李大钊', '123', '123');
INSERT INTO `user` VALUES ('ss', '123456', '开发人员', '女', 'ss', '居里夫人', '13', '123123');
INSERT INTO `user` VALUES ('ww', '123456', '工作人员', '女', 'ww', '伊丽莎白', '123', '213');

-- ----------------------------
-- Table structure for `web_model`
-- ----------------------------
DROP TABLE IF EXISTS `web_model`;
CREATE TABLE `web_model` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `format` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of web_model
-- ----------------------------

-- ----------------------------
-- Table structure for `worker`
-- ----------------------------
DROP TABLE IF EXISTS `worker`;
CREATE TABLE `worker` (
  `id` int NOT NULL AUTO_INCREMENT,
  `organization_id` int NOT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sex` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `job` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_worker_org` (`organization_id`),
  CONSTRAINT `fk_worker_org` FOREIGN KEY (`organization_id`) REFERENCES `organization` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of worker
-- ----------------------------
