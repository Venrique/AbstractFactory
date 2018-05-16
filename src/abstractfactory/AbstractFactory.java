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
public interface AbstractFactory {
    Elfo getElfo(String tipo);
    Orco getOrco(String tipo);
}
