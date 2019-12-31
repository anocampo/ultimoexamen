package io.andres.personalsoft.GameCivilWar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AtaqueTest {

    private Ataque atac;

    @Before
    public void setUp() throws Exception {
        atac = new Ataque("Atacan todos los vehiculos");
    }

    @Test
    public void getataquePeloton() {
        Assert.assertEquals("Los vehiculos deben de atacar","Los vehiculos deben de atacar");
    }
}