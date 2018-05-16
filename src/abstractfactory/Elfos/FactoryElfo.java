/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.Elfos;

import abstractfactory.AbstractFactory;
import abstractfactory.Orcos.Orco;

/**
 *
 * @author Administrator
 */
public class FactoryElfo implements AbstractFactory {

    @Override
    public Elfo getElfo(String tipo) {
        switch (tipo){
            case "Arquero":
                return new Arquero();
            case "Mago":
                return new Mago();
            case "ReyElfo":
                return new ReyElfo();
        }
        return null;
    }

    @Override
    public Orco getOrco(String tipo) {
        return null;
    }
    
}
