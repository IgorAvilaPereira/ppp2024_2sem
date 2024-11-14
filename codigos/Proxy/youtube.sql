DROP DATABASE IF EXISTS youtube;

CREATE DATABASE youtube;

\c youtube;

CREATE TABLE video (
    id serial primary key,
    video_id character varying(100) not null,
    autor text,
    title text,
    is_live boolean default false,
    UNIQUE(video_id) 
);
