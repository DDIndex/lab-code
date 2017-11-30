public class School{
	private String schoolName;
	private String schoolAddress;
	private String principal;
	private int numberOfFreshmen;
	private int numberOfSophomores;
	private int numberOfJuniors;
	private int numberOfSeniors;
    
    public School()
    {
        schoolName = "Suncoast High";
        schoolAddress = "1717 Avenue S, Riviera Beach, FL 33404";
        principal = " karen whetsell";
        numberOfFreshmen = 375;
        numberOfSophomores = 375;
        numberOfJuniors = 375;
        numberOfSeniors = 375;
    }
	
	public School(String schoolName, String schoolAddress, String principal,int numberOfFreshmen,int numberOfSophomores,int numberOfJuniors,int numberOfSeniors){
		this.schoolName= schoolName;
		this.schoolAddress=schoolAddress;
		this.principal=principal;
		this.numberOfFreshmen=numberOfFreshmen;
		this.numberOfSophomores=numberOfSophomores;
		this.numberOfJuniors=numberOfJuniors;
		this.numberOfSeniors=numberOfSeniors;
	}
    
    //copy old school class
	public School(School oldSchool) {
    	this.schoolName = oldSchool.schoolName;
        this.schoolAddress = oldSchool.schoolAddress;
		this.principal = oldSchool.principal;
		this.numberOfFreshmen = oldSchool.numberOfFreshmen;
		this.numberOfSophomores = oldSchool.numberOfSophomores;
		this.numberOfJuniors = oldSchool.numberOfJuniors;
		this.numberOfSeniors = oldSchool.numberOfSeniors;
 	}
	
	public String getName(){
		return schoolName;
	}
	
	public String getAddress(){
		return schoolAddress;
	}
	
	public String getPrincipal(){
		return principal;
	}
	public double getNumberOfFreshmen(){
		return numberOfFreshmen;
	}
	public double getNumberOfSophomores(){
		return numberOfSophomores;
	}
	public double getNumberOfJuniors(){
		return numberOfJuniors;
	}
	public double getNumberOfSeniors(){
		return numberOfSeniors;
	}
	
	public void setName(String schoolName){
		this.schoolName= schoolName;
	}
	
	public void setAddress(String schoolAddress){
		this.schoolAddress= schoolAddress;
	}
	
	public void setPrincipal(String principal){
		this.principal= principal;
	}
	
	public void setNumberOfFreshmen(int numberOfFreshmen){
		this.numberOfFreshmen= numberOfFreshmen;
	}
	public void setNumberOfSophomores(int numberOfSophomores){
		this.numberOfSophomores= numberOfSophomores;
	}
	public void setNumberOfJuniors(int numberOfJuniors){
		this.numberOfJuniors = numberOfJuniors;
	}
	public void setNumberOfSeniors(int numberOfSeniors){
		this.numberOfSeniors = numberOfSeniors;
	}

    public String toString(){
		String str = "School name = "+ schoolName +" ,School Address = "+schoolAddress+" ,School Principal = "+principal+" ,Freshmen = "+numberOfFreshmen+" ,Sophmores = "+numberOfSophomores+" ,Juniors = "+numberOfJuniors+" ,Seniors = "+numberOfSeniors;
		return str;
 	}
    	
	public int getTotalStudents(){
		int total = numberOfFreshmen + numberOfSophomores + numberOfJuniors + numberOfSeniors;
		return total;
	}
	
	public static void main(String[] args) {
		System.out.println("Suncoast High Info.");
		School s1= new School();
		System.out.println(s1.toString());
		
		School s2 = new School("Not a High School","3210 abc street","Dr.Nobdy",321,123,456,654);
		System.out.println(s2.toString());
	}

}
