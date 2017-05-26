import { Component } from '@angular/core';

@Component({
    selector:'my-app',
    styleUrls: ['./app.component.css'],
    template:`
          <h1>{{title}}</h1>
            <nav>
                <a routerLink="/dashboard" routerLinkActive="active">Dashboard</a>
                <a routerLink="/todos" routerLinkActive="active">Todos</a>
            </nav>
          <router-outlet></router-outlet>
        `
    
})

export class AppComponent {

    title='Todo - App';

}