package by.andersen.info.entity;


import java.io.Serializable;

public class PersonPK implements Serializable {
    public String firstName;
    public String lastName;

    public PersonPK() {
    }

    public PersonPK(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object obj) {
        boolean returnVal = false;
        if (obj == null) {
            returnVal = false;
        } else if (!obj.getClass().equals(this.getClass())) {
            returnVal = false;
        } else {
            PersonPK other = (PersonPK) obj;
            if (this == other) {
                returnVal = true;
            } else if (firstName != null && other.firstName != null
                    && this.firstName.equals(other.firstName)) {
                if (lastName != null && other.lastName != null
                        && lastName.equals(other.lastName)) {
                    returnVal = true;
                }
            } else {
                returnVal = false;
            }
        }
        return returnVal;
    }

    @Override
    public int hashCode() {
        if (firstName == null || lastName == null) {
            return 0;
        } else {
            return firstName.hashCode() ^ lastName.hashCode();
        }
    }
}
