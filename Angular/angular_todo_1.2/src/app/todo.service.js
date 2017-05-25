"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var core_1 = require("@angular/core");
var mock_todo_1 = require("./mock-todo");
var TodoService = (function () {
    function TodoService() {
    }
    // getTodos():Todo[]{
    //     return TODOS;
    // } 
    // this is the promise
    // better in case of Asynch call, if data is prepared using some Rest service. 
    TodoService.prototype.getTodos = function () {
        return Promise.resolve(mock_todo_1.TODOS);
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
    core_1.Injectable()
], TodoService);
exports.TodoService = TodoService;
//# sourceMappingURL=todo.service.js.map