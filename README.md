# Vaadin Spring Boot Multi Module Example


This project is a multi-module Vaadin + Spring Boot project. It consists of four modules:

<ol>
  <li>backend: includes JPA entities, repos, and services</li>
  <li>custom component (Copied from https://github.com/TatuLund/ColorPicker)</li>
  <li>my-theme: custom theme packaged into jar</li>
  <li>vaadin-app: is the actual runnable application that depends on the other modules</li>
</ol>

## Running the project

From the root directory, run
```terminal
mvn install
```

then to start the project, run
```terminal
mvn spring-boot:run -pl vaadin-app
```
