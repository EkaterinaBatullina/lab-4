/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hierarchy;

/**
 *
 * @author ekaterina
 */
public class Hierarchy {

    public static void main(String[] args) throws EmptyElementException {
        
        ArrayList<Animal> list1 = new ArrayList<Animal>(10);
        ArrayList<Person> list2 = new ArrayList<Person>(10);
        ArrayList<Dog> list3 = new ArrayList<Dog>(10);
        
        for (int i = 0; i < 10; ++i) {
            Animal animal = new Dog();
            Person person = new Person();
            Dog dog = new Dog();
            list1.add(animal);
            list2.add(person);
            list3.add(dog);
        }
        
        System.out.println(processingAnimals(list1));
        System.out.println(processingPersons(list2));
        System.out.println(processingDogs(list3));
    }
    
    public static String processingAnimals(ArrayList<Animal> arrayList) {
        return arrayList.pop().getInfo();
    }
    
    public static String processingPersons(ArrayList<Person> arrayList) {
        return arrayList.pop().getInfo();
    }
        
    public static String processingDogs(ArrayList<Dog> arrayList) {
        return arrayList.pop().getInfo();
    }
    
    
}
