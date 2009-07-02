package org.zoda.util;

import junit.framework.TestCase;
import org.zoda.dao.impl.PersonDao;
import org.zoda.dao.impl.HealthInformationDao;
import org.zoda.model.HealthInformation;
import org.zoda.model.Person;

import java.util.List;

/**
 * User: Melih Birim -- melih.birim@alcatel-lucent.com
 * Date: Jun 19, 2009
 * Time: 5:14:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class BasicDaoTest extends TestCase {

    public void testBasicDao(){
        HealthInformationDao hiDao = new HealthInformationDao();
        PersonDao pd = new PersonDao();

        HealthInformation hi = new HealthInformation();
        Person p = new Person();
        p.setName("test");
        p.setSurname("sd");
        hi.setPerson(p);

        hiDao.persist(hi);

        List<Person> list = pd.list(Person.class);
        for (Person person : list) {
            System.out.println("person.getName() = " + person.getName());
        }

        List<HealthInformation> hiList = hiDao.list(HealthInformation.class);

        for (HealthInformation healthInformation : hiList) {
            System.out.println("Health Information = " + healthInformation);
            System.out.println("Person Name = " + healthInformation.getPerson().getName());
        }

    }

}
