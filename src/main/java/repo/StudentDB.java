package repo;

import model.Student;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class StudentDB {

    private Map<String, Student> students;


    public Student findById(String id) {
        if (students.containsKey(id)) {
        return students.get(id);
        }else {
            throw new RuntimeException("Student mit der " + id + " konnte nicht gefunden werden !");
        }
    } 

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