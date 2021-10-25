package com.vijay.roomwebapp.roomwebapp.data;

import com.vijay.roomwebapp.roomwebapp.models.StaffMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<StaffMember , Long> {

}
