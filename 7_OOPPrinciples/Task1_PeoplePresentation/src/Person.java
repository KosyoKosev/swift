
public abstract class Person {

    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return ("First name: " + firstName + "\n" + "Last name: " + lastName
                + "\n" + "Occupation: " + getOccupation() + "\n");
    }

    String validate() {
        if (firstName.length() < 2 || firstName.length() > 30) {
            return ("Expected length for first name is between 2 and 30 symbols.");
        } else if (lastName.length() < 2 || lastName.length() > 30) {
            return ("Expected length for last name is between 2 and 30 symbols.");
        } else if (!firstName.matches("^[a-zA-Z]*$")) {
            return ("Expected only Latin letters in firt name.");
        } else if (!lastName.matches("^[a-zA-Z]*$")) {
            return ("Expected only Latin letters in last name.");
        } else if (!firstName.matches("^[A-Z].*")) {// регулярен израз[regular expression]
            return ("Expected upper case letter at first position of first name.");
        } else if (!lastName.matches("^[A-Z].*")) {
            return ("Expected upper case letter at first position of last name.");
        }
        return "";
    }

    abstract String getOccupation();

    abstract double getHoursPerDay();

}
