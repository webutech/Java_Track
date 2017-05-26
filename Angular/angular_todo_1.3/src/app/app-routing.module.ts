import { NgModule }      from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TodoDetailComponent } from './todo-detail.component';
import { TodosComponent } from './todos.component';
import { DashBoardComponent } from './dashboard.component';

const routes:Routes=[
      {path: 'detail/:id', component :TodoDetailComponent}, 
      {path: 'todos', component :TodosComponent},
      {path: 'dashboard',component :DashBoardComponent},
      {path:'',redirectTo:'/dashboard',pathMatch:'full'}
    ];

  @NgModule({
      imports:[RouterModule.forRoot(routes)],
      exports :[RouterModule]
  })
export class AppRoutingModule { }
