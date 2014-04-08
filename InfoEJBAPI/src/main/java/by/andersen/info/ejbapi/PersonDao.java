package by.andersen.info.ejbapi;


import by.andersen.info.entity.Person;

import javax.ejb.Local;
import java.util.Date;

@Local
public interface PersonDao {
    Person getPerson(String firstName, String lastName, String patronymic, Date birthdayDate);
}
