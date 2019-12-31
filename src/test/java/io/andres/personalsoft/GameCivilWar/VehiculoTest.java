package io.andres.personalsoft.GameCivilWar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehiculoTest {

    private Vehiculo vehic;

    @Before
    public void setUp() throws Exception {
        vehic = new Vehiculo(0, 0, "null");
    }

    @Test
    public void getCantidadPersonasT() {
        Assert.assertEquals("La cantidad de pasajeros que puede trasnportar es", 0, vehic.getCantidadPersonasT());
    }

    @Test
    public void getToneladasTransportadas() {
        Assert.assertEquals("La cantidad de toneladas que puede trasnportar es", 0, vehic.getToneladasTransportadas());
    }

    @Test
    public void getArmamentosEquipados() {
        Assert.assertEquals("El armamento que lleva equipado este vehiculo es",null,vehic.getArmamentosEquipados());
    }
}