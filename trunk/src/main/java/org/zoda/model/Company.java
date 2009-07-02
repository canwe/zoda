package org.zoda.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Company extends Persistable {

    private static long serialVersionUID = 1L;

    @OneToMany(cascade={CascadeType.PERSIST,CascadeType.MERGE})
    @JoinColumn(name="CompanyID")
    List<PersonEmployee> employees;

    public List<PersonEmployee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<PersonEmployee> employees) {
        this.employees = employees;
    }

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String companyName;
    private String companyAddress;
    private String companyTel;
    private String companySicil;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getID() != null ? getID().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Company)) {
            return false;
        }
        Company other = (Company) object;
        if ((this.getID() == null && other.getID() != null) || (this.getID() != null && !this.ID.equals(other.ID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "healthsystem.Company[ID=" + getID() + "]";
    }

    /**
     * @return the ID
     */
    public Long getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

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
