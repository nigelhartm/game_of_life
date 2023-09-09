# game_of_life
Welcome to the Game of Life project! This is a Java implementation of Conway's Game of Life, a cellular automaton devised by mathematician John Conway. In this version, I've added a graphical user interface (GUI) to make it more interactive and visually appealing.

## Introduction
Conway's Game of Life is a cellular automaton that simulates the evolution of a grid of cells over time, based on a set of simple rules. Each cell can be in one of two states: alive or dead. The rules determine the next state of each cell based on its current state and the state of its neighboring cells.
This project aims to provide a user-friendly way to explore the Game of Life, allowing you to interact with the simulation using a GUI. It's a great educational tool for learning about emergent behaviors and patterns in cellular automata.

## Rules
The rules for this implementation are adapted from Conway's Game of Life on Wikipedia. In this version, I use the following encoding to represent cells:
* 0: Dead cell
* 1: Alive cell
* 2: Cell that will die in the next generation
* 3: Cell that will be born in the next generation
These rules create a dynamic and ever-changing grid of cells, leading to the emergence of interesting patterns and behaviors over time. As you can see, the grid evolves from one generation to the next, creating interesting patterns and shapes.

## Example output
![alt text](img/output_window.gif)

## Getting Started
To get started with this Game of Life implementation, follow these steps:
* 1. Clone the Repository: Start by cloning this repository to your local machine using Git.
* 2. Compile the Java Code: Compile the Java source code files to prepare for running the program.
* 3. Run the Program: Execute the program to start the Game of Life simulation.
* 4. Use the GUI Interface: Once the program is running, you can interact with the simulation using the graphical user interface. Click on cells to toggle their state and explore how different patterns evolve.

## Usage
The GUI interface provides an intuitive way to experiment with the Game of Life. You can:
* Toggle Cells: Click on a cell to toggle it between alive and dead states.
* Start/Stop Simulation: Use the controls to start and stop the simulation.
* Advance Generations: Step through generations manually to observe changes.
* Clear the Grid: Clear the grid to start fresh with an empty canvas.
Feel free to experiment with different initial patterns and observe how they evolve over time.

## Contributing
I welcome contributions to this project! If you have ideas for improvements, bug fixes, or new features, please submit issues or pull requests on GitHub. Together, we can make this implementation even better.

## License
This project is licensed under the MIT License. For more details, please refer to the LICENSE file.<br>
<br>
Happy exploring the fascinating world of cellular automata!
