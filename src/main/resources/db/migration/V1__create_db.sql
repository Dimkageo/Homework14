-- Create tables
-- V1__create_db.sql

CREATE TABLE client (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        name VARCHAR(200) NOT NULL
);

CREATE TABLE planet (
                        id VARCHAR(50) NOT NULL PRIMARY KEY,
                        name VARCHAR(500) NOT NULL
);

CREATE TABLE ticket (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        created_at TIMESTAMP NOT NULL,
                        client_id INT NOT NULL,
                        from_planet_id VARCHAR(50) NOT NULL,
                        to_planet_id VARCHAR(50) NOT NULL,
                        FOREIGN KEY (client_id) REFERENCES client (id),
                        FOREIGN KEY (from_planet_id) REFERENCES planet (id),
                        FOREIGN KEY (to_planet_id) REFERENCES planet (id)
);



