create table users(
username varchar_ignorecase(50) not null primary key,
password varchar_ignorecase(50) not null,
enabled boolean not null
);
create table authorities(
username varchar_ignorecase(50) not null ,
password varchar_ignorecase(50) not null,
constraint fk_authorities_users foreign key(username) references users(username)
);
create unique index idx_authorities_username_authority ON authorities (username, authority);
);