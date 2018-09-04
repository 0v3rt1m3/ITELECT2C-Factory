/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author Rolland Charles
 */
public class Dog implements Animal{

    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String makeSound() {
      return "Arf-Arf";
    }
    
    
    
}
