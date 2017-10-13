import { TestBed, inject } from '@angular/core/testing';

import { RedmineElasticsearchServiceService } from './redmine-elasticsearch-service.service';

describe('RedmineElasticsearchServiceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [RedmineElasticsearchServiceService]
    });
  });

  it('should be created', inject([RedmineElasticsearchServiceService], (service: RedmineElasticsearchServiceService) => {
    expect(service).toBeTruthy();
  }));
});
