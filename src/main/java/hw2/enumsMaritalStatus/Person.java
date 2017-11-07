package hw2.enumsMaritalStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
    private MaritalStatus maritalStatus;

    @Override
    public String toString() {
        return name + " age: " + age + ", " + maritalStatus;
    }

    @Override
    public boolean equals(Object o){
        if (o == null)                return false;
        if (!(o instanceof Person)) return false;

        Person other = (Person) o;
        if (this.age != other.age)      return false;
        if (!this.name.equals(other.name)) return false;
        if (!this.maritalStatus.equals(other.maritalStatus))   return false;

        return true;
    }
}
