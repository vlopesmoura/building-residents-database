package vitorlopes.residents_database_tool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ResidentController {

    @Autowired
    private ResidentService residentService;

    @GetMapping("/residents")
    public List<Resident> getResidents(
        @RequestParam(required = false) String firstName,
        @RequestParam(required = false) String lastName,
        @RequestParam(required = false) String unitNumber,
        @RequestParam(required = false) String moveInDate) {

        // Implement your logic to filter residents based on the query parameters
        // For example, you can call a service method that handles the filtering
        return residentService.getFilteredResidents(firstName, lastName, unitNumber, moveInDate);
        }

        @GetMapping("/add-resident")
        public String showAddResidentPage() {
            return "add-resident";
        }
    
        @PostMapping("/add-resident")
        public ModelAndView addResident(
            @RequestParam String firstName,
            @RequestParam String lastName,
            @RequestParam String unitNumber,
            @RequestParam String moveInDate) {
    
            residentService.addResident(firstName, lastName, unitNumber, moveInDate);
            return new ModelAndView("redirect:/residents");
        }
}

// @PostMapping
// public Resident addResident(@RequestBody Resident resident) {
//     return residentService.addResident(resident);
// }