# Loan-Calculator
Following API simply calculates the loan amount, where UI was built on eclipse windowbuilder, and main part in java, building tool gradle was used.

- After entering inside the project main source file folder, we run the following command:

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/228722916-3a3720db-8cc4-40fd-bb69-5a12f513533b.png" alt="Image">
</p>

- When api is built without issues, we can run and check program

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/228722994-210add89-f047-4196-847f-7bc584e547d9.png" alt="Image">
</p>

- Testrun with sample input amounts:

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/228723067-1c62f5b5-7e7d-4099-9bde-cdef55037e53.png" alt="Image">
</p>

## [Implementation](https://github.com/af4092/Loan-Calculator/blob/main/LoanCalculatorAPI/lib/src/main/java/loancalculatorapi/LoanClass.java)

- `UI.java` code snippet represents a Java Swing-based user interface (UI) class named `UI` in the package `loancalculatorapi`. It extends the `JFrame` class and provides a graphical interface for a loan calculator application. Here's a breakdown of the code:
  - The UI class contains various Swing components such as `JFrame`, `JPanel`, `JLabel`, `JTextField`, and `JButton` to create the UI elements.
  - The UI is initialized and configured in the constructor (`UI()` method).
  - The UI elements are positioned and styled using the `setBounds()` and `setFont()` methods.
  - Text fields (`tfInterestRate`, `tfNumberOfYears`, `tfLoanAmount`, `tfMonthlyPayment`, `tfTotalPayment`) are created to allow the user to input data.
  - A `Calculate` button (`btnCalculate`) is created with an `ActionListener` that triggers calculations based on the user's inputs.
  - The input data is retrieved from the text fields, passed to an instance of the `LoanClass` class, and the calculated results are displayed back in the text fields.

- `LoanClass.java` code snippet represents a Java class named `LoanClass` in the package `loancalculatorapi`. It is used to perform loan calculations based on user input. Here's an overview of the code:
  - The `LoanClass` class has private fields for `InterestRate`, `NumberOfYears`, and `LoanAmount`.
  - A constructor is defined to initialize the `LoanClass` instance with the input values.
  - Getter and setter methods are provided to access and modify the private fields.
  - Utility methods (`parseInterestRate()`, `parseNumberOfYears()`, `parseLoanAmount()`) are defined to convert the input strings to `Double` values.
  - The class includes methods (`getMonthlyPayment()`, `getTotalPayment()`) to calculate the monthly payment and total payment based on the loan parameters.
  - Additional methods (`resultMonthlyPayment()`, `resultTotalPayment()`) convert the calculated values to strings for display.
  - The `LoanClass` is used in the `UI` class to perform loan calculations based on user input and display the results in the UI.
