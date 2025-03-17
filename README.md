# Project Overview
This repository contains two projects implemented using design patterns in Java:
1. **Online Payment Gateway** - Demonstrates the use of Factory Method and Adapter patterns to create a flexible and secure payment processing system.
2. **Coffee Shop Simulator** - Uses Factory Method and Decorator patterns to provide a customizable coffee ordering experience.

---

## Project 1: Online Payment Gateway
### Features
- Supports multiple payment methods:
  - Credit Card
  - PayPal
  - Cryptocurrency
- Uses **Factory Method** to create payment objects.
- Integrates a **Credit Card Validator** using the **Adapter Pattern**.
- Handles transaction statuses (Pending, Completed, Failed).
- Includes error handling for invalid data or failed transactions.

### How to Run
1. Compile all `.java` files in the project folder.
2. Run the `PaymentMain` class.
3. Follow the prompts to:
   - Select a payment method (`cc` for Credit Card, `pp` for PayPal, `cr` for Crypto).
   - Enter card details (if using Credit Card).
   - Specify the payment amount.
4. The system will display the payment status and transaction result.

### Example Usage
```
Choose your payment method (cc, pp, cr): cc
Type here card number: 1234567890123456
Type here amount of money: 100.50
Credit card payment of 100.5 is in process
Transaction status is COMPLETED
```

---

## Project 2: Coffee Shop Simulator
### Features
- Uses **Factory Method** to create coffee objects.
- Allows users to add various syrups and toppings using the **Decorator Pattern**.
- Customizable with multiple options such as:
  - Milk
  - Chocolate Syrup
  - Salted Caramel Syrup
  - Whipped Cream
- Provides detailed descriptions and calculates the total price.

### How to Run
1. Compile all `.java` files in the project folder.
2. Run the `CoffeeShopMain` class.
3. Follow the prompts to:
   - Choose your base coffee.
   - Add desired toppings by entering their corresponding codes.
   - Finalize the order to see the total price.

### Example Usage
```
Choose coffee: Espresso
Wanna add toppings? (milk, chocolate syrup, salted caramel syrup, whipped cream, no): milk
Wanna add toppings? (milk, chocolate syrup, salted caramel syrup, whipped cream, no): chocolate syrup
Wanna add toppings? (milk, chocolate syrup, salted caramel syrup, whipped cream, no): no
Your order: Espresso with added milk with added chocolate syrup
Total: 1600
```

---

