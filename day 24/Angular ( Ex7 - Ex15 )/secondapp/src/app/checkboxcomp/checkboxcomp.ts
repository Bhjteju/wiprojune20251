import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Ex15Homecomp } from '../ex15-homecomp/ex15-homecomp';

@Component({
  selector: 'app-checkboxcomp',
  imports: [CommonModule, FormsModule, Ex15Homecomp],
  templateUrl: './checkboxcomp.html',
  styleUrl: './checkboxcomp.css'
})
export class Checkboxcomp {

//>>>>>>>>>>>>>>>>> Ex:-11 >>>>>>>>>>>>>>>>>>
  // isVisible = false;

  // toggle() {
  //   this.isVisible = !this.isVisible;
  // }

//>>>>>>>>>>>>>>>>> Ex:12 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>

  // countries: string[] = ["India", "USA", "UK", "Australia", "Germany"];

  // dropdownList: string[] = [];

  // loadCountries() {
  //   if (this.dropdownList.length === 0) {
  //     this.dropdownList = this.countries;
  //   }
  // }

//>>>>>>>>>>>>>>>>> Ex:-13 >>>>>>>>>>>>>>>>>> -->

// color:string="dafault";



//>>>>>>>>>>>>>>>>> Ex:14 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>

searchText: string = "";
  names: string[] = ["Jayanta", "Jayaram", "Srikanth", "Srinivas", "Sriram", "Harish", "Harsha"];

}
