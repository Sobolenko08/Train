package com.edu.sabalenka.train.entity;

public class Train implements Comparable<Train> {
	private String destination;
	private int trainNumber;
	private String departureTime;

	public Train(String destination, int trainNumber, String departureTime) {
		this.destination = destination;
		this.trainNumber = trainNumber;
		this.departureTime = departureTime;
	}

	public String getDestination() {
		return destination;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	@Override
	public int compareTo(Train other) {
		return Integer.compare(this.trainNumber, other.trainNumber);
	}

	@Override
	public String toString() {
		return "Train [Destination: " + destination + ", Train Number: " + trainNumber + ", Departure Time: "
				+ departureTime + "]";
	}
}
