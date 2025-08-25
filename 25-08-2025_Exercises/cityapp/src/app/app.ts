import { CommonModule } from '@angular/common';
import { Component, signal,inject } from '@angular/core';
import { ReactiveFormsModule, Validators ,FormBuilder} from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatListModule } from '@angular/material/list';
import { MatStepperModule } from '@angular/material/stepper';
import { RouterOutlet } from '@angular/router';
import { ReverseText } from './reverse-text/reverse-text';
import { RegistrationForm } from './registration-form/registration-form';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule,ReactiveFormsModule,MatStepperModule,MatFormFieldModule,MatInputModule,MatButtonModule,RegistrationForm],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  //cities : string[] = ['New York', 'Los Angeles', 'Chicago', 'Houston', 'Phoenix'];
  private fb = inject(FormBuilder);
  nameForm = this.fb.group({
    name: ['', Validators.required]
  });

  ageForm = this.fb.group({
    age: ['', [Validators.required, Validators.min(1)]]
  });

  emailForm = this.fb.group({
    email: ['', [Validators.required, Validators.email]]
  });
}
