/**
 * @author Navin
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{		
		Exercises myExercises = new Exercises();
		//System.out.println(myExercises.getString(""));
		
		Job job = new Job("", false, "");
		Job jobA = new Job("a", false, "");
		Job jobB = new Job("b", false, "");
		Job jobC = new Job("c", true, "c");
		Job jobD = new Job("d", true, "a");
		Job jobE = new Job("e", true, "b");
		Job jobF = new Job("f", false, "");

		
		
		//Exercise 1
//		myExercises.printJob(job);
		
		
		//Exercise 2
//		myExercises.printJob(jobA);
		
		
		//Exercise 3
//		myExercises.printJob(jobA);
//		myExercises.printJob(jobB);
//		myExercises.printJob(jobC);

		
		//Exercise 4
//		myExercises.printJob(jobA);
//		myExercises.printJob(jobB);
		
		
		//Exercise 5
//		myExercises.printJob(jobB);
//		myExercises.printJob(jobC);
//		myExercises.printJob(jobD);
//		myExercises.printJob(jobE);
		
		
		//Exercise 6
		myExercises.printJob(jobA);
		myExercises.printJob(jobB);
		myExercises.printJob(jobC);
	
	}
}