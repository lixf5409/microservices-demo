CREATE TABLE `org_dept` (
  `dept_id` int(32) NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(30) DEFAULT NULL,
  `dept_code` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`dept_id`)
) ;

ALTER TABLE `demodept`.`org_dept`
ADD COLUMN `parent_id` int(32) NULL AFTER `dept_code`;