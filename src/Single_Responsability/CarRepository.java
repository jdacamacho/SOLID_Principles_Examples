/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Single_Responsability;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jdacamacho
 */
public class CarRepository {
    private List<Car> cars;
    
    public CarRepository(){
        this.cars = new ArrayList<>();
    }
    
    private int existsById(long id){
        for(int pos = 0 ; pos < this.cars.size() ; pos++){
            if(this.cars.get(pos).getId() == id){
                return pos;
            }
        }
        return -1;
    }
    
    public void save(Car newCar) throws Exception{
        if(this.existsById(newCar.getId()) != -1){
            throw new Exception("Duplicate car...");
        }
        this.cars.add(newCar);
    }
    
    public void update(Car newCar) throws Exception{
        int pos = this.existsById(newCar.getId());
        if(pos == -1){
           throw new Exception("Car was not found"); 
        }
        this.delete(newCar.getId());
        this.cars.add(pos, newCar);
    }
    
    public void findAll()throws Exception{
        if(this.cars.isEmpty()){
            throw new Exception("There are no cars...");
        }
        for(int i = 0 ; i < this.cars.size() ; i++){
            System.out.println("Car n" + i + " " + this.cars.get(i).getBrand());
        }
    }
    
    public void delete(long id) throws Exception{
        int pos = this.existsById(id);
        if(pos == -1){
            throw new Exception("Car was not found");
        }
        this.cars.remove(pos);
    }
}
