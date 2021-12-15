package com.tioga.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tioga.training.data.entity.Guest;
import com.tioga.training.data.entity.Reservation;
import com.tioga.training.data.entity.Room;
import com.tioga.training.data.repository.GuestRepository;
import com.tioga.training.data.repository.ReservationRepository;
import com.tioga.training.data.repository.RoomRepository;

@SpringBootApplication
public class SpringBootTiogaTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTiogaTrainingApplication.class, args);
	}
	
}
