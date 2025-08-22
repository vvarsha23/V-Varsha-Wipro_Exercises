import { Component,OnInit } from '@angular/core';
import { Productservise } from '../productservise';
import { HttpClient } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-orderhistorycomp',
  imports: [FormsModule,CommonModule],
  templateUrl: './orderhistorycomp.html',
  styleUrl: './orderhistorycomp.css'
})
export class Orderhistorycomp implements OnInit{
  orders: any[] = [];
  constructor(private http: HttpClient) { }
  ngOnInit(): void {
    this.http.get<any[]>('http://localhost:8080/products/orders')
      .subscribe(data => this.orders = data);
  }

}
