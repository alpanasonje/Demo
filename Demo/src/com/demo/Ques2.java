package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Meeting {
	int start;
	int end;

	Meeting(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public String toString() {
		return "Meeting [start=" + start + ", end=" + end + "]";
	}
	
}

public class Ques2 {

	public static int findEarliestMeetingTime(List<Meeting> schedules, int meetingLength) {
		// Sort the meetings by start time
		Collections.sort(schedules, Comparator.comparingInt(a -> a.start));
		System.out.println(schedules);
		
		// Merge overlapping meetings
		List<Meeting> mergedMeetings = new ArrayList<>();
		int start = schedules.get(0).start;
		int end = schedules.get(0).end;

		for (Meeting meeting : schedules) {
			if (meeting.start <= end) {
				end = Math.max(end, meeting.end);
			} else {
				mergedMeetings.add(new Meeting(start, end));
				start = meeting.start;
				end = meeting.end;
			}
		}
		mergedMeetings.add(new Meeting(start, end));

		// Check for available time slots
		int dayStart = 0;
		int dayEnd = 1440;

		// Check time before the first meeting
		if (mergedMeetings.get(0).start - dayStart >= meetingLength) {
			return dayStart;
		}

		// Check time between meetings
		for (int i = 0; i < mergedMeetings.size() - 1; i++) {
			int gapStart = mergedMeetings.get(i).end;
			int gapEnd = mergedMeetings.get(i + 1).start;
			if (gapEnd - gapStart >= meetingLength) {
				return gapStart;
			}
		}

		// Check time after the last meeting
		if (dayEnd - mergedMeetings.get(mergedMeetings.size() - 1).end >= meetingLength) {
			return mergedMeetings.get(mergedMeetings.size() - 1).end;
		}

		// If no time slot is found
		return -1;
	}

	public static void main(String[] args) {
		int meetingLength ;
		List<Meeting> schedules = new ArrayList<Meeting>();
		/*
		 * schedules.add(new Meeting(60,150)); schedules.add(new Meeting(180, 240));
		 * schedules.add(new Meeting(0, 210)); schedules.add(new Meeting(360,420));
		 * 
		 * meetingLength = 120;
		 */
		
		/*
		 * schedules.add(new Meeting(0,1439)); schedules.add(new Meeting(0,1439));
		 * schedules.add(new Meeting(0,390)); schedules.add(new Meeting(480,510));
		 * meetingLength = 90; // Meeting length in minutes
		 */
		
		schedules.add(new Meeting(480,510));
		schedules.add(new Meeting(240,330));
		schedules.add(new Meeting(375,400));
		
		meetingLength = 180; // Meeting length in minutes
		int earliestMeetingTime = findEarliestMeetingTime(schedules, meetingLength);
		System.out.println("Earliest possible time for the meeting: " + earliestMeetingTime);
	}
}
