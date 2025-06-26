package com.oops_concepts;

public class MotorBike {

	int speed;

	MotorBike(int speed) {
		this.speed = speed;

	}

	void start() {
		System.out.println("Bike has started");
	}

	public int getSpeed() {
		return speed;

	}

	public void setSpeed(int speed) {
		if (speed > 0)
			this.speed = speed;
	}

	public void increaseSpeed(int speed) {
		setSpeed(this.speed + speed);
	}

	public void decreaseSpeed(int speed) {
		setSpeed(this.speed - speed);
	}

}
