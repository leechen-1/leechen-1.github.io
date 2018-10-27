/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50536
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50536
File Encoding         : 65001

Date: 2017-03-17 09:26:22
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `husband`
-- ----------------------------
DROP TABLE IF EXISTS `husband`;
CREATE TABLE `husband` (
  `hid` int(5) NOT NULL AUTO_INCREMENT,
  `hname` varchar(20) DEFAULT NULL,
  `wifeId` int(5) DEFAULT NULL,
  PRIMARY KEY (`hid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of husband
-- ----------------------------
INSERT INTO `husband` VALUES ('1', 'AAA', '1');
INSERT INTO `husband` VALUES ('2', 'BBB', '2');
INSERT INTO `husband` VALUES ('3', 'CCC', '3');

-- ----------------------------
-- Table structure for `wife`
-- ----------------------------
DROP TABLE IF EXISTS `wife`;
CREATE TABLE `wife` (
  `wid` int(5) NOT NULL AUTO_INCREMENT,
  `wname` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`wid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wife
-- ----------------------------
INSERT INTO `wife` VALUES ('1', 'aaa');
INSERT INTO `wife` VALUES ('2', 'bbb');
INSERT INTO `wife` VALUES ('3', 'ccc');
