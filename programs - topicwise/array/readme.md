create table ground (
id text primary key,
name text not null,
type text not null check (type in ('coastal', 'offshore', 'high seas', 'freshwater')),
location text not null
);
create table fleet (
id text primary key,
name text not null,
ground_id text not null,
foreign key (ground_id) references ground(id)
);
create table fish (
id text primary key,
name text not null,
reproduction rate real not null,
price real not null,
weight integer not null weight in lbs
);
create table fish_population (
fish id text not null,
ground_id text not null,
population integer not null,
foreign key (fish id) references fish(id), 
foreign key (ground_id) references ground(id), 
primary key (fish_id, ground_id)
);
create table vessel (

id text primary key,
fleet_id text not null,
type text not null,
capacity integer not null -- capacity in tons
);


create table equipment_type (
id text primary key, 
name text not null,
price integer not null,
lifespan integer not null
);
create table equipment ( 
id text primary key,
equipment_type_id text not null,
age integer not null,
foreign key (equipment_type_id) references equipment_type_id(id)
);
create table vessel_equipment (
vessel id text not null,
equipment_id text not null,
Foreign key (vessel_id) references vessel(id),
Foreign key (equipment_id) references equipment(id),
primary key (vessel_id, equipment_id)
);
create table orders (
id text primary key,
fleet_id text not null,
equipment_id text not null,
order_count integer not null, 
order date text not null,
foreign key (fleet_id) references vessel (fleet_id), 
foreign key (equipment_id) references equipment(id)
);
create table campaign ( 
id text primary key,
fleet_id text not null,
start_date text not null,
end date text
);

create table catchment (
campaign_id text not null,
fish id text not null,
count integer not null,
foreign key (campaign_id) references campaign(id),
foreign key (fish_id) references fish(id),
primary key (campaign_id, fish_id)
);
INSERT INTO ground (id, name, type, location) VALUES
('1', 'Pacific Coast', 'coastal', 'California'),
('2', 'Gulf of Mexico', 'offshore", "Texas'),
('3', 'Great Lakes', 'freshwater', 'Michigan'),
('4', 'Atlantic Coast', 'coastal', 'Florida'), 
('5', 'Caribbean Sea, high seas', 'Caribbean');

