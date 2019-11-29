CREATE TABLE `org_dept` (
  `dept_id` int(32) NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(30) DEFAULT NULL,
  `dept_code` varchar(30) DEFAULT NULL,
  `parent_id` int(32) NULL,
  PRIMARY KEY (`dept_id`)
) ;
