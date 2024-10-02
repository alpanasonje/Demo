package os.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PriorityScheduling {
	public void schedule(List<Process> processes) {
		int currentTime = 0;
		List<Process> completed = new ArrayList<>();

		while (!processes.isEmpty()) {
			List<Process> available = new ArrayList<>();
			for (Process p : processes) {
				if (p.arrivalTime <= currentTime) {
					available.add(p);
				}
			}
			if (available.isEmpty()) {
				currentTime++;
				continue;
			}

			Process highestPriorityJob = Collections.min(available, Comparator.comparingInt(p -> p.priority));
			currentTime += highestPriorityJob.burstTime;
			highestPriorityJob.completionTime = currentTime;
			highestPriorityJob.turnaroundTime = highestPriorityJob.completionTime - highestPriorityJob.arrivalTime;
			highestPriorityJob.waitingTime = highestPriorityJob.turnaroundTime - highestPriorityJob.burstTime;

			completed.add(highestPriorityJob);
			processes.remove(highestPriorityJob);
		}

		printProcesses(completed);
	}

	private void printProcesses(List<Process> processes) {
		System.out.println("Priority Scheduling:");
		System.out.println("Process\tArrival\tBurst\tPriority\tCompletion\tTurnaround\tWaiting");
		for (Process p : processes) {
			System.out.println(p.id + "\t" + p.arrivalTime + "\t" + p.burstTime + "\t" + p.priority + "\t"
					+ p.completionTime + "\t\t" + p.turnaroundTime + "\t\t" + p.waitingTime);
		}
	}

}
