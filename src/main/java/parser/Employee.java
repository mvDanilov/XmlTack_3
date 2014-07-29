package parser;

public class Employee {
    String id;
    String surname;
    String firstName;
    String middlename;
    

    @Override
    public String toString() {
        return surname + " " + firstName + "(" + id + ")" + middlename;

    }

}
}
