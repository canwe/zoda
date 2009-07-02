package org.zoda.model;

import java.io.Serializable;
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
public class DoctorRound extends Persistable {
    
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
    private Long protocolNum;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateDRound;
    private String explanation;
    private String bloodPB;
    private String examination;
    private String scrutiny;
    private String workplaceDr;
    private String forwardPlace;
    private String diagnosis;
    private String treatment;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date reportBegin;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date reportEnd;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date reportDate;
    private boolean pregnant;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date SAT;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date MDT;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date permissionDate;
    private String attention;
    private String workAccident;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dummy;
    private String scrutinyDR;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Date getMDT() {
        return MDT;
    }

    public void setMDT(Date MDT) {
        this.MDT = MDT;
    }

    public Date getSAT() {
        return SAT;
    }

    public void setSAT(Date SAT) {
        this.SAT = SAT;
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention;
    }

    public String getBloodPB() {
        return bloodPB;
    }

    public void setBloodPB(String bloodPB) {
        this.bloodPB = bloodPB;
    }


    public Date getDateDRound() {
        return dateDRound;
    }

    public void setDateDRound(Date dateDRound) {
        this.dateDRound = dateDRound;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Date getDummy() {
        return dummy;
    }

    public void setDummy(Date dummy) {
        this.dummy = dummy;
    }

    public String getExamination() {
        return examination;
    }

    public void setExamination(String examination) {
        this.examination = examination;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getForwardPlace() {
        return forwardPlace;
    }

    public void setForwardPlace(String forwardPlace) {
        this.forwardPlace = forwardPlace;
    }

    public String getScrutinyDR() {
        return scrutinyDR;
    }

    public void setScrutinyDR(String scrutinyDR) {
        this.scrutinyDR = scrutinyDR;
    }

    public Date getPermissionDate() {
        return permissionDate;
    }

    public void setPermissionDate(Date permissionDate) {
        this.permissionDate = permissionDate;
    }

    public boolean isPregnant() {
        return pregnant;
    }

    public void setPregnant(boolean pregnant) {
        this.pregnant = pregnant;
    }

    public Long getProtocolNum() {
        return protocolNum;
    }

    public void setProtocolNum(Long protocolNum) {
        this.protocolNum = protocolNum;
    }

    public Date getReportBegin() {
        return reportBegin;
    }

    public void setReportBegin(Date reportBegin) {
        this.reportBegin = reportBegin;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public Date getReportEnd() {
        return reportEnd;
    }

    public void setReportEnd(Date reportEnd) {
        this.reportEnd = reportEnd;
    }

    public String getScrutiny() {
        return scrutiny;
    }

    public void setScrutiny(String scrutiny) {
        this.scrutiny = scrutiny;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getWorkAccident() {
        return workAccident;
    }

    public void setWorkAccident(String workAccident) {
        this.workAccident = workAccident;
    }

    public String getWorkplaceDr() {
        return workplaceDr;
    }

    public void setWorkplaceDr(String workplaceDr) {
        this.workplaceDr = workplaceDr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ID != null ? ID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DoctorRound)) {
            return false;
        }
        DoctorRound other = (DoctorRound) object;
        if ((this.ID == null && other.ID != null) || (this.ID != null && !this.ID.equals(other.ID))) {
            return false;
        }
        return true;
    }
}