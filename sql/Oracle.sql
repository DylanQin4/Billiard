-----------------------ORACLE------------------------------

-----------------------------------------------------------
connect system;
create user billiard identified by billiard;
grant connect to billiar;
grant all privileges to billiard;

CREATE TABLE player ( 
    idPlayer NUMBER(10)  PRIMARY KEY , 
    namePlayer VARCHAR2(10)
);
CREATE TABLE championship(
	idChampionship NUMBER(18) PRIMARY KEY,
	years NUMBER(4) check (years>2020 and years<2050)
);
CREATE TABLE match ( 
    idMatch NUMBER(18)  PRIMARY KEY ,
	idChampionship NUMBER(18),
	idPlayer1 NUMBER(10),
	idPlayer2 NUMBER(10),
    dateMatch DATE,
	FOREIGN KEY (idChampionship) REFERENCES championship(idChampionship),
	FOREIGN KEY (idPlayer1) REFERENCES player(idPlayer),
	FOREIGN KEY (idPlayer2) REFERENCES player(idPlayer)
);
CREATE TABLE score(
	idMatch NUMBER(18),
	nbShotP1 NUMBER(10) check (nbShotP1>0 or nbShotP1=0),
	nbGoalP1 NUMBER(10) check (nbGoalP1>0 or nbGoalP1=0),
	nbShotP2 NUMBER(10) check (nbShotP2>0 or nbShotP2=0),
	nbGoalP2 NUMBER(10) check (nbGoalP2>0 or nbGoalP2=0),
	FOREIGN KEY (idMatch) REFERENCES Match(idMatch)
);
create sequence player_seq start with 1;
create sequence Macth_seq start with 1;
create sequence championship_seq start with 1;

-- row by row, after row: '/';
CREATE OR REPLACE TRIGGER declenchIdPlayer BEFORE INSERT ON player FOR EACH ROW BEGIN SELECT player_seq.NEXTVAL INTO :new.idplayer FROM dual; END;
CREATE OR REPLACE TRIGGER declenchMatch BEFORE INSERT ON match FOR EACH ROW BEGIN SELECT Macth_seq.NEXTVAL INTO :new.idMatch FROM dual; END;
CREATE OR REPLACE TRIGGER declenchChampionship BEFORE INSERT ON championship FOR EACH ROW BEGIN SELECT championship_seq.NEXTVAL INTO :new.idChampionship FROM dual; END;
