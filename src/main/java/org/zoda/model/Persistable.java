package org.zoda.model;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * User: Melih Birim -- melih.birim@alcatel-lucent.com
 * Date: Jun 13, 2009
 * Time: 2:07:40 AM
 * To change this template use File | Settings | File Templates.
 */
@MappedSuperclass
public abstract class Persistable implements Serializable {
    public static final long UNSAVED_ID_VALUE = 0L ;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    protected Long Id = Persistable.UNSAVED_ID_VALUE ;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}
