package org.zoda.util;

import junit.framework.TestCase;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.zoda.model.Person;

/**
 * User: Melih Birim -- melih.birim@alcatel-lucent.com
 * Date: Jun 13, 2009
 * Time: 1:53:30 AM
 * To change this template use File | Settings | File Templates.
 */
public class BasicHibernateTest extends TestCase {

    public void testBasicInsert() {
        SessionFactory session = HibernateUtil.getSessionFactory();
        Session sess = session.getCurrentSession();
        /** Starting the Transaction */
        Transaction tx = sess.beginTransaction();
        /** Creating Pojo */
        Person pojo = new Person();        
        pojo.setName("Test");
        pojo.setSurName("Test");
        /** Saving POJO */        
        sess.save(pojo);
        /** Commiting the changes */
        tx.commit();
        System.out.println("Record Inserted");
        /** Closing Session */
        session.close();
    }

    public void PersonDaoTest(){
        
    }
}
