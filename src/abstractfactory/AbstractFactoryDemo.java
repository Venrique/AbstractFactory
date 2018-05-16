/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import abstractfactory.Elfos.Elfo;
import abstractfactory.Orcos.Orco;

/**
 *
 * @author Administrator
 */
public class AbstractFactoryDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractFactory factory;
        
        factory = FactoryProducer.getFactory("Elfo");
        Elfo arquero = factory.getElfo("Arquero");
        Elfo mago = factory.getElfo("Mago");
        Elfo rey = factory.getElfo("ReyElfo");
        
        System.out.println("- - - Turno Elfos - - -");
        System.out.println("Ataque arquero: ");
        arquero.Atacar();
        System.out.println("Ataque mago: ");
        mago.Atacar();
        System.out.println("Ataque rey:");
        rey.Atacar();
        
        System.out.println("");
        
        factory = FactoryProducer.getFactory("Orco");
        Orco lanzador = factory.getOrco("Lanzador");
        Orco hechicero = factory.getOrco("Hechicero");
        Orco bestia = factory.getOrco("BestiaMayor");
        
        System.out.println("- - - Turno Orcos - - -");
        System.out.println("Ataque lanzador: ");
        lanzador.Atacar();
        System.out.println("Ataque hechicero: ");
        hechicero.Atacar();
        System.out.println("Ataque Bestia Mayor: ");
        bestia.Atacar();
        System.out.println("");
        bestia.Intimidar();
    }
    
}
