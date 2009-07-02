package org.zoda.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

@Entity
public class DefaultHI extends Persistable {

    private static final long serialVersionUID = 1L;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @OneToOne(mappedBy = "defaultHI")
    public Person person;

    public Person getOwner() {
        return person;
    }

    public void setOwner(Person person) {
        this.person = person;
    }
    private String bloodGRP;
    private String workAccident;
    private String attention;
    private String medicineAllergy;
    private String healthHistory;
    private String originHistory;
    private String smoke;
    private String alcohol;
    private String tetanusVaccin;
    private String hepatitisBvaccin;
    private String hepatitisA;
    private String hepatitis;
    private Long bloodGive;
    private String workIllness;
    private String otherVaccins;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date TERMD;

    /**
     * @return the bloodGRP
     */
    public String getBloodGRP() {
        return bloodGRP;
    }

    /**
     * @param bloodGRP the bloodGRP to set
     */
    public void setBloodGRP(String bloodGRP) {
        this.bloodGRP = bloodGRP;
    }

    /**
     * @return the workAccident
     */
    public String getWorkAccident() {
        return workAccident;
    }

    /**
     * @param workAccident the workAccident to set
     */
    public void setWorkAccident(String workAccident) {
        this.workAccident = workAccident;
    }

    /**
     * @return the attention
     */
    public String getAttention() {
        return attention;
    }

    /**
     * @param attention the attention to set
     */
    public void setAttention(String attention) {
        this.attention = attention;
    }

    /**
     * @return the medicineAllergy
     */
    public String getMedicineAllergy() {
        return medicineAllergy;
    }

    /**
     * @param medicineAllergy the medicineAllergy to set
     */
    public void setMedicineAllergy(String medicineAllergy) {
        this.medicineAllergy = medicineAllergy;
    }

    /**
     * @return the healthHistory
     */
    public String getHealthHistory() {
        return healthHistory;
    }

    /**
     * @param healthHistory the healthHistory to set
     */
    public void setHealthHistory(String healthHistory) {
        this.healthHistory = healthHistory;
    }

    /**
     * @return the originHistory
     */
    public String getOriginHistory() {
        return originHistory;
    }

    /**
     * @param originHistory the originHistory to set
     */
    public void setOriginHistory(String originHistory) {
        this.originHistory = originHistory;
    }

    /**
     * @return the smoke
     */
    public String getSmoke() {
        return smoke;
    }

    /**
     * @param smoke the smoke to set
     */
    public void setSmoke(String smoke) {
        this.smoke = smoke;
    }

    /**
     * @return the alcohol
     */
    public String getAlcohol() {
        return alcohol;
    }

    /**
     * @param alcohol the alcohol to set
     */
    public void setAlcohol(String alcohol) {
        this.alcohol = alcohol;
    }

    /**
     * @return the tetanusVaccin
     */
    public String getTetanusVaccin() {
        return tetanusVaccin;
    }

    /**
     * @param tetanusVaccin the tetanusVaccin to set
     */
    public void setTetanusVaccin(String tetanusVaccin) {
        this.tetanusVaccin = tetanusVaccin;
    }

    /**
     * @return the hepatitisBvaccin
     */
    public String getHepatitisBvaccin() {
        return hepatitisBvaccin;
    }

    /**
     * @param hepatitisBvaccin the hepatitisBvaccin to set
     */
    public void setHepatitisBvaccin(String hepatitisBvaccin) {
        this.hepatitisBvaccin = hepatitisBvaccin;
    }

    /**
     * @return the hepatitisA
     */
    public String getHepatitisA() {
        return hepatitisA;
    }

    /**
     * @param hepatitisA the hepatitisA to set
     */
    public void setHepatitisA(String hepatitisA) {
        this.hepatitisA = hepatitisA;
    }

    /**
     * @return the hepatitis
     */
    public String getHepatitis() {
        return hepatitis;
    }

    /**
     * @param hepatitis the hepatitis to set
     */
    public void setHepatitis(String hepatitis) {
        this.hepatitis = hepatitis;
    }

    /**
     * @return the bloodGive
     */
    public Long getBloodGive() {
        return bloodGive;
    }

    /**
     * @param bloodGive the bloodGive to set
     */
    public void setBloodGive(Long bloodGive) {
        this.bloodGive = bloodGive;
    }

    /**
     * @return the workIllness
     */
    public String getWorkIllness() {
        return workIllness;
    }

    /**
     * @param workIllness the workIllness to set
     */
    public void setWorkIllness(String workIllness) {
        this.workIllness = workIllness;
    }

    /**
     * @return the otherVaccins
     */
    public String getOtherVaccins() {
        return otherVaccins;
    }

    /**
     * @param otherVaccins the otherVaccins to set
     */
    public void setOtherVaccins(String otherVaccins) {
        this.otherVaccins = otherVaccins;
    }

    public Date getTERMD() {
        return TERMD;
    }

    public void setTERMD(Date TERMD) {
        this.TERMD = TERMD;
    }

}
