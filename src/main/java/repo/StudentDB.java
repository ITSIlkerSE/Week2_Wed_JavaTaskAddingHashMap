package repo;

import model.Student;

import java.util.HashMap;
import java.util.Objects;

public class StudentDB {

    private HashMap<String, Student> students;

    public Student add(Student student){
        students.put(student.getId(), student);
        return student;

    }

    public void remove(String Id){
        students.remove(Id);

    }


    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }

    public StudentDB() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentDB studentDB = (StudentDB) o;

        return Objects.equals(students, studentDB.students);
    }

    @Override
    public int hashCode() {
        return students != null ? students.hashCode() : 0;
    }


}