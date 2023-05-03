import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { FooBarQuixService } from '../foo-bar-quix.service';

@Component({
  selector: 'app-foo-bar-quix',
  templateUrl: './foo-bar-quix.component.html'
})
export class FooBarQuixComponent implements OnInit, OnDestroy {
  convertedResults: {inputNumber : number, result: string}[] = [];

  constructor(private fooBarQuixService: FooBarQuixService) { }

  ngOnInit(): void {
  }

  ngOnDestroy(): void {
  }

  convertNumber(inputNumber: number): void {
    this.fooBarQuixService.sendNumber(inputNumber)
      .subscribe(response => {
        console.log(response.result),
        this.convertedResults.push({inputNumber, result : response.result}),
        this.convertedResults.forEach(element => console.log(element))
      })
    ;
  }

}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}
