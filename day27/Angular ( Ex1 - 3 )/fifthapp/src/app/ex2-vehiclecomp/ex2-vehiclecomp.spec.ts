import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex2Vehiclecomp } from './ex2-vehiclecomp';

describe('Ex2Vehiclecomp', () => {
  let component: Ex2Vehiclecomp;
  let fixture: ComponentFixture<Ex2Vehiclecomp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex2Vehiclecomp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex2Vehiclecomp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
