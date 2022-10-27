create sequence hibernate_sequence start with 1 increment by 1;

    create table Feedback (
       id bigint not null,
        comment varchar(255),
        rating integer,
        primary key (id)
    ) engine=InnoDB;
