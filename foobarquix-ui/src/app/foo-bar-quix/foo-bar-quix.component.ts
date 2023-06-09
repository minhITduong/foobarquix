import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { FooBarQuixService } from '../foo-bar-quix.service';

@Component({
  selector: 'app-foo-bar-quix',
  templateUrl: './foo-bar-quix.component.html',
  styleUrls: ['./foo-bar-quix.component.scss']
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
        this.convertedResults.push({inputNumber, result : response.result})
      })
    ;
  }

}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}
