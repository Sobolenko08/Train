package com.edu.sabalenka.train.service;

import com.edu.sabalenka.train.entity.Train;
import java.util.Arrays;

public class TrainService {
	private Train[] trains;

	public TrainService(Train[] trains) {
		this.trains = trains;
	}

	public void sortByTrainNumber() {
		Arrays.sort(trains);
	}

	public void sortByDestinationAndTime() {
		Arrays.sort(trains, (t1, t2) -> {
			int destCompare = t1.getDestination().compareTo(t2.getDestination());
			if (destCompare == 0) {
				return t1.getDepartureTime().compareTo(t2.getDepartureTime());
			}
			return destCompare;
		});
	}

	public Train findTrainByNumber(int trainNumber) {
		for (Train train : trains) {
			if (train.getTrainNumber() == trainNumber) {
				return train;
			}
		}
		return null;
	}

	public Train[] getTrains() {
		return trains;
	}
}
