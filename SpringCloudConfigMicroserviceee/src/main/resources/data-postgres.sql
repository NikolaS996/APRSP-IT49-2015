insert into education(id, name, level_of_education, description) values (nextval('education_seq'), 'Diplomirani inženjer informacionih tehnologija', 'VII', 'IIS na FTN-u');
insert into education(id, name, level_of_education, description) values (nextval('education_seq'), 'Diplomirani inženjer elektrotehnike i računarstva', 'VII-2', 'E3 na FTN-u');
insert into education(id, name, level_of_education, description) values (nextval('education_seq'), 'Diplomirani ekonomista', 'VII', 'Finansije, bankarstvo i osiguranje na Ekonomskom fakultetu');
insert into education(id, name, level_of_education, description) values (nextval('education_seq'), 'Trgovac', 'III', 'Ekonomska škola "Svetozar Miletić"');
insert into education(id, name, level_of_education, description) values (nextval('education_seq'), 'Elektrotehničar računara', 'IV', 'ETŠ "Mihajlo Pupin"');
insert into education(id, name, level_of_education, description) values (nextval('education_seq'), 'Diplomirani pravnik', 'VII-2', 'Opšti smer na Pravnom fakultetu');
insert into education(id, name, level_of_education, description) values (nextval('education_seq'), 'Diplomirani inženjer mehatronike', 'VII', 'Mehatronika na FTN-u');
insert into education(id, name, level_of_education, description) values (nextval('education_seq'), 'Diplomirani inženjer menadžmenta', 'VII', 'IM na FTN-u');


insert into company(id, name, pib, headquarter, description) values (nextval('company_seq'), 'Levi9', 123456789, 'Novi Sad, Srbija', 'IT firma koja razvija IT rešenja za razne klijente.');
insert into company(id, name, pib, headquarter, description) values (nextval('company_seq'), 'Vega IT Sourcing', 111258499, 'Novi Sad, Srbija', 'IT firma koja razvija Enterprise sisteme, vebsajt aplikacije, mobilne aplikacije, itd.');
insert into company(id, name, pib, headquarter, description) values (nextval('company_seq'), 'FSD', 33456777, 'Novi Sad, Srbija', 'IT firma koja razvija veb ERP sisteme i kompleksne veb aplikacije.');
insert into company(id, name, pib, headquarter, description) values (nextval('company_seq'), 'Devoteam', 134679259, 'Francuska', 'IT firma koja pruža konsalting usluge raznim klijentima.');
insert into company(id, name, pib, headquarter, description) values (nextval('company_seq'), 'RT-RK', 968698764, 'Novi Sad, Srbija', 'IT firma koja se bavi istraživanjem i razvojem.');
insert into company(id, name, pib, headquarter, description) values (nextval('company_seq'), 'Sixsentix', 444789634, 'Švajcarska', 'IT firma koja se bavi testiranjem i analitikom softvera i izveštavanjem kao i pomaganjem klijenata.');


insert into sector(id, name, tag, company) values (nextval('sector_seq'), 'Marketing', 'M', 1);
insert into sector(id, name, tag, company) values (nextval('sector_seq'), 'Ljudski resursi', 'HR', 1);
insert into sector(id, name, tag, company) values (nextval('sector_seq'), 'Računovodstvo', 'F', 1);
insert into sector(id, name, tag, company) values (nextval('sector_seq'), 'Razvoj', 'D', 1);
insert into sector(id, name, tag, company) values (nextval('sector_seq'), 'Testiranje', 'T', 1);
insert into sector(id, name, tag, company) values (nextval('sector_seq'), 'Marketing', 'M', 2);
insert into sector(id, name, tag, company) values (nextval('sector_seq'), 'Ljudski resursi', 'HR', 2);
insert into sector(id, name, tag, company) values (nextval('sector_seq'), 'Računovodstvo', 'F', 2);
insert into sector(id, name, tag, company) values (nextval('sector_seq'), 'Razvoj', 'D', 2);
insert into sector(id, name, tag, company) values (nextval('sector_seq'), 'Marketing', 'M', 3);
insert into sector(id, name, tag, company) values (nextval('sector_seq'), 'Ljudski resursi', 'HR', 3);
insert into sector(id, name, tag, company) values (nextval('sector_seq'), 'Računovodstvo', 'F', 3);
insert into sector(id, name, tag, company) values (nextval('sector_seq'), 'Razvoj', 'D', 3);
insert into sector(id, name, tag, company) values (nextval('sector_seq'), 'Marketing', 'M', 4);
insert into sector(id, name, tag, company) values (nextval('sector_seq'), 'Ljudski resursi', 'HR', 4);
insert into sector(id, name, tag, company) values (nextval('sector_seq'), 'Računovodstvo', 'F', 4);
insert into sector(id, name, tag, company) values (nextval('sector_seq'), 'Razvoj', 'D', 4);
insert into sector(id, name, tag, company) values (nextval('sector_seq'), 'Marketing', 'M', 5);
insert into sector(id, name, tag, company) values (nextval('sector_seq'), 'Ljudski resursi', 'HR', 5);
insert into sector(id, name, tag, company) values (nextval('sector_seq'), 'Računovodstvo', 'F', 5);
insert into sector(id, name, tag, company) values (nextval('sector_seq'), 'Razvoj', 'D', 5);
insert into sector(id, name, tag, company) values (nextval('sector_seq'), 'Marketing', 'M', 6);
insert into sector(id, name, tag, company) values (nextval('sector_seq'), 'Ljudski resursi', 'HR', 6);
insert into sector(id, name, tag, company) values (nextval('sector_seq'), 'Računovodstvo', 'F', 6);
insert into sector(id, name, tag, company) values (nextval('sector_seq'), 'Razvoj', 'D', 6);


