/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Single_Responsability;

/**
 *
 * @author jdacamacho
 */
public class Main_Single_responsability {
    
    public static void main(String[] args) throws Exception {
       /* Single responsability */
       /* Now we have a class that is responsible for performing repository actions*/
       CarRepository serviceBD = new CarRepository();
       Car car1 = new Car(1,"Brand 1");
       Car car2 = new Car(2,"Brand 2");
       Car car3 = new Car(1,"Brand update");
        
       serviceBD.save(car1);
       serviceBD.save(car2);
       serviceBD.update(car3);
       serviceBD.findAll();
    }
}
