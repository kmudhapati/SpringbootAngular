package veni.com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import veni.com.domain.Employee;
import veni.com.domain.HourlyEmployee;
import veni.com.domain.Manager;
import veni.com.domain.SalariedEmployee;

@Service
public class EmployeeService {
	
	private static List<Employee> emplyeeList;
	static {
		String he = "Hourly Employee";
		String se = "Salaried Employee";
		String me = "Manager";
		emplyeeList = new ArrayList<Employee>();
		int y = 1;
		for(int x = 1 ; x <= 30 ; x++) {
			
			if(x < 11) {
				emplyeeList.add(new HourlyEmployee(he+y));
				y ++;
			}else if(x > 10 && x < 21) {
				if(x == 11) {
					y = 1;
				}
				emplyeeList.add(new SalariedEmployee(se+y));
				y++;
			}else {
				if(x == 21 ) {
					y = 1;
				}
				emplyeeList.add(new Manager(me+y));
				y++;
			}
					}
	}
	public  List<Employee> getEmplyeeList() {
		return emplyeeList;
	}
	
	public List<Employee> updateWorkDays(Employee emp) throws Exception {
		Employee employee = emplyeeList.stream()
                .filter(x -> x.getName().equals(emp.getName()))
                .findFirst().orElse(null);
		employee.Work(emp.getDaysReported());
		
		return emplyeeList;
	}
	
	public List<Employee> updatePTO(Employee emp) throws Exception {
		Employee employee = emplyeeList.stream()
                .filter(x -> x.getName().equals(emp.getName()))
                .findFirst().orElse(null);
		employee.takeVacation(emp.getRequestedPTO());
		
		return emplyeeList;
	}
	

}
