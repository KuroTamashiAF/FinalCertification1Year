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
## SELECT * FROM Cat;

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
INSERT INTO Dog (Dog_name, Dog_age, Dog_Date_Bith, Dog_sound, Dog_methods)
VALUES
("Джой",  7, "2017-01-23", "Мычит", "Сходить с ума, Просить кушать"), 
("Цербер", 2000, "0000-01-01", "0-0", "Охранять вход в царство мертвых"),
("Мелочь", 4, "2019-11-17", "тЯФ", " Дрожать от страха, Быть тупой");
## SELECT * FROM DOG;

CREATE TABLE Hamster
(
Hamster_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
Hamster_name VARCHAR(10) NOT NULL, 
Hamster_age INT, 
Hamster_Date_Bith DATE, 
Hamster_methods VARCHAR(50)
);
## DROP TABLE Hamster;
INSERT INTO Hamster (Hamster_name, Hamster_age, Hamster_Date_Bith, Hamster_methods)
VALUES
("Хома", 2, "2021-02-17", "Шуршать ночью пока все спят"),
("Жена Хомы", 3, "2020-07-21", "Пилить Хому за просто так =)"),
("Детё Хомы", 1, "2022-01-01", "Тостеть и ни хрена не делать"); 

##SELECT * FROM Hamster;

CREATE TABLE Parrot
(
Parrot_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
Parrot_name VARCHAR(13) NOT NULL, 
Parrot_age INT, 
Parrot_Date_Bith DATE, 
Parrot_talk BOOLEAN, 
Parrot_methods VARCHAR(50)
);
## DROP TABLE Parrot;
INSERT INTO Parrot (Parrot_name, Parrot_age, Parrot_Date_Bith, Parrot_talk, Parrot_methods)
VALUES
("Кеша", 2, "2021-03-06", TRUE,"Свободу попугаям. Кия" ), 
("Птерадактель", 64002023, "0001-01-01", FALSE, "Как в парке юрского периода"), 
("Жар Птица", 223, "1800-01-01", TRUE, "Помогать Ивану Царевичу во всякой фигне");
  
## SELECT * FROM Parrot;

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
INSERT INTO Goat (Goat_name, Goat_age, Goat_Date_Bith, Goat_buttingHeads, Goat_getMilk, Goat_methods)
VALUES
("Бадалка",5, "2018-10-17",TRUE, TRUE, "Забодает кого хочешь"),
("НеБадалка", 3, "2020-01-20",FALSE, TRUE, "Давать козье молоко" ),
("Старая", 6, "2017-01-01", FALSE, FALSE, "Высоко прыгает");
## SELECT * FROM Goat;

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
INSERT INTO Cow (Cow_name, Cow_age, Cow_Date_Bith, Cow_getMilk, Cow_methods)
VALUES
("Буренка", 10, "2013-06-03",TRUE, "Давать молоко" ),
("Жувайка", 7, "2016-02-13", TRUE, "МЫчать много, давать молоко"),
("Мавашка", 3, "2020-10-11", FALSE, "бЕГАТЬ И СКАКАТЬ" ); 
## SELECT * FROM Cow;

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

INSERT INTO Ram (Ram_name, Ram_age, Ram_Date_Bith, Ram_quantityWool, Ram_methods)
VALUES
("Бобер", 4, "2019-06-05", 4, "Бадаться" ),
("Волосатый", 6, "2017-05-30", 10, "БЕЕЕКАТЬ" ),
("Зелень", 2, "2021-10-11", 1, " ");
SELECT * FROM Ram;

CREATE TABLE Horse
(
Horse_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
Horse_name VARCHAR(10) NOT NULL, 
Horse_age INT, 
Horse_Date_Bith DATE, 
Horse_loadCapasityKG INT NOT NULL,
Horse_methods VARCHAR(50)
);
## DROP TABLE Horse;
INSERT INTO Horse (Horse_name, Horse_age, Horse_Date_Bith, Horse_loadCapasityKG, Horse_methods)
VALUES
("Крокант", 5, "2018-05-01", 50, "Кушать сено и сахар, попрошайничать"),
("Камикадзе", 15, "2008-07-11", 100, "Катать детишек"),
("Росинант", 20, "1605-01-01", 80, "Превозмогать, Дон Кихот");
## SELECT * FROM Horse;

CREATE TABLE Camel
(
Camel_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
Camel_name VARCHAR(10) NOT NULL, 
Camel_age INT, 
Camel_Date_Bith DATE, 
Camel_loadCapasityKG INT NOT NULL,
Camel_methods VARCHAR(50)
);
## DROP TABLE Camel;
INSERT INTO Camel (Camel_name, Camel_age, Camel_Date_Bith, Camel_loadCapasityKG, Camel_methods)
VALUES
("Аид", 2, "2021-07-03", 100, "Перевозить грузы и людей"),
("Плевун", 5, "2018-03-21", 115, "Плеваться"),
("Орун", 8, "2015-01-23", 95, "Орать");
## SELECT * FROM Horse;
## Все работет ошибок нет на данном этапе !!
## Удалить из таблицы верблюдов 

DELETE FROM Camel
WHERE Camel_id >0;

SELECT * FROM Camel;
## НО ПРОЩЕ БЫЛО БЫ УДАЛИТЬ ПРОСТО ТАБЛИЦУ ЦЕЛИКОМ









