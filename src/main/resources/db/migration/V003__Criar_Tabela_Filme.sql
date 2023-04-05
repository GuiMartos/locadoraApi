Create Table Filmes(
    id bigint not null primary key auto_increment,
    nomefilme varchar(50),
    idgenero int not null,
    idator int not null
);

Alter table Filmes add constraint FK_Filmes_Genero FOREIGN Key (idgenero) references Genero(id);
Alter table Filmes add constraint FK_Filmes_Ator FOREIGN Key (idator) references Ator(id);

Insert into Filmes (nomefilme, idgenero, idator) Values ('Luca',1,1);
Insert into Filmes (nomefilme, idgenero, idator) Values ('Os Incriveis',2,2);
Insert into Filmes (nomefilme, idgenero, idator) Values ('A Princesa e o Sapo',3,3);