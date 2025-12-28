# Vehicle Management System

## Project Overview
This project demonstrates Object-Oriented Programming principles in Java,
including inheritance, abstraction, composition, and aggregation.
An abstract Vehicle class is extended by Car, Motorcycle, and Truck classes.

## Class Hierarchy
- Vehicle (abstract superclass)
    - Car
    - Motorcycle
    - Truck

Each subclass overrides the startEngine() and stopEngine() methods.
Protected fields are used in the superclass to allow subclass access.

## Driver Association
Each Vehicle has a Driver object (composition).
One Driver can be associated with multiple vehicles (aggregation).
