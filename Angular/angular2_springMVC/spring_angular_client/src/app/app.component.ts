import { Component, OnInit } from '@angular/core';
import { Http } from '@angular/http';
import 'rxjs/add/operator/toPromise';
@Component({
  selector: 'my-app',
  template: `
  <h1>Spring- Angular 2 Demo</h1>
  <ul>
    <li *ngFor="let user of users">
      ID : {{user.id}}
      Name : {{user.name}}
      Contact : {{user.contact}}
    </li>
  </ul>
  
  `,
})
export class AppComponent implements  OnInit{ 
  
  name = 'Angular'; 
  getUsersUrl:string="http://localhost:8080/spring_angular/users";
  users=[{"id":1,"name":"test name","contact":"23842638"}];

  constructor(private http :  Http){}

  ngOnInit(){
    this.http.get("http://localhost:8080/spring_angular/users")
    .toPromise()
    .then(result=>result.json())
    .then(u=>this.users=u);
  }

}
