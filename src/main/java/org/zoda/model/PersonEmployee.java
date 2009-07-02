package org.zoda.model;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name="PersonEmployee")
public class PersonEmployee extends Persistable {

    @ManyToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE})
    @JoinColumn(name="CompanyID")
    Company company;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @ManyToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE})
    @JoinColumn(name="PersonID")
    Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    /**
     * @return the serialVersionUID
     */
    private static long serialVersionUID = 1L;

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

    private Long telsic;
    private boolean isActive;
    private String departmentCode;
    private String secondSCL;
    private String sigsic;
    private String workState;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date entryDate;

    private boolean periodicScrutiny;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date IGMdate;

    private String works;
    private String job;
    private String jobRisk;
    private String personelProtector;
    private String exCompany;
    private String companySCL;
    
    
    public PersonEmployee() {}

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getID() != null ? getID().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonEmployee)) {
            return false;
        }
        PersonEmployee other = (PersonEmployee) object;
        if ((this.getID() == null && other.getID() != null) || (this.getID() != null && !this.ID.equals(other.ID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "newpackage.PersonEmployee[ID=" + getID() + "]";
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

    public Long getTelsic() {
        return telsic;
    }

    public void setTelsic(Long telsic) {
        this.telsic = telsic;
    }
    /**
     * @return the isActive
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * @param isActive the isActive to set
     */
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * @return the departmentCode
     */
    public String getDepartmentCode() {
        return departmentCode;
    }

    /**
     * @param departmentCode the departmentCode to set
     */
    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    /**
     * @return the secondSCL
     */
    public String getSecondSCL() {
        return secondSCL;
    }

    /**
     * @param secondSCL the secondSCL to set
     */
    public void setSecondSCL(String secondSCL) {
        this.secondSCL = secondSCL;
    }

    public boolean isPeriodicScrutiny() {
        return periodicScrutiny;
    }

    public void setPeriodicScrutiny(boolean periodicScrutiny) {
        this.periodicScrutiny = periodicScrutiny;
    }

    /**
     * @return the sigsic
     */
    public String getSigsic() {
        return sigsic;
    }

    /**
     * @param sigsic the sigsic to set
     */
    public void setSigsic(String sigsic) {
        this.sigsic = sigsic;
    }

    /**
     * @return the workState
     */
    public String getWorkState() {
        return workState;
    }

    /**
     * @param workState the workState to set
     */
    public void setWorkState(String workState) {
        this.workState = workState;
    }

    /**
     * @return the entryDate
     */
    public Date getEntryDate() {
        return entryDate;
    }

    /**
     * @param entryDate the entryDate to set
     */
    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }


    /**
     * @return the IGMdate
     */
    public Date getIGMdate() {
        return IGMdate;
    }

    /**
     * @param IGMdate the IGMdate to set
     */
    public void setIGMdate(Date IGMdate) {
        this.IGMdate = IGMdate;
    }

    /**
     * @return the works
     */
    public String getWorks() {
        return works;
    }

    /**
     * @param works the works to set
     */
    public void setWorks(String works) {
        this.works = works;
    }

    /**
     * @return the job
     */
    public String getJob() {
        return job;
    }

    /**
     * @param job the job to set
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * @return the jobRisk
     */
    public String getJobRisk() {
        return jobRisk;
    }

    /**
     * @param jobRisk the jobRisk to set
     */
    public void setJobRisk(String jobRisk) {
        this.jobRisk = jobRisk;
    }

    /**
     * @return the personelProtector
     */
    public String getPersonelProtector() {
        return personelProtector;
    }

    /**
     * @param personelProtector the personelProtector to set
     */
    public void setPersonelProtector(String personelProtector) {
        this.personelProtector = personelProtector;
    }

    /**
     * @return the exCompany
     */
    public String getExCompany() {
        return exCompany;
    }

    /**
     * @param exCompany the exCompany to set
     */
    public void setExCompany(String exCompany) {
        this.exCompany = exCompany;
    }

    /**
     * @return the companySCL
     */
    public String getCompanySCL() {
        return companySCL;
    }

    /**
     * @param companySCL the companySCL to set
     */
    public void setCompanySCL(String companySCL) {
        this.companySCL = companySCL;
    }

}
