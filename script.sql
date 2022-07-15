create table pupil
(
    id        integer,
    firstname varchar(40),
    lastname  varchar(40),
    gender    varchar(10),
    grade     integer
);

alter table pupil
    owner to postgres;

create table teacher
(
    id        integer,
    firstname varchar(40),
    lastname  varchar(40),
    gender    varchar(10),
    subject   varchar(40)
);

alter table teacher
    owner to postgres;


