import { InMemoryDbService } from 'angular-in-memory-web-api';
export class InMemoryDataService implements InMemoryDbService {
  createDb() {
    let todos = [
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
    return {todos};
  }
}