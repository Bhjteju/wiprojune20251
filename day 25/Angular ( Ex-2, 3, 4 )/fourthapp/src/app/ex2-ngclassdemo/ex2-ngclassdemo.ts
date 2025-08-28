import { NgClass, NgStyle } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-ex2-ngclassdemo',
  imports: [NgClass, NgStyle],
  templateUrl: './ex2-ngclassdemo.html',
  styleUrl: './ex2-ngclassdemo.css'
})
export class Ex2Ngclassdemo {


  // >>>>>>>>>>>> Ex-2 & 3 >>>>>>>>>>>>>>
  // flag1 = true;
  // flag2 = false;

  // getNgClass() {
  //   return {
  //     app1: this.flag1,
  //     app2: this.flag2
  //   };
  // }

  // toggleFlags() {
  //   this.flag1 = !this.flag1;
  //   this.flag2 = !this.flag2;
  // }

  //>>>>>>>>>>>>>>>>>> Ex-4 >>>>>>>>>>>>>>>

  flag1 = true;
  color1 = 'purple';

  getColor() {
    return this.flag1 ? 'purple' : 'green';
  }

  toggleFlag() {

    this.flag1 = !this.flag1;
  }
}
