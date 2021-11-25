package com.shad.TrainTicket.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shad.TrainTicket.model.Train;
import com.shad.TrainTicket.repository.TrainRepository;

@Service
public class TrainService {

	private final TrainRepository trainRepository;

	@Autowired
	public TrainService(TrainRepository trainRepository) {

		this.trainRepository = trainRepository;

		Train train1 = new Train(2419, "Gomti Express", "Lucknow", "Aligarh", 120.0);

		Train train2 = new Train(2234, "Rajdhani Express", "Delhi", "Hyderabad", 765.0);

		Train train3 = new Train(1002, "Pushpak Express", "Lucknow", "Mumbai", 850.0);

		Train train4 = new Train(5987, "Bullet Express", "Mumbai", "Ahmadabad", 1200.0);

		List<Train> trains = new ArrayList<Train>();
		trains.add(train1);
		trains.add(train2);
		trains.add(train3);
		trains.add(train4);

		trainRepository.saveAll(trains);
	}

	public Optional<Train> getTrainByNumber(int trainNumber) {
		return trainRepository.findById(trainNumber);
	}

	public List<Train> getAllTrains() {
		return trainRepository.findAll();
	}

	

}
