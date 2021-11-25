package com.shad.TrainTicket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shad.TrainTicket.model.Train;

@Repository
public interface TrainRepository extends JpaRepository<Train, Integer> {

}
