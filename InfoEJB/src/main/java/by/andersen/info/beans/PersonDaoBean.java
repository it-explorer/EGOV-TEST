package by.andersen.info.beans;

import by.andersen.info.ejbapi.PersonDao;
import by.andersen.info.entity.Person;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Date;
import java.util.List;

@Stateless
public class PersonDaoBean implements PersonDao {
    @PersistenceContext(unitName = "personPersistenceUnit")
    private EntityManager entityManager;

    @Override
    public Person getPerson(String firstName, String lastName, String patronymic, Date birthdayDate) {
        String sql = "select p from Person p where p.firstName = :firstName and p.lastName = :lastName and p.birthdayDate = :birthdayDate";
        if (patronymic != null || !patronymic.equals("")) {
            sql += " and p.patronymic = :patronymic";
        }
        Query query = entityManager.createQuery(sql);
        query.setParameter("firstName", firstName);
        query.setParameter("lastName", lastName);
        query.setParameter("birthdayDate", birthdayDate);

        Person person;
        if (patronymic != null || !patronymic.equals("")) {
            query.setParameter("patronymic", patronymic);
        }
        List<Person> personList = query.getResultList();
        if (personList.size() >= 1) {
            return personList.get(0);
        }
        return null;
    }
}
