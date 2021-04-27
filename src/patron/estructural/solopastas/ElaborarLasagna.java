/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron.estructural.solopastas;

/**
 *
 * @author Yurguen Pinedo
 */
public class ElaborarLasagna extends ElaborarPasta {

    public ElaborarLasagna(IElaborar implementador) {
        this.setImplementador(implementador);
    }

    // Proceso a seguir para producto Lasagna
    @Override
    public void obtener() {
        System.out.println("Preparando lasagna...");
        this.getImplementador().procesar();
    }
}
