import { RouterModule, Routes } from '@angular/router';
import { Ex1Productlist } from './ex1-productlist/ex1-productlist';
import { Ex1Productadd } from './ex1-productadd/ex1-productadd';
import { NgModule } from '@angular/core';
import { Ex1Productedit } from './ex1-productedit/ex1-productedit';
import { Ex1Productdelete } from './ex1-productdelete/ex1-productdelete';
import { Ex3Purchagecomp } from './ex3-purchagecomp/ex3-purchagecomp';
import { Ex3Orderhistorycomp } from './ex3-orderhistorycomp/ex3-orderhistorycomp';

export const routes: Routes = [
  { path: '', redirectTo: 'product-list', pathMatch: 'full' },
  { path: 'product-list', component: Ex1Productlist },
  { path: 'product-add', component: Ex1Productadd },
  { path: 'product-edit/:id', component: Ex1Productedit },
  { path: 'product-delete/:id', component: Ex1Productdelete },
  { path: 'place-order', component: Ex3Purchagecomp },
  { path: 'order-history', component: Ex3Orderhistorycomp }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
