CREATE TABLE `org_user` (
  `user_id` int(32) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(30) DEFAULT NULL,
  `user_code` varchar(30) DEFAULT NULL,
  `dept_id` int(32) DEFAULT NULL,
  `sex` varchar(1) DEFAULT NULL COMMENT '性别',
  `birthday` varchar(20) DEFAULT NULL COMMENT '生日',
  `phone` varchar(11) DEFAULT NULL COMMENT '手机号',
  `remarks` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`user_id`)
) ;