/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author sahoryb
 */
public class Cat {
    private String name;
    private String raza;
    private int age;

    public Cat(String name, String raza, int age) {
        this.name = name;
        this.raza = raza;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" + "name=" + name + ", raza=" + raza + ", age=" + age + '}';
    }
    
    
}
