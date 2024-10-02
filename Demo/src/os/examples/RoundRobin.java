package os.examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RoundRobin {
	private int quantum; // The time quantum

	public RoundRobin(int quantum) {
		this.quantum = quantum;
	}

	public void schedule(List<Process> processes) {
		int currentTime = 0; // Keep track of the current time
		Queue<Process> readyQueue = new LinkedList<>(); // The ready queue
		List<Process> completed = new ArrayList<>(); // Completed processes

		// Sort processes by arrival time initially
		processes.sort(Comparator.comparingInt(p -> p.arrivalTime));

		int index = 0;
		while (completed.size() < processes.size()) {
			// Add processes to the ready queue that have arrived by the current time
			while (index < processes.size() && processes.get(index).arrivalTime <= currentTime) {
				readyQueue.add(processes.get(index));
				index++;
			}

			if (readyQueue.isEmpty()) {
				// If no process is ready, increment currentTime to the next process arrival
				currentTime = processes.get(index).arrivalTime;
				continue;
			}

			// Dequeue the first process from the ready queue
			Process currentProcess = readyQueue.poll();

			// Execute the process for either the time quantum or the remaining time
			int timeToExecute = Math.min(currentProcess.remainingTime, quantum);
			currentTime += timeToExecute;
			currentProcess.remainingTime -= timeToExecute;

			// Check if the process has completed
			if (currentProcess.remainingTime == 0) {
				currentProcess.completionTime = currentTime;
				currentProcess.turnaroundTime = currentProcess.completionTime - currentProcess.arrivalTime;
				currentProcess.waitingTime = currentProcess.turnaroundTime - currentProcess.burstTime;
				completed.add(currentProcess);
			} else {
				// If the process has not finished, put it back in the ready queue
				readyQueue.add(currentProcess);
			}

			// Add any new processes that have arrived during this quantum
			while (index < processes.size() && processes.get(index).arrivalTime <= currentTime) {
				readyQueue.add(processes.get(index));
				index++;
			}
		}

		// Print the results
		printProcesses(completed);
	}

	private void printProcesses(List<Process> processes) {
		System.out.println("Round Robin Scheduling:");
		System.out.println("Process\tArrival\tBurst\tCompletion\tTurnaround\tWaiting");
		for (Process p : processes) {
			System.out.println(p.id + "\t" + p.arrivalTime + "\t" + p.burstTime + "\t" + p.completionTime + "\t\t"
					+ p.turnaroundTime + "\t\t" + p.waitingTime);
		}
	}
}
