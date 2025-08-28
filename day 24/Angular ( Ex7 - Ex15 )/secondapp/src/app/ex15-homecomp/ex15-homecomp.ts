import { Component } from '@angular/core';
import { Ex15Bookcomp } from '../ex15-bookcomp/ex15-bookcomp';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-ex15-homecomp',
  imports: [Ex15Bookcomp, CommonModule],
  templateUrl: './ex15-homecomp.html',
  styleUrl: './ex15-homecomp.css'
})
export class Ex15Homecomp {

// books1 = Array.from({ length: 20 }).map(() => ({
//     title: `100 Success Lessons from Warren Buffett`,
//     description: `Investment Secret Principles of Warren Buffett (A Guide to Building Wealth: Warren Buffett Investment Strategy Book)`,
//     image: "https://m.media-amazon.com/images/I/71Ja3FZ84wL._SY342_.jpg"
//   }));

  books = [
    {
      title: "100 Success Lessons from Warren Buffett",
      description: "Investment Secret Principles of Warren Buffett (A Guide to Building Wealth: Warren Buffett Investment Strategy Book)",
      image: "https://m.media-amazon.com/images/I/71Ja3FZ84wL._SY342_.jpg"
    },
    {
      title: "The Psychology of Money",
      description: "How to manage money, invest it, and make business decisions are typically considered to involve a lot of mathematical calculations...",
      image: "https://m.media-amazon.com/images/I/715ucF1cMZS._SY466_.jpg"
    },
    {
      title: "Confessions Of Stock Market Wizards",
      description: "Safir Anand gets India's top investors and stock market legends to share their wisdom.",
      image: "https://m.media-amazon.com/images/I/81sjAR1wxIL._SY466_.jpg"
    },
    {
      title: "The Power of Your Subconscious Mind",
      description: "Dr. Joseph Murphy’s classic book on unlocking the power of your subconscious.",
      image: "https://m.media-amazon.com/images/I/41f1KlSQqNL._SX342_SY445_.jpg"
    },
    {
      title: "You Can",
      description: "“You yourself determine the height to which you shall climb. Have you the summit in view?”.",
      image: "https://m.media-amazon.com/images/I/514fD3oqIFL._SX342_SY445_.jpg"
    },
    {
      title: "Rich Dad Poor Dad",
      description: "Robert Kiyosaki’s best-selling book on personal finance and investing.",
      image: "https://m.media-amazon.com/images/I/81bsw6fnUiL._SY466_.jpg"
    },
    {
      title: "Atomic Habits",
      description: "James Clear explains how small changes lead to remarkable results.",
      image: "https://m.media-amazon.com/images/I/91bYsX41DVL._SY466_.jpg"
    },
    {
      title: "Think and Grow Rich",
      description: "Napoleon Hill’s timeless classic on building wealth and success.",
      image: "https://m.media-amazon.com/images/I/71UypkUjStL._SY466_.jpg"
    },
    {
      title: "Ikigai",
      description: "The Japanese secret to a long and happy life.",
      image: "https://m.media-amazon.com/images/I/81l3rZK4lnL._SY466_.jpg"
    },
    {
      title: "The Intelligent Investor",
      description: "Benjamin Graham’s legendary book on value investing.",
      image: "https://m.media-amazon.com/images/I/417z5-8gRjL._SY445_SX342_.jpg"
    },
    {
      title: "Deep Work",
      description: "Cal Newport shows how to focus without distraction.",
      image: "https://m.media-amazon.com/images/I/41G4-FBs1YS._SY445_SX342_.jpg"
    },
    {
      title: "Can't Hurt Me",
      description: "David Goggins’ story of overcoming obstacles through mental toughness.",
      image: "https://m.media-amazon.com/images/I/51TNypSYkoL._SY445_SX342_QL70_FMwebp_.jpg"
    },
    {
      title: "Zero to One",
      description: "Peter Thiel on startups and building the future.",
      image: "https://m.media-amazon.com/images/I/71m-MxdJ2WL._SY466_.jpg"
    },
    {
      title: "Start with Why",
      description: "Simon Sinek explains how great leaders inspire action.",
      image: "https://m.media-amazon.com/images/I/41l817g1yFL._SY445_SX342_QL70_FMwebp_.jpg"
    },
    {
      title: "The 5 AM Club",
      description: "Robin Sharma’s guide to owning your mornings and life.",
      image: "https://m.media-amazon.com/images/I/41gSraGHXUL._SY445_SX342_QL70_FMwebp_.jpg"
    },
    {
      title: "Dare to Lead",
      description: "Brené Brown teaches courage and leadership skills.",
      image: "https://m.media-amazon.com/images/I/51-cXlWjiiL.jpg"
    },
    {
      title: "The Alchemist",
      description: "Paulo Coelho’s inspiring novel about following your dreams.",
      image: "https://m.media-amazon.com/images/I/71aFt4+OTOL._SY466_.jpg"
    },
    {
      title: "Wings of Fire",
      description: "Autobiography of Dr. A.P.J. Abdul Kalam, former President of India.",
      image: "https://m.media-amazon.com/images/I/51rzYRCPppL._SY445_SX342_QL70_FMwebp_.jpg"
    },
    {
      title: "Sapiens",
      description: "Yuval Noah Harari’s history of humankind.",
      image: "https://m.media-amazon.com/images/I/713jIoMO3UL._SY466_.jpg"
    },
    {
      title: "Elon Musk",
      description: "Biography of Elon Musk by Ashlee Vance.",
      image: "https://m.media-amazon.com/images/I/51e-uVPtr5L._SY445_SX342_QL70_FMwebp_.jpg"
    }
  ];


}

