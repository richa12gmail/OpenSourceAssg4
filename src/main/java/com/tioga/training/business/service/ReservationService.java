package com.tioga.training.business.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tioga.training.business.domain.RoomReservation;
import com.tioga.training.data.entity.Guest;
import com.tioga.training.data.entity.Reservation;
import com.tioga.training.data.entity.Room;
import com.tioga.training.data.repository.GuestRepository;
import com.tioga.training.data.repository.ReservationRepository;
import com.tioga.training.data.repository.RoomRepository;

@Service
public class ReservationService {

	private final RoomRepository roomRepository;


    @Autowired
    public ReservationService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;

    }


}
