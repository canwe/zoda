/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.zoda.model;

import java.util.List;
import org.zoda.dao.impl.*;

/**
 *
 * @author furkan
 */
public class Test {

    public static void main(String[] args){
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
