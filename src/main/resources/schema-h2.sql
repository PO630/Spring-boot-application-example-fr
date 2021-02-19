CREATE TABLE user
(
  id_user INT PRIMARY KEY AUTO_INCREMENT,
  name_user varchar(30) DEFAULT NULL,
  password_user varchar(200) DEFAULT NULL,
  email_user varchar(200) DEFAULT NULL,
  avatar_user varchar(200) DEFAULT NULL,
  ban_user int(1) DEFAULT NULL
);