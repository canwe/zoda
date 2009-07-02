package org.zoda.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Company extends Persistable {

    private static final long serialVersionUID = 1L;

    @OneToMany(cascade={CascadeType.PERSIST,CascadeType.MERGE})
    @JoinColumn(name="CompanyID")
    List<PersonEmployee> employees;

    public List<PersonEmployee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<PersonEmployee> employees) {
        this.employees = employees;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    private String companyName;
    private String companyAddress;
    private String companyTel;
    private String companySicil;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * @return the companyAddress
     */
    public String getCompanyAddress() {
        return companyAddress;
    }

    /**
     * @param companyAddress the companyAddress to set
     */
    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    /**
     * @return the companyTel
     */
    public String getCompanyTel() {
        return companyTel;
    }

    /**
     * @param companyTel the companyTel to set
     */
    public void setCompanyTel(String companyTel) {
        this.companyTel = companyTel;
    }

    /**
     * @return the companySicil
     */
    public String getCompanySicil() {
        return companySicil;
    }

    /**
     * @param companySicil the companySicil to set
     */
    public void setCompanySicil(String companySicil) {
        this.companySicil = companySicil;
    }
}
