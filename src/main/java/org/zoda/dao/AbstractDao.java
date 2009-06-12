package org.zoda.dao;

import org.zoda.model.AbstractModel;
import org.zoda.util.HibernateUtil;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * User: Melih Birim -- melih.birim@alcatel-lucent.com
 * Date: Jun 13, 2009
 * Time: 2:05:36 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractDao {
    private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    
    public void save(AbstractModel abstractModel){       
        Session session = sessionFactory.getCurrentSession();
        // Starting the Transaction
        Transaction tx = session.beginTransaction();
        // Save the abstractModel
        session.save(abstractModel);
        //Commiting the changes 
        tx.commit();
        System.out.println("Record Inserted");
        // Closing Session 
        session.close();
    }
}
