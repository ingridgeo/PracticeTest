# Practice Test

A simple java console app used in order to display the number of digits required to represent the integer part of an input number.


The logic behind the  function built to return the number of digits, takes the absolute value of a given number, then counts the number of digits required to represent the integer part of the number by repeatedly dividing the absolute value by 10 until it's less than 10.

### Installation

1. Clone the repo
   ```
   git clone https://github.com/ingridgeo/PracticeTest.git
   ```
3. Build PracticeTest
   ```
   mvn clean install
   ```
4. Run unit tests that you can find them in ./src/tests dedicated space
   ```
   mvn test
   ```
   
5. Run the console application 
   ```
   java -jar ./target/*.jar
   ```

# Building commands

|        | Task  | Command                    |
| ------ | ----- | -------------------------- |
| Maven  | Build | `mvn clean install`        |
| Maven  | Test  | `mvn test`                 |
|        | Run   | `java -jar ./target/*.jar` |
