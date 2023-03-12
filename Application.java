/*
 * This class test everything from the other classes of this Project.
 * Puts the implemented Priority interface in both Task & Process classes
 * along with their respective methods to the test. Also tests the compareTo()
 * method addition in the RationalNumber class.
 * 
 * @author Chris Myhre
 * @version 1.0 (CS-131 Module 2 Project)
 * Spring 2023
 */
public class Application {

	public static void main(String[] args) {
		/*
		 * These 3 RationalNumber objects are fractions being compared to each other
		 * with the newly implemented compareTo() method.
		 */
			RationalNumber r1 = new RationalNumber(6,8);
			RationalNumber r2 = new RationalNumber(1,3);
			RationalNumber r3 = new RationalNumber(3,4);
			System.out.println(r1.compareTo(r2));
			System.out.println(r2.compareTo(r1));
			System.out.println(r1.compareTo(r3));
			
			
			/*
			 * The first task object tests all setters & getters along with the toString() method.
			 * the second & third tasks are created to test the compareTo() method.
			 */
			Task task = new Task("Cleaning");
			System.out.println(task.getName());
			task.setPriority(Task.MAX_PRIORITY);
			System.out.println(task.getPriority());
			task.setStatus(Task.Status.IN_PROCESS);
			System.out.println(task.getStatus());
			System.out.println(task.toString());
			Task task2 = new Task("Dishes");
			task2.setPriority(Task.MIN_PRIORITY);
			Task task3 = new Task ("Dusting");
			task3.setPriority(Task.MIN_PRIORITY);
			task.toString();
			System.out.println(task.compareTo(task2));
			System.out.println(task2.compareTo(task));
			System.out.println(task2.compareTo(task3));
			
			
			/*
			 * The first process object tests all setters & getters along with the toString() method.
			 * the second & third processes are created to test the compareTo() method.
			 */
			Process process = new Process("Washing");
			System.out.println(process.getProcessID());
			process.setPriority(Process.MED_PRIORITY);
			System.out.println(process.getPriority());
			System.out.println(process.toString());
			Process process2 = new Process("Dusting");
			process2.setPriority(Process.MIN_PRIORITY);
			Process process3 = new Process("Cooking");
			process3.setPriority(Process.MED_PRIORITY);
			System.out.println(process.compareTo(process2));
			System.out.println(process2.compareTo(process));
			System.out.println(process.compareTo(process3));
	}//end main() method
}//end Application class
