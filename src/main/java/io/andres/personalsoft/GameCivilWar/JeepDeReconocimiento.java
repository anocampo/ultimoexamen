package io.andres.personalsoft.GameCivilWar;

import Interfaces.Ametralladorasable;

public class JeepDeReconocimiento extends Vehiculo implements Ametralladorasable {

    public JeepDeReconocimiento(int cantidadPersonasT, int toneladasTransportadas, String armamentosEquipados) {
        super(cantidadPersonasT, toneladasTransportadas, armamentosEquipados);
    }

    public void rafagasDeBalas() {
        System.out.println("Permite disparar una rafaga de balas");
    }
}
