import { Component,OnInit } from '@angular/core';
import { Iproduct } from '../iproduct';
import { Productservise } from '../productservise';
import { Router, RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-productcomp',
  standalone: true,
  imports: [FormsModule,CommonModule,RouterModule],
  templateUrl: './productcomp.html',
  styleUrl: './productcomp.css'
})
export class Productcomp {
  products : Iproduct[] = [];
  constructor(private productService: Productservise, private router: Router) { }
  ngOnInit(): void {
    this.loadProducts();
  }
  loadProducts(){
    this.productService.getProducts().subscribe(data => this.products = data);
  }
  deleteProduct(id: number) {
    this.productService.deleteProduct(id).subscribe(() => this.loadProducts());
    }
  editProduct(id: number) {
    this.router.navigate(['/products/edit', id]);
  }
}
