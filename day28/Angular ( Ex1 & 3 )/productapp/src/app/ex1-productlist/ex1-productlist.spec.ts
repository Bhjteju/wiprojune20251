import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex1Productlist } from './ex1-productlist';

describe('Ex1Productlist', () => {
  let component: Ex1Productlist;
  let fixture: ComponentFixture<Ex1Productlist>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex1Productlist]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex1Productlist);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
