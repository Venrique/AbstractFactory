/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.Orcos;

import abstractfactory.AbstractFactory;
import abstractfactory.Elfos.Elfo;

/**
 *
 * @author Administrator
 */
public class FactoryOrco implements AbstractFactory {

    @Override
    public Elfo getElfo(String tipo) {
        return null;
    }

    @Override
    public Orco getOrco(String tipo) {
        switch(tipo){
            case "Lanzador":
                return new Lanzador();
            case "Hechicero":
                return new Hechicero();
            case "BestiaMayor":
                return new BestiaMayor();
        }
        
        return null;
    }
    
}
