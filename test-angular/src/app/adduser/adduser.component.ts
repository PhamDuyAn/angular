import { Component, OnInit,ViewChild } from '@angular/core';
import { Http,Response,Headers } from '@angular/http';
import { Router } from '@angular/router';
import { UserComponent } from '../user/user.component';
import { DataService } from '../services/data.service';
import { FormBuilder,FormGroup,FormControl,Validators,Validator } from '@angular/forms';

import { Personal } from '../entitys/personal';


@Component({
  selector: 'app-adduser',
  templateUrl: './adduser.component.html',
  styleUrls: ['./adduser.component.css']
})
export class AdduserComponent implements OnInit {
  // user1:User1[];
  FileForm: FormGroup;
  personalimage:File;
  @ViewChild("image") Image_Personal;
  userObj:Personal;
  selectedValue:String=null;
  position=[
    {value:"positon1",viewvalue:"Position 1"},
    {value:"positon2",viewvalue:"Position 2"},
    {value:"positon3",viewvalue:"Position 3"},
    {value:"positon4",viewvalue:"Position 4"}
  ]
  constructor(private http:Http,private router:Router,dataService:DataService,private fb:FormBuilder) {
    this.FileForm = this.fb.group({
      'image':["",Validators.required]
    });
   }
  isAdded:boolean=false;
  

  adduser = function(user){
    this.userObj = user;
    console.log("chiu " +user.image);
    // this.http.post('http://localhost:8080/Application/personal',this.userObj).subscribe((res:Response)=>{
    // this.isAdded=true;this.router.navigate(['/']);
    // });
    console.log(user);
  }
  
  // adduser = function(user){
  //   this.dataService.adduser(user);
  // }
  form;
  filesubmit(value){
    console.log(value.image);
  }
  ngOnInit() {
    
    // this.form= new FormGroup({
    //   name_personal:new FormControl('Duy An',Validators.compose([
    //     Validators.required,
    //     Validators.minLength(4),
    //     ])),
    //   // date_personal:new FormControl(Validators.compose([Validators.required])),
    //   // address_personal:new FormControl('Nam Dinh',Validators.required),
    //   // sex_personal:new FormControl(Validators.required),
    //   // numberphone_personal:new FormControl(Validators.compose([Validators.required,Validators.minLength(9),Validators.maxLength(13)])),
    //   // position:new FormControl(Validators.required),
    //   // email:new FormControl('Duan@gmail.com',Validators.compose([Validators.required])),
    //   // create_date:new FormControl(Validators.required),
    //   // image:new FormControl()
    // });
  }
}

