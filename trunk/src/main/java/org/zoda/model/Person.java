package org.zoda.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * User: Melih Birim -- melih.birim@alcatel-lucent.com
 * Date: Jun 13, 2009
 * Time: 1:45:07 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "PERSON")
public class Person extends Persistable {

    private String name;
    private String surName;

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
