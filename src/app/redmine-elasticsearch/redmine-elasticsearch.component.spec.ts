import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RedmineElasticsearchComponent } from './redmine-elasticsearch.component';

describe('RedmineElasticsearchComponent', () => {
  let component: RedmineElasticsearchComponent;
  let fixture: ComponentFixture<RedmineElasticsearchComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RedmineElasticsearchComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RedmineElasticsearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
