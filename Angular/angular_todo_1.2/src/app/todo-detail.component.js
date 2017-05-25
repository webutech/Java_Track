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
var todo_1 = require("./todo");
var TodoDetailComponent = (function () {
    function TodoDetailComponent() {
    }
    return TodoDetailComponent;
}());
__decorate([
    core_1.Input(),
    __metadata("design:type", todo_1.Todo)
], TodoDetailComponent.prototype, "todo", void 0);
TodoDetailComponent = __decorate([
    core_1.Component({
        selector: 'todo-detail',
        template: "\n     <div *ngIf=\"todo\">\n        <h2>{{todo.name}} - details!</h2>\n            <div><label>id: </label>{{todo.id}}</div>\n            <div>\n                <label>name: </label>\n                <input [(ngModel)]=\"todo.name\" placeholder=\"add task\">\n            </div>\n    </div>\n  "
    })
], TodoDetailComponent);
exports.TodoDetailComponent = TodoDetailComponent;
//# sourceMappingURL=todo-detail.component.js.map