-- V2__populate_db.sql
-- Insert clients
INSERT INTO client (name) VALUES
                              ('John Doe'),
                              ('Jane Doe'),
                              ('Mike Jones'),
                              ('Sarah Smith'),
                              ('Peter Brown'),
                              ('Mary Green'),
                              ('David Williams'),
                              ('Emily Johnson'),
                              ('Alex Miller'),
                              ('Jessica Parker');


-- Insert planets
INSERT INTO planet (id, name) VALUES
                                  ('MARS', 'Марс'),
                                  ('VENUS', 'Венера'),
                                  ('MERCURY', 'Меркурій'),
                                  ('EARTH', 'Земля'),
                                  ('JUPITER', 'Юпітер'),
                                  ('SATURN', 'Сатурн'),
                                  ('URANUS', 'Уран'),
                                  ('NEPTUNE', 'Нептун');

-- Insert tickets
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES
                                                                             (NOW(), 1, 'MARS', 'VENUS'),
                                                                             (NOW(), 2, 'VENUS', 'MARS'),
                                                                             (NOW(), 3, 'MARS', 'EARTH'),
                                                                             (NOW(), 4, 'EARTH', 'MARS'),
                                                                             (NOW(), 5, 'JUPITER', 'VENUS'),
                                                                             (NOW(), 6, 'VENUS', 'JUPITER'),
                                                                             (NOW(), 7, 'JUPITER', 'EARTH'),
                                                                             (NOW(), 8, 'EARTH', 'JUPITER'),
                                                                             (NOW(), 9, 'SATURN', 'VENUS'),
                                                                             (NOW(), 10, 'VENUS', 'SATURN');
-- Add any additional data as needed
