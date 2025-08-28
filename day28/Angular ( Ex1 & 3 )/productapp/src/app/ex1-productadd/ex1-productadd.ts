import { Component, OnInit } from '@angular/core';
import { Ex1Product } from '../ex1-product';
import { Router } from '@angular/router';
import { Ex1Productservice } from '../ex1-productservice';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-ex1-productadd',
  imports: [FormsModule, CommonModule],
  templateUrl: './ex1-productadd.html',
  styleUrl: './ex1-productadd.css'
})
export class Ex1Productadd implements OnInit {

 product: Ex1Product = { id: '', name: '', category: '', price: 0, qty: 0 };
  products: Ex1Product[] = [];

  constructor(private productService: Ex1Productservice, private router: Router) { }

  ngOnInit(): void {
    
    this.productService.getProducts().subscribe({
      next: data => this.products = data,
      error: err => console.error(err)
    });
  }

  submit() {
 
    const maxId = this.products.length > 0 ? Math.max(...this.products.map(p => Number(p.id))) : 0;
    this.product.id = (maxId + 1).toString();

    this.productService.addProduct(this.product).subscribe({
      next: () => this.router.navigate(['/product-list']),
      error: err => console.error(err)
    });
  }
}