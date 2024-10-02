package os.examples;

import java.util.ArrayList;
import java.util.List;

public class CPUScheduling {
	public static List<Process> getProcesses()
	{
		List<Process> processes = new ArrayList<>();
		processes.add(new Process(1, 10, 0, 3)); // id, burstTime, arrivalTime, priority
		processes.add(new Process(2, 1, 0, 1));
		processes.add(new Process(3, 2, 0, 3));
		processes.add(new Process(4, 1, 0, 4));
		processes.add(new Process(5, 5, 0, 2));
		return processes;
	}
	public static void main(String[] args) {
		
		// First-Come, First-Served (FCFS)
		List<Process> fcfsProcesses = new ArrayList<>(getProcesses());
		FCFS fcfs = new FCFS();
		fcfs.schedule(fcfsProcesses);

		// Priority Scheduling (Non-preemptive)
	
		List<Process> priorityProcesses = new ArrayList<>(getProcesses());
		PriorityScheduling priorityScheduling = new PriorityScheduling();
		priorityScheduling.schedule(priorityProcesses);

		// Shortest Job First (SJF)
		List<Process> sjfProcesses = new ArrayList<>(getProcesses());
		SJFPreemptive sjf = new SJFPreemptive();
		sjf.schedule(sjfProcesses);
		
		// Round Robin (Preemptive)
		List<Process> rrProcesses = new ArrayList<>(getProcesses());
		RoundRobin roundRobin = new RoundRobin(2); // Quantum is 4
		roundRobin.schedule(rrProcesses);

	}
}
