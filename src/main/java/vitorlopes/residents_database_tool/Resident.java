package vitorlopes.residents_database_tool;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Resident {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long residentId; // Use Long for primary key

    private String firstName;
    private String lastName;
    private String moveInDate;
    private String unitNumber;
    
    public Resident(String firstName2, String lastName2, String unitNumber2, String moveInDate2) {
        //TODO Auto-generated constructor stub
    }
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
    public String getMoveInDate() {
        return moveInDate;
    }
    public void setMoveInDate(String moveInDate) {
        this.moveInDate = moveInDate;
    }
    public String getUnitNumber() {
        return unitNumber;
    }
    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }
}