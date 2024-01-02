
package com.mycompany.Persona,Pasajero,Chofer;

class Persona:
    def __init__(self, nombre, edad, cedula):
        self.nombre = nombre
        self.edad = edad
        self.cedula = cedula

class Pasajero(Persona):
    def __init__(self, nombre, edad, cedula, id_pasajero):
        super().__init__(nombre, edad, cedula)
        self.id_pasajero = id_pasajero

    def pedir_taxi(self):
        print(f"{self.nombre} ({self.id_pasajero}) ha pedido un taxi.")

    def cancelar_taxi(self):
        print(f"{self.nombre} ({self.id_pasajero}) ha cancelado el taxi.")

class Chofer(Persona):
    def __init__(self, nombre, edad, cedula, numero_placa, codigo_taxi):
        super().__init__(nombre, edad, cedula)
        self.numero_placa = numero_placa
        self.codigo_taxi = codigo_taxi

    def aceptar_carrera(self):
        print(f"Chofer {self.nombre} ({self.numero_placa}) ha aceptado la carrera.")

    def cancelar_carrera(self):
        print(f"Chofer {self.nombre} ({self.numero_placa}) ha cancelado la carrera.")


nombre = input("Ingrese su nombre: ")
edad = int(input("Ingrese su edad: "))
cedula = input("Ingrese su cédula: ")

tipo_persona = input("¿Es pasajero o chofer? ").lower()

if tipo_persona == "pasajero":
    id_pasajero = input("Ingrese su número de ID: ")
    pasajero = Pasajero(nombre, edad, cedula, id_pasajero)
    pasajero.pedir_taxi()
    opcion_cancelar = input("¿Desea cancelar el taxi? (Sí/No): ").lower()
    if opcion_cancelar == "si":
        pasajero.cancelar_taxi()
    else:
        print("Taxi no cancelado.")

elif tipo_persona == "chofer":
    numero_placa = input("Ingrese el número de placa del vehículo: ")
    codigo_taxi = input("Ingrese el código del taxi: ")
    chofer = Chofer(nombre, edad, cedula, numero_placa, codigo_taxi)
    chofer.aceptar_carrera()
    opcion_cancelar = input("¿Desea cancelar la carrera? (Sí/No): ").lower()
    if opcion_cancelar == "si":
        chofer.cancelar_carrera()
    else:
        print("Carrera no cancelada.")

else:
    print("Tipo de persona no reconocido.")
