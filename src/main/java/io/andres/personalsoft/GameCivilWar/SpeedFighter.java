package io.andres.personalsoft.GameCivilWar;

import Interfaces.Ametralladorasable;
import Interfaces.Bombasable;

public class SpeedFighter extends Vehiculo implements Ametralladorasable, Bombasable{

    public SpeedFighter(int cantidadPersonasT, int toneladasTransportadas, String armamentosEquipados) {
        super(cantidadPersonasT, toneladasTransportadas, armamentosEquipados);
    }

    public void rafagasDeBalas() {
        System.out.println("Permite disparar una rafaga de balas");
    }

    public void bombasADiscrecion() {
        System.out.println("Suelta multiples Bombas a discreción");
    }
}
