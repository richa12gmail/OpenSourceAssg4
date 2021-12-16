package com.tioga.training.business.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.tioga.training.business.domain.RoomReservation;
import com.tioga.training.data.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tioga.training.data.repository.ReservationRepository;
import com.tioga.training.data.repository.RoomRepository;

@Service
public class ReservationService {

private final RoomRepository roomRepository;

private final ReservationRepository reservationRepository;

private final GuestRepository guestRepository;

  @Autowired
  public ReservationService(RoomRepository roomRepository,GuestRepository guestRepository,ReservationRepository reservationRepository ) {
      this.roomRepository = roomRepository;
      this.guestRepository = guestRepository;
    this.reservationRepository = reservationRepository;

  }
    public List<RoomReservation> getRoomReservationsForDate(Date date){
        List<RoomReservation> roomReservations = new ArrayList<>();
        return roomReservations;
    }

}
