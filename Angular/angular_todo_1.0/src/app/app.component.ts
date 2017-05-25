import { Component } from '@angular/core';
export class Todo{
    id:number;
    name: string;
}

const TODOS : Todo[]=[
  { id:1, name : 'Create Angular2 todo app'},
  { id:2, name : 'Take Rest WS Test'},
  { id:3, name : 'Create PPT for Angular todo'},
  { id:4, name : 'Check mails'},
  { id:5, name : 'Take Interview'},
  { id:6, name : 'Talk to Rakeshji'},
  { id:7, name : 'Prepare Questions for Interview'},
  { id:8, name : 'Prepare Test'},
  { id:9, name : 'Talk to narendra sir'},
  { id:10, name : 'Plan for team lunch'}
];

@Component({
  selector: 'my-app',
  template: `
  <h1>{{title}}</h1>
  <h2>My Todos</h2>
  <ul class="todos">
    <li *ngFor="let todo of todos" 
      [class.selected]="todo === selectedTodo" 
      (click)="onSelect(todo)">
      <span class="badge">{{todo.id}}</span>{{todo.name}}
    </li>
  </ul>

  <div *ngIf="selectedTodo">
  <h2>{{selectedTodo.name}} - details!</h2>
  <div><label>id: </label>{{selectedTodo.id}}</div>
  <div>
    <label>name: </label>
    <input [(ngModel)]="selectedTodo.name" placeholder="add task">
  </div>
  </div>
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
  
  `]
})
export class AppComponent  {
 title='Todo - App';
 todos=TODOS;
 selectedTodo:Todo;
 onSelect(todo: Todo):void {
   this.selectedTodo=todo;
 }

}
