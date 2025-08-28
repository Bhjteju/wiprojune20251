import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './login.html'
})
export class Login {
  username = '';
  password = '';

  login() {
    alert(`Username: ${this.username}, Password: ${this.password}`);
  }
}
