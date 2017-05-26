import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Params } from '@angular/router';
import { Location } from '@angular/common';
import { TodoService } from './todo.service';
import { Todo } from './todo';
import 'rxjs/add/operator/switchMap';
@Component({
  selector: 'todo-detail',
  templateUrl:'./todo-detail.component.html',
  styleUrls:["./todo-detail.component.css"]
})
export class TodoDetailComponent implements OnInit{
    constructor(
        private todoService:TodoService, 
        private route:ActivatedRoute, 
        private location:Location){}

     
       @Input() todo: Todo;
       ngOnInit(): void {
            this.route.params
                .switchMap((params: Params) => this.todoService.getTodo(+params['id']))
                .subscribe(todo => this.todo = todo);
        }

        goBack():void{
            this.location.back();
        }
}