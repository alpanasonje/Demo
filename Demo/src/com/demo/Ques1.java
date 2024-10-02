//Bus Departure Problem
package com.demo;

public class Ques1 {

	public static void main(String[] args) {
        String[] schedule = {"08:00", "09:30", "10:45", "12:00", "14:30"};
        String currentTime = "06:00";

        int minutesAgo = minutesAgoLastBusLeft(schedule, currentTime);
        if (minutesAgo == -1) {
            System.out.println("No bus has left yet");
        } else {
            System.out.println("The last bus left " + minutesAgo + " minutes ago.");
        }
    }

    public static int minutesAgoLastBusLeft(String[] schedule, String currentTime) {
        int currentMinutes = convertToMinutes(currentTime);
        int lastBusMinutes = -1;

        for (String time : schedule) {
            int busMinutes = convertToMinutes(time);
            if (busMinutes <= currentMinutes && busMinutes > lastBusMinutes) {
                lastBusMinutes = busMinutes;
            }
        }

        if (lastBusMinutes == -1) {
            return -1;  // No bus has left yet
        }

        return currentMinutes - lastBusMinutes;
    }

    public static int convertToMinutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }



	

}
