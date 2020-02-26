# RoomBookingSystem

## Author: Luke McCann

### Student Number: U1364096

_________________

# Project Aim

To use the GUI components, event-handling, and thread management facilities provided by the Java class libraries to develop an interactive system for object manipulation; to apply appropriate Design Patterns in the design and creation of that software; and to explore Distributed Object Technologies as mechanisms for the further development of the system architecture.

_________________

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