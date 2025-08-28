import { Component, Input } from '@angular/core';
import { DisplayListcomp } from '../display-listcomp/display-listcomp';
import { CommonModule } from '@angular/common';
import { Iproduct } from '../iproduct';


@Component({
  selector: 'app-homecomp',
  standalone: true, 
  imports: [CommonModule, DisplayListcomp],
  templateUrl: './homecomp.html',
  styleUrls: ['./homecomp.css']  
})
export class Homecomp { 

 fruits : Iproduct[] = [
    {
      name: 'Apple',
      description: 'Crisp, juicy, and deliciously sweet – the perfect snack for any time!',
      image: 'https://www.gardenplantsonline.co.uk/wp-content/uploads/2024/09/73114-5.jpg'
    },
    {
      name: 'Banana',
      description: 'Soft, creamy, and full of natural energy – a tasty and healthy treat!',
      image: 'https://m.media-amazon.com/images/I/51W9iO9AwhL._UF1000,1000_QL80_.jpg'
    },
    {
      name: 'Orange',
      description: 'Bright, zesty, and packed with vitamin C – a citrus delight!',
      image: 'https://img.freepik.com/premium-photo/orange-fruits-with-leaf-wooden-nature-background-fresh-orange-with-leaves-healthy-fruits_73523-5205.jpg'
    },
    {
      name: 'Pineapple',
      description: 'Tropical, tangy, and sweet – a burst of sunshine in every bite!',
      image: 'https://media.istockphoto.com/id/524687723/photo/pineapple-plant.jpg?s=612x612&w=0&k=20&c=kQuadcsV_6L4qGSkIWSRIa5xvrc_RuolV_94WSMbOl0='
    },
    {
      name: 'Pomegranate',
      description: 'Rich, ruby-red seeds bursting with flavor and antioxidants!',
      image: 'https://cdn.mos.cms.futurecdn.net/qr7xkgk55kk3fiapx89D9i.jpg'
    },

    {
      name: 'Grapes',
      description: 'Juicy, sweet, and bursting with flavor – grapes make the perfect bite-sized snack for any occasion!”',
      image: 'https://thumbs.dreamstime.com/b/red-grapes-vine-vinyard-generative-ai-design-background-instagram-facebook-wall-painting-image-photo-wallpaper-325271071.jpg'
    }
  ];


  handleRemoveFruit(fruit: Iproduct) {
    console.log(`Removed fruit: ${fruit.name}`);
    this.fruits = this.fruits.filter(f => f !== fruit);
  }
}
