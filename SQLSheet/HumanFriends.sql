## создать базу данных HumanFriends
CREATE DATABASE HumanFriends;
use HumanFriends;
## DROP DATABASE HumanFriends;
## Создаем таблицы из схемы 
CREATE TABLE Cat
(
Cat_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
Cat_name VARCHAR(20) NOT NULL, 
Cat_age INT, 
Cat_Date_Bith DATE, 
Cat_sound VARCHAR(5) NOT NULL, 
CAt_methods VARCHAR(50)
);
## DROP TABLE Cat;
INSERT INTO Cat (Cat_name, Cat_age, Cat_Date_Bith, Cat_sound, CAt_methods)
VALUES
("Сфинкс", 3000, "1111-11-11", "Хмм","Задать загадку"),
("Пантера", 2, "2022-02-21", "Жмяк","Охотиться" ),
("Кошак ГАлактуса",5000, "0000-07-22", "Хрум", "Скушать планету");

CREATE TABLE Dog
(
Dog_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
Dog_name VARCHAR(10) NOT NULL, 
Dog_age INT, 
Dog_Date_Bith DATE, 
Dog_sound VARCHAR(5) NOT NULL, 
Dog_methods VARCHAR(50)
);
## DROP TABLE Dog;







CREATE TABLE Hamster
(
Hamster_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
Hamster_name VARCHAR(10) NOT NULL, 
Hamster_age INT, 
Hamster_Date_Bith DATE, 
Hamster_methods VARCHAR(50)
);
## DROP TABLE Hamster;

CREATE TABLE Parrot
(
Parrot_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
Parrot_name VARCHAR(10) NOT NULL, 
Parrot_age INT, 
Parrot_Date_Bith DATE, 
Parrot_talk BOOLEAN, 
Parrot_methods VARCHAR(50)
);
## DROP TABLE Parrot;

CREATE TABLE Goat
(
Goat_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
Goat_name VARCHAR(10) NOT NULL, 
Goat_age INT, 
Goat_Date_Bith DATE, 
Goat_buttingHeads BOOLEAN, 
Goat_getMilk BOOLEAN,  
Goat_methods VARCHAR(50)
);
## DROP TABLE Goat;

CREATE TABLE Cow
(
Cow_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
Cow_name VARCHAR(10) NOT NULL, 
Cow_age INT, 
Cow_Date_Bith DATE, 
Cow_getMilk BOOLEAN,  
Cow_methods VARCHAR(50)
);
## DROP TABLE Cow;

CREATE TABLE Ram
(
Ram_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
Ram_name VARCHAR(10) NOT NULL, 
Ram_age INT, 
Ram_Date_Bith DATE, 
Ram_quantityWool INT NOT NULL,
Ram_methods VARCHAR(50)
);
## DROP TABLE Ram;


CREATE TABLE Horse
(
Horse_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
Horse_name VARCHAR(10) NOT NULL, 
Horse_age INT, 
Horse_Date_Bith DATE, 
Horse_loadCapasity INT NOT NULL,
Horse_methods VARCHAR(50)
);
## DROP TABLE Horse;
## Все работет ошибок нет на данном этапе !!





