/*
Navicat MySQL Data Transfer

Source Server         : srg
Source Server Version : 80011
Source Host           : localhost:3306
Source Database       : user

Target Server Type    : MYSQL
Target Server Version : 80011
File Encoding         : 65001

Date: 2018-07-19 20:44:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for music
-- ----------------------------
DROP TABLE IF EXISTS `music`;
CREATE TABLE `music` (
  `music_name` varchar(255) DEFAULT NULL,
  `music_author` varchar(255) DEFAULT NULL,
  `music_time` int(4) unsigned zerofill DEFAULT NULL,
  `music_id` int(5) NOT NULL AUTO_INCREMENT,
  `music_address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`music_id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of music
-- ----------------------------
INSERT INTO `music` VALUES ('There\'s Nothing Holdin\' Me Back', 'Shawn Mendes', '0099', '1', '473602620');
INSERT INTO `music` VALUES ('Light Up', 'Luke Bryan', '0097', '2', '500406896');
INSERT INTO `music` VALUES ('Body Like Back Road', 'Sam Hunt', '0097', '3', '455311478');
INSERT INTO `music` VALUES ('Praying', 'Kesha', '0090', '4', '490381073');
INSERT INTO `music` VALUES ('What About Us', 'Plnk', '0089', '5', '497218048');
INSERT INTO `music` VALUES ('What Ifs', 'Kane Brown / Lauren Alaina', '0076', '6', '444548751');
INSERT INTO `music` VALUES ('Despacito', 'Luis Fonsi / Daddy Yankee', '0075', '7', '452613551');
INSERT INTO `music` VALUES ('No Promises', 'Cheat Codes / Demi Lovato', '0075', '8', '467952465');
INSERT INTO `music` VALUES ('When It Rains It Pours', 'Luke Comnbs', '0074', '9', '481241995');
INSERT INTO `music` VALUES ('Young Dumb & Broke', 'Khalid', '0073', '10', '462895657');
INSERT INTO `music` VALUES ('Small Town Boy', 'Dustin Lynch', '0072', '11', '461167362');
INSERT INTO `music` VALUES ('Walk On Water', '30 Seconds to Mars', '0045', '12', '500406851');
INSERT INTO `music` VALUES ('Eyes Closed', 'In Real Life', '0043', '13', '501501453');
INSERT INTO `music` VALUES ('Something Just Like This', 'The Chainsmokers / Coldplay', '0042', '14', '461347998');
INSERT INTO `music` VALUES ('Most Girls', 'Hailee Steinfeld', '0041', '15', '474932965');
INSERT INTO `music` VALUES ('No Such Thing as a Broken Heart', 'Old Dominion', '0037', '16', '464797028');
INSERT INTO `music` VALUES ('Mi Gente', 'J Balvin / Willy William', '0037', '17', '487753742');
INSERT INTO `music` VALUES ('Fetish', 'Selena Gomez / Gucci Mane', '0036', '18', '489997578');
INSERT INTO `music` VALUES ('Unforgettable', 'Thomas Rhett', '0035', '19', '493705143');
INSERT INTO `music` VALUES ('That\'s What I Like', 'Bruno Mars', '0033', '20', '441120471');
INSERT INTO `music` VALUES ('Wish I Knew You', 'The Revivalists', '0028', '21', '440354464');
INSERT INTO `music` VALUES ('Heartache on the Dance Floor', 'Jon Pardi', '0021', '22', '417614005');
INSERT INTO `music` VALUES ('Demons', 'Imagine Dragons', '0008', '24', '19945735');
