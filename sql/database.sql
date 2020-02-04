-- Database: rezepte_db

-- DROP DATABASE rezepte_db;

CREATE DATABASE rezepte_db
    WITH 
    OWNER = rezepte
    ENCODING = 'UTF8'
    LC_COLLATE = 'en_US.utf8'
    LC_CTYPE = 'en_US.utf8'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

GRANT ALL ON DATABASE rezepte_db TO rezepte;