/*
Navicat MySQL Data Transfer

Source Server         : srg
Source Server Version : 80011
Source Host           : localhost:3306
Source Database       : user

Target Server Type    : MYSQL
Target Server Version : 80011
File Encoding         : 65001

Date: 2018-07-19 20:44:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for usernumber
-- ----------------------------
DROP TABLE IF EXISTS `usernumber`;
CREATE TABLE `usernumber` (
  `id` int(3) NOT NULL AUTO_INCREMENT,
  `name` varchar(11) NOT NULL,
  `password` varchar(20) NOT NULL,
  `phone` varchar(11) NOT NULL,
  `head_Icon_Address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of usernumber
-- ----------------------------
INSERT INTO `usernumber` VALUES ('1', 'sun', 'Sun961017', '18855036835', 'sun.jpg');
