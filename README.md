# Task4 : Currency Converter
* Objective of the Project
    ~ The main objective of this project is to develop a user-friendly application that converts an amount from one currency to another based on real-time or static     conversion rates.
  
    ~ It simplifies the process of manual conversion by providing an interactive GUI where users can:
  
      1. Select the source and target currencies.
      2. Enter an amount in the source currency.
      3. Instantly get the equivalent amount in the target currency.
  
    ~ This project demonstrates core concepts of Java programming, GUI development using Swing, event handling, exception handling, and data structures like HashMap.

* Features of the Application
    1. Graphical User Interface (GUI) – Clean and interactive GUI built using Java Swing components.
    2. Dropdown Menus (JComboBox) – For selecting base and target currencies.
    3. Amount Input (JTextField) – User can input the amount to be converted.
    4. Conversion Output (JLabel) – Displays the converted amount dynamically.
    5. Convert and Clear Buttons (JButton) – For performing conversion and clearing inputs.
    6. Currency Rates Stored in HashMap – Ensures quick lookup and flexibility in updating rates.
    7. Error Handling – For invalid selections and invalid numeric inputs.
    8. Modular and Scalable Design – Easily extendable for adding more currencies or integrating real-time APIs in the future.

 * Technologies and Concepts Used
    1. Component	Purpose
    2. Java Swing	To create the GUI components and layout.
    3. HashMap	For storing and accessing currency rates.
    4. Event Handling	To handle user actions like button clicks.
    5. Exception Handling	To handle invalid inputs gracefully.
    6. Object-Oriented Concepts	Classes, methods, and objects for structure.

* System Design
  
  ~ Main Components
  
     1. JFrame: The main window of the application.
     2. JPanel: Used for layout organization (input panel, result panel, etc.).
     3. JComboBox: For selecting base and target currencies.
     4. JTextField: For user input (amount).
     5. JButton: Convert and Clear buttons.
     6. JLabel: For displaying messages and results.

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
     1. The program reads the selected currencies and amount.
     2. It fetches the corresponding rates from the HashMap.
     3. It performs the conversion using the formula.
     4. The result is displayed in a JLabel on the GUI.
  
  ~ If the user selects Clear, all fields reset for a new conversion.

* Error Handling

    ~If the user selects “Select Currency” instead of a valid option, a message prompts them to select a valid currency.

    ~If the amount field contains invalid characters (like letters), an exception is caught, and an error message is shown.

* Example Currency Rates Used in the Project
  
   Currency Code	Currency Name	Rate (Relative to USD)

           USD	US Dollar	       1.0
           INR	Indian Rupee	       83.0
           EUR	Euro	               0.92
           GBP	British Pound	       0.81
           JPY	Japanese Yen	       155.0
           CAD	Canadian Dollar	       1.36
           AUD	Australian Dollar      1.48
          
  * Overview of the frame-


  ![currency](https://github.com/user-attachments/assets/7469bb37-ea67-4490-b046-46ab56642b8c)

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
