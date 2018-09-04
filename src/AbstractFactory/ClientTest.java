/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;
public class ClientTest {
    public static void main(String[] args) {
        FactoryProvider fp = new FactoryProvider();
       
        
        System.out.println("" + fp.getFactory("Animal"));
        
        AnimalFactory an = new AnimalFactory();
        
        System.out.println("" + an.getAnimal("Dog"));
        System.out.println("" + an.getColor("White"));
        
        
        
    }
    
}
