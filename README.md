# BMI Calculator - Java Project

## Overview

This is a **Body Mass Index (BMI)** calculator developed in **Java** as part of a Year 1 programming task. The program calculates a person's BMI based on their weight and height and classifies them into different categories: Underweight, Normal weight, Overweight, or Obesity.

### BMI Formula:
```
BMI = weight (kg) / height^2 (m²)
```

## Features

- Accepts user input for weight (in kilograms) and height (in meters).
- Calculates BMI using the formula above.
- Classifies the BMI into categories:
  - **Underweight**: BMI < 18.5
  - **Normal weight**: BMI 18.5 - 24.9
  - **Overweight**: BMI 25 - 29.9
  - **Obesity**: BMI ≥ 30
- Displays the calculated BMI value and the corresponding category.

## Usage

1. Compile the program:
   ```bash
   javac BMICalculator.java
   ```

2. Run the program:
   ```bash
   java BMICalculator
   ```

3. Input your **weight** (in kilograms) and **height** (in meters) when prompted.

4. The program will calculate and display your BMI along with the classification (Underweight, Normal weight, Overweight, Obesity).

## Example Output

```
Enter weight in kilograms: 70
Enter height in meters: 1.75

Your BMI is: 22.86
Classification: Normal weight
```

## Technologies Used

- Java (for the program logic)

## Contribution

Feel free to suggest improvements or modifications. Pull requests are welcome!

---
