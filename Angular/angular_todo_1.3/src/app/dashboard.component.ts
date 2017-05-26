import { Component, OnInit } from '@angular/core';
import { Todo } from './todo';
import { TodoService } from './todo.service';

@Component({
    selector:'my-dashboard',
    templateUrl:'./dashboard.component.html',
    styleUrls: [ './dashboard.component.css' ]
}) 
export class DashBoardComponent implements OnInit {
  todos: Todo[] = [];
  constructor(private todoService: TodoService) { }
  ngOnInit(): void {
    this.todoService.getTodos()
      .then(todos => this.todos = todos.slice(1, 5));
  }
}