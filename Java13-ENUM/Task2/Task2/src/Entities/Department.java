package Entities;

public class Department {
    private String Name;

    public Department(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "Name='" + Name + '\'' +
                '}';
    }
}
