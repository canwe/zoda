package org.zoda.dao.impl;

import org.zoda.dao.AbstractDao;
import org.zoda.model.Person;

/**
 * User: Melih Birim -- melih.birim@alcatel-lucent.com
 * Date: Jun 13, 2009
 * Time: 2:17:30 AM
 * To change this template use File | Settings | File Templates.
 */
public class PersonDao extends AbstractDao {
     public <T extends Person> T persist(T obj) {
         return super.persist(obj);
     }
}
