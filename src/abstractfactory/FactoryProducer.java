/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import abstractfactory.Elfos.FactoryElfo;
import abstractfactory.Orcos.FactoryOrco;

/**
 *
 * @author Administrator
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String tipo){
        switch(tipo){
            case "Elfo":
                return new FactoryElfo();
            case "Orco":
                return new FactoryOrco();
        }
        return null;
    }
}
