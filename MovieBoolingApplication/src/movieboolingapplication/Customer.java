/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieboolingapplication;

/**
 *
 * @author luoze
 */
public class Customer {
    private String name;
    private int age;
    private boolean isStudent;
    
    Customer(String name, int age, boolean isStudent){
        this.setName(name);
        this.setIsStudent(isStudent);
        this.setAge(age);
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", age=" + age + ", isStudent=" + isStudent + '}';
    }
    
    //--------helper
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsStudent() {
        return isStudent;
    }

    public void setIsStudent(boolean isStudent) {
        this.isStudent = isStudent;
    }
    
    
}
