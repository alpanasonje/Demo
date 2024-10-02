//Meeting Scheduler Problem
package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ques3 {

	public static void main(String[] args) {
		int[][][] schedules = { { { 60, 150 }, { 180, 240 } }, // Employee 1
				{ { 0, 210 }, { 360, 480 } }, // Employee 2
				{ { 120, 180 } } // Employee 3
		};
		int meetingLength = 120;

		int result = findEarliestMeetingTime(schedules, meetingLength);
		System.out.println("Earliest possible time for the meeting: " + result);
	}

	public static int findEarliestMeetingTime(int[][][] schedules, int meetingLength) {
		List<int[]> allMeetings = new ArrayList<>();

		// Collect all meetings into a single list
		for (int[][] employeeSchedule : schedules) {
			Collections.addAll(allMeetings, employeeSchedule);
		}

		// Sort meetings by start time
		allMeetings.sort(Comparator.comparingInt(meeting -> meeting[0]));

		// Check for possible gaps in the schedule
		int dayStart = 0;
		int dayEnd = 24 * 60;

		// Check the gap before the first meeting
		if (allMeetings.get(0)[0] >= meetingLength) {
			return dayStart;
		}

		// Check gaps between meetings
		for (int i = 0; i < allMeetings.size() - 1; i++) {
			int endCurrentMeeting = allMeetings.get(i)[1];
			int startNextMeeting = allMeetings.get(i + 1)[0];

			if (startNextMeeting - endCurrentMeeting >= meetingLength) {
				return endCurrentMeeting;
			}
		}

		// Check the gap after the last meeting
		int endLastMeeting = allMeetings.get(allMeetings.size() - 1)[1];
		if (dayEnd - endLastMeeting >= meetingLength) {
			return endLastMeeting;
		}

		// If no gap is found, return -1 indicating no available slot
		return -1;
	}
}
