/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1stage1;

/**
 *
 * @author ASUS
 */
public class Dog extends Animal {
    private String newName;
    
    public Dog(String newName) 
    {
      this.newName = newName;
    }
    
    public void introduceYourself() 
    {
        System.out.println("Woof I am a dog. My name is" + this.newName + ",");
    }
    
}
