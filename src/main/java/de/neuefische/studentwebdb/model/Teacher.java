package de.neuefische.studentwebdb.model;

import java.util.Objects;

public class Teacher {

    String lastName;
    String firstName;
    int id;

    public Teacher(String lastName, String firstName, int id) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(lastName, teacher.lastName) && Objects.equals(firstName, teacher.firstName);
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
