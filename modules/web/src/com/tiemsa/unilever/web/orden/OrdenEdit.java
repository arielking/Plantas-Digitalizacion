package com.tiemsa.unilever.web.orden;

import com.haulmont.cuba.gui.components.AbstractEditor;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.tiemsa.unilever.entity.Orden;
import com.tiemsa.unilever.entity.OrdenLinea;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;

public class OrdenEdit extends AbstractEditor<Orden> {


    @Inject
    private CollectionDatasource<OrdenLinea, UUID> lineaDs;

    @Override
    public void init(Map<String, Object> params) {
        lineaDs.addCollectionChangeListener(e -> calcularMonto());


    }
    private void calcularMonto(){

        BigDecimal monto=BigDecimal.ZERO;

        for (OrdenLinea linea : lineaDs.getItems())
            monto = monto.add(linea.getProducto().getPrecio().multiply(linea.getCantidad()));
        getItem().setMonto(monto);


    }
}