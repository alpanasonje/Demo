package os.examples;

public class Process {

	int id;
	int burstTime;
	int arrivalTime;
	int priority;
	int remainingTime; // For Round Robin
	int completionTime;
	int waitingTime;
	int turnaroundTime;

	public Process(int id, int burstTime, int arrivalTime, int priority) {
		this.id = id;
		this.burstTime = burstTime;
		this.arrivalTime = arrivalTime;
		this.priority = priority;
		this.remainingTime = burstTime; // Initially, remaining time is burst time
	}
}
