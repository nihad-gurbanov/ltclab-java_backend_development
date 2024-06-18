package com.ltc.person.controller;

import com.ltc.person.dto.PersonDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {
    private final List<PersonDTO> persons = new ArrayList<>();

    @GetMapping("/persons")
    public List<PersonDTO> persons() {
        return persons;
    }

    @GetMapping("/persons/{id}")
    public PersonDTO persons(@PathVariable Integer id) {
        return persons.get(id);
    }

    @PostMapping("/persons")
    public String createPerson(@RequestBody PersonDTO person) {
        persons.add(person);
        return "Person created successfully";
    }

    @DeleteMapping("/persons/{id}")
    public String deletePerson(@PathVariable Long id) {

        for (PersonDTO personDTO : persons) {
            if (personDTO.getId().equals(id)) {
                persons.remove(personDTO);
                return "Person deleted successfully";
            }
        }
        return "Person not found";
    }

    @PutMapping("/persons/{id}")
    public String updatePerson(@PathVariable Long id, @RequestBody PersonDTO person) {

        for (PersonDTO personDTO : persons) {
            if (personDTO.getId().equals(id)) {
                personDTO.setId(person.getId());
                personDTO.setFirstName(person.getFirstName());
                personDTO.setLastName(person.getLastName());
                personDTO.setAge(person.getAge());
                return "Person updated successfully";
            }
        }
        return "Person not found";
    }
}
