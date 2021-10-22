package com.vijay.roomwebapp.roomwebapp.controllers;

import com.vijay.roomwebapp.roomwebapp.models.StaffMember;
import com.vijay.roomwebapp.roomwebapp.services.StaffService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffRestController {
    private final StaffService staffService;

    public StaffRestController (StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public List<StaffMember> getAllStaffMembers() {
        return staffService.getAllStaff();
    }
}
