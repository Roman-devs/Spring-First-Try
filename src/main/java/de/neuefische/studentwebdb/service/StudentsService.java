package de.neuefische.studentwebdb.service;

import de.neuefische.studentwebdb.model.Student;
import de.neuefische.studentwebdb.model.Teacher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentsService {


    List<Student> list = new ArrayList<>(List.of(
        new Student("Knickknack", "Horst",2),
        new Student("Mueller", "Peter",1),
        new Student("Dafoe", "Willem",3))
    );


    List<Teacher> list2 = new ArrayList<>(List.of(
        new Teacher("Knick", "Wilhelm",1),
        new Teacher("Knack", "Knick",2),
        new Teacher("Back", "Knackund",3))
    );



    public Optional<Teacher> getTeacherById(int id){
        for (Teacher teacher : list2) {
            if (teacher.getId() == id){
                return Optional.of(teacher);
            }
        } return Optional.empty();
    }

    public Optional<Student> getStudentById(int id){
        for (Student student : list){
            if(student.getId() == id){
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }

    public List<Teacher> getTeacherList(String search){
        List<Teacher> result = new ArrayList<>();
        for (Teacher teacher : list2) {
            if(teacher.getFirstName().contains(search)){
                result.add(teacher);
            }
        } return result;
    }

    public List<Student> getStudentList(String search){
        List<Student> result = new ArrayList<>();
        for (Student student : list) {
           if(student.getFirstName().contains(search)){
               result.add(student);
           }
        } return result;
    }

    public Student addStudent(Student student) {
        list.add(student);
        return student;
    }

    public Teacher addTeacher(Teacher teacher){
        list2.add(teacher);
        return teacher;
    }


}
