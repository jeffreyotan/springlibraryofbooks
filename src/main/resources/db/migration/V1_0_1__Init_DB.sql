CREATE TABLE IF NOT EXISTS books (
	id SERIAL PRIMARY KEY,
	title TEXT NOT NULL,
	author TEXT NOT NULL,
	language VARCHAR(15) NOT NULL
);
