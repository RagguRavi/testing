package spring.core;

public class WeekendStudent extends Student{

	String companyName;

	public WeekendStudent(String companyName) {
		
		this.companyName = companyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "WeekendStudent [companyName=" + companyName + "]";
	}
	
	
}
