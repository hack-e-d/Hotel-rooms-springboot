package com.vijay.roomwebapp.roomwebapp.services;

import java.util.ArrayList;
import java.util.List;

import com.vijay.roomwebapp.roomwebapp.data.RoomRepository;
import com.vijay.roomwebapp.roomwebapp.models.Room;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }
    public List<Room> getAllRooms(){
        return roomRepository.findAll();
    }
}
