package veni.com.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public  class Employee {
	private String name;
	
	private float vacationTaken;
	private float vacationRemaining;
	private float timeBankBalance;
	public int daysReported;
	public float vacationAccumulated;
	public int daysWorked;
	public static final int YEARLY_WORK_DAYS = 260;
	private final int alowedVacationDays = 0;
	private float requestedPTO;
	public Employee() {
		
	}
	public Employee(String name) {
		super();
		this.name = name;
	}

	public  void Work (int noOfDays)  throws Exception {
		
	}
	
	public  void takeVacation(float requestedTime) throws Exception { 
		if(getTimeBankBalance() == 0 || requestedTime > getTimeBankBalance()) {
			throw new Exception("Requested employee has insufficient time bank balance.");
		}else {
			setTimeBankBalance((float)(getTimeBankBalance() - requestedTime));
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getVacationTaken() {
		return vacationTaken;
	}


	public int getDaysWorked() {
		return daysWorked;
	}

	public int getVacationAllowed() {
		return alowedVacationDays;
	}

	public float getVacationAccumulated() {
		return vacationAccumulated;
	}

	public void setVacationAccumulated(float vacationAccumulated) {
		this.vacationAccumulated = vacationAccumulated;
	}

	public float getTimeBankBalance() {
		return timeBankBalance;
	}

	public void setTimeBankBalance(float timeBankBalance) {
		this.timeBankBalance = timeBankBalance;
	}

	public int getAlowedVacationDays() {
		return alowedVacationDays;
	}

	public void setVacationTaken(float vacationTaken) {
		this.vacationTaken = vacationTaken;
	}

	public void setDaysWorked(int daysWorked) {
		this.daysWorked = daysWorked;
	}
	public int getDaysReported() {
		return daysReported;
	}
	public void setDaysReported(int daysReported) {
		this.daysReported = daysReported;
	}
	public float getRequestedPTO() {
		return requestedPTO;
	}
	public void setRequestedPTO(float requestedPTO) {
		this.requestedPTO = requestedPTO;
	}

	


	
	
}
