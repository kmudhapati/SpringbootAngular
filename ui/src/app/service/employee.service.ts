import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  
  constructor(private http: HttpClient) { }

  getEmployees() {
    return this.http.get<any>("http://localhost:8080/api/v1/employee");
  }

  updateWorkdays(emp:any){
    return this.http.put<any>("http://localhost:8080/api/v1/employee/workdays",emp);
  }
  updatePTO(emp:any){
    return this.http.put<any>("http://localhost:8080/api/v1/employee/pto",emp);
  }
}
