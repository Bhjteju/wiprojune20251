import { Component, OnInit } from '@angular/core';
import { Router, RouterLink, RouterModule } from '@angular/router';
import { Ex1Product } from '../ex1-product';
import { Ex1Productservice } from '../ex1-productservice';
import { FormsModule } from '@angular/forms';
import { CommonModule, CurrencyPipe } from '@angular/common';

@Component({
  selector: 'app-ex1-productlist',
  imports: [FormsModule, CommonModule, CurrencyPipe, RouterModule],
  templateUrl: './ex1-productlist.html',
  styleUrl: './ex1-productlist.css'
})
export class Ex1Productlist implements OnInit{

 products: Ex1Product[] = [];

  constructor(private productService: Ex1Productservice, private router: Router) { }

  ngOnInit(): void {
    this.loadProducts();
  }

  loadProducts() {
    this.productService.getProducts().subscribe(data => this.products = data);
  }

  addProduct() {
    this.router.navigate(['/product-add']);
  }

  editProduct(id: string) {
    this.router.navigate(['/product-edit', id]);
  }

  deleteProduct(id: string) {
    this.router.navigate(['/product-delete', id]);
  }

}
