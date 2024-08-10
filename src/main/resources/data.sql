-- Insert directors
INSERT INTO Directors (firstName, lastName) VALUES ('Steven', 'Spielberg');
INSERT INTO Directors (firstName, lastName) VALUES ('Christopher', 'Nolan');
INSERT INTO Directors (firstName, lastName) VALUES ('Martin', 'Scorsese');

-- Insert actors
INSERT INTO Actors (firstName, lastName) VALUES ('Leonardo', 'DiCaprio');
INSERT INTO Actors (firstName, lastName) VALUES ('Tom', 'Hanks');
INSERT INTO Actors (firstName, lastName) VALUES ('Natalie', 'Portman');
INSERT INTO Actors (firstName, lastName) VALUES ('Christian', 'Bale');

-- Insert movies
INSERT INTO Movies (title, releaseYear, director_id) VALUES ('Inception', 2010, 2);
INSERT INTO Movies (title, releaseYear, director_id) VALUES ('Interstellar', 2014, 2);
INSERT INTO Movies (title, releaseYear, director_id) VALUES ('Shutter Island', 2010, 3);
INSERT INTO Movies (title, releaseYear, director_id) VALUES ('Saving Private Ryan', 1998, 1);

-- Insert movie actors relationships
INSERT INTO Movie_Actors (movie_id, actor_id) VALUES (1, 1);  -- Inception, Leonardo DiCaprio
INSERT INTO Movie_Actors (movie_id, actor_id) VALUES (1, 4);  -- Inception, Christian Bale
INSERT INTO Movie_Actors (movie_id, actor_id) VALUES (2, 4);  -- Interstellar, Christian Bale
INSERT INTO Movie_Actors (movie_id, actor_id) VALUES (3, 1);  -- Shutter Island, Leonardo DiCaprio
INSERT INTO Movie_Actors (movie_id, actor_id) VALUES (4, 2);  -- Saving Private Ryan, Tom Hanks
