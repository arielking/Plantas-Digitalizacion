alter table UNILEVERPLANTAS_ORDEN add constraint FK_UNILEVERPLANTAS_ORDEN_ON_CLIENTE foreign key (CLIENTE_ID) references UNILEVERPLANTAS_CLIENTES(ID);
create index IDX_UNILEVERPLANTAS_ORDEN_ON_CLIENTE on UNILEVERPLANTAS_ORDEN (CLIENTE_ID);
