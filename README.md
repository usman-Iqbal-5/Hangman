# 🎮 Hangman Game

[![Java Version](https://img.shields.io/badge/Java-17+-blue.svg)](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)

---

## 🎨 Overview

Welcome to the **Hangman Game**, a text-based word-guessing challenge built entirely in **Java**. Designed as a showcase of core Object-Oriented Programming (OOP) concepts, this project combines clean, modular code with an engaging gameplay experience.

---

## ✅  Aim / Purpose

The primary goal of this Hangman game project is to demonstrate key **object-oriented programming concepts** in Java through a practical, interactive application.  
It serves as both an educational tool for learning OOP principles like encapsulation, inheritance, and polymorphism, and as an engaging game to showcase clean code design and effective exception handling.  

Whether you're a beginner learning Java or an enthusiast exploring software design, this project aims to provide clarity, maintainability, and a fun user experience.

---


### 🕹️ How to Play

- The game randomly selects a word from the list.  
- Guess one letter at a time by typing it in and pressing Enter.  
- Correct guesses reveal the letter’s position(s) in the word.  
- Incorrect guesses bring the hangman closer to completion.  
- You win if you guess the entire word before the hangman is fully drawn.  
- Invalid inputs (e.g., numbers, multiple letters) are handled with error messages.

---

## 🚀 Features

- **Robust OOP design:** Encapsulation, inheritance, and polymorphism are fully utilized to ensure maintainability and scalability.  
- **Custom Exception Handling:** User-defined exceptions improve error feedback and user experience.  
- **Dynamic Game Play:** Word list managed via arrays, with real-time hangman figure updates.  
- **Clean User Interface:** Console-based but intuitive prompts and status displays.  
- **Extensible Architecture:** Easily add new features or expand word lists with minimal effort.

---

## 🧩 Object-Oriented Principles in Action

| Concept          | Implementation Details                                                                                  |
|------------------|--------------------------------------------------------------------------------------------------------|
| **Encapsulation**| Classes safeguard data using private attributes and provide public methods for controlled access.      |
| **Inheritance**  | Custom `InputException` inherits from Java's `Exception` class to handle invalid input scenarios.      |
| **Polymorphism** | Overridden `toString()` method in exception class provides descriptive error messages.                  |
| **Arrays**       | Manage word pools, track guessed letters, and render the hangman ASCII art progressively.               |

---

## 🏗️ System Architecture & UML

- **InputException Class**  
  Handles validation of player inputs, throwing exceptions on invalid entries to maintain game integrity.

- **Player Class**  
  Manages player input and validation, working closely with the custom exception class to enforce rules.

- **Game Class**  
  Drives game logic — including selecting words, checking guesses, updating the display, and controlling the game loop.

- **Main Class**  
  Entry point; initialises the game environment and starts the gameplay.

---

## 🛠️ Installation & Usage

### Prerequisites

- Java JDK 17 or higher installed  
- Basic knowledge of command line usage

### Setup Instructions

```bash
# Clone the repo
git clone https://github.com/YourUsername/Hangman-Game.git

# Navigate into project directory
cd Hangman-Game

# Compile Java source files
javac *.java

# Run the game
java Main
```
---

## 📞 Contact

For questions or support, please reach out at:  
GitHub: [https://github.com/Usman-A-Iqbal](https://github.com/usman-Iqbal-5)
