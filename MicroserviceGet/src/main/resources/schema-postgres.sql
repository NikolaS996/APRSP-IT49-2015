drop table if exists education CASCADE;
drop table if exists company CASCADE;
drop table if exists employee CASCADE;
drop table if exists sector CASCADE;
drop sequence if exists education_seq;
drop sequence if exists company_seq;
drop sequence if exists employee_seq;
drop sequence if exists sector_seq;

create table education(
	id integer not null,
	name varchar(100) not null,
	level_of_education varchar(10) not null,
	description varchar(500)
);

create table company(
	id integer not null,
	name varchar(100) not null,
	pib integer not null,
	headquarter varchar(100) not null,
	description varchar(500)
);

create table employee(
	id integer not null,
	name varchar(50) not null,
	surname varchar(50) not null,
	id_number integer not null,
	education integer not null,
	sector integer not null
);

create table sector(
	id integer not null,
	name varchar(100) not null,
	tag varchar(10) not null,
	company integer not null
);

alter table education add constraint pk_education primary key (id);
alter table company add constraint pk_company primary key (id);
alter table employee add constraint pk_employee primary key (id);
alter table sector add constraint pk_sector primary key (id);

alter table sector add constraint fk_sector_company foreign key (company) references company(id);
alter table employee add constraint fk_employee_sector foreign key (sector) references sector(id);
alter table employee add constraint fk_employee_education foreign key (education) references education(id);

create index idxpk_education on education(id);
create index idxpk_company on company(id);
create index idxpk_employee on employee(id);
create index idxpk_sector on sector(id);

create index idxfk_sector_company on sector(company);
create index idxfk_employee_sector on employee(sector);
create index idxfk_employee_education on radnik(education);

create sequence education_seq
increment 1;
create sequence company_seq
increment 1;
create sequence employee_seq
increment 1;
create sequence sector_seq
increment 1;