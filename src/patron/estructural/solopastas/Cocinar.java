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
public class Cocinar implements IElaborar {

    public Cocinar() {
    }

    // Implementacion comun para Cocinar producto
    @Override
    public void procesar() {
        System.out.println("Alimento cocinado");
    }
}
