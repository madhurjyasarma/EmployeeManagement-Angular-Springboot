import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { EmployeeService } from 'src/app/shared/employee.service';

@Component({
  selector: 'app-employee-add',
  templateUrl: './employee-add.component.html',
  styleUrls: ['./employee-add.component.scss']
})
export class EmployeeAddComponent implements OnInit {

  constructor(public employeeService: EmployeeService) { } // Inject

  ngOnInit(): void { //Life Cycle hook
    // get all departments
    this.employeeService.getAllDepartments();
  }

  //Submit Method
  onSubmit(form: NgForm){
    console.log(form.value);
    let _addEmpId=this.employeeService.formEmployeeData.empId;

    // check condition
    if(_addEmpId==0 || _addEmpId==null){
      this.addEmployee(form);
      window.location.reload();
    }else{
      this.editEmployee(form);
      window.location.reload;
    }
    this.addEmployee(form);
  }

  //INSERT 
  addEmployee(form?: NgForm){
    console.log("Inserting...");
    this.employeeService.insertEmployee(form.value).subscribe(
      (result)=>{
        console.log(result);
      },
      (error)=>{
        console.log(error);
      }

    );
  }

  //UPDATE
  editEmployee(form?: NgForm){
    console.log("Updating...");
    this.employeeService.insertEmployee(form.value).subscribe(
      (result)=>{
        console.log(result);
      },
      (error)=>{
        console.log(error);
      }

    );
  }

}