CREATE TABLE Pets(
    id INTIGER PRIMARY KEY,
    name TEXT(30) NOT NULL,
    type TEXT(20)
);

INSERT INTO Pets(id, name, type)
VALUES(1,"Muris","Kaķis");

INSERT INTO Pets(id, name, type)
VALUES(2,"Raada","Suns");

INSERT INTO Pets(id, name, type)
VALUES(1,"Poga","Suns");
(4,"Miks", "Kaķis");


SELECT name, type *FROM Pets;