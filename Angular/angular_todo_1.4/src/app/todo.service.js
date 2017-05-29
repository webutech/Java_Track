"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = require("@angular/core");
var http_1 = require("@angular/http");
require("rxjs/add/operator/toPromise");
var TodoService = (function () {
    function TodoService(http) {
        this.http = http;
        this.todosUrl = 'api/todos'; //URL to web api
        this.headers = new http_1.Headers({ 'Content-Type': 'application/json' });
    }
    TodoService.prototype.getTodos = function () {
        return this.http.get(this.todosUrl)
            .toPromise()
            .then(function (response) { return response.json().data; })
            .catch(this.handleError);
    };
    TodoService.prototype.handleError = function (error) {
        console.error('An error occured', error);
        return Promise.reject(error.message || error);
    };
    TodoService.prototype.getTodo = function (id) {
        var url = this.todosUrl + "/" + id;
        return this.http.get(url)
            .toPromise()
            .then(function (response) { return response.json().data; })
            .catch(this.handleError);
    };
    TodoService.prototype.update = function (todo) {
        var url = this.todosUrl + "/" + todo.id;
        return this.http
            .put(url, JSON.stringify(todo), { headers: this.headers })
            .toPromise()
            .then(function () { return todo; })
            .catch(this.handleError);
    };
    TodoService.prototype.create = function (name) {
        return this.http
            .post(this.todosUrl, JSON.stringify({ name: name }), { headers: this.headers })
            .toPromise()
            .then(function (res) { return res.json().data; })
            .catch(this.handleError);
    };
    TodoService.prototype.delete = function (id) {
        var url = this.todosUrl + "/" + id;
        return this.http.delete(url, { headers: this.headers })
            .toPromise()
            .then(function () { return null; })
            .catch(this.handleError);
    };
    TodoService.prototype.getTodosSlowly = function () {
        var _this = this;
        return new Promise(function (resolve) {
            //Simulate server litency with 2 seconds delay
            setTimeout(function () { return resolve(_this.getTodos()); }, 2000);
        });
    };
    return TodoService;
}());
TodoService = __decorate([
    core_1.Injectable(),
    __metadata("design:paramtypes", [http_1.Http])
], TodoService);
exports.TodoService = TodoService;
//# sourceMappingURL=todo.service.js.map