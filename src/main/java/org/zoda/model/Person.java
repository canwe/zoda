package org.zoda.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * User: Melih Birim -- melih.birim@alcatel-lucent.com
 * Date: Jun 13, 2009
 * Time: 1:45:07 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "PERSON")
public class Person implements Serializable,AbstractModel{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)    
    private Long personId;

    private String name;
    private String surName;

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
