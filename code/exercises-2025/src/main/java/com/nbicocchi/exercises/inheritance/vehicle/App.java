package com.nbicocchi.exercises.inheritance.vehicle;

/**
 * ### **Exercise: Defining a Java Class with Multiple Interfaces and an Abstract Class**
 *
 * **Objective:**
 * Enhance your understanding of Java class design by combining interfaces, an abstract class, and concrete implementations.
 *
 * ---
 *
 * ### **Problem Statement:**
 * You are designing a **vehicle management system** that models different types of vehicles. Define a class `Car` that extends an abstract class `Vehicle` and implements two interfaces:
 *
 * 1. **Drivable**: Represents vehicles that can be driven.
 * 2. **Fuelable**: Represents vehicles that consume fuel.
 *
 * Additionally, create another class `ElectricCar` that follows a similar structure but operates on battery power instead of fuel.
 *
 * ---
 *
 * ### **Requirements:**
 *
 * #### **1. Define an abstract class `Vehicle` with:**
 *    - A `String brand` (e.g., "Toyota", "Tesla").
 *    - A `String model` (e.g., "Camry", "Model S").
 *    - A `int year`.
 *    - A constructor to initialize these fields.
 *    - A method `void displayInfo()` that prints the vehicle details.
 *
 * #### **2. Define an interface `Drivable` with:**
 *    - `void accelerate()`: Simulates vehicle acceleration.
 *    - `void brake()`: Simulates braking.
 *
 * #### **3. Define an interface `Fuelable` with:**
 *    - `void refuel(int liters)`: Adds fuel to the tank.
 *    - `int getFuelLevel()`: Returns the current fuel level.
 *
 * #### **4. Implement a class `Car` that:**
 *    - Extends `Vehicle` and implements both `Drivable` and `Fuelable`.
 *    - Maintains a fuel level (0-100 liters).
 *    - Implements acceleration, braking, and refueling logic.
 *
 * #### **5. Implement another class `ElectricCar` that:**
 *    - Extends `Vehicle` and implements `Drivable`, but not `Fuelable`.
 *    - Instead of fuel, it maintains a battery level (0-100%).
 *    - Has a method `void charge(int percentage)` to charge the battery.
 *
 * #### **6. In the `main` method, demonstrate:**
 *    - Creating an instance of `Car` and `ElectricCar`.
 *    - Accelerating, braking, refueling, and charging.
 *    - Displaying vehicle information and fuel/battery levels.
 *
 * ---
 *
 * ### **Example Output (Expected Behavior)**
 * ```
 * Vehicle: Toyota Camry (2020)
 * Fuel level: 50L
 * Accelerating...
 * Braking...
 * Refueling 20L...
 * Fuel level: 70L
 *
 * Vehicle: Tesla Model S (2023)
 * Battery level: 40%
 * Accelerating...
 * Braking...
 * Charging 50%...
 * Battery level: 90%
 * ```
 *
 * ---
 *
 * ### **Bonus Challenge:**
 * - Add a `getRange()` method to estimate how far the vehicle can travel based on fuel or battery level.
 * - Create a `Motorcycle` class that implements `Drivable` and `Fuelable`.
 *
 * Would you like a sample solution for reference? 🚗⚡
 */
public class App {
    public static void main(String[] args) {
        Car c1 = new Car("fiat", "uno turbo", 1984, 0, 10);
        ECar c2 = new ECar("tesla", "gt", 2020, 0, 10);
        System.out.println(c1);
        System.out.println(c2);
    }


}
