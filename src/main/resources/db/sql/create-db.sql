CREATE  TABLE users (
  username VARCHAR(45) NOT NULL ,
  password VARCHAR(45) NOT NULL ,
  enabled SMALLINT NOT NULL DEFAULT 1 ,
  PRIMARY KEY (username));
 
CREATE TABLE user_roles (
  user_role_id SMALLINT NOT NULL,
  username varchar(45) NOT NULL,
  role varchar(45) NOT NULL,
  PRIMARY KEY (user_role_id));