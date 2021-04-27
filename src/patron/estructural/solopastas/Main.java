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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear un objeto de tipo 'AbstraccionRefinada' indicándole un 'ImplementadorConcreto'
        ElaborarPasta ravioli = new ElaborarRavioli(new Cocinar());
        // Realizar el proceso de que se trate (cocinar)
        ravioli.obtener();
        // Cambiar de implementador y realizar el proceso (envasar)
        ravioli.setImplementador(new Envasar());
        ravioli.obtener();
        System.out.println("-------------");
        ElaborarPasta lasagna = new ElaborarLasagna(new Cocinar());
        lasagna.obtener();
        lasagna.setImplementador(new Envasar());
        lasagna.obtener();
    }
}
