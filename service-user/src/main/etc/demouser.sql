CREATE TABLE `org_user` (
  `user_id` INT(32) NOT NULL AUTO_INCREMENT,
  `user_name` VARCHAR(30) DEFAULT NULL,
  `user_code` VARCHAR(30) DEFAULT NULL,
  `dept_id` INT(32) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
);

