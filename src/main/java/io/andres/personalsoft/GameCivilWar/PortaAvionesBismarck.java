package io.andres.personalsoft.GameCivilWar;

import Interfaces.RayoElectricoable;
import Interfaces.Ametralladorasable;

 class PortaAvionesBismarck extends Vehiculo implements RayoElectricoable,Ametralladorasable {

     public PortaAvionesBismarck(int cantidadPersonasT, int toneladasTransportadas, String armamentosEquipados) {
        super(cantidadPersonasT, toneladasTransportadas, armamentosEquipados);
    }

    public void rafagasDeBalas() {
        System.out.println("Permite disparar una rafaga de balas");
    }

    public void rayosElectricos() {
        System.out.println("Dispara rayos de calor generados por electricidad");
    }
}
