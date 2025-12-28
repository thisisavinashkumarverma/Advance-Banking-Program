# **Advance Banking Program** 🏦

A console-based banking application built using **Core Java** that provides a secure and user-friendly interface for banking operations. Users can authenticate, withdraw funds, deposit money, and check their account balance through an interactive menu-driven system.

> **Developed by**: Avinash Kumar Verma  
> **Repository**: [Advance-Banking-Program](https://github.com/thisisavinashkumarverma/Advance-Banking-Program)  
> **Language**: Java (100%)

---

## 📋 **Table of Contents**

- [Overview](#overview)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Class Descriptions](#class-descriptions)
- [How to Run](#how-to-run)
- [Usage Guide](#usage-guide)
- [Code Flow](#code-flow)
- [Validation Features](#validation-features)
- [OOP Design Principles](#oop-design-principles)
- [Sample Interaction](#sample-interaction)
- [Security Features](#security-features)
- [Future Enhancements](#future-enhancements)
- [Contributing](#contributing)
- [License](#license)

---

## 📝 **Overview**

The Advance Banking Program is a simple yet effective banking application that demonstrates solid object-oriented programming principles and modular code design. It allows users to perform essential banking operations with proper validation and authentication mechanisms, making it an excellent project for portfolio building.

**Key Purpose**: Educational project showcasing Core Java skills including OOP, user authentication, input validation, and menu-driven application design.

---

## ✨ **Features**

| Feature | Description |
|---------|-------------|
| 🔐 **User Authentication** | Secure login with username and password validation |
| 💰 **Withdraw Funds** | Safely withdraw money with balance verification |
| 💵 **Deposit Money** | Add funds to your account |
| 📊 **Check Balance** | View current account balance |
| 🔑 **PIN Validation** | Additional security with PIN-based transactions |
| 📱 **Menu-Driven Interface** | Easy-to-use console-based navigation |
| ✅ **Input Validation** | Comprehensive validation for all user inputs |
| 🏗️ **Object-Oriented Design** | Clean and modular code structure |

---
┌─────────────────────────────────────┐
│ TECHNOLOGY STACK │
├─────────────────────────────────────┤
│ Language │ Java (Core) │
│ JDK Version │ 8 or Higher │
│ Paradigm │ OOP │
│ Interface │ CLI │
│ Build │ Manual Compile │
│ Module Support │ Java 9+ │
└─────────────────────────────────────┘


---

## 📁 **Project Structure**

Advance-Banking-Program/
│
├── README.md # Project documentation
│
└── NetBanking/ # Main project folder
│
├── src/ # Source code directory
│ └── NetBanking/
│ ├── Login.java ⭐ Entry Point
│ ├── LoginCredential.java 📦 Credential Storage
│ ├── AskIdPass.java 🔐 Authentication
│ ├── Services.java 📋 Main Menu
│ ├── SelectedOption.java 🎯 Option Router
│ ├── Withdraw.java 💸 Withdrawal Logic
│ ├── Deposite.java 💳 Deposit Logic
│ ├── CheckBalance.java 💹 Balance Inquiry
│ ├── PinValidation.java 🔑 PIN Verification
│ ├── Validation.java ✓ Input Validation
│ ├── Exit.java 🚪 Exit Handler
│ └── module-info.java ⚙️ Module Config
│
└── bin/ # Compiled bytecode
└── NetBanking/
└── (*.class files)

## 🛠️ **Tech Stack**


---

## 📚 **Class Descriptions**

### **1. Login.java** ⭐
**Entry Point of the Application**

**Key Operations**:
- Creates default LoginCredential object
- Username: "Avinash"
- Password: "Avi@123"
- PIN: 4254
- Initial Balance: 10,00,000 (10 Lakhs)
- Calls AskIdPass for authentication

---

### **2. LoginCredential.java** 📦
**User Credential & Account Information Storage**

Attributes:
├── username : String (Username)
├── password : String (Password)
├── pin : int (Personal PIN)
└── balance : long (Account Balance)

**Purpose**: Encapsulates all user account data in a single object

---

### **3. AskIdPass.java** 🔐
**User Authentication & Login Handler**

**Responsibilities**:
1. Prompts user for username
2. Prompts user for password
3. Validates credentials against LoginCredential object
4. Handles successful/failed login
5. Routes to Services menu upon successful authentication

**Flow**:
Input Username
↓
Validate Username
↓
Input Password
↓
Validate Password
↓
(if valid) → Services Menu
(if invalid) → Error Message

---

### **4. Services.java** 📋
**Main Banking Services Menu**

**Displays Options**:
Welcome to our Bank
You Logged In Successfully

Withdraw

Deposite

Check balance

Exit
Enter Your selection:

**Functionality**: Displays menu and routes selection to SelectedOption class

---

### **5. SelectedOption.java** 🎯
**User Selection Router**

**Purpose**: Acts as a dispatcher for user menu choices

**Routes**:
Selection 1 → Withdraw.java
Selection 2 → Deposite.java
Selection 3 → CheckBalance.java
Selection 4 → Exit.java

---

### **6. Withdraw.java** 💸
**Fund Withdrawal Logic**

**Process**:
1. Prompts for withdrawal amount
2. Validates amount (must be > 0)
3. Checks if amount ≤ available balance
4. Calls PinValidation for PIN verification
5. Updates balance if PIN is correct
6. Displays transaction confirmation

**Validation Checks**:
- ✓ Amount greater than 0
- ✓ Amount less than or equal to balance
- ✓ PIN verification

---

### **7. Deposite.java** 💳
**Fund Deposit Logic**

**Process**:
1. Prompts for deposit amount
2. Validates amount (must be > 0)
3. Adds amount to current balance
4. Updates account balance
5. Displays confirmation message
6. Returns to main menu

**Features**:
- Simple and straightforward
- No PIN required
- Instant balance update

---

### **8. CheckBalance.java** 💹
**Account Balance Inquiry**

**Functionality**:
- Retrieves current balance from LoginCredential
- Displays balance to user
- Returns to main menu

**Output Format**:

---

### **9. PinValidation.java** 🔑
**PIN Verification for Transactions**

**Purpose**: Provides additional security layer

**Features**:
- Prompts user to enter PIN
- Compares with stored PIN in LoginCredential
- Returns boolean (valid/invalid)
- Used by Withdraw class

**Logic**:
Input PIN
↓
Compare with stored PIN
↓
Return true (if match) / false (if no match)


---

### **10. Validation.java** ✓
**General Input Validation Utility**

**Contains Validation Methods**:
- Username validation
- Password format validation
- Amount validation
- Numeric input validation
- PIN format validation

**Usage**: Shared validation logic across multiple classes

---

### **11. Exit.java** 🚪
**Application Exit Handler**

**Functionality**:
- Graceful application termination
- Displays exit message
- Closes Scanner resources
- Prevents resource leaks

---

### **12. module-info.java** ⚙️
**Module Configuration (Java 9+)**

**Purpose**: Defines module dependencies and exports for Java module system

---

## 🚀 **How to Run**

### **Prerequisites** ✅
✓ Java Development Kit (JDK) 8 or higher
✓ Command-line/Terminal access
✓ Git installed (for cloning)
✓ Text editor or IDE (optional)

### **Step-by-Step Instructions**

#### **Step 1: Clone Repository**
git clone https://github.com/thisisavinashkumarverma/Advance-Banking-Program.git
cd Advance-Banking-Program


#### **Step 2: Navigate to Project**
cd NetBanking


#### **Step 3: Compile Java Files**

**Option A - From NetBanking directory:**
javac src/NetBanking/*.java -d bin

**Option B - From src/NetBanking directory:**
cd src/NetBanking
javac *.java
cd ../..


#### **Step 4: Run Application**

**Option A - Using compiled bin:**
java -cp bin NetBanking.Login


#### **Step 5: Login to System**

When prompted:
- **Username**: `Avinash`
- **Password**: `Avi@123`

Enter your Username: Avinash
Enter your Password: Avi@123
You Logged In Successfully


---

## 💻 **Usage Guide**

### **Login Screen**
Enter your Username:
(Type: Avinash)

Enter your Password:
(Type: Avi@123)


**Note**: Credentials are case-sensitive

---

### **Main Menu**

After successful login, you'll see:

Welcome to our Bank
You Logged In Successfully


