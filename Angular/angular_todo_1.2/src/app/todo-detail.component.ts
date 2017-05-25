import { Component, Input } from '@angular/core';
import { Todo } from './todo';
@Component({
  selector: 'todo-detail',
  template:`
     <div *ngIf="todo">
        <h2>{{todo.name}} - details!</h2>
            <div><label>id: </label>{{todo.id}}</div>
            <div>
                <label>name: </label>
                <input [(ngModel)]="todo.name" placeholder="add task">
            </div>
    </div>
  `
})
export class TodoDetailComponent{
    @Input() todo: Todo;
}