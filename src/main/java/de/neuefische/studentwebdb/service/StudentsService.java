package de.neuefische.studentwebdb.service;

import de.neuefische.studentwebdb.model.Student;
import de.neuefische.studentwebdb.model.Teacher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentsService {

    public Optional<Teacher> getTeacherById(int id){
        List<Teacher> list = new ArrayList<>();
        Teacher teacher1 =  new Teacher("Knick", "Wilhelm",1);
        Teacher teacher2 =  new Teacher("Knack", "Knick",2);
        Teacher teacher3 =  new Teacher("Back", "Knackund",3);
        list.add(teacher1);
        list.add(teacher2);
        list.add(teacher3);
        for (Teacher teacher : list) {
            if (teacher.getId() == id){
                return Optional.of(teacher);
            }
        } return Optional.empty();
    }

    public Optional<Student> getStudentById(int id){
        List<Student> list = new ArrayList<>();
        Student student1 =  new Student("Knickknack", "Horst",2);
        Student student2 =  new Student("Mueller", "Peter",1);
        Student student3 =  new Student("Dafoe", "Willem",3);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        for (Student student : list){
            if(student.getId() == id){
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }

    public List<Teacher> getTeacherList(){
        List<Teacher> list = new ArrayList<>();
        Teacher teacher1 =  new Teacher("Knick", "Wilhelm",1);
        Teacher teacher2 =  new Teacher("Knack", "Knick",2);
        Teacher teacher3 =  new Teacher("Back", "Knackund",3);
        list.add(teacher1);
        list.add(teacher2);
        list.add(teacher3);
        return list;
    }

    public List<Student> getStudentList(){
        List<Student> list = new ArrayList<>();
        Student student1 =  new Student("Knickknack", "Horst",2);
        Student student2 =  new Student("Mueller", "Peter",1);
        Student student3 =  new Student("Dafoe", "Willem",3);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        return list;
    }
}
