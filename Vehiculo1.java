/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehiculo1;

/**
 *
 * @author Hp
 */
public class Vehiculo1 {

    public class Vehiculo {

    protected String marca;
    protected String modelo;
    private int anoFabricacion;
    protected int velocidadActual;

  
    public Vehiculo(String marca, String modelo, int anoFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacion = anoFabricacion;
        this.velocidadActual = 0;
    }

    
    public void acelerar(int cantidad) {
        velocidadActual += cantidad;
        System.out.println("Acelerando. Velocidad actual: " + velocidadActual + " km/h");
    }

    public void frenar(int cantidad) {
        velocidadActual -= cantidad;
        System.out.println("Frenando. Velocidad actual: " + velocidadActual + " km/h");
    }
}

public class Moto extends Vehiculo {
   
    private boolean tieneCasco;

    
    public Moto(String marca, String modelo, int anioFabricacion, boolean tieneCasco) {
        super(marca, modelo, anioFabricacion);
        this.tieneCasco = tieneCasco;
    }

    
    public void ponerCasco() {
        if (tieneCasco) {
            System.out.println("El conductor ya tiene puesto el casco.");
        } else {
            tieneCasco = true;
            System.out.println("El conductor ha puesto el casco.");
        }
    }

   
    @Override
    public void acelerar(int cantidad) {
        super.acelerar(cantidad);
        System.out.println("La moto está acelerando.");
    }
}

public class Carro extends Vehiculo {
    
    private boolean tieneMaletero;


    public Carro(String marca, String modelo, int anioFabricacion, boolean tieneMaletero) {
        super(marca, modelo, anioFabricacion);
        this.tieneMaletero = tieneMaletero;
    }

    
    public void abrirMaletero() {
        if (tieneMaletero) {
            System.out.println("El maletero ya está abierto.");
        } else {
            tieneMaletero = true;
            System.out.println("Se ha abierto el maletero.");
        }
    }

    
    @Override
    public void frenar(int cantidad) {
        super.frenar(cantidad);
        System.out.println("El carro está frenando.");
    }
]
