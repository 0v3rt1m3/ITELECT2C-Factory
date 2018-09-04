/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

public interface AbstractFactory {
    Animal getAnimal(String animalType) ;
    Color getColor(String colorType);
}
