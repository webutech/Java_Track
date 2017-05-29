"use strict";
var InMemoryDataService = (function () {
    function InMemoryDataService() {
    }
    InMemoryDataService.prototype.createDb = function () {
        var todos = [
            { id: 1, name: 'Create Angular2' },
            { id: 2, name: 'Take Rest WS Test' },
            { id: 3, name: 'Create PPT' },
            { id: 4, name: 'Check mails' },
            { id: 5, name: 'Take Interview' },
            { id: 6, name: 'Talk to Rakeshji' },
            { id: 7, name: 'Prepare Questions' },
            { id: 8, name: 'Prepare Test' },
            { id: 9, name: 'Talk to narendra sir' },
            { id: 10, name: 'Plan for team lunch' }
        ];
        return { todos: todos };
    };
    return InMemoryDataService;
}());
exports.InMemoryDataService = InMemoryDataService;
//# sourceMappingURL=in-memory-data.service.js.map