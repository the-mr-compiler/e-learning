package com.msoft.elearning.controllers;


import com.msoft.elearning.models.Staff;
import com.msoft.elearning.repositories.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StaffController {

    @Autowired
    StaffRepository repository;

    @GetMapping("/staff")
    public List<Staff> getStaffs(){return (List<Staff>) repository.findAll();}

    @PostMapping("/staff")
    public Staff addStaff(@RequestBody Staff staff){return repository.save(staff);}

    @DeleteMapping("/staff/{id}")
    public void removeStaff(@PathVariable("id") long id){repository.deleteById(id);}

    @PutMapping("/staff/{id}")
    public Staff updateStaff(@PathVariable("id") long id,@RequestBody Staff staff){
        staff.setId(id);
        return repository.save(staff);
    }
}
