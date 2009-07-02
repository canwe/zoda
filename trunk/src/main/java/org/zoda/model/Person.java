package org.zoda.model;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Person", uniqueConstraints = {@UniqueConstraint(columnNames = {"TCno"})})
public class Person extends Persistable  {

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "PersonID")
    List<PersonEmployee> employees;

    public List<PersonEmployee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<PersonEmployee> employees) {
        this.employees = employees;
    }
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "PersonID")
    List<Periodic> periodic;

    public List<Periodic> getPeriodic() {
        return periodic;
    }

    public void setPeriodic(List<Periodic> periodic) {
        this.periodic = periodic;
    }
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "PersonID")
    List<DoctorRound> doctorround;

    public List<DoctorRound> getDoctorround() {
        return doctorround;
    }

    public void setDoctorround(List<DoctorRound> doctorround) {
        this.doctorround = doctorround;
    }
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "DefaultHIID")
    private DefaultHI defaultHI;

    public DefaultHI getDefaultHI() {
        return defaultHI;
    }

    public void setDefaultHI(DefaultHI defaultHI) {
        this.defaultHI = defaultHI;
    }
    private static long serialVersionUID = 1L;

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
    private String name;
    private String surname;
    private String sex;
    private String conditions;
    private String nmbrChild;
    private Long tel;
    private Long homeTel;
    private String birthPlace;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date birthDate;
    private String education;
    private String address;
    private Long TCno;
    private boolean retirement;


    public Person() {
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getID() != null ? getID().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Person)) {
            return false;
        }
        Person others = (Person) object;
        if ((this.getID() == null && others.getID() != null) || (this.getID() != null && !this.ID.equals(others.ID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "newpackage.Employee[ID=" + getID() + "]";
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

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the conditions
     */
    public String getConditions() {
        return conditions;
    }

    /**
     * @param conditions the conditions to set
     */
    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    /**
     * @return the nmbrChild
     */
    public String getNmbrChild() {
        return nmbrChild;
    }

    /**
     * @param nmbrChild the nmbrChild to set
     */
    public void setNmbrChild(String nmbrChild) {
        this.nmbrChild = nmbrChild;
    }



    /**
     * @return the tel
     */
    public Long getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(Long tel) {
        this.tel = tel;
    }

    /**
     * @return the homeTel
     */
    public Long getHomeTel() {
        return homeTel;
    }

    /**
     * @param homeTel the homeTel to set
     */
    public void setHomeTel(Long homeTel) {
        this.homeTel = homeTel;
    }

    /**
     * @return the birthPlace
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /**
     * @param birthPlace the birthPlace to set
     */
    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    /**
     * @return the birthDate
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the education
     */
    public String getEducation() {
        return education;
    }

    /**
     * @param education the education to set
     */
    public void setEducation(String education) {
        this.education = education;
    }



    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }


    /**
     * @return the TCno
     */
    public Long getTCno() {
        return TCno;
    }

    /**
     * @param TCno the TCno to set
     */
    public void setTCno(Long TCno) {
        this.TCno = TCno;
    }

    /**
     * @return the retirement
     */
    public boolean isRetirement() {
        return retirement;
    }

    /**
     * @param retirement the retirement to set
     */
    public void setRetirement(boolean retirement) {
        this.retirement = retirement;
    }


}
