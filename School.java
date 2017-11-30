public class School{
	private String schoolName = "Suncoast High";
	private String schoolAddress="1717 Avenue S, Riviera Beach, FL 33404";
	private String principal=" karen whetsell";
	private int numberOfFreshmen=375;
	private int numberOfSophomores=375;
	private int numberOfJuniors=375;
	private int numberOfSeniors=375;
	
	public School(String schoolName, String schoolAddress, String principal,int numberOfFreshmen,int numberOfSophomores,int numberOfJuniors,int numberOfSeniors){
		this.schoolName= schoolName;
		this.schoolAddress=schoolAddress;
		this.principal=principal;
		this.numberOfFreshmen=numberOfFreshmen;
		this.numberOfSophomores=numberOfSophomores;
		this.numberOfJuniors=numberOfJuniors;
		this.numberOfSeniors=numberOfSeniors;
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
		
	//copy old school class
	public School(Schoool oldSchool) {
    	schoolName = oldSchool.schoolName;
        schoolAddress = oldSchool.schoolAddress;
		principal = oldSchool.principal;
		numberOfFreshmen = oldSchool.numberOfFreshmen;
		numberOfSophomores = oldSchool.numberOfSophomores;
		numberOfJuniors = oldSchool.numberOfJuniors;
		numberOfSeniors = oldSchool.numberOfSeniors;
 	}

 	public toString(){

 	}
	
	public int getTotalStudents(){

	}
	
}



