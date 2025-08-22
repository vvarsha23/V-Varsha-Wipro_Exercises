import { Component,OnInit } from '@angular/core';
import { Iproduct } from '../iproduct';
import { Productservise } from '../productservise';
import { ActivatedRoute,Router, RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-productformcomp',
  imports: [FormsModule,CommonModule,RouterModule],
  templateUrl: './productformcomp.html',
  styleUrl: './productformcomp.css'
})
export class Productformcomp implements OnInit {
  product: Iproduct = { id: 0, name: '', category: '', price: 0 , qty: 0};
  isEdit = false;

  constructor(private productService: Productservise, private route: ActivatedRoute, private router: Router) { }
  ngOnInit(): void {
    const id = this.route.snapshot.paramMap.get('id');
    if (id) {
      this.isEdit = true;
      this.productService.getProductById(+id).subscribe(data => {
        this.product = data;
      });
    }

  }
  saveProduct() {
    if (this.isEdit) {
      this.productService.updateProduct(this.product.id, this.product).subscribe(() => {
        this.router.navigate(['/products']);
      });
    } else {
      this.productService.createProduct(this.product).subscribe(() => {
        this.router.navigate(['/products']);
      });
    }
  }

}
