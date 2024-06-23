create table topics(
    id bigint not null auto_increment,
    title varchar(100) not null,
    message varchar(100) not null,
    created_at datetime not null,
    status varchar(100) not null,
    author_id bigint not null,
    course varchar(100) not null,
    response varchar(100) not null,

    primary key(id),
    constraint fk_topics_users_id foreign key(author_id) references users(id)
);