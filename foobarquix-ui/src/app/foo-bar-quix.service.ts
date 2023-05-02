import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Result } from './model/result';

const API = 'http://localhost:8080/foo-bar-quix/';

@Injectable({
  providedIn: 'root'
})
export class FooBarQuixService {

  constructor(private http: HttpClient) { }

  public sendNumber(inputNumber: number): Observable<Result> {
    return this.http.get<Result>(API + inputNumber);
  }

}
