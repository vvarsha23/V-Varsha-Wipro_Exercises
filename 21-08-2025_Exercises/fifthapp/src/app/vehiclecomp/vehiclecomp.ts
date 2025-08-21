import { Component,OnInit } from '@angular/core';
import { Vehicleservice } from '../vehicleservice';
import { Ivehicle } from '../ivehicle';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
@Component({
  selector: 'app-vehiclecomp',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './vehiclecomp.html',
  styleUrl: './vehiclecomp.css'
})
export class Vehiclecomp implements OnInit {
  vehicles: Ivehicle[] = [];
  newVehicle: Ivehicle = { id: 0, make: '', fuelType: '', model: '', price: 0 };
  isEditing: boolean = false;

  constructor(private vehicleService: Vehicleservice) { }
  ngOnInit(): void {
    this.loadVehicles();
  }
  loadVehicles(): void {
    this.vehicleService.getVehicles().subscribe(data => {
      this.vehicles = data;
    });
  }
  addVehicle(): void {
    this.vehicleService.addVehicle(this.newVehicle).subscribe(() => {
      this.loadVehicles();
      this.newVehicle = { id: 0, make: '', fuelType: '', model: '', price: 0 };
    });
  }
  editVehicle(vehicle: Ivehicle): void {
    this.newVehicle = { ...vehicle };
    this.isEditing = true;
  }
  updateVehicle(): void {
    this.vehicleService.updateVehicle(this.newVehicle).subscribe(() => {
      this.loadVehicles();
      this.newVehicle = { id: 0, make: '', fuelType: '', model: '', price: 0 };
      this.isEditing = false;
    });
  }
  deleteVehicle(id: number): void {
    this.vehicleService.deleteVehicle(id).subscribe(() => {
      this.loadVehicles();
    });
  }
  cancelEdit(): void {
    this.newVehicle = { id: 0, make: '', fuelType: '', model: '', price: 0 };
    this.isEditing = false;
  }

}
