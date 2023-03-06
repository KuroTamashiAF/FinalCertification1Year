## создать базу данных HumanFriends
CREATE DATABASE HumanFriends;
use HumanFriends;
## DROP DATABASE HumanFriends;
## Создаем таблицы из схемы 
CREATE TABLE Cat
(
Cat_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
Cat_name VARCHAR(10) NOT NULL, 
Cat_age INT, 
Cat_Date_Bith DATE, 
Cat_sound VARCHAR(5) NOT NULL, 
CAt_methods VARCHAR(50)
);
## DROP TABLE Cat;
CREATE TABLE Dog
(
Dog_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
Dog_name VARCHAR(10) NOT NULL, 
Dog_age INT, 
Dog_Date_Bith DATE, 
Dog_sound VARCHAR(5) NOT NULL, 
Dog_methods VARCHAR(50)
);
## DROP TABLE Cat;
