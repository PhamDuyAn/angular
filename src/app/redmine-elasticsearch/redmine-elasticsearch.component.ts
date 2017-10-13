import { Component, OnInit } from '@angular/core';
import { RedmineElasticsearchServiceService } from '../redmine-elasticsearch-service.service';
@Component({
  selector: 'app-redmine-elasticsearch',
  templateUrl: './redmine-elasticsearch.component.html',
  styleUrls: ['./redmine-elasticsearch.component.css'],
  providers:[RedmineElasticsearchServiceService]
})
export class RedmineElasticsearchComponent implements OnInit {
  /**
   * name
   */
  public RedmineElasticsearchList :any[];
  constructor( private redmineelasticsearchservice: RedmineElasticsearchServiceService) { }

  ngOnInit():void {
    this.redmineelasticsearchservice.getIssuesRedmine().subscribe((response:any)=>
  {this.RedmineElasticsearchList = response;
  console.log(response);
  });
  }

}
