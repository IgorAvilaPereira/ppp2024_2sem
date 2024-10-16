DROP DATABASE IF EXISTS iterator;

CREATE DATABASE iterator;

\c iterator;

CREATE TABLE menu_item (
    id serial primary key,
    nome text,
    descricao text,
    preco numeric,
    eh_vegetariano boolean
);
