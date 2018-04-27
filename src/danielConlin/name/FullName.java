package danielConlin.name;

public class FullName {

    private String firstName;
    private String middleName;
    private char middleInital;
    private String lastName;

    public FullName(String firstName, String middleName, String lastName) {
        setFirstName(firstName);
        setMiddleName(middleName);
        setLastName(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {

        char [] charArray = new char[99];

        char tempMiddleInital = middleName.charAt(0);
        setMiddleInital(Character.toUpperCase(tempMiddleInital));


    }

    public char getMiddleInital() {
        return middleInital;
    }

    public void setMiddleInital(char middleInital) {
        this.middleInital = middleInital;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "FullName{" +
                "firstName='" + firstName + '\'' +
                "\n, middleName='" + middleName + '\'' +
                "\n, middleInital=" + middleInital +
                "\n, lastName='" + lastName + '\'' +
                '}';
    }
}
