import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EmployeeListComponent } from './employees/employee-list/employee-list.component';
import { EmployeesAddComponent } from './employees/employees.component';


const routes: Routes = [
{path:'',redirectTo:'employeeList', pathMatch:'full'},
{path:'employeelist',component:EmployeeListComponent},
{path:'employeeadd',component:EmployeesAddComponent},
{path: 'employeeadd/:empId',component:EmployeesAddComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
