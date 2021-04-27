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
public class Envasar implements IElaborar {

    public Envasar() {
    }

    // Implementacion comun para Envasar producto
    @Override
    public void procesar() {
        System.out.println("Alimento envasado");
    }
}
