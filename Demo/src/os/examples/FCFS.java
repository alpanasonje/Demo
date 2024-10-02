package os.examples;

import java.util.List;

public class FCFS {
	public void schedule(List<Process> processes) {
		int currentTime = 0;

		for (Process p : processes) {
			if (currentTime < p.arrivalTime) {
				currentTime = p.arrivalTime;
			}
			p.completionTime = currentTime + p.burstTime;
			p.turnaroundTime = p.completionTime - p.arrivalTime;
			p.waitingTime = p.turnaroundTime - p.burstTime;
			currentTime = p.completionTime;
		}

		printProcesses(processes);
	}

	private void printProcesses(List<Process> processes) {
		System.out.println("FCFS Scheduling:");
		System.out.println("Process\tArrival\tBurst\tCompletion\tTurnaround\tWaiting");
		for (Process p : processes) {
			System.out.println(p.id + "\t" + p.arrivalTime + "\t" + p.burstTime + "\t" + p.completionTime + "\t\t"
					+ p.turnaroundTime + "\t\t" + p.waitingTime);
		}
	}
}