INSERT INTO fleet (id, name, ground_id) VALUES
('1', 'California Fleet', '1'),
('2', 'Gulf Fleet', '2'),
('3', 'Lakes Fleet', '3').
('4", 'Florida Fleet', '4'),
('5', 'Caribbean Fleet', '5'),
('6', 'Alaskan Fleet', '6').
('7', 'East Coast Fleet', '7'),
('8', 'Great Pacific Fleet', '1');
INSERT INTO fish (id, name, reproduction rate, price, weight) VALUES
('1', 'Salmon', 1.5, 20.00, 4),
('2', 'Tuna', 1.3, 25.00, 28),
('3', 'Shrimp', 1.2, 15.00, 0.01),
('4', 'Cod', 1.4, 18.00, 5),
('5', 'Halibut', 1.1, 22.88, 25),
('6', 'Lobster', 1.6, 30.66, 1),
('7', 'Crab', 1.2, 20.00, 0.5),
('8', 'Sardines', 1.8, 5.00, 0.1),
('9', 'Herring', 1.4, 4.00, 0.15), 
('10', 'Trout', 1.3, 12.00, 2),
('11', 'Catfish', 1.2, 8.00, 10);
INSERT INTO fish population (fish_id, ground_id, population) VALUES
('1', '1', 5000),
('1', '4', 3000),
('2', '2', 3800),
('2', '4', 1500),
('3', '3', 2000),
('4', '1', 4000),
('5', '2', 2500),
('6', '3', 1500),
('7', '1', 3000),
('8', '2', 4500),
('9', '3', 2800),
('10', '1', 3500),
('11', '2', 2200);
INSERT INTO vessel (id, fleet id, type, capacity) VALUES
('1', '1', 'Trawler', 500),
('2', '1', 'Purse Seine', 300),
('3', '2', 'Shrimp Boat', 200),
('4', '2', 'Longliner', 150),
('5', '3', 'Trawler', 460).
('6', '3', 'Gillnetter', 250),
('7', '4', 'Purse Seine', 358),
('8', '4', 'Lobster Boat', 186),
('9', '5', 'Trawler', 660),
('10', '5', 'Skiff', 150),
('11', '6', 'Longliner', 258),
('12', '6', 'Skiff", 200),
('13', '7', 'Trawler', 550),
('14', '7', 'Purse Seine', 400),
('15', '8', 'Gillnetter', 388),
('16', '8', 'Skiff', 188),
('17', '1', 'Crabber", 250),
('18', '2', 'Cutter', 350),
('19', '3', 'Barge', 500),
('20', '4', 'Catamaran', 450),
('21', '5', 'Catamaran', 500),
('22', '6', 'Cutter', 360);
INSERT INTO equipment_type (id, name, price, lifespan) VALUES
('1', 'Sonar System', 5000, 5),
('2', 'GPS Navigation', 2006, 3),
('3', 'Fishing Nets', 1000, 2),
('4', 'Radar System, 3000, 4),
('5', 'Ice Machine', 1560, 5),
('6', 'Fish Finder', 2500, 4),
('7', 'Safety Gear, 1600, 3);
INSERT INTO equipment (id, equipment_type_id, age) VALUES
('1', '1', 2),
('2', '1', 1),
('3', '2', 3),
('4', '2', 2),
('5', '3', 1),
('6', '3', 3),
('7', '4', 2),
('8', '4', 1).
('9', '5', 3),
('10', '5', 2),
('11', '6', 1),
('12', '6', 2),
('13', '7', 3),
('14', '7', 2),
('15', '1', 3).
('16', '2', 1),
('17', '3', 2),
('18', '4', 3),
('19', '5', 2),
('28', '6', 1),
('21', '7', 2),
('22', '1', 2),
('23', '2', 1),
('24', '3', 3),
('25', '4', 2),
('26', '5', 1),
('27', '6', 3),
('28', '7', 2),
('29', '1', 1),
('30', '2', 2)
('31', '3', 1),
('32', '4', 3),
('33', '5', 2),
('34', '6', 1),
('35', '7', 2),
('36', '2', 3),
('37', '3', 2),
('38', '4', 1),
('39', '5', 3),
('48', '6', 2),
('41', '1', 2),
('42', '2', 1),
('43', '3', 3),
('44', '4', 2),
('45', '5', 1),
('46', '6', 3),
('47', '7', 2),
('48', '3', 1),
('49', '4', 2),
('50', '5', 3);
INSERT INTO vessel_equipment (vessel_id, equipment_id) VALUES
('1', '1'),
('1', '2'),
('2', '3'),
('2', '4'),
('3', '5'),
('3', '6'),
('4', '7').
('4', '8'),
('5', '9'),
('5', '10'),
('6', '11'),
('6', '12'),
('7', '13'),
('7', '14'),
('8', '15').
('8', '16'),
('9', '17'),
('9', '18'),
('10', '19'),
('10', '20'),
('11', '21'),
('11', '22'),
('12', '23'),
('12', '24').
('13', '25'),
('13', '26'),
('14', '27'),
('14', '28'),
('15', '29'),
('15', '30'),
('16', '31'),
('16', '32'),
('17', '33'),
('17', '34').
('18', '35'),
('18', '36'),
('19', '37'),
('19', '38').
('20', '39'),
('20', '40'),
('21', '41'),
('21', '42'),
('22', '43'),
('22', '44'),
('23', '45'),
('23', '46'),
('24', '47'),
('24', '48').
('25', '49'),
('25', '50');
INSERT INTO orders (id, fleet_id, equipment_id, order_count, order_date) VALUES
('1', '1', 'T', 2, '2017-08-06'),
('2', '1', '2', 3, '2017-07-20'),
('3', '2', '3', 1, '2018-08-03'),
('4', '2', '4', 2, '2018-07-15'),
('5', '3', '5', 3, '2019-08-10'),
('6', '3', '6', 1, '2019-07-25'),
('7', '4', '7', 2, '2020-08-08'),
('8', '4', '8', 1, '2020-07-28'),
('9', '5', '9', 3, '2017-08-12'),
('10', '5', '10', 2, '2018-07-30'),
('11', '6', '11', 1, '2019-08-15'),
('12', '6', '12', 2, '2019-08-01'),
('13', '7', '13', 3, '2020-07-22′),
('14', '7', '14', 2, 2017-08-05'),
('15', '8', '15', 1, '2018-07-18'),
('16', '8', '16', 2, 2019-08-10'),
('17', '9', '17', 3, '2020-07-25'),
('18', '9', '18', 2, '2017-08-03'),
('19', '10', '19', 1, '2018-07-30'),
('20', '10', '20', 2, '2019-08-08');
INSERT INTO campaign (id, fleet_id, start_date, end_date) VALUES
('1', '1', '2017-06-01', '2017-09-30'),
('2', '2', '2017-07-15', '2017-10-15'),
('3', '3', '2018-05-01 ', '2018-09-01'),
('4', '4', '2018-06-15', '2018-09-30')
('5', '5', '2019-04-01', '2019-08-15'),
('6', '6', '2019-05-15', '2019-09-30)
('7', '7', '2020-06-01', '2020-09-15'),
('8', '8', '2020-07-15", "2020-10-31'),
('9', '1', '2017-11-01', '2018-02-28'), 
('10', '3', '2018-11-15', '2019-03-15'),
('11', '5', '2019-10-01', '2020-01-15"),
('12', '7', '2020-02-01', '2020-05-15);
INSERT INTO catchment (campaign id, fish id, count) VALUES
('1', '1', 588),
('1', '2', 300),
('2', '3', 200), 
('2', '4', 150 ),
('3', '5', 400),
('3', '6', 258),
('4', '7', 300),
('4', '8', 180),
('5', '9', 250),
('5', '10', 120),
('6', '11', 150),
('6', '1', 200),
('7', '2', 350),
('7', '3', 220),
('8', '4', 180),
('8', '5', 300),
('9', '6', 250),
('9', '7', 150),
('10', '8', 400),
('10', '9', 280),
('11', '10', 320),
('11', '11', 200),
('12', '1', 450),
('12', '2', 280);