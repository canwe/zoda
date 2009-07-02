package org.zoda.model;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Furkan KAMACI
 */

@Entity
public class Periodic extends Persistable {

    @ManyToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE})
    @JoinColumn(name="PersonID")
    Person person;
    
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datePeriodic;
    private Long height;
    private Long weight;
    private String BMI;
    private String tension;
    private String pulse;
    private String alcohol;
    private String cigarette;
    private String complaint;
    private String illness;
    private String operations;
    private String disability;
    private String treatment;
    private String sisExamination;
    private String eye;
    private String KBB;
    private String skin;
    private String kardiyovaskuler;
    private String respiration;
    private String digestion;
    private String urogenital;
    private String orthopedy;
    private String neurology;
    private String psychiatry;
    private String other;
    private String xray;
    private String EKG;
    private String spirometry;
    private String hemogram;
    private double bloodPB;
    private String urine;
    private String sgotGama;
    private String sedimentation;
    private String audiometry;
    private String conclusion;
    private boolean hardWork;
    private boolean PM;
    private String scrutinyDR;


    public String getBMI() {
        return BMI;
    }

    public void setBMI(String BMI) {
        this.BMI = BMI;
    }

    public String getEKG() {
        return EKG;
    }

    public void setEKG(String EKG) {
        this.EKG = EKG;
    }

    public String getKBB() {
        return KBB;
    }

    public void setKBB(String KBB) {
        this.KBB = KBB;
    }

    public String getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(String alcohol) {
        this.alcohol = alcohol;
    }

    public String getAudiometry() {
        return audiometry;
    }

    public void setAudiometry(String audiometry) {
        this.audiometry = audiometry;
    }

    public double getBloodPB() {
        return bloodPB;
    }

    public void setBloodPB(double bloodPB) {
        this.bloodPB = bloodPB;
    }

    public String getTension() {
        return tension;
    }

    public void setTension(String tension) {
        this.tension = tension;
    }

    public String getCigarette() {
        return cigarette;
    }

    public void setCigarette(String cigarette) {
        this.cigarette = cigarette;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public Date getDatePeriodic() {
        return datePeriodic;
    }

    public void setDatePeriodic(Date datePeriodic) {
        this.datePeriodic = datePeriodic;
    }

    public String getDigestion() {
        return digestion;
    }

    public void setDigestion(String digestion) {
        this.digestion = digestion;
    }

    public String getDisability() {
        return disability;
    }

    public void setDisability(String disability) {
        this.disability = disability;
    }

    public String getEye() {
        return eye;
    }

    public void setEye(String eye) {
        this.eye = eye;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public String getHemogram() {
        return hemogram;
    }

    public void setHemogram(String hemogram) {
        this.hemogram = hemogram;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public String getKardiyovaskuler() {
        return kardiyovaskuler;
    }

    public void setKardiyovaskuler(String kardiyovaskuler) {
        this.kardiyovaskuler = kardiyovaskuler;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getNeurology() {
        return neurology;
    }

    public void setNeurology(String neurology) {
        this.neurology = neurology;
    }

    public String getOperations() {
        return operations;
    }

    public void setOperations(String operation) {
        this.operations = operation;
    }

    public String getOrthopedy() {
        return orthopedy;
    }

    public void setOrthopedy(String orthopedy) {
        this.orthopedy = orthopedy;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public boolean isPM() {
        return PM;
    }

    public void setPM(boolean PM) {
        this.PM = PM;
    }

    public boolean isHardWork() {
        return hardWork;
    }

    public void setHardWork(boolean hardWork) {
        this.hardWork = hardWork;
    }

    public String getScrutinyDR() {
        return scrutinyDR;
    }

    public void setScrutinyDR(String scrutinyDR) {
        this.scrutinyDR = scrutinyDR;
    }

    public String getPsychiatry() {
        return psychiatry;
    }

    public void setPsychiatry(String psychiatry) {
        this.psychiatry = psychiatry;
    }

    public String getPulse() {
        return pulse;
    }

    public void setPulse(String pulse) {
        this.pulse = pulse;
    }

    public String getRespiration() {
        return respiration;
    }

    public void setRespiration(String respiration) {
        this.respiration = respiration;
    }

    public String getSedimentation() {
        return sedimentation;
    }

    public void setSedimentation(String sedimentation) {
        this.sedimentation = sedimentation;
    }

    public String getSgotGama() {
        return sgotGama;
    }

    public void setSgotGama(String sgotGama) {
        this.sgotGama = sgotGama;
    }

    public String getSisExamination() {
        return sisExamination;
    }

    public void setSisExamination(String sisExamination) {
        this.sisExamination = sisExamination;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getSpirometry() {
        return spirometry;
    }

    public void setSpirometry(String spirometry) {
        this.spirometry = spirometry;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getUrine() {
        return urine;
    }

    public void setUrine(String urine) {
        this.urine = urine;
    }

    public String getUrogenital() {
        return urogenital;
    }

    public void setUrogenital(String urogenital) {
        this.urogenital = urogenital;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public String getXray() {
        return xray;
    }

    public void setXray(String xray) {
        this.xray = xray;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ID != null ? ID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the ID fields are not set
        if (!(object instanceof Periodic)) {
            return false;
        }
        Periodic others = (Periodic) object;
        if ((this.ID == null && others.ID != null) || (this.ID != null && !this.ID.equals(others.ID))) {
            return false;
        }
        return true;
    }

}
