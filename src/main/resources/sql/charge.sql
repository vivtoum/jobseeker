CREATE TABLE `charge` (
  `charge_id` varchar(255) NOT NULL,
  `charge_info` varchar(255) DEFAULT NULL,
  `charge_item` varchar(255) DEFAULT NULL,
  `charge_standard` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`charge_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;