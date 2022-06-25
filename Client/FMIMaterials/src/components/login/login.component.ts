import { User } from './../../models/user';
import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
 
  private _users:any;

  get users(){
    return this._users;
  }

  constructor(private http:HttpClient) { }

  ngOnInit(): void {
  }

  getUsers() {
    let url:string = "http://localhost:8080/users/{users}";
    this._users =  this.http.get(url);
  }

  login(){
    
  }

}
