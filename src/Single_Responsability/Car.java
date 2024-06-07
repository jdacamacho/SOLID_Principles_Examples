/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Single_Responsability;

/**
 *
 * @author jdacamacho
 */
public class Car {
    private long id;
    private String brand;
    
    public Car(long id, String brand){
        this.id = id;
        this.brand = brand;
    }
    
    public long getId(){
        return this.id;
    }
    
    public String getBrand(){
        return this.brand;
    }
    
    public void setbrand(String brand){
        this.brand = brand;
    }
    
    /*
    In this case we are violating the principle of single responsability 
    because in addition to using methods getters and setters, we have repository actions too
    */ 
    
    /* These methods are not correct */
    public void save(){
        
    }
    
    public void update(){
        
    }
    
    public void findAll(){
        
    }
    
    public boolean existsById(){
        return false;
    }
    
    public void delete(){
        
    }
    
}
