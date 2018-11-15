-- begin UNILEVERPLANTAS_CLIENTES
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
)^
-- end UNILEVERPLANTAS_CLIENTES
-- begin UNILEVERPLANTAS_ORDEN
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
)^
-- end UNILEVERPLANTAS_ORDEN
-- begin UNILEVERPLANTAS_PRODUCTO
create table UNILEVERPLANTAS_PRODUCTO (
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
    PRECIO decimal(19, 3),
    --
    primary key (ID)
)^
-- end UNILEVERPLANTAS_PRODUCTO
-- begin UNILEVERPLANTAS_ORDEN_LINEA
create table UNILEVERPLANTAS_ORDEN_LINEA (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ORDEN_ID varchar(36),
    PRODUCTO_ID varchar(36),
    CANTIDAD decimal(19, 3) not null,
    --
    primary key (ID)
)^
-- end UNILEVERPLANTAS_ORDEN_LINEA
