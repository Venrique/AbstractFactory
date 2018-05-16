/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.Orcos;

/**
 *
 * @author Administrator
 */
public class BestiaMayor implements Orco {

    @Override
    public void Atacar() {
        System.out.println("*Zarpada*");
    }

    @Override
    public void Intimidar() {
        System.out.println("*Rugido que intimida*");
    }
    
}
