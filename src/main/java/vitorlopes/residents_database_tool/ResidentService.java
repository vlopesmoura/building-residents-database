package vitorlopes.residents_database_tool;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ResidentService {

    private List<Resident> residents;

    public ResidentService() {
        this.residents = new ArrayList<>();
    }

    public List<Resident> getFilteredResidents(String firstName, String lastName, String unitNumber, String moveInDate) {
        return residents.stream()
                .filter(resident -> (firstName == null || resident.getFirstName().equalsIgnoreCase(firstName)) &&
                                    (lastName == null || resident.getLastName().equalsIgnoreCase(lastName)) &&
                                    (unitNumber == null || resident.getUnitNumber().equalsIgnoreCase(unitNumber)) &&
                                    (moveInDate == null || resident.getMoveInDate().equalsIgnoreCase(moveInDate)))
                .collect(Collectors.toList());
    }

    public void addResident(String firstName, String lastName, String unitNumber, String moveInDate) {
        Resident newResident = new Resident(firstName, lastName, unitNumber, moveInDate);
        residents.add(newResident);
    }
}