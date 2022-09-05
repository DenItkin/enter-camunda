use enter;

CREATE TABLE TypeVehicle (
	id_type INT NOT NULL AUTO_INCREMENT,
	name_type VARCHAR(50),
	PRIMARY KEY (id_type)
);

CREATE TABLE Vehicle (
	id_vehicle INT NOT NULL AUTO_INCREMENT,
    id_type INT,
	name_type VARCHAR(50),
	PRIMARY KEY (id_vehicle),
    FOREIGN KEY (id_type) REFERENCES TypeVehicle(id_type)
);

CREATE TABLE Client (
	id_client INT NOT NULL AUTO_INCREMENT,
    name_client VARCHAR(50) NOT NULL,
	surname_client VARCHAR(50) NOT NULL,
    age_client INT NOT NULL,
	PRIMARY KEY (id_client)
);

CREATE TABLE RentInfo (
	id_rent INT NOT NULL AUTO_INCREMENT,
    id_client INT NOT NULL,
	id_vehicle INT NOT NULL,
    date_rent_start DATETIME NOT NULL,
    date_rent_end DATETIME NOT NULL,
	PRIMARY KEY (id_rent),
	FOREIGN KEY (id_client) REFERENCES Client(id_client),
	FOREIGN KEY (id_vehicle) REFERENCES Vehicle(id_vehicle)
);