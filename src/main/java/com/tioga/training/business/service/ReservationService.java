package com.tioga.training.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tioga.training.data.repository.ReservationRepository;
import com.tioga.training.data.repository.RoomRepository;

@Service
public class ReservationService {

	private final RoomRepository roomRepository;
	private final ReservationRepository reservationRepository;


    @Autowired
    public ReservationService(RoomRepository roomRepository,ReservationRepository reservationRepository) {
        this.roomRepository = roomRepository;
		this.reservationRepository = reservationRepository;
    }


}
