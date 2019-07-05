/**
 * @author Navin
 *
 */
public class Exercises 
{
	private boolean hasDependency;
	
	//method for returning string
	public String getString(String myString)
	{	
		if(myString.isEmpty()) 
		{
			return "empty sequence";
		}
		return myString;
	}
	
	
	public void printJob(Job job)
	{		
		if(job.getJobName().isEmpty())
		{
			System.out.println("no job to print...");
		}
		else
		{			
			if(job.isHasDependency() == true)
			{
				
				if(job.getDependency().equalsIgnoreCase(job.getJobName()))
				{
					System.out.println("***Error: Jobs can't depend on themselves....Job " + job.getJobName() + 
							" cannot depend on Job " + job.getDependency());
				}
				else
				{
					System.out.print(job.getDependency());
					System.out.print(job.getJobName());
				}		
			}
			else
			{
				System.out.print(job.getJobName());
			}
		}
	}
}