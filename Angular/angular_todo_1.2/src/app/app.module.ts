import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppComponent }  from './app.component';
import { TodoDetailComponent } from './todo-detail.component';
@NgModule({
  imports:      [ BrowserModule, FormsModule ],
  declarations: [ AppComponent, TodoDetailComponent ],
  bootstrap:    [ AppComponent ]
})
export class AppModule { }
