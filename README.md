# Task4 : Currency Converter
* Objective of the Project
    The main objective of this project is to develop a user-friendly application that converts an amount from one currency to another based on real-time or static     conversion rates.
    It simplifies the process of manual conversion by providing an interactive GUI where users can:
       Select the source and target currencies.
       Enter an amount in the source currency.
       Instantly get the equivalent amount in the target currency.
    This project demonstrates core concepts of Java programming, GUI development using Swing, event handling, exception handling, and data structures like HashMap.

* Features of the Application
    Graphical User Interface (GUI) – Clean and interactive GUI built using Java Swing components.
    Dropdown Menus (JComboBox) – For selecting base and target currencies.
    Amount Input (JTextField) – User can input the amount to be converted.
    Conversion Output (JLabel) – Displays the converted amount dynamically.
    Convert and Clear Buttons (JButton) – For performing conversion and clearing inputs.
    Currency Rates Stored in HashMap – Ensures quick lookup and flexibility in updating rates.
    Error Handling – For invalid selections and invalid numeric inputs.
    Modular and Scalable Design – Easily extendable for adding more currencies or integrating real-time APIs in the future.

 * Technologies and Concepts Used
    Component	Purpose
    Java Swing	To create the GUI components and layout.
    HashMap	For storing and accessing currency rates.
    Event Handling	To handle user actions like button clicks.
    Exception Handling	To handle invalid inputs gracefully.
    Object-Oriented Concepts	Classes, methods, and objects for structure.

* System Design
  ~ Main Components
     JFrame: The main window of the application.
     JPanel: Used for layout organization (input panel, result panel, etc.).
     JComboBox: For selecting base and target currencies.
     JTextField: For user input (amount).
     JButton: Convert and Clear buttons.
     JLabel: For displaying messages and results.

  ~Currency Rates Mapping
     A HashMap<String, Double> is used to map each currency code (like USD, INR, EUR) to its value relative to USD. This allows easy conversion between currencies.

  ~Conversion Logic
     Formula:
        amount_in_target = (amount_in_base / rate_of_base) * rate_of_target
     For example, converting 100 INR to USD (1 USD = 83 INR):
        amount_in_USD = 100 / 83 = 1.20 USD
  
* Working of the Application
  ~ User selects the base currency and target currency from the dropdown menus.
  ~ User enters the amount to be converted.
  ~ On clicking the Convert button:
     The program reads the selected currencies and amount.
     It fetches the corresponding rates from the HashMap.
     It performs the conversion using the formula.
     The result is displayed in a JLabel on the GUI.
  ~ If the user selects Clear, all fields reset for a new conversion.

* Error Handling
    If the user selects “Select Currency” instead of a valid option, a message prompts them to select a valid currency.
    If the amount field contains invalid characters (like letters), an exception is caught, and an error message is shown.

* Example Currency Rates Used in the Project
   Currency Code	Currency Name	Rate (Relative to USD)
   USD	US Dollar	1.0
   INR	Indian Rupee	83.0
   EUR	Euro	0.92
   GBP	British Pound	0.81
   JPY	Japanese Yen	155.0
   CAD	Canadian Dollar	1.36
   AUD	Australian Dollar	1.48

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
