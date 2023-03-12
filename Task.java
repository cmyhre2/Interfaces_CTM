/*
 * This class creates and manages tasks.
 * 
 * @author Chris Myhre
 * @version 1.0 (CS-131 Module 2 Project)
 * Spring 2023
 */
public class Task implements Priority{ 
	/**
	 * creates an enumerated value status for all task objects.
	 * @enum Status
	 */
	enum  Status {
		NOT_STARTED,
		IN_PROCESS,
		COMPLETE,
	}//end enum Status
	
	public Status status;//Status variable to track the status of a task.
	private final String name;//String variable to name a task.
	private int priority;//int variable to track the priority level of a task.
	
	
	/**
	 * Getter for task name
	 * @return name
	 */
	public String getName() {
		return name;
	}//end getName()
	
	
	/**
	 * Getter for the priority level of a task
	 * @return priority
	 */
	public int getPriority() {
		return priority;
	}//end getPriority()
	
	
	/**
	 * Setter for the priority level of a task
	 * @param priority
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}//end setPriority()
	
	
	/**
	 * Creates a task object with a set name
	 * @param name
	 */
	public Task(String name) {
		this.name=name;
		this.priority = 0;
		this.status = Status.NOT_STARTED;
	}//end Preferred Task() constructor
	
	
	/**
	 * Getter for the status of a task
	 * @return status
	 */
	public Status getStatus() {
		return status;
	}//end getStatus()
	
	
	/**
	 * Setter for the status of a task
	 * @param status
	 */
	public void setStatus(Status status) {
		this.status = status;
	}//end setStatus()
	
	
	/**
	 * Compares the priority level of two tasks
	 * @param task
	 * @return 0, 1, or -1
	 */
	public int compareTo(Task task){
		int t1 = this.getPriority();
		int t2 = task.getPriority();
    	if(Math.abs(t1-t2)<0.0001)
    		return 0;
    	else if (t1-t2>0.0001)
    		return 1;
    	else 
    		return -1;
    }//end compareTo()
	
	
	/*
	 * Converts & combines all task instance fields into one string
	 */
	public String toString() {
		String string = "\nTask: " + getName() + "\nPriority: " + getPriority() + "\nStatus: " + getStatus();
		return string;
	}//end toString()
}//end Task class