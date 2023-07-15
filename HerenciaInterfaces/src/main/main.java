package main;

import domain.Person;
import domain.Professor;
import domain.Student;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author reych
 */
public class main {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Person> list=new ArrayList<>();
        //insertarDatosStudent(list, 1);
  
        int run = 1;
        String insert;
        int cantidadUser;
        while (run != 0) {
            //CASO 1
            
         insert=JOptionPane.showInputDialog("Si desea agregar un usuario de tipo profesor inserte p o inserte s para estudiante.");
            if (insert.contains("s")) {
                  cantidadUser = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de usuarios"));
                    insertarDatosStudent(list, cantidadUser);
            }else if (insert.contains("p")) {
                  cantidadUser = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de usuarios"));
                     insertarDatosProfessor(list, cantidadUser);

            }

            //caso 3
            
            run = Integer.parseInt(JOptionPane.showInputDialog("Si desea continuar ingrese 1, de lo contrario ingrese 0"));
            
        }

                showData(list);

    }

    public static void insertarDatosStudent(ArrayList<Person> list, int counter) {
        String name, lastName;
        int courses, year, month, day;
        for (int i = 0; i < counter; i++) {
            name = JOptionPane.showInputDialog("Ingresa el nombre del estudiante:");
            lastName = JOptionPane.showInputDialog("Ingresa el apellido del estudiante:");
            year = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año de nacimiento del estudiante:"));
            month = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número del mes de nacimiento del estudiante:"));
            day = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el día de nacimiento del estudiante:"));
            courses = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de cursos"));
            list.add(new Student(name, lastName, new Date((year - 1900), month, day), courses));
        }
    }

    public static void insertarDatosProfessor(ArrayList<Person> list, int counter) {
        String name, lastName;
        int year, month, day;
        double salary;
        for (int i = 0; i < counter; i++) {
            name = JOptionPane.showInputDialog("Ingresa el nombre del profesor:");
            lastName = JOptionPane.showInputDialog("Ingresa el apellido del profesor:");
            year = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año de nacimiento del profesor:"));
            month = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el el número del mes de nacimiento del profesor:"));
            day = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el día de nacimiento del profesor:"));
            salary = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad de salario"));
            list.add(new Professor(name, lastName, new Date((year - 1900), month, day), salary));
        }
    }
    
    public static void showData(ArrayList<Person> list){
        for (int i = 0; i < list.size(); i++) {
            JOptionPane.showMessageDialog(null, list.get(i));
        }
    
    }
    
}
