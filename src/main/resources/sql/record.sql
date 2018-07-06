CREATE TABLE `record` (
  `record_id` varchar(255) NOT NULL,
  `record_gas` varchar(255) DEFAULT NULL,
  `record_item` varchar(255) DEFAULT NULL,
  `record_number` varchar(255) DEFAULT NULL,
  `record_power` varchar(255) DEFAULT NULL,
  `record_time` datetime DEFAULT NULL,
  `record_water` varchar(255) DEFAULT NULL,
  `room_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`record_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;