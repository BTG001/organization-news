CREATE DATABASE news_api;
\c news_api;

CREATE TABLE IF NOT EXISTS departments(
 id SERIAL PRIMARY KEY,
 name VARCHAR,
 description VARCHAR,
 numberOfemployees INTEGER
);

CREATE TABLE IF NOT EXISTS news (
 id SERIAL PRIMARY KEY,
 name VARCHAR
);

CREATE TABLE users (
 id SERIAL PRIMARY KEY,
 roles VARCHAR,
 position VARCHAR,
 departmentId INTEGER,
 createdat BIGINT
);


CREATE DATABASE news_api_test WITH TEMPLATE news_api;