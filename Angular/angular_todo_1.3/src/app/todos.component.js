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
var todo_service_1 = require("./todo.service");
var router_1 = require("@angular/router");
var TodosComponent = (function () {
    function TodosComponent(todoService, router) {
        this.todoService = todoService;
        this.router = router;
    }
    //  getTodos():void{
    //    this.todos=this.todoService.getTodos();
    //  }
    TodosComponent.prototype.getTodos = function () {
        var _this = this;
        this.todoService.getTodosSlowly().then(function (todos) { return _this.todos = todos; });
    };
    TodosComponent.prototype.ngOnInit = function () {
        this.getTodos();
    };
    TodosComponent.prototype.onSelect = function (todo) {
        this.selectedTodo = todo;
    };
    TodosComponent.prototype.gotoDetail = function () {
        this.router.navigate(['/detail', this.selectedTodo.id]);
    };
    return TodosComponent;
}());
TodosComponent = __decorate([
    core_1.Component({
        selector: 'my-todos',
        templateUrl: "./todos-component.html",
        styleUrls: ["./todos-component.css"],
        providers: [todo_service_1.TodoService]
    }),
    __metadata("design:paramtypes", [todo_service_1.TodoService, router_1.Router])
], TodosComponent);
exports.TodosComponent = TodosComponent;
//# sourceMappingURL=todos.component.js.map