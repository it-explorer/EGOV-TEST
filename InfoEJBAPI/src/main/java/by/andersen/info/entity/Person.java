package by.andersen.info.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "person")
@IdClass(value = PersonPK.class)
public class Person implements Serializable {

    @Id
    @Column(name = "first_name")
    private String firstName;

    @Id
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "patronymic")
    private String patronymic;

    @Temporal(value = TemporalType.DATE)
    @Column(name = "birthday_date")
    private Date birthdayDate;

    @Column(name = "location_address")
    private String locationAddress;

    @Column(name = "birth_address")
    private String birthAddress;

    @Column(name = "document_number")
    private String documentNumber;
    @Temporal(value = TemporalType.DATE)
    @Column(name = "issuance_document_date")
    private Date issuanceDocumentDate;
    @Temporal(value = TemporalType.DATE)
    @Column(name = "expiration_document_date")
    private Date expirationDocumentDate;

    @Column(name = "document_issued")
    private String documentIssued;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(Date birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public void setLocationAddress(String locationAddress) {
        this.locationAddress = locationAddress;
    }

    public String getBirthAddress() {
        return birthAddress;
    }

    public void setBirthAddress(String birthAddress) {
        this.birthAddress = birthAddress;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Date getIssuanceDocumentDate() {
        return issuanceDocumentDate;
    }

    public void setIssuanceDocumentDate(Date issuanceDocumentDate) {
        this.issuanceDocumentDate = issuanceDocumentDate;
    }

    public Date getExpirationDocumentDate() {
        return expirationDocumentDate;
    }

    public void setExpirationDocumentDate(Date expirationDocumentDate) {
        this.expirationDocumentDate = expirationDocumentDate;
    }

    public String getDocumentIssued() {
        return documentIssued;
    }

    public void setDocumentIssued(String documentIssued) {
        this.documentIssued = documentIssued;
    }
}
