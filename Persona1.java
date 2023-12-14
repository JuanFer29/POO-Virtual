package Tarea1;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



public class Persona {

    public String nombre;
    public String apellido;
    public int edad;
    private int id;

   
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

 
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }
}
