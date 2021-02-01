package model;

import java.util.Objects;

public class Student {

    String lastName = "Mueller";
    String firstName = "Hans";

    public Student(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(lastName, student.lastName) && Objects.equals(firstName, student.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
