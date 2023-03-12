/*
 * This interfaces creates 3 priority levels and requires a setter & getter for priority 
 * on any classes that implement this interface.
 * 
 * @author Chris Myhre
 * @version 1.0 (CS-131 Module 2 Project)
 * Spring 2023
 */
public interface Priority {
	 static final int MED_PRIORITY = 5;
	 static final int MAX_PRIORITY = 10;
	 static final int MIN_PRIORITY = 1;
	 public void setPriority(int priority);
	 public int getPriority();
}//end Priority interface
