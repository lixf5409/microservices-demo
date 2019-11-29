CREATE TABLE `org_user_0` (
  `user_id` BIGINT NOT NULL,
  `user_name` VARCHAR(30) DEFAULT NULL,
  `user_code` VARCHAR(30) DEFAULT NULL,
  `dept_id` INT(32) DEFAULT NULL,
  `sex` VARCHAR(1) DEFAULT NULL COMMENT '性别',
  `birthday` VARCHAR(20) DEFAULT NULL COMMENT '生日',
  `phone` VARCHAR(11) DEFAULT NULL COMMENT '手机号',
  `remarks` VARCHAR(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`user_id`)
) ;
CREATE TABLE `org_user_1` (
  `user_id` BIGINT NOT NULL,
  `user_name` VARCHAR(30) DEFAULT NULL,
  `user_code` VARCHAR(30) DEFAULT NULL,
  `dept_id` INT(32) DEFAULT NULL,
  `sex` VARCHAR(1) DEFAULT NULL COMMENT '性别',
  `birthday` VARCHAR(20) DEFAULT NULL COMMENT '生日',
  `phone` VARCHAR(11) DEFAULT NULL COMMENT '手机号',
  `remarks` VARCHAR(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`user_id`)
) ;
CREATE TABLE `org_user_2` (
  `user_id` BIGINT NOT NULL,
  `user_name` VARCHAR(30) DEFAULT NULL,
  `user_code` VARCHAR(30) DEFAULT NULL,
  `dept_id` INT(32) DEFAULT NULL,
  `sex` VARCHAR(1) DEFAULT NULL COMMENT '性别',
  `birthday` VARCHAR(20) DEFAULT NULL COMMENT '生日',
  `phone` VARCHAR(11) DEFAULT NULL COMMENT '手机号',
  `remarks` VARCHAR(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`user_id`)
) ;