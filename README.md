# RoomBookingSystem

## Author: Luke McCann

### Student Number: U1364096

_________________

## Dependencies

* [JavaFX-11](https://gluonhq.com/products/javafx/)


## Adding Dependencies

Note: The following steps need to be taken for Java 11 or higher.

1. Using IntelliJIDEA navigate to: Project Structure &rarr; Global Libraries
Add all of the JAR files from the downloaded folder (e.g. c:/User/Documents/javafx-sdk-11.0.2\lib) to the Global Libraries (label it as something relatable, e.g. JavaFX).

* If errors occur throughout the code then you will need to check the SDK version is set to 11.05, right click JavaFX-11 in the Global Libraries section and select add to modules. 

2. Run the application, you will receive the following error: 

~~~~

Error: JavaFX runtime components are missing, and are required to run this application.

~~~~

3. Right-click src &rarr; New &rarr; module-info.java 

4. Enter the following into the module-info.java replacing the module name with the project and "sample" with the package name.

~~~~

                            module JavaFX.Sandbox {
                                requires javafx.fxml;
                                requires javafx.controls;

                                opens sample;
                            }

~~~~
_________________

# Project Aim

To use the GUI components, event-handling, and thread management facilities provided by the Java class libraries to develop an interactive system for object manipulation; to apply appropriate Design Patterns in the design and creation of that software; and to explore Distributed Object Technologies as mechanisms for the further development of the system architecture.

# Case Study / Brief

A local college has decided to rent out its rooms during evenings, weekends, and holidays as a way to generate extra income.  It hopes that local clubs and societies may be interested in booking rooms for meetings, rehearsals, to play games,  etc.  Management has decided that a software system is required to allow three Booking Clerks and one Room Manager to view the state of the system at all times.  You have been asked to develop a prototype desktop system that uses a shared memorymodel (i.e. a concurrent system) to provide the functionality required.

## Project Requirements

* decide on the data structures to be used to model the state of the system.  
  This data model should capture the rooms, their size (number of seats), type (computer lab, tutorial room, or lecture theatre), and availability (each eveningduring term time, or AM/PM at weekends and during holidays).

* design a suitable user interface for use by the Booking Clerks.  
  This should show the availability of rooms and allow the clerk to add details of bookings 4
  (who has made the booking, their contact details, and any notes about the booking).  Search facilities should also be considered, for example to find all available computer labs on a specific evening, or all tutorial room on a specific(non-term-time) day.

* design a suitable interface for the Room Manager.  
  This should allow the manager to add and remove rooms to/from the system, view the availability ofrooms, mark rooms as unavailable (e.g. rooms to be redecorated or to have computer equipment replaced) for a period of time (days or weeks, as required) and to enter the term dates, such that the system can decide whether or not rooms should be available for bookings during the day.

You are free to choose whatever GUI components you consider appropriate for this system, and to use Java Swing or JavaFX. Appropriate use should be made of dialogs and reporting mechanisms, to maximise the robustness of your prototype.In the long term the system is to be implemented as a client-server or distributed architecture, to allow the different users to access the system from different locationsat the same time.  However, for the initial prototype the system you create must be a desktop application with the different interfaces running in separate threads, and it must share access to the system data and update the interfaces in real time to show changes made to the system state by any active user.

_________________


# JavaFX Quick-Introduction

JavaFX was designed taking the MVC design pattern into consideration. This pattern keeps the business logic and GUI separate. When using this pattern you should not mix the code which deals with the UI with the code that manipulates application data. Controllers act as a middle-man between the GUI and data. 

When working in JavaFX the model corresponds to the data model as usual, however the view is the FXML, and the controller is the code which determines the events which take place when a user interacts with the GUI. Controllers are used to handle events. 

While JavaFX does not strictly enforce the use of the MVC pattern, it is a good practice to follow and is used in this project. 