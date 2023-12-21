

package Persona, Visitante,Cuidador,Animal,Zoo, Leon, Pinguino;

import random

class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

class Visitante(Persona):
    def __init__(self, nombre, edad, numero_carnet):
        super().__init__(nombre, edad)
        self.numero_carnet = numero_carnet

class Cuidador(Persona):
    def __init__(self, nombre, edad, cuidador_id):
        super().__init__(nombre, edad)
        self.cuidador_id = cuidador_id

class Animal:
    def __init__(self, nombre, edad, tipo):
        self.nombre = nombre
        self.edad = edad
        self.tipo = tipo

class Zoo:
    def __init__(self, nombre_zoo):
        self.nombre_zoo = nombre_zoo
        self.animales = []

    def agregar_animal(self, animal):
        self.animales.append(animal)

class Leon(Animal):
    def __init__(self, nombre, edad, melena_color):
        super().__init__(nombre, edad, 'León')
        self.melena_color = melena_color

class Pinguino(Animal):
    def __init__(self, nombre, edad, color_plumaje):
        super().__init__(nombre, edad, 'Pingüino');
        self.color_plumaje = color_plumaje

def obtener_datos_persona():
    nombre = input('Persona, introduce tu nombre: ');
    edad = int(input('Persona, introduce tu edad: '));
    return Persona(nombre, edad)

def obtener_datos_visitante():
    nombre = input('Visitante, introduce tu nombre: ');
    edad = int(input('Visitante, introduce tu edad: '));
    numero_carnet = int(input('Visitante, introduce tu número de carnet: '));
    return Visitante(nombre, edad, numero_carnet)

def obtener_datos_cuidador():
    nombre = input('Cuidador, introduce tu nombre: ');
    edad = int(input('Cuidador, introduce tu edad: '));
    cuidador_id = int(input('Cuidador, introduce tu ID: '));
    return Cuidador(nombre, edad, cuidador_id);

def obtener_datos_leon():
    nombre = input('León, introduce el nombre del león: ');
    edad = int(input('León, introduce la edad del león: '));
    melena_color = input('León, introduce el color de la melena: ');
    return Leon(nombre, edad, melena_color);

def obtener_datos_pinguino():
    nombre = input('Pingüino, introduce el nombre del pingüino: ');
    edad = int(input('Pingüino, introduce la edad del pingüino: '));
    color_plumaje = input('Pingüino, introduce el color del plumaje: ');

def main():
    try:
       
        persona = obtener_datos_persona();

       
        visitante = obtener_datos_visitante()

       
        cuidador = obtener_datos_cuidador()

   
        nombre_zoo = input('Introduce el nombre del zoo: ')
        zoo = Zoo(nombre_zoo)

       
        leon = obtener_datos_leon();
        zoo.agregar_animal(leon)

     
        pinguino = obtener_datos_pinguino()
        zoo.agregar_animal(pinguino)

   
        print(f'\nDatos de la persona: {persona.__dict__}');
        print(f'Datos del visitante: {visitante.__dict__}');
        print(f'Datos del cuidador: {cuidador.__dict__}');
        print(f'\nDatos del zoo "{nombre_zoo}":');
        for animal in zoo.animales:
            print(f'Datos del {animal.tipo} - {animal.nombre}: {animal.__dict__}');

    except KeyboardInterrupt;
        print('\nPrograma interrumpido por el usuario.');

if __name__ == "__main__";
    main()

