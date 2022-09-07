import model.BiologyStudent;
import model.Citizen;
import model.ComputerScienceStudent;
import model.Student;

import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        ComputerScienceStudent csStudent = new ComputerScienceStudent("789", "James", "Java", "Weg 1", "ABC100");
        System.out.println(csStudent);

        Student student = new ComputerScienceStudent("123", "Sally", "Java", "Weg 1", "ABC100");
        System.out.println(student);

        Student bioStudent = new BiologyStudent("123", "Sally", "Weg 1", "ABC100");
        System.out.println(bioStudent);

        Citizen citizen = new BiologyStudent("4711", "Herbert", "Weg 1", "ABC100");
        System.out.println(citizen);

        HashMap<Integer, Student> mapOfStudents = new HashMap<>();

        mapOfStudents.put(4, new ComputerScienceStudent("123", "Sally", "Java", "Weg 1", "ABC100"));
        mapOfStudents.put(1, new BiologyStudent("123", "Sally", "Weg 1", "ABC100"));
        mapOfStudents.put(3, new BiologyStudent("4711", "Herbert", "Weg 1", "ABC100"));

        System.out.println(mapOfStudents);
        System.out.println(mapOfStudents.get(3));


        mapOfStudents.remove(1);


        }







}