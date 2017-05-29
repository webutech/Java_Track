import { Injectable } from '@angular/core';
import { Headers, Http } from '@angular/http';
import 'rxjs/add/operator/toPromise';
import { Todo } from './todo';
import { TODOS } from './mock-todo';
@Injectable()
export class TodoService{
    private todosUrl='api/todos';   //URL to web api
    private headers = new Headers({'Content-Type': 'application/json'});

    constructor(private http:Http){}

    getTodos(): Promise<Todo[]>{
        return this.http.get(this.todosUrl)
            .toPromise()
            .then(response=>response.json().data as Todo[])
            .catch(this.handleError)
        ;
    }

    private handleError(error:any):Promise<any>{
        console.error('An error occured',error);
        return Promise.reject(error.message || error);
    }

   getTodo(id: number): Promise<Todo> {
    const url = `${this.todosUrl}/${id}`;
        return this.http.get(url)
            .toPromise()
            .then(response => response.json().data as Todo)
            .catch(this.handleError);
    }

    update(todo: Todo): Promise<Todo> {
        const url = `${this.todosUrl}/${todo.id}`;
        return this.http
        .put(url, JSON.stringify(todo), {headers: this.headers})
        .toPromise()
        .then(() => todo)
        .catch(this.handleError);
    }

    create(name: string): Promise<Todo> {
        return this.http
        .post(this.todosUrl, JSON.stringify({name: name}), {headers: this.headers})
        .toPromise()
        .then(res => res.json().data as Todo)
        .catch(this.handleError);
    }

    delete(id: number): Promise<void> {
    const url = `${this.todosUrl}/${id}`;
        return this.http.delete(url, {headers: this.headers})
            .toPromise()
            .then(() => null)
            .catch(this.handleError);
    }

    getTodosSlowly():Promise<Todo[]>{
        return new Promise(resolve=>{
            //Simulate server litency with 2 seconds delay
            setTimeout(()=>resolve(this.getTodos()),2000);
        });
    }
}