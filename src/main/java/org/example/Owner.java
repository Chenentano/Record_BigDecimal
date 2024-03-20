package org.example;

import java.util.Objects;

public record Owner(String Name, int Age, String Adress) {


    @Override
    public String toString() {
        return "Owner{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Adress='" + Adress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return Age == owner.Age && Objects.equals(Name, owner.Name) && Objects.equals(Adress, owner.Adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Age, Adress);
    }
}
