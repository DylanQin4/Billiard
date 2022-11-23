-----------------------POSTGRESQL-------------------------
---------creation de database
create database billiard;
---------connection a la database"billiard";
\c billiard;
---------creation d'une table
create table shot (
	idPlayer int,
	idMatch int,
	shotTime Time not null default current_time
);
---------description d'une table
\d nomtable;
---------