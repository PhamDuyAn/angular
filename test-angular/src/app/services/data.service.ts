import { Injectable } from '@angular/core';
import { Http,Response,Headers } from '@angular/http';
import { RouterModule,Router,ActivatedRoute } from '@angular/router';
import 'rxjs/add/operator/map';

@Injectable()
export class DataService {
  isAdded:boolean=false;
  isUpdate:boolean=false;
  id:number;
  data=[];
  users=[];
  userObj:any;
  private header = new Headers({'Content-Type': 'application/json'});
  url:string = "http://localhost:8080/Application/personal";
  constructor(public http:Http,public router:Router,private route:ActivatedRoute) {
    console.log('Service run');
  }
  getUser(){
    return this.http.get(this.url)
    .map(res=>res.json());
  }
  adduser = function(user){
    this.userObj = {
      "name_personal":user.name_personal,
      "date_personal":user.date_personal,
      "address_personal":user.address_personal,
      "sex_personal":user.sex_personal,
      "numberphone_personal": user.numberphone_personal,
      "position": user.position,
      "create_date": user.create_date,
      "email": user.email,
      "image": user.image
    }
    this.http.post('http://localhost:8080/Application/personal',this.userObj).subscribe((res:Response)=>{
    this.isAdded=true;this.router.navigate(['/']);
    });
  }
  edituser(user){
    this.userObj = {
      "name_personal":user.name_personal,
      "date_personal":user.date_personal,
      "address_personal":user.address_personal,
      "sex_personal":user.sex_personal,
      "numberphone_personal": user.numberphone_personal,
      "position": user.position,
      "create_date": user.create_date,
      "email": user.email,
      "image": user.image
    }
    const url1 = this.url+"/"+this.id;
    this.http.put(url1, JSON.stringify(this.userObj), {headers:this.header}).map(res=>res.json());
  }
  //delete
  deleteuser = function(id){
    if(confirm('Are you sure???')){
      const url2 =this.url+"/"+id;
      return this.http.delete(url2,{header:this.header}).toPromise()
      .then(()=>{
        this.getUser();
      })
    }
  }
  ngOnInit() {
    //console.log(this.id);
    
  }
}
