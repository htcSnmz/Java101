package com.company.Odev39;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(double salary) {
        if (salary > 1000) {
            return salary * 0.03;
        }
        return 0;
    }

    public double bonus(int workHours) {
        if (workHours > 40) {
            return ((workHours - 40) * 30);
        }
        return 0;
    }

    public double raiseSalary(int hireYear) {
        int difference = 2021 - hireYear;
        if (difference >= 20) {
            return 0.15;
        } else if (difference >= 10) {
            return 0.1;
        }
        return 0.05;
    }

    public String toString() {
        double tax = this.tax(this.salary);
        double bonus = this.bonus(this.workHours);
        double raiseSalary = this.raiseSalary(this.hireYear) * this.salary;
        double totalSalary = this.salary + tax + bonus + raiseSalary;

        return "Adı: " + this.name + "\n" +
                "Maaşı: " + this.salary + "\n" +
                "Çalışma Saati: " + this.workHours + "\n" +
                "Başlangıç Yılı: " + this.hireYear + "\n" +
                "Vergi: " + tax + "\n" +
                "Bonus: " + bonus + "\n" +
                "Maaş Artışı: " + raiseSalary + "\n" +
                "Toplam Maaş: " + totalSalary;

    }
}