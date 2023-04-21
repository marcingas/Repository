package pl.marcin.body;

import java.util.Objects;

public class User {
    private int id;
    private String name;
    private int age;
    private String role;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRole() {
        return role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return getId() == user.getId() && getAge() == user.getAge() && getName().equals(user.getName()) && getRole().equals(user.getRole());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAge(), getRole());
    }
}
