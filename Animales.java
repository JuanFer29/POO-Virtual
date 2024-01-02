
package com.mycompany.animal;

class Animal:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

class Gato(Animal):
    def __init__(self, nombre, edad, color_pelo):
        super().__init__(nombre, edad)
        self.color_pelo = color_pelo

    def cazar_raton(self):
        print(f"{self.nombre} está cazando un ratón.")

    def trepar_arbol(self):
        print(f"{self.nombre} está trepando a un árbol.")

class Perro(Animal):
    def __init__(self, nombre, edad, raza):
        super().__init__(nombre, edad)
        self.raza = raza

    def correr(self):
        print(f"{self.nombre} está corriendo a gran velocidad.")

    def jugar(self):
        print(f"{self.nombre} está jugando felizmente.")


nombre = int input("Ingrese el nombre del animal: ")
edad = int(input("Ingrese la edad del animal: "))

tipo_animal = input("¿Es un gato o un perro? ").lower()

if tipo_animal == "gato":
    color_pelo = input("Ingrese el color de pelo del gato: ")
    mi_gato = Gato(nombre, edad, color_pelo)
    mi_gato.cazar_raton()
    mi_gato.trepar_arbol()
elif tipo_animal == "perro":
    raza = input("Ingrese la raza del perro: ")
    mi_perro = Perro(nombre, edad, raza)
    mi_perro.correr()
    mi_perro.jugar()
else:
    print("Tipo de animal no reconocido.")


  
