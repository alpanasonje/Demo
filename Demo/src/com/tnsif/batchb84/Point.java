package com.tnsif.batchb84;

public class Point {
	float x, y;

	public Point() {
		this.x = 0.0f;
		this.y = 0.0f;
	}
	public Point(float value) {
		this.x = value;
		this.y = value;
	}
	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
