package io.andres.personalsoft.GameCivilWar;

import Interfaces.Ametralladorasable;
import Interfaces.Bombasable;

public class BombarderoB56 extends Vehiculo implements Bombasable, Ametralladorasable {

    public BombarderoB56(int cantidadPersonasT, int toneladasTransportadas, String armamentosEquipados) {
        super(cantidadPersonasT, toneladasTransportadas, armamentosEquipados);
    }

    public void rafagasDeBalas() {
        System.out.println("Permite disparar una rafaga de balas");
    }

    public void bombasADiscrecion() {
        System.out.println("Suelta multiples Bombas a discreción");

    }
}
