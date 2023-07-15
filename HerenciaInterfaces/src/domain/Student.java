package domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 *
 * @author reych
 */
public class Student extends Person implements Features{
private int edad;
private Date dateOfBirth;
private int numCourses;

    public Student() {
    }

    public Student(String name, String lastName,Date dateOfBirth, int numCourses) {
        super(name, lastName);
      this.numCourses=numCourses;
        this.dateOfBirth = dateOfBirth;
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

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
    
    
     
    @Override
    public int setAge() {
    LocalDate hoy = LocalDate.now();   
    LocalDate nacimiento = this.dateOfBirth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); 
    long edad = ChronoUnit.YEARS.between(nacimiento, hoy); 
    this.edad=(int) edad;
        return this.edad;

    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"El estudiante tiene " + edad + " años de edad. Y lleva un total de "+this.numCourses+" de cursos.";
    }

    @Override
    public String showData() {
       String s="";
        return s;
    }
   

}
