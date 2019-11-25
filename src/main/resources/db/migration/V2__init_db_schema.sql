create table service
(
    id   int8 not null,
    name varchar(255),
    description varchar(255),
    primary key (id)
);

create table skill
(
    id   int8 not null,
    name varchar(255),
    primary key (id)
);

create table worker
(
    id               int8 not null,
    name             varchar(255),
    second_name      varchar(255),
    self_description varchar(1000),
    primary key (id)
);

create table worker_services
(
    worker_id   int8 not null,
    services_id int8 not null
);

create table worker_skills
(
    worker_id int8 not null,
    skills_id int8 not null
);

alter table if exists worker_services
    drop constraint if exists UK_pbc5fjto6nwi4ewhjc1dmm78u;


alter table if exists worker_skills
    drop constraint if exists UK_1g4yne8708dhoejn7jirs3kv7;

alter table if exists worker_services
    add constraint FKyg6nqhp3hkf3kddycg16j6bo
        foreign key (services_id)
            references service;

alter table if exists worker_services
    add constraint FKp0jmgd9aptw29qg8qlo7klvgk
        foreign key (worker_id)
            references worker;

alter table if exists worker_skills
    add constraint FKg8bnnre1he7tkx59b5byaxx4j
        foreign key (skills_id)
            references skill;

alter table if exists worker_skills
    add constraint FKn09787xqhmvrtg20sryml9fsa
        foreign key (worker_id)
            references worker;
