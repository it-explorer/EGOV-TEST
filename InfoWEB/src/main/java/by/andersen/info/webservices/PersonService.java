package by.andersen.info.webservices;

import by.andersen.info.ejbapi.PersonDao;
import by.andersen.info.entity.Person;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Date;

@WebService
public class PersonService {
    @EJB
    private PersonDao personDao;

    @WebMethod
    public Person getPerson(String firstName, String lastName, String patronymic, Date birthdayDate) {
        try {
            personDao = InitialContext.doLookup("java:comp/env/PersonDaoBean");
        } catch (NamingException e) {
            e.printStackTrace();
        }
        return personDao.getPerson(firstName, lastName, patronymic, birthdayDate);
    }
}
