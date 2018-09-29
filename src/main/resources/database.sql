USE volgahack;
DROP TABLE IF EXISTS user;
DROP TABLE IF EXISTS task;
DROP TABLE IF EXISTS tag;
DROP TABLE IF EXISTS role;
DROP TABLE IF EXISTS tag_task;
CREATE TABLE user (
  id int(11) NOT NULL,
  username varchar(255) CHARACTER SET utf8 NOT NULL,
  password varchar(255) CHARACTER SET utf8 NOT NULL,
  karma int(11) NOT NULL,
  about_me TEXT CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (id)
)


CREATE TABLE task (
  id BIGINT(9) NOT NULL,
  title varchar(255) CHARACTER SET utf8 NOT NULL,
  description TEXT CHARACTER SET utf8 NOT NULL,
  active int(100) NOT NULL,
  author_id int(100) NOT NULL,
  contribution int(100) NOT NULL,
  price int(9) NOT NULL,
  PRIMARY KEY (id)
)

CREATE TABLE tag (
  id int(11) NOT NULL,
  text varchar(40) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (id)
)

CREATE TABLE role (
  id int(11) NOT NULL AUTO_INCREMENT,
  role    varchar(255)     DEFAULT NULL,
  PRIMARY KEY (role_id)
);

CREATE TABLE tag_task (
  task_id int(11) NOT NULL,
  tag_id int(11) NOT NULL,
   PRIMARY KEY (user_id, role_id),
  FOREIGN KEY (task_id) REFERENCES task(id)
)

insert into role
value (1, 'ADMIN');
insert into role
values (2, 'USER');

use frame;
insert into user (username, password)
value ("admin", "$2a$10$S7ukTjY7CoR.O2uksyWrjuBDIOCEgBzMPyfAI1aXS36HXLJDKIcdO");
insert into user_role
value (1, 1);
insert into user_role
value (1, 2);