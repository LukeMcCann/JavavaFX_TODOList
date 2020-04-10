# TODO List

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

Sandbox project for prototyping a GUI.