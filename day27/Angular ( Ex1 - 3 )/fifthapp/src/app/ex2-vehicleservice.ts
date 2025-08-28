import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Ex2Vehicle } from './ex2-vehicle';

@Injectable({
  providedIn: 'root'
})
export class Ex2Vehicleservice {

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Ex-2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  
  // private apiUrl = 'http://localhost:3000/vehicles';

  // constructor(private http: HttpClient) {}

  // getVehicles(): Observable<Ex2Vehicle[]> {
  //   return this.http.get<Ex2Vehicle[]>(this.apiUrl);
  // }


//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Ex-3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  
  private apiUrl = 'http://localhost:3000/vehicles';

constructor(private http: HttpClient) {}


getVehicles(): Observable<Ex2Vehicle[]> {
  return this.http.get<Ex2Vehicle[]>(this.apiUrl);
}


getVehicleById(id: number): Observable<Ex2Vehicle> {
  return this.http.get<Ex2Vehicle>(`${this.apiUrl}/${id}`);
}

addVehicle(vehicle: Partial<Ex2Vehicle>): Observable<Ex2Vehicle> {
  return this.http.post<Ex2Vehicle>(this.apiUrl, vehicle);
}


updateVehicle(vehicle: Ex2Vehicle): Observable<Ex2Vehicle> {
  return this.http.put<Ex2Vehicle>(`${this.apiUrl}/${vehicle.id}`, vehicle);
}

deleteVehicle(id: number): Observable<void> {
  return this.http.delete<void>(`${this.apiUrl}/${id}`);
}

}
