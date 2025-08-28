import { Component } from '@angular/core';
import { Ex1Product } from '../ex1-product';
import { Ex3Purchaseservice } from '../ex3-purchaseservice';
import { Ex1Productservice } from '../ex1-productservice';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-ex3-purchagecomp',
  imports: [FormsModule, CommonModule],
  templateUrl: './ex3-purchagecomp.html',
  styleUrls: ['./ex3-purchagecomp.css']
})
export class Ex3Purchagecomp {

  products: Ex1Product[] = [];
  selectedProductId: string = '';
  selectedProduct: Ex1Product | null = null;
  purchaseQty: number = 0;
  message: string = '';

  constructor(
    private productService: Ex1Productservice,
    private purchaseService: Ex3Purchaseservice
  ) {}

  ngOnInit() {
    this.loadProducts();
  }

  loadProducts() {
    this.productService.getProducts().subscribe(data => {
      this.products = data;
    });
  }

  onProductSelect(productId: string) {
    this.selectedProduct = this.products.find(p => p.id === productId) || null;
    this.purchaseQty = 0;
    this.message = '';
  }

  placeOrder() {
    if (!this.selectedProduct || this.purchaseQty <= 0) {
      this.message = 'Please select a product and enter a valid quantity!';
      return;
    }

    if (this.purchaseQty > this.selectedProduct.qty) {
      this.message = `Only ${this.selectedProduct.qty} items available.`;
      return;
    }

    this.purchaseService.placeOrder(this.selectedProduct.id, this.purchaseQty)
      .subscribe(order => {
        this.message = `Order placed for ${order.qtyPurchased} ${order.productName}!`;

        if (this.selectedProduct) {
          this.selectedProduct.qty -= this.purchaseQty;
        }

        this.purchaseQty = 0;
      }, error => {
        console.error(error);
        this.message = 'Error placing order!';
      });
  }
}
