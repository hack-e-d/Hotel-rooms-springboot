package com.vijay.roomwebapp.roomwebapp.data;

import com.vijay.roomwebapp.roomwebapp.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
