import { Injectable } from '@angular/core';
import { Http,Response} from '@angular/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
@Injectable()
export class RedmineElasticsearchServiceService {
  private apiUrl="http://localhost:8080/api/issuedemo/";

  constructor(private http :Http) { }
  getIssuesRedmine(): Observable<any[]>{
    return this.http.get(this.apiUrl).map((response: Response)=>response.json());
  }
}
