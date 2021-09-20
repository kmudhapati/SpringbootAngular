package veni.com.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class HourlyEmployee extends Employee {

	public HourlyEmployee(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Work(int daysReported) throws Exception {
		if(daysReported > 260 ||  (daysWorked + daysReported) > 260) {
			throw new Exception("Invalid days reported. An emplyee can not report more than 260 days per year.");
		}
		daysWorked = daysWorked + daysReported;
		float tempVacationTime = ((float)10/YEARLY_WORK_DAYS) * daysReported  ;
		if( vacationAccumulated < 10) {
			if( (vacationAccumulated + tempVacationTime) < 10 ) {
				vacationAccumulated = vacationAccumulated + tempVacationTime;
			}else if(vacationAccumulated != 10 && (vacationAccumulated + tempVacationTime) >= 10) {
				vacationAccumulated = 10;
			}
			setTimeBankBalance(getTimeBankBalance() + tempVacationTime);
		}
	}

	
	
}
