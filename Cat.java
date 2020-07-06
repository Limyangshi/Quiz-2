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
public class Cat extends Animal{
    private String newName;
    
    public Cat(String newName) 
    {
      this.newName = newName;
    }
    
    public void introduceYourself() 
    {
        System.out.println("Meow, I am a cat. My name is" + this.newName + ",");
    }
}
