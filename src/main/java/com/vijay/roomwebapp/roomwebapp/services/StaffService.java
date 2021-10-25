package com.vijay.roomwebapp.roomwebapp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.vijay.roomwebapp.roomwebapp.data.StaffRepository;
import com.vijay.roomwebapp.roomwebapp.models.Position;
import com.vijay.roomwebapp.roomwebapp.models.StaffMember;
import org.springframework.stereotype.Service;

@Service
public class StaffService {

    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }
    public List<StaffMember> getAllStaff(){
        return staffRepository.findAll();
    }
}