--Levi9
insert into employee(id, name, surname, id_number, education, sector) values (nextval('employee_seq'), 'Nemanja', 'Žunić', 131099180, 1, 5);
insert into employee(id, name, surname, id_number, education, sector) values (nextval('employee_seq'), 'Nemanja', 'Mitić', 110899080, 2, 4);
insert into employee(id, name, surname, id_number, education, sector) values (nextval('employee_seq'), 'Branislava', 'Duvnjak', 121299180, 3, 3);
insert into employee(id, name, surname, id_number, education, sector) values (nextval('employee_seq'), 'Dejan', 'Slijepčević', 240298980, 2, 4);
insert into employee(id, name, surname, id_number, education, sector) values (nextval('employee_seq'), 'Marko', 'Antonić', 230598780, 1, 5);
insert into employee(id, name, surname, id_number, education, sector) values (nextval('employee_seq'), 'Vladimir', 'Barbul', 181199080, 8, 2);
insert into employee(id, name, surname, id_number, education, sector) values (nextval('employee_seq'), 'Krsto', 'Savić', 111199180, 1, 1);
--Vega IT
insert into employee(id, name, surname, id_number, education, sector) values (nextval('employee_seq'), 'Neven', 'Milakara', 240498780, 1, 9);
insert into employee(id, name, surname, id_number, education, sector) values (nextval('employee_seq'), 'Isidora', 'Lekić', 190199180, 6, 8);
insert into employee(id, name, surname, id_number, education, sector) values (nextval('employee_seq'), 'Marija', 'Papuga', 180299280, 2, 9);
insert into employee(id, name, surname, id_number, education, sector) values (nextval('employee_seq'), 'Marija', 'Vučetić', 170399380, 8, 6);
insert into employee(id, name, surname, id_number, education, sector) values (nextval('employee_seq'), 'Maja', 'Nedučić', 260499480, 3, 7);
--FSD
insert into employee(id, name, surname, id_number, education, sector) values (nextval('employee_seq'), 'Branko', 'Mitrović', 370599280, 1, 10);
insert into employee(id, name, surname, id_number, education, sector) values (nextval('employee_seq'), 'Dušan', 'Petrović', 380699180, 2, 11);
insert into employee(id, name, surname, id_number, education, sector) values (nextval('employee_seq'), 'Jelena', 'Vuković', 390799080, 3, 12);
insert into employee(id, name, surname, id_number, education, sector) values (nextval('employee_seq'), 'Srđan', 'Budalić', 100899280, 4, 13);
insert into employee(id, name, surname, id_number, education, sector) values (nextval('employee_seq'), 'Aleksandar', 'Đokić', 110999080, 5, 13);
insert into employee(id, name, surname, id_number, education, sector) values (nextval('employee_seq'), 'Nemanja', 'Đatkov', 121098980, 6, 12);
--Devoteam
insert into employee(id, name, surname, id_number, education, sector) values (nextval('employee_seq'), 'Dajana', 'Mitrović', 131199080, 1, 14);
insert into employee(id, name, surname, id_number, education, sector) values (nextval('employee_seq'), 'Marija', 'Habek', 141299180, 2, 15);
insert into employee(id, name, surname, id_number, education, sector) values (nextval('employee_seq'), 'Srećko', 'Crevar', 150199280, 3, 16);
insert into employee(id, name, surname, id_number, education, sector) values (nextval('employee_seq'), 'Neda', 'Zlatić', 160298880, 4, 17);
insert into employee(id, name, surname, id_number, education, sector) values (nextval('employee_seq'), 'Dejan', 'Rašić', 170398980, 5, 17);
--RT-RK
insert into employee(id, name, surname, id_number, education, sector) values (nextval('employee_seq'), 'Vladimir', 'Kovačević', 180497080, 1, 18);
insert into employee(id, name, surname, id_number, education, sector) values (nextval('employee_seq'), 'Nikola', 'Teslić', 190596880, 2, 19);
insert into employee(id, name, surname, id_number, education, sector) values (nextval('employee_seq'), 'Milenko', 'Berić', 200698080, 3, 20);
insert into employee(id, name, surname, id_number, education, sector) values (nextval('employee_seq'), 'Velibor', 'Mihić', 210797980, 4, 21);
insert into employee(id, name, surname, id_number, education, sector) values (nextval('employee_seq'), 'Mile', 'Davidović', 220898080, 5, 20);
--Sixsentix
insert into employee(id, name, surname, id_number, education, sector) values (nextval('employee_seq'), 'Ivana', 'Stojanović', 230999480, 1, 22);
insert into employee(id, name, surname, id_number, education, sector) values (nextval('employee_seq'), 'Nevena', 'Ćirić', 241099380, 2, 23);
insert into employee(id, name, surname, id_number, education, sector) values (nextval('employee_seq'), 'Maja', 'Davidov', 251199080, 3, 24);
insert into employee(id, name, surname, id_number, education, sector) values (nextval('employee_seq'), 'Đorđe', 'Ugren', 261298980, 4, 25);