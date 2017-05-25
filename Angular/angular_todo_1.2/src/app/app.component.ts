import { Component, OnInit } from '@angular/core';
import { Todo } from './todo';
import { TodoService } from './todo.service';


@Component({
  selector: 'my-app',
  template: `
  <h1>{{title}}</h1>
  <h2>My Todos</h2>
  <ul class="todos">
    <li *ngFor="let todo of todos" [class.selected]="todo === selectedTodo" (click)="onSelect(todo)">
      <span class="badge">{{todo.id}}</span>{{todo.name}}
    </li>
  </ul>
  <todo-detail [todo]="selectedTodo"></todo-detail> 
  `,
  styles : [`

  .selected {
      background-color: #CFD8DC !important;
      color: white;
    }
    .todos{
      margin: 0 0 2em 0;
      list-style-type: none;
      padding: 0;
      width: 15em;
    }

    .todos li {
    cursor: pointer;
    position: relative;
    left: 0;
    background-color: #EEE;
    margin: .5em;
    padding: .3em 0;
    height: 1.6em;
    border-radius: 4px;
  }

  .todos li.selected:hover {
    background-color: #BBD8DC !important;
    color: white;
  }

   .todos li:hover {
    color: #607D8B;
    background-color: #DDD;
    left: .1em;
  }
  .todos .text {
    position: relative;
    top: -3px;
  }
  .todos .badge {
    display: inline-block;
    font-size: small;
    color: white;
    padding: 0.8em 0.7em 0 0.7em;
    background-color: #607D8B;
    line-height: 1em;
    position: relative;
    left: -1px;
    top: -4px;
    height: 1.8em;
    margin-right: .8em;
    border-radius: 4px 0 0 4px;
  }  
  `],
  providers:[TodoService]
})
export class AppComponent implements OnInit {
 title='Todo - App';
 todos: Todo[];
 selectedTodo:Todo;

 constructor(private todoService: TodoService){}

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

}
