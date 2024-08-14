package com.edu.sabalenka.train.main;

import com.edu.sabalenka.train.entity.Train;
import com.edu.sabalenka.train.service.TrainService;
import java.util.Scanner;

public class TrainApp {
	public static void main(String[] args) {
		Train[] trains = { new Train("Moscow", 101, "14:30"), new Train("Saint Petersburg", 203, "09:15"),
				new Train("Kazan", 102, "17:00"), new Train("Moscow", 104, "13:45"), new Train("Kazan", 205, "12:00") };

		TrainService trainService = new TrainService(trains);

		// Сортировка по номерам поездов
		trainService.sortByTrainNumber();
		System.out.println("Trains sorted by train numbers:");
		for (Train train : trainService.getTrains()) {
			System.out.println(train);
		}

		// Запрос номера поезда и вывод информации
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the train number to get details:");
		int trainNumber = scanner.nextInt();
		Train foundTrain = trainService.findTrainByNumber(trainNumber);
		if (foundTrain != null) {
			System.out.println(foundTrain);
		} else {
			System.out.println("Train with number " + trainNumber + " not found.");
		}

		// Сортировка по пункту назначения и времени отправления
		trainService.sortByDestinationAndTime();
		System.out.println("Trains sorted by destination and departure time:");
		for (Train train : trainService.getTrains()) {
			System.out.println(train);
		}

		scanner.close();
	}
}
