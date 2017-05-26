import { Component, OnInit } from '@angular/core';
import { Todo } from './todo';
import { TodoService } from './todo.service';
import { Router } from '@angular/router';



@Component({
  selector: 'my-todos',
  templateUrl:"./todos-component.html",
  styleUrls:["./todos-component.css"],
  providers:[TodoService]
})
export class TodosComponent implements OnInit {
 
 todos: Todo[];
 selectedTodo:Todo;

 constructor(private todoService: TodoService, private router:Router){}

//  getTodos():void{
//    this.todos=this.todoService.getTodos();
//  }

  getTodos():void{
    this.todoService.getTodosSlowly().then(todos=>this.todos=todos);
  }

 ngOnInit():void{
    this.getTodos();
 }

 onSelect(todo: Todo):void {
   this.selectedTodo=todo;
 }

 gotoDetail(): void {
  this.router.navigate(['/detail', this.selectedTodo.id]);
 }

}
