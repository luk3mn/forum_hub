create table users(
    id bigint not null auto_increment,
    name varchar(100) not null,
    email varchar(100) not null,
    password varchar(100) not null,
    profiles_id bigint not null,

    primary key(id),
    constraint fk_users_profiles_id foreign key(profiles_id) references profiles(id)
);