DROP TABLE IF EXISTS schedule_job;
CREATE TABLE schedule_job(
schedule_job_id BIGINT(20) NOT NULL auto_increment,
job_name varchar(255) DEFAULT NULL,
alias_name varchar(255) DEFAULT NULL,
job_group varchar(255) DEFAULT NULL,
job_trigger varchar(255) DEFAULT NULL,
status varchar(255) DEFAULT NULL,
cron_expression varchar(255) DEFAULT NULL,
is_sync VARCHAR(1) NOT NULL,
description VARCHAR(255) DEFAULT NULL,
gmt_create timestamp NULL DEFAULT NULL,
gmt_modify timestamp NULL DEFAULT NULL,
PRIMARY KEY (schedule_job_id)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;