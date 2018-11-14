create table UNILEVERPLANTAS_CLIENTES (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NOMBRE varchar(255) not null,
    EMAIL varchar(255) not null,
    --
    primary key (ID)
);
