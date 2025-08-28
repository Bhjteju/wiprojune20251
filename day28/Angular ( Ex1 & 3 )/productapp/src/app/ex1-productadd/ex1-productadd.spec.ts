import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex1Productadd } from './ex1-productadd';

describe('Ex1Productadd', () => {
  let component: Ex1Productadd;
  let fixture: ComponentFixture<Ex1Productadd>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex1Productadd]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex1Productadd);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
