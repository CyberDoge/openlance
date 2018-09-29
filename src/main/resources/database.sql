CREATE TABLE `User` (
  `id` mediumint(9) NOT NULL,
  `username` varchar(255) CHARACTER SET utf8 NOT NULL,
  `password` varchar(255) CHARACTER SET utf8 NOT NULL,
  `karma` int(11) NOT NULL,
  `aboutme` varchar(255) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (id)
)


CREATE TABLE `Task` (
  `id` mediumint(9) NOT NULL,
  `title` varchar(255) CHARACTER SET utf8 NOT NULL,
  `description` varchar(255) CHARACTER SET utf8 NOT NULL,
  `active` int(100) NOT NULL,
  `author_id` int(100) NOT NULL,
  `contribution` int(100) NOT NULL,
  `price` int(100) NOT NULL,
  PRIMARY KEY (id)
)

CREATE TABLE `Tag` (
  `id` mediumint(9) NOT NULL,
  `text` varchar(255) CHARACTER SET utf8 NOT NULL
  PRIMARY KEY (id)
)

CREATE TABLE `Tag_to_Task` (
  `task_id` int(11) NOT NULL,
  `teg_id` int(11) NOT NULL
)