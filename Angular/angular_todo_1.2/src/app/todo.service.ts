import { Injectable } from '@angular/core';
import { Todo } from './todo';
import { TODOS } from './mock-todo';
@Injectable()
export class TodoService{
    // getTodos():Todo[]{
    //     return TODOS;
    // } 

    // this is the promise
    // better in case of Asynch call, if data is prepared using some Rest service. 
    getTodos():Promise<Todo[]>{
        return Promise.resolve(TODOS);
    }

    getTodosSlowly():Promise<Todo[]>{
        return new Promise(resolve=>{
            //Simulate server litency with 2 seconds delay
            setTimeout(()=>resolve(this.getTodos()),2000);
        });
    }
}