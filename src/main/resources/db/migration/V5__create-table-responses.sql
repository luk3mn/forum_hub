create table responses(
    id bigint not null auto_increment,
    message varchar(100) not null,
    topic_id bigint not null,
    created_at datetime not null,
    author_id bigint not null,
    solution varchar(100) not null,

    primary key(id),
    constraint fk_responses_topics_id foreign key(topic_id) references topics(id),
    constraint fk_responses_users_id foreign key(author_id) references users(id)
);