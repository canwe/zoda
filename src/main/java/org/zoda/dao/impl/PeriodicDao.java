/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.zoda.dao.impl;

import org.zoda.dao.AbstractDao;
import org.zoda.model.Periodic;

/**
 *
 * @author furkan
 */
public class PeriodicDao extends AbstractDao{

     public <T extends Periodic> T persist(T per){        
        return super.persist(per);
    }
}
