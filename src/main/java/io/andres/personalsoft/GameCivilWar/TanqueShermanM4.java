package io.andres.personalsoft.GameCivilWar;

import Interfaces.Ametralladorasable;
import Interfaces.RayoDesintegradorable;
import Interfaces.RayoElectricoable;

public class TanqueShermanM4 extends Vehiculo implements Ametralladorasable, RayoElectricoable, RayoDesintegradorable {

    public TanqueShermanM4(int cantidadPersonasT, int toneladasTransportadas, String armamentosEquipados) {
        super(cantidadPersonasT, toneladasTransportadas, armamentosEquipados);
    }

    public void rafagasDeBalas() {
        System.out.println("Permite disparar una rafaga de balas");
    }

    public void laserMolecular() {
        System.out.println("Dispara un laser que desintegra en particulas moleculares");
    }

    public void rayosElectricos() {
        System.out.println("Dispara rayos de calor generados por electricidad");
    }
}
