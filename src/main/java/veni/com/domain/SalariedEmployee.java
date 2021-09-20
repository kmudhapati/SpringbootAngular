package veni.com.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class SalariedEmployee extends Employee {

	public SalariedEmployee(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void Work(int daysReported) throws Exception {
		if(daysReported > 260 ||  (daysWorked + daysReported) > 260) {
			throw new Exception("Invalid days reported. An emplyee can not report more than 260 days per year.");
		}
		daysWorked = daysWorked + daysReported;
		float tempVacationTime = ((float)15/YEARLY_WORK_DAYS) * daysReported  ;
		if( vacationAccumulated < 15) {
			if( (vacationAccumulated + tempVacationTime) < 15 ) {
				vacationAccumulated = vacationAccumulated + tempVacationTime;
			}else if(vacationAccumulated != 15 && (vacationAccumulated + tempVacationTime) >= 15) {
				vacationAccumulated = 15;
			}
			setTimeBankBalance(getTimeBankBalance() + tempVacationTime);
		}
		
	}
	
}
