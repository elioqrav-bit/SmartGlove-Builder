# Assignment 1: Builder Pattern — Smart Glove

## Overview
This project demonstrates the Builder creational design pattern implemented in Java (JDK 17).
The chosen domain is a **Smart Glove**, a complex wearable device requiring custom configurations for different use cases (VR Gaming vs. Medical Rehabilitation).

## Structure
- `SmartGlove` — Product class.
- `SmartGloveBuilder` — Builder interface.
- `VRGamingGloveBuilder` & `MedicalGloveBuilder` — Concrete builders for specific glove types.
- `SmartGloveDirector` — Director class orchestrating default configurations.
- `Main` — Client class showing execution and method chaining (Fluent API).

## How to Run
1. Open the project in IntelliJ IDEA.
2. Ensure JDK 17 is configured.
3. Run `src/smartglove/Main.java`.