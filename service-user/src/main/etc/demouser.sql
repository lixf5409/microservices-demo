create table if not exists org_user
(
	user_id int(32) auto_increment
		primary key,
	user_name varchar(30) null,
	user_code varchar(30) null,
	dept_id int(32) null,
	sex varchar(1) null comment '性别',
	birthday varchar(20) null comment '生日',
	phone varchar(11) null comment '手机号',
	remarks varchar(200) null comment '备注'
)
charset=utf8;

