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
var DashBoardComponent = (function () {
    function DashBoardComponent(todoService) {
        this.todoService = todoService;
        this.todos = [];
    }
    DashBoardComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.todoService.getTodos()
            .then(function (todos) { return _this.todos = todos.slice(1, 5); });
    };
    return DashBoardComponent;
}());
DashBoardComponent = __decorate([
    core_1.Component({
        selector: 'my-dashboard',
        templateUrl: './dashboard.component.html',
        styleUrls: ['./dashboard.component.css']
    }),
    __metadata("design:paramtypes", [todo_service_1.TodoService])
], DashBoardComponent);
exports.DashBoardComponent = DashBoardComponent;
//# sourceMappingURL=dashboard.component.js.map