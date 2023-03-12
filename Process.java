/*
 * This class creates and manages processes.
 * 
 * @author Chris Myhre
 * @version 1.0 (CS-131 Module 2 Project)
 * Spring 2023
 */
public class Process implements Priority{
	private final String processID;//String variable for the process identification name.
	private int priority;//int variable to set the priority of a process
	
	
	/**
	 * Getter for the processID
	 * @return processID
	 */
	public String getProcessID() {
		return processID;
	}//end getProcessID()

	
	/**
	 *Creates a Process object
	 * @param processID
	 */
	public Process(String processID) {
		this.processID = processID;
		this.priority = MIN_PRIORITY;
	}//end Preferred Process() Constructor
	
	
	/**
	 * Getter for the priority level of a process
	 * @return priority
	 */
	public int getPriority() {
		return priority;
	}//end getPriority()
	
	
	/**
	 * Setter for the priority level of a process
	 * @param priority
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}//end setPriority()
	
	
	/**
	 * Converts & combines all fields of a process into one string
	 * @return string
	 */
	public String toString(){
		String string = "\nProcess ID: " + getProcessID() + "\nPriority: " + getPriority();
		return string;
		//System.out.println("Process ID: " + getProcessID());
		//System.out.println("Priority: " + getPriority());
	}//end toString()
	
	
	/**
	 * Compares the priority level of two processes
	 * @return 0, 1, or -1
	 */
	public int compareTo(Process p){
		int p1 = this.getPriority();
		int p2 = p.getPriority();
    	if(Math.abs(p1-p2)<0.0001)
    		return 0;
    	else if (p1-p2>0.0001)
    		return 1;
    	else 
    		return -1;
    }//end compareTo()
}//end Process class