package org.zoda.model;

import javax.persistence.*;

/**
 * User: Melih Birim -- melih.birim@alcatel-lucent.com
 * Date: Jun 19, 2009
 * Time: 5:05:17 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "HEALTH_INFORMATION")
public class HealthInformation extends Persistable{
   
    @OneToOne(cascade = CascadeType.PERSIST)
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
}
