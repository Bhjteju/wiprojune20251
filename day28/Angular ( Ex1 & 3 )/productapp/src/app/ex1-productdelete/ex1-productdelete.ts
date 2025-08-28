import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Ex1Productservice } from '../ex1-productservice';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-ex1-productdelete',
  imports: [CommonModule],
  templateUrl: './ex1-productdelete.html',
  styleUrl: './ex1-productdelete.css'
})
export class Ex1Productdelete {

id: string = '';

  constructor(
    private route: ActivatedRoute,
    private productService: Ex1Productservice,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.id = this.route.snapshot.paramMap.get('id') || '';
  }

  confirmDelete() {
    if (this.id) {
      this.productService.deleteProduct(this.id).subscribe({
        next: () => this.router.navigate(['/product-list']),
        error: err => console.error(err)
      });
    }
  }

  cancel() {
    this.router.navigate(['/product-list']);
  }

}
