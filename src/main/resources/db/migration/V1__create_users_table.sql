CREATE TABLE users (
    id          UUID                     PRIMARY KEY DEFAULT gen_random_uuid(),
    name varchar(100),
    email varchar(100) unique,
    cpf varchar(11) unique,
    phone varchar(20),
    created_by  VARCHAR(40),
    updated_by  VARCHAR(40),
    created_at  TIMESTAMP WITH TIME ZONE NOT NULL    DEFAULT NOW(),
    updated_at  TIMESTAMP WITH TIME ZONE NOT NULL    DEFAULT NOW()
);
