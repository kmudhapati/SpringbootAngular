import { Component } from '@angular/core';
import { EmployeeService } from './service/employee.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ui';
  constructor (private employeeService: EmployeeService) { }
  employees: any;
  updatedEmployee: any;
  errorMessage: any;


  hourly = {title: 'Hourly'};
  salaried = {title: 'Salaried'};
  managers = {title: 'Manager'};
  ngOnInit(): void {
    this.getUser();
  }

  getUser(): void {
    this.employeeService.getEmployees()
      .subscribe(data => {
        this.employees = data;
    })
  }

  updateWorkDays(emp: any): void {
    this.errorMessage = null;
    this.employeeService.updateWorkdays(emp)
      .subscribe(
        data => {this.employees = data;},
        error => {this.errorMessage = error.error;console.log(this.errorMessage)}
        )
  }

  updatePTO(emp: any): void {
    this.errorMessage = null;
    this.employeeService.updatePTO(emp)
      .subscribe(
        data => {this.employees = data;},
        error => {this.errorMessage = error.error;console.log(this.errorMessage)}
        )
  }
}
