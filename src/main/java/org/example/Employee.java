package org.example;

public class Employee {
    String name;
    double salary;
    int workHouse;
    int hireYear;
    int taxRate=3;
    Employee(String name,double salary,int workHouse,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHouse=workHouse;
        this.hireYear=hireYear;
    }
    double tax(){
        if (salary > 1000) {
            double tax=(this.taxRate*this.salary)/100;
            return tax;
        }
        return 0;
    }
    double bonus(){
        if (workHouse > 40) {
            double bonus=(workHouse-40)*30;
            return bonus;
        }
        return 0;
    }
    double raiseSalary(){
        int currentYear=2023;
        int howYear=currentYear-this.hireYear;
        double raiseSalary;
        if (howYear<10) {
            raiseSalary=this.salary*0.05;
            return raiseSalary;
        } else if ((howYear>9)&&(howYear<20)) {
            raiseSalary=salary*0.10;
            return raiseSalary;
        } else if (howYear>19) {
            raiseSalary=salary*0.15;
            return raiseSalary;
        }
        return 0;
    }
    void showInfo(){
        System.out.println("AD: " + this.name);
        System.out.println("MAAŞ: " + this.salary);
        System.out.println("HAFTALIK ÇALIŞMA SAATİ: " + this.workHouse);
        System.out.println("BAŞLANGIÇ YILI: " + this.hireYear);
        System.out.println("VERGİ: " + this.tax());
        System.out.println("BONUS ÜCRET: " + this.bonus());
        System.out.println("MAAŞ ARTIŞI: " + this.raiseSalary());
        System.out.println("VERGİ VE BONUSLAR İLE TOPLAM MAAŞ: " + ((this.raiseSalary() + this.bonus()+ this.salary)-this.tax()));
        System.out.println("TOPLAM MAAŞ: " + (this.salary+this.raiseSalary()+this.bonus()));
    }
}
