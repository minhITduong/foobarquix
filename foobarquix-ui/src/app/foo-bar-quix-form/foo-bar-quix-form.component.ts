import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { FooBarQuixService } from '../foo-bar-quix.service';

@Component({
  selector: 'app-foo-bar-quix-form',
  templateUrl: './foo-bar-quix-form.component.html'
})
export class FooBarQuixFormComponent implements OnInit {
  @Output() submitNumberOutput$: EventEmitter<number> = new EventEmitter();

  inputNumber: number;

  constructor() {

  }

  ngOnInit(): void {
  }

  onSubmitClick(): void {
    this.submitNumberOutput$.emit(this.inputNumber);
  }

}
