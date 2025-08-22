import { Routes,RouterModule } from '@angular/router';
import { NgModule } from '@angular/core';
import { Productcomp } from './productcomp/productcomp';
import { Productformcomp } from './productformcomp/productformcomp';

export const routes: Routes = [
    {path: '', redirectTo: 'products', pathMatch: 'full'},
    {path: 'products', component: Productcomp},
    {path: 'products/new', component: Productformcomp},
    {path: 'products/edit/:id', component: Productformcomp},
];
