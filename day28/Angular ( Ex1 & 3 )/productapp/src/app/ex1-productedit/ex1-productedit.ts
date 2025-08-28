import { Component, OnInit } from '@angular/core';
import { Ex1Product } from '../ex1-product';
import { ActivatedRoute, Router } from '@angular/router';
import { Ex1Productservice } from '../ex1-productservice';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-ex1-productedit',
  imports: [FormsModule, CommonModule],
  templateUrl: './ex1-productedit.html',
  styleUrl: './ex1-productedit.css'
})
export class Ex1Productedit implements OnInit {

product: Ex1Product = { id: '', name: '', category: '', price: 0 , qty: 0};

  constructor(
    private productService: Ex1Productservice,
    private router: Router,
    private route: ActivatedRoute
  ) {}

  ngOnInit() {
  const id = this.route.snapshot.paramMap.get('id');
  if (id) {
    this.productService.findProduct(id).subscribe({
      next: data => {
        this.product = data;
        this.product.price = Number(this.product.price); // ensure number
      },
      error: err => console.error(err)
    });
  }
}

save() {
  this.productService.saveProduct(this.product).subscribe({
    next: () => this.router.navigate(['/product-list']),
    error: err => console.error(err)
  });
}
}
