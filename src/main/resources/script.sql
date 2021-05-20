-- database and user configuration --
create database agency;
create user 'admin'@'%' identified by 'strongerPassword123';
grant all on agency.* to 'admin'@'%';

-- Initial proffesion data --
insert into tb_profesion values (1, "Abogado");
insert into tb_profesion values (2, "Ingeniería de Sistemas");
insert into tb_profesion values (3, "Administración de empresas");
insert into tb_profesion values (4, "Psicóloga");