/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hierarchy;

/**
 *
 * @author ekaterina
 */
public interface List<T> { 
    
    void add(T e) throws EmptyElementException;
    
    void delete(int index) throws IndexOutOfBoundException;
    
    T pop();
    
    T get(int index) throws IndexOutOfBoundException;
    
    int size();    
}
