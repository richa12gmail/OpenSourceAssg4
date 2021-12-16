package com.tioga.training.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tioga.training.data.repository.RoomRepository;

@Service
public class ReservationService {

	private final RoomRepository roomRepository;


    @Autowired
    public ReservationService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;

    }


}
