import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex1Productdelete } from './ex1-productdelete';

describe('Ex1Productdelete', () => {
  let component: Ex1Productdelete;
  let fixture: ComponentFixture<Ex1Productdelete>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex1Productdelete]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex1Productdelete);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
