import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Ex1Product } from './ex1-product';

@Injectable({
  providedIn: 'root'
})
export class Ex1Productservice {

  private apiUrl = 'http://localhost:9000/products';

  constructor(private http: HttpClient) { }

  getProducts(): Observable<Ex1Product[]> {
    return this.http.get<Ex1Product[]>(this.apiUrl);
  }

  addProduct(product: Ex1Product): Observable<Ex1Product> {
    return this.http.post<Ex1Product>(this.apiUrl, product);
  }

  findProduct(id: string): Observable<Ex1Product> {
    return this.http.get<Ex1Product>(`${this.apiUrl}/${id}`);
  }

  saveProduct(product: Ex1Product): Observable<Ex1Product> {
    return this.http.put<Ex1Product>(`${this.apiUrl}/${product.id}`, product);
  }

  deleteProduct(id: string): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
}
