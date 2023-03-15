Create Table Filmes(
    id bigint not null primary key auto_increment,
    nomefilme varchar(50),
    idgenero int not null,
    idator int not null
);

Alter table Filmes add constraint FK_Filmes_Genero FOREIGN Key (idgenero) references Genero(id);
Alter table Filmes add constraint FK_Filmes_Ator FOREIGN Key (idator) references Ator(id);

Insert into Filmes (id, nomefilme, idgenero, idator) Values (1, 'Luca',1,1);