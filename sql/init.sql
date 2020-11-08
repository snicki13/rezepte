CREATE ROLE rezepte WITH
    LOGIN
    NOSUPERUSER
    INHERIT
    NOCREATEDB
    NOCREATEROLE
    NOREPLICATION
    ENCRYPTED PASSWORD 'md557bb7f2a4c1f1fcd1495acc2647ef626';

CREATE DATABASE rezepte_db
    WITH
    OWNER = rezepte
    ENCODING = 'UTF8'
    LC_COLLATE = 'en_US.utf8'
    LC_CTYPE = 'en_US.utf8'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

GRANT ALL ON DATABASE rezepte_db TO rezepte;

insert into
