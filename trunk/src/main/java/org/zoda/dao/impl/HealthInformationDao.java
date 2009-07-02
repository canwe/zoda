package org.zoda.dao.impl;

import org.zoda.dao.AbstractDao;
import org.zoda.model.HealthInformation;

/**
 * User: Melih Birim -- melih.birim@alcatel-lucent.com
 * Date: Jun 19, 2009
 * Time: 5:03:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class HealthInformationDao extends AbstractDao {

    PersonDao pd = new PersonDao();

    public <T extends HealthInformation> T persist(T hi){
        //hi.setPerson(pd.persist(hi.getPerson()));
        return super.persist(hi);
    }

}
