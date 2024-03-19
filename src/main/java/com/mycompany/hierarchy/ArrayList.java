/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hierarchy;

/**
 *
 * @author ekaterina
 */
public class ArrayList<T> implements List<T> {
    
    Object[] array;
    int size = 0;
    
    public ArrayList(int size) {
        
        array = new Object[size];
        
    }
    
    public ArrayList(Object[] array){
        
        this.array = array;
    } 
    
    @Override
    public void add(T e) throws EmptyElementException {
                
        if (size == array.length) {
            Object[] array1 = new Object[size + 1];
            for (int i = 0; i < size; ++i) {
                array1[i] = array[i];
            }
            array = array1;   
        }
        
        array[size] = e;
        size++;
        
    }
    
    @Override
    public void delete(int index) throws IndexOutOfBoundException {
        
        Object[] array1 = new Object[array.length - 1];
        for (int i = 0; i < array.length; ++i) {
            if (i > index) {
                array1[i-1] = array[i];
            }
            if (i < index){
                array1[i] = array[i]; 
            }
        }
        array = array1; 
        
    }
   
    @Override
    public T pop() {
       
       Object lastElement = array[array.length - 1];
       Object[] array1 = new Object[array.length - 1];
       for (int i = 0; i < array.length - 1; ++i) {
           array1[i] = array[i];
       }
       array = array1;
       return (T) lastElement;
       
   }
    
    @Override
    public T get(int index) throws IndexOutOfBoundException{
        
       return (T) array[index]; 
       
    }
    
    @Override
    public int size() {
        
        return array.length;
        
    }
    
    public int findFirst(T value) throws EmptyElementException{
        
        int first = -1;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == value) {
                first = i;
                break;
            }
        }
        return first;
     
    }
    
    public void deleteAll(T value) throws IndexOutOfBoundException {
        
        int delta = 0;
        for (int i = 0; i < array.length + delta; ++i) {
            if (array[i - delta] == value) {
                delete(i - delta);
                delta++;
            }
        }
        
    }
    
}
