package ie.gmit.RMIInterface;

public class jobAssignment
{
	private static final long serialVersionUID = 1L;
	private String algo;
	private String FirstString;
	private String SecondString;
	private String jobNumber;
	
	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

	
	public jobAssignment()
	{
		super();
	}
	
	public void myJob(String FirstString, String SecondString, String algo, String jobNumber) {
		this.FirstString = FirstString;
		this.SecondString = SecondString;
		this.algo = algo;
		this.jobNumber = jobNumber;

	}
	
	

	public String getAlgo()
	{
		return algo;
	}

	public void setAlgo(String algo)
	{
		this.algo = algo;
	}

	public String getFirstString()
	{
		return FirstString;
	}

	public void setFirstString(String FirstString)
	{
		FirstString = FirstString;
	}

	public String getSecondString()
	{
		return SecondString;
	}

	public void SecondString(String SecondString)
	{
		SecondString = SecondString;
	}

	public String getJobNumber()
	{
		return jobNumber;
	}

	public void setJobNumber(String jobNumber)
	{
		this.jobNumber = jobNumber;
	}

}
