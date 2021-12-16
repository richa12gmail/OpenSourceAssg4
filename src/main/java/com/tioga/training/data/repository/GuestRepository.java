package com.tioga.training.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tioga.training.data.entity.Guest;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long>{

}
