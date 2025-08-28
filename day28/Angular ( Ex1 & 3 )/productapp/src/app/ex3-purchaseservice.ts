import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Ex3Order } from './ex3-order';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class Ex3Purchaseservice {

  private baseUrl = 'http://localhost:9000/orders';

  constructor(private http: HttpClient) {}

  placeOrder(productId: string, qty: number): Observable<Ex3Order> {
  return this.http.post<Ex3Order>(`http://localhost:9000/orders/${productId}/${qty}`, {});
}


  getOrders(): Observable<Ex3Order[]> {
    return this.http.get<Ex3Order[]>(this.baseUrl);
  }
  
}
