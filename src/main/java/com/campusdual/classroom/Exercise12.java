package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {

        Car car = new Car("Toyota", "Corolla", "Gasolina");

        // Comprobaciones solicitadas:
        System.out.println("¿Tacómetro a cero? " + car.isTachometerEqualToZero());

        car.start(); // Debería encenderse
        car.start(); // Ya está encendido

        car.accelerate();
        car.accelerate();

        car.stop(); // No se puede apagar si se mueve

        for (int i = 0; i < 30; i++) car.accelerate(); // Hasta el límite

        car.brake();
        for (int i = 0; i < 50; i++) car.brake(); // No baja de 0

        car.turnAngleOfWheels(20);
        car.turnAngleOfWheels(60); // Máx. 45
        car.turnAngleOfWheels(-200); // Mín. -45

        car.setReverse(true); // No se puede en movimiento
        for (int i = 0; i < 25; i++) car.brake();
        car.setReverse(true); // Ahora sí
        car.showDetails();
    }
}