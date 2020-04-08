/*
Navicat MySQL Data Transfer

Source Server         : 本地链接
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : punch

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2020-04-08 16:31:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for companyinfo
-- ----------------------------
DROP TABLE IF EXISTS `companyinfo`;
CREATE TABLE `companyinfo` (
  `companyid` varchar(50) NOT NULL,
  `companyname` varchar(50) DEFAULT NULL,
  `companylogo` varchar(50) DEFAULT NULL,
  `companyindustry` varchar(255) DEFAULT NULL,
  `companyregion` varchar(255) DEFAULT NULL,
  `companyscale` int(11) DEFAULT NULL,
  `companytel` varchar(50) DEFAULT NULL,
  `companycreatime` varchar(50) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,
  PRIMARY KEY (`companyid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of companyinfo
-- ----------------------------

-- ----------------------------
-- Table structure for fileinfo
-- ----------------------------
DROP TABLE IF EXISTS `fileinfo`;
CREATE TABLE `fileinfo` (
  `fid` int(11) NOT NULL AUTO_INCREMENT,
  `fname` varchar(50) DEFAULT NULL,
  `frealurl` varchar(255) DEFAULT NULL,
  `fvirtualurl` varchar(255) DEFAULT NULL,
  `fuploadtime` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fileinfo
-- ----------------------------

-- ----------------------------
-- Table structure for usercompany
-- ----------------------------
DROP TABLE IF EXISTS `usercompany`;
CREATE TABLE `usercompany` (
  `userid` int(11) NOT NULL,
  `companyid` varchar(50) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `uctype` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of usercompany
-- ----------------------------

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `loginname` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `userpic` varchar(255) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `usersex` int(11) DEFAULT NULL,
  `userbirthday` varchar(50) DEFAULT NULL,
  `usertelphone` varchar(50) DEFAULT NULL,
  `companyemail` varchar(50) DEFAULT NULL,
  `companytelphone` varchar(50) DEFAULT NULL,
  `worknumber` varchar(50) DEFAULT NULL,
  `companyposition` varchar(50) DEFAULT NULL,
  `incompany` varchar(50) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `usercreatime` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES ('1', 'zhangsan', '4QrcOUm6Wau+VuBX8g+IPg==', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `userinfo` VALUES ('2', 'lisi', '4QrcOUm6Wau+VuBX8g+IPg==', null, null, null, null, null, null, null, null, null, null, null, '2020-04-03 18:16:22');
