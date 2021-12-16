package com.tioga.training.data.repository;

import java.sql.Date;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tioga.training.data.entity.Reservation;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long>{

	Iterable<Reservation> findReservationByReservationDate(Date date);

}
