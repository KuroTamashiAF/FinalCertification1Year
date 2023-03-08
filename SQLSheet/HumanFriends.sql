## создать базу данных HumanFriends
CREATE DATABASE HumanFriends;
use HumanFriends;
## DROP DATABASE HumanFriends;
## Создаем таблицы из схемы 
CREATE TABLE Cat
(
Id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
Name VARCHAR(20) NOT NULL, 
Age INT, 
Date_Bith DATE,  
Methods VARCHAR(50)
);
## DROP TABLE Cat;
INSERT INTO Cat (Name, Age, Date_Bith, Methods)
VALUES
("Сфинкс", 3, "2020-11-11", "Задать загадку"),
("Пантера", 2, "2022-02-21", "Охотиться" ),
("Кошак ГАлактуса",5, "2018-07-22", "Скушать планету");
## SELECT * FROM Cat;

CREATE TABLE Dog
(
Id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
Name VARCHAR(10) NOT NULL, 
Age INT, 
Date_Bith DATE,  
Methods VARCHAR(50)
);
## DROP TABLE Dog;
INSERT INTO Dog (Name, Age, Date_Bith, Methods)
VALUES
("Джой",  7, "2017-01-23", "Сходить с ума, Просить кушать"), 
("Цербер", 10, "2013-01-01", "Охранять вход в царство мертвых"),
("Мелочь", 4, "2019-11-17", " Дрожать от страха, Быть тупой");
## SELECT * FROM DOG;

CREATE TABLE Hamster
(
Id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
Name VARCHAR(10) NOT NULL, 
Age INT, 
Date_Bith DATE, 
Methods VARCHAR(50)
);
## DROP TABLE Hamster;
INSERT INTO Hamster (Name, Age, Date_Bith, Methods)
VALUES
("Хома", 2, "2021-02-17", "Шуршать ночью пока все спят"),
("Жена Хомы", 3, "2020-07-21", "Пилить Хому за просто так =)"),
("Детё Хомы", 1, "2022-01-01", "Тостеть и ни хрена не делать"); 

##SELECT * FROM Hamster;

CREATE TABLE Parrot
(
Id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
Name VARCHAR(13) NOT NULL, 
Age INT, 
Date_Bith DATE,  
Methods VARCHAR(50)
);
## DROP TABLE Parrot;
INSERT INTO Parrot (Name, Age, Date_Bith, Methods)
VALUES
("Кеша", 2, "2021-03-06","Свободу попугаям. Кия" ), 
("Птерадактель", 6, "2017-01-01", "Как в парке юрского периода"), 
("Жар Птица", 2, "2021-01-01", "Помогать Ивану Царевичу во всякой фигне");
  
## SELECT * FROM Parrot;

CREATE TABLE Goat
(
Id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
Name VARCHAR(10) NOT NULL, 
Age INT, 
Date_Bith DATE,   
Methods VARCHAR(50)
);
## DROP TABLE Goat;
INSERT INTO Goat (Name, Age, Date_Bith, Methods)
VALUES
("Бадалка",5, "2018-10-17", "Забодает кого хочешь"),
("НеБадалка", 3, "2020-01-20", "Давать козье молоко" ),
("Старая", 6, "2017-01-01", "Высоко прыгает");
## SELECT * FROM Goat;

CREATE TABLE Cow
(
Id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
Name VARCHAR(10) NOT NULL, 
Age INT, 
Date_Bith DATE,   
Methods VARCHAR(50)
);
## DROP TABLE Cow;
INSERT INTO Cow (Name, Age, Date_Bith, Methods)
VALUES
("Буренка", 10, "2013-06-03", "Давать молоко" ),
("Жувайка", 7, "2016-02-13",  "МЫчать много, давать молоко"),
("Мавашка", 3, "2020-10-11", "бЕГАТЬ И СКАКАТЬ" ); 
## SELECT * FROM Cow;

CREATE TABLE Ram
(
Id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
Name VARCHAR(10) NOT NULL, 
Age INT, 
Date_Bith DATE, 
Methods VARCHAR(50)
);
## DROP TABLE Ram;

INSERT INTO Ram (Name, Age, Date_Bith, Methods)
VALUES
("Бобер", 4, "2019-06-05", "Бадаться" ),
("Волосатый", 6, "2017-05-30", "БЕЕЕКАТЬ" ),
("Зелень", 2, "2021-10-11", " ");
SELECT * FROM Ram;

CREATE TABLE Horse
(
Id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
Name VARCHAR(10) NOT NULL, 
Age INT, 
Date_Bith DATE, 
Methods VARCHAR(50)
);
## DROP TABLE Horse;
INSERT INTO Horse (Name, Age, Date_Bith, Methods)
VALUES
("Крокант", 5, "2018-05-01", "Кушать сено и сахар, попрошайничать"),
("Камикадзе", 15, "2008-07-11", "Катать детишек"),
("Росинант", 15, "2008-01-01", "Превозмогать, Дон Кихот");
## SELECT * FROM Horse;

CREATE TABLE Camel
(
Id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
Name VARCHAR(10) NOT NULL, 
Age INT, 
Date_Bith DATE, 
Methods VARCHAR(50)
);
## DROP TABLE Camel;
INSERT INTO Camel (Name, Age, Date_Bith, Methods)
VALUES
("Аид", 2, "2021-07-03", "Перевозить грузы и людей"),
("Плевун", 5, "2018-03-21", "Плеваться"),
("Орун", 8, "2015-01-23", "Орать");
## SELECT * FROM Horse;
## Все работет ошибок нет на данном этапе !!
## Удалить из таблицы верблюдов 

DELETE FROM Camel
WHERE Camel.Id >0;

SELECT * FROM Camel;
## НО ПРОЩЕ БЫЛО БЫ УДАЛИТЬ ПРОСТО ТАБЛИЦУ ЦЕЛИКОМ

## Объединить таблицы (Horse, Ram)
CREATE TABLE HorseRam 
(id INT PRIMARY KEY AUTO_INCREMENT)
SELECT Name, Age, Date_Bith, Methods
FROM Horse
UNION 
SELECT Name, Age, Date_Bith, Methods
FROM Ram;

SELECT * FROM HorseRam;
## DROP TABLE HorseRam;

CREATE TABLE CowGoat 
(id INT PRIMARY KEY AUTO_INCREMENT)
SELECT Name, Age, Date_Bith, Methods
FROM Cow
UNION 
SELECT Name, Age, Date_Bith, Methods
FROM Goat;

SELECT * FROM CowGoat;
## DROP TABLE HorseRam;

CREATE TABLE packAnimalUnion 
(id INT PRIMARY KEY AUTO_INCREMENT)
SELECT Name, Age, Date_Bith, Methods
FROM HorseRam
UNION 
SELECT Name, Age, Date_Bith, Methods
FROM CowGoat;

SELECT * FROM packAnimalUnion;
## DROP TABLE HorseRam;


/*Создать новую таблицу “молодые животные” в которую попадут все
животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью
до месяца подсчитать возраст животных в новой таблице*/

CREATE TABLE youngAnimal
(Id INT PRIMARY KEY AUTO_INCREMENT)
SELECT * FROM packAnimalUnion
WHERE ROUND((YEAR(CURRENT_DATE)-YEAR(Date_Bith)+ (MONTH(CURRENT_DATE) -MONTH(Date_Bith))/10),2) as Age_new
FROM packAnimalUnion;





