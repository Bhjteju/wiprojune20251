import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Ex3Order } from '../ex3-order';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { Ex3Purchaseservice } from '../ex3-purchaseservice';

@Component({
  selector: 'app-ex3-orderhistorycomp',
  standalone: true,
  imports: [FormsModule, CommonModule],
  templateUrl: './ex3-orderhistorycomp.html',
  styleUrl: './ex3-orderhistorycomp.css'
})
export class Ex3Orderhistorycomp {

orders: Ex3Order[] = [];

  constructor(private purchaseService: Ex3Purchaseservice) {}

  ngOnInit() {
    this.purchaseService.getOrders().subscribe(data => {
      this.orders = data;
    });
  }
}
