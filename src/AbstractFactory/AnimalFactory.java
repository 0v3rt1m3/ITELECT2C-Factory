/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

public class AnimalFactory implements AbstractFactory {

    @Override
    public Animal getAnimal(String animalType) {
       if ("Dog".equalsIgnoreCase(animalType)) {
            return new Dog();
        } 
       else if ("Duck".equalsIgnoreCase(animalType)) {
            return new Duck();
        }
       else if ("Bear".equalsIgnoreCase(animalType)){
           return new Bear();
       }
 
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        if ("White".equalsIgnoreCase(colorType)){
            return new White();
        }
        else if ("Brown".equalsIgnoreCase(colorType)){
            return new Brown();
        }
        else if ("Black".equalsIgnoreCase(colorType)){
            return new Black();
        }
        return null;
    }
    
    
    
}
