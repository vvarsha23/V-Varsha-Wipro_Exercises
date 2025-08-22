import { Component,OnInit } from '@angular/core';
import { Productservise } from '../productservise';
import { HttpClient } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-orderformcomp',
  imports: [FormsModule,CommonModule],
  templateUrl: './orderformcomp.html',
  styleUrl: './orderformcomp.css'
})
export class Orderformcomp implements OnInit{
  products: any[] = [];
  selectedProductId: number = 0;
  selectedProductQty: number = 0;
  purchasedQty: number = 1;
  errorMessage = '';
  constructor(private Productservise: Productservise, private http: HttpClient) { }
  ngOnInit(): void {
    this.Productservise.getProducts().subscribe(data => this.products = data);
  }
  onProductChange() {
    const selected = this.products.find(p => p.id === +this.selectedProductId);
    this.selectedProductQty = selected?.qty || 0;
  }
  placeOrder(){
    if(this.purchasedQty > this.selectedProductQty){
      this.errorMessage = "Insufficient stock available";
      return;
  }
  this.http.post('http://localhost:8080/products/order?productId=${this.selectedProductId}&qty=${this.purchasedQty}', {})
    .subscribe({
      next: () => {
        this.errorMessage = '';
        alert('Order placed successfully');
        this.ngOnInit();
      },
      error: err => {
        this.errorMessage = err.error;
      }
    });

  }
}
