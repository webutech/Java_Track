import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { AppComponent }  from './app.component';
import { TodoDetailComponent } from './todo-detail.component';
import { TodosComponent } from './todos.component';
import { DashBoardComponent } from './dashboard.component';
import { TodoService } from './todo.service';
import { AppRoutingModule } from './app-routing.module';
@NgModule({
  imports:      [ 
    BrowserModule, 
    FormsModule,
    AppRoutingModule
    ],
  declarations: [ 
    AppComponent, 
    TodoDetailComponent,
    TodosComponent,
    DashBoardComponent ],    
  providers:[TodoService],
  bootstrap:    [ AppComponent ]
})
export class AppModule { }
