create table UNILEVERPLANTAS_ORDEN (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FECHA timestamp not null,
    MONTO decimal(19, 2) not null,
    CLIENTE_ID varchar(36) not null,
    --
    primary key (ID)
);
