create table users(
    id bigint not null auto_increment,
    name varchar(100) not null,
    email varchar(100) not null,
    password varchar(100) not null,
    profiles varchar(100) not null,

    primary key(id)
);