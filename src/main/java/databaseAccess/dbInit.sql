DROP TABLE IF EXISTS `Orders`;
DROP TABLE IF EXISTS `Users`;

CREATE TABLE `Users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(90) NOT NULL,
  `password` varchar(45) NOT NULL,
  `role` varchar(20) NOT NULL DEFAULT 'customer',
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

LOCK TABLES `Users` WRITE;
INSERT INTO `Users` VALUES 
(1,'jens@somewhere.com','jensen','customer'),
(2,'ken@somewhere.com','kensen','customer'),
(3,'robin@somewhere.com','batman','employee');
UNLOCK TABLES;

CREATE TABLE `Orders`(
`id` int(11) NOT NULL AUTO_INCREMENT,
`length` int(11) NOT NULL,
`width` int(11) NOT NULL,
`height` int(11) NOT NULL,
`user_id` int(11) NOT NULL,
`status` varchar(20) DEFAULT 'Not sent',
PRIMARY KEY (`id`),
FOREIGN KEY (`user_id`) REFERENCES Users(`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;