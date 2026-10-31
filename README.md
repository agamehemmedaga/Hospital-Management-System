# 🏥 Hospital Management System

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge)
![OOP](https://img.shields.io/badge/OOP-Polymorphism-blue?style=for-the-badge)
![Type](https://img.shields.io/badge/Console-Application-lightgrey?style=for-the-badge)

A console application written in pure Java that calculates the cost of different hospital services. It is a practical demonstration of core Object-Oriented Programming principles: abstraction, inheritance, encapsulation and polymorphism.

## 🧩 How It Works

All services extend the abstract class `MedicalService`, which defines a common contract (`calculateCost()`). Each subclass implements its own pricing logic, and `Main` processes them all through a single `MedicalService[]` array.

| Service | Class | Cost calculation |
|---------|-------|------------------|
| Surgery | `Surgery` | base price + equipment cost |
| Therapy | `Therapy` | base price × number of sessions |
| Consultation | `Consultation` | base price (shows the doctor's title) |

## 🏗️ Class Structure

```
MedicalService (abstract)
├── Surgery        - equipmentCost
├── Therapy        - sessionCount
└── Consultation   - doctorTitle
```

## 💡 OOP Concepts Used

- **Abstraction:** `MedicalService` is an abstract class with an abstract `calculateCost()` method.
- **Inheritance:** `Surgery`, `Therapy` and `Consultation` extend `MedicalService`.
- **Polymorphism:** one array of `MedicalService` holds all service types, and the correct `calculateCost()` runs for each object at runtime.
- **Encapsulation:** fields are `private` and accessed through getters.

## ⚙️ Getting Started

### Prerequisites

- JDK 17 or newer (tested with JDK 21)

### Run

```bash
git clone https://github.com/agamehemmedaga/Hospital-Management-System.git
cd Hospital-Management-System
javac -encoding UTF-8 *.java
java Main
```

Or open the project in IntelliJ IDEA and run `Main`.

## 🖥️ Sample Output

```
---Medical-Hospital---

Surgery Əməliyyatı:
-> Əsas xidmət haqqı:1500.0AZN
-> Avadanlıq xərci:3000.0AZN
-> Ümumi Cəm :4500.0AZN
-----------------
Therapy:Müalicəsi:
-> Terapiya qiyməti:500.0AZN
-> Təyin olunan seans sayısı:5dəfə
-> Toplam ödəniş:2500.0AZN
-----------------
Consultation Xidməti:
-> Həkimin dərəcəsi:Professor
->Konsultasiya qiyməti:50.0AZN
-----------------
```

> Output text is in Azerbaijani (AZN currency). On a Windows terminal, run `chcp 65001` first so special characters display correctly.

## 📁 Project Structure

```
MedicalService.java   Abstract base class
Surgery.java          Surgery pricing
Therapy.java          Therapy pricing
Consultation.java     Consultation pricing
Main.java             Entry point
```

## 👤 Author

**Aga** - Java Backend Developer
GitHub: [agamehemmedaga](https://github.com/agamehemmedaga)
