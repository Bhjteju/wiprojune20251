import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { Ex2Vehicle } from '../ex2-vehicle';
import { Ex2Vehicleservice } from '../ex2-vehicleservice';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-ex2-vehiclecomp',
  imports: [CommonModule, FormsModule],
  templateUrl: './ex2-vehiclecomp.html',
  styleUrl: './ex2-vehiclecomp.css'
})
export class Ex2Vehiclecomp implements OnInit{

//>>>>>>>>>>>>>>>>>>>>>>>>>>>> Ex-2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
  // vehicles: Ex2Vehicle[] = [];

  // constructor(private vehicleService: Ex2Vehicleservice, private cdr: ChangeDetectorRef) {}

  // ngOnInit(): void {
  //   this.vehicleService.getVehicles().subscribe(data => {
  //     console.log('Fetched vehicles:', data); 
  //     this.vehicles = data;
  //     this.cdr.detectChanges(); 
  //   });
  // }


//>>>>>>>>>>>>>>>>>>>>>>>>>>>> Ex-3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
vehicles: Ex2Vehicle[] = [];

  vehicleAdd: Ex2Vehicle = { id: 0, make: '', model: '', fuelType: '', price: 0 };
  vehicleEdit: Ex2Vehicle | null = null; 

  constructor(
    private vehicleService: Ex2Vehicleservice,
    private cdr: ChangeDetectorRef
  ) {}

  ngOnInit() {
    this.loadVehicles();
  }

  loadVehicles() {
    this.vehicleService.getVehicles().subscribe(data => {
      this.vehicles = data;
      this.cdr.detectChanges(); 
    });
  }

  edit(vehicleId: number) {
    this.vehicleService.getVehicleById(vehicleId).subscribe(vehicle => {
      this.vehicleEdit = { ...vehicle };
      console.log('Editing vehicle:', this.vehicleEdit);
      this.cdr.detectChanges(); 
    });
  }

  update() {
    if (!this.vehicleEdit) return;

    this.vehicleService.updateVehicle(this.vehicleEdit).subscribe(updatedVehicle => {
      const index = this.vehicles.findIndex(v => v.id === updatedVehicle.id);
      if (index !== -1) this.vehicles[index] = updatedVehicle;

      this.vehicleEdit = null; 
      this.cdr.detectChanges(); 
    });
  }

  delete(vehicleId: number) {
    if (!confirm('Are you sure?')) return;

    this.vehicleService.deleteVehicle(vehicleId).subscribe(() => {
      this.vehicles = this.vehicles.filter(v => v.id !== vehicleId);
      this.cdr.detectChanges(); 
    });
  }

  save() {
    const vehicleToAdd: any = { ...this.vehicleAdd };
    delete vehicleToAdd.id; 

    this.vehicleService.addVehicle(vehicleToAdd).subscribe(newVehicle => {
      this.vehicles.push(newVehicle);
      this.vehicleAdd = { id: 0, make: '', model: '', fuelType: '', price: 0 };
      this.cdr.detectChanges(); 
    });
  }

}
