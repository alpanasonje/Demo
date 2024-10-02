package os.examples;

import java.util.List;

public class SJFPreemptive {
	public void schedule(List<Process> processes) {
		int currentTime = 0;
		int completedProcesses = 0;
		int totalProcesses = processes.size();

		while (completedProcesses < totalProcesses) {
			Process shortestJob = null;

			// Find the process with the shortest remaining time that has arrived
			for (Process p : processes) {
				if (p.arrivalTime <= currentTime && p.remainingTime > 0) {
					if (shortestJob == null || p.remainingTime < shortestJob.remainingTime) {
						shortestJob = p;
					}
				}
			}

			if (shortestJob == null) {
				// If no process is ready to execute, increment time
				currentTime++;
			} else {
				// Execute the shortest job for 1 unit of time
				shortestJob.remainingTime--;
				currentTime++;

				if (shortestJob.remainingTime == 0) {
					// Process has completed
					shortestJob.completionTime = currentTime;
					shortestJob.turnaroundTime = shortestJob.completionTime - shortestJob.arrivalTime;
					shortestJob.waitingTime = shortestJob.turnaroundTime - shortestJob.burstTime;
					completedProcesses++;
				}
			}
		}

		printProcesses(processes);
	}

	private void printProcesses(List<Process> processes) {
		System.out.println("SJF Preemptive (SRTF) Scheduling:");
		System.out.println("Process\tArrival\tBurst\tCompletion\tTurnaround\tWaiting");
		for (Process p : processes) {
			System.out.println(p.id + "\t" + p.arrivalTime + "\t" + p.burstTime + "\t" + p.completionTime + "\t\t"
					+ p.turnaroundTime + "\t\t" + p.waitingTime);
		}
	}
}
