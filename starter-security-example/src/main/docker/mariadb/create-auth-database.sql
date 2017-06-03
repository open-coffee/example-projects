CREATE DATABASE IF NOT EXISTS `auth` CHARACTER SET UTF8 COLLATE utf8_unicode_ci;
GRANT ALL ON `auth`.* TO 'auth'@'%';

-- Make privileges active
FLUSH PRIVILEGES;
