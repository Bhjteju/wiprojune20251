import { Component, Input, Output, EventEmitter } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Iproduct } from '../iproduct';

@Component({
  selector: 'app-display-listcomp',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './display-listcomp.html',
  styleUrls: ['./display-listcomp.css']  
})
export class DisplayListcomp {

  @Input() fruit!: Iproduct;

  @Output() remove = new EventEmitter<Iproduct>();

  onRemove() {
    console.log("Remove clicked: " + this.fruit.name);
    this.remove.emit(this.fruit); 
  }

  //  fruits = [
  //   {
  //     name: 'Apple',
  //     description: 'Crisp, juicy, and deliciously sweet – the perfect snack for any time!',
  //     image: 'https://static.vecteezy.com/system/resources/thumbnails/016/940/260/small/apple-fruit-isolated-on-white-background-photo.jpg'
  //   },
  //   {
  //     name: 'Banana',
  //     description: 'Soft, creamy, and full of natural energy – a tasty and healthy treat!',
  //     image: 'https://m.media-amazon.com/images/I/51W9iO9AwhL._UF1000,1000_QL80_.jpg'
  //   },
  //   {
  //     name: 'Orange',
  //     description: 'Bright, zesty, and packed with vitamin C – a citrus delight!',
  //     image: 'https://png.pngtree.com/png-clipart/20220615/ourmid/pngtree-hand-drawn-delicious-orange-fruit-clipart-in-psd-and-png-png-image_5087882.png'
  //   },
  //   {
  //     name: 'Pineapple',
  //     description: 'Tropical, tangy, and sweet – a burst of sunshine in every bite!',
  //     image: 'https://media.istockphoto.com/id/524687723/photo/pineapple-plant.jpg?s=612x612&w=0&k=20&c=kQuadcsV_6L4qGSkIWSRIa5xvrc_RuolV_94WSMbOl0='
  //   },
  //   {
  //     name: 'Pomegranate',
  //     description: 'Rich, ruby-red seeds bursting with flavor and antioxidants!',
  //     image: 'https://cdn.mos.cms.futurecdn.net/qr7xkgk55kk3fiapx89D9i.jpg'
  //   }
  // ];

}
