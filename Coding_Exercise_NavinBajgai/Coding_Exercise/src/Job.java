/**
 * 
 */

/**
 * @author Navin
 *
 */
public class Job 
{
	private String jobName;
	private boolean hasDependency;
	private String dependency;
	
	public Job(String jobName, boolean hasDependency, String dependency)
	{
		this.setJobName(jobName);
		this.setHasDependency(hasDependency);
		this.dependency = dependency;
	}

	/**
	 * @return the jobName
	 */
	public String getJobName() {
		return jobName;
	}

	/**
	 * @param jobName the jobName to set
	 */
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	/**
	 * @return the hasDependency
	 */
	public boolean isHasDependency() {
		return hasDependency;
	}

	/**
	 * @param hasDependency the hasDependency to set
	 */
	public void setHasDependency(boolean hasDependency) {
		this.hasDependency = hasDependency;
	}

	/**
	 * @return the dependency
	 */
	public String getDependency() {
		return dependency;
	}

	/**
	 * @param dependency the dependency to set
	 */
	public void setDependency(String dependency) {
		this.dependency = dependency;
	}
}