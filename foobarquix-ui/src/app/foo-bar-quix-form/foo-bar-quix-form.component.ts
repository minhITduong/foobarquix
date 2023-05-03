import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { FooBarQuixService } from '../foo-bar-quix.service';

@Component({
  selector: 'app-foo-bar-quix-form',
  templateUrl: './foo-bar-quix-form.component.html',
  styleUrls:['./foo-bar-quix-form.component.scss']
})
export class FooBarQuixFormComponent implements OnInit {
  @Output() submitNumberOutput$: EventEmitter<number> = new EventEmitter();

  inputNumber: number;

  constructor() {

  }

  ngOnInit(): void {
  }

  onSubmitClick(): void {
    console.log(this.inputNumber);
    this.submitNumberOutput$.emit(this.inputNumber);
    this.inputNumber = null;
  }

}
