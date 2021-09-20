package veni.com.domain;

public class Manager extends SalariedEmployee {

	public Manager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Work(int daysReported) throws Exception {
		if(daysReported > 260 ||  (daysWorked + daysReported) > 260) {
			throw new Exception("Invalid days reported. An emplyee can not report more than 260 days per year.");
		}
		daysWorked = daysWorked + daysReported;
		float tempVacationTime = ((float)30/YEARLY_WORK_DAYS) * daysReported  ;
		if( vacationAccumulated < 30) {
			if( (vacationAccumulated + tempVacationTime) < 30 ) {
				vacationAccumulated = vacationAccumulated + tempVacationTime;
			}else if(vacationAccumulated != 30 && (vacationAccumulated + tempVacationTime) >= 30) {
				vacationAccumulated = 30;
			}
			setTimeBankBalance(getTimeBankBalance() + tempVacationTime);
		}
	}

	
	
}
