package domain;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 *
 * @author reych
 */
public class Professor extends Person implements Features {
    private int edad;
    private Date dateOfBirth;
    private double salary;

    public Professor() {
    }

    public Professor(String name, String lastName,Date dateOfBirth, double salary) {
        super(name, lastName);
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
         setAge();
    }
    
     public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public int setAge() {
        LocalDate nacimiento = this.dateOfBirth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate today = LocalDate.now();
        Period age = Period.between(nacimiento, today);
        System.out.println(today.getYear() - nacimiento.getYear());

        this.edad = today.getYear() - nacimiento.getYear();
        return edad;

    }

    @Override
    public String toString() {
        return super.toString() + ".\n" + "El profesor tiene " + edad + " años de edad. Y tiene un salario de $" + this.salary + ".";
    }

    @Override
    public String showData() {
       String s="";
        return s;
    }
    
}
