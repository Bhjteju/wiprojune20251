import { TestBed } from '@angular/core/testing';

import { Ex2Vehicleservice } from './ex2-vehicleservice';

describe('Ex2Vehicleservice', () => {
  let service: Ex2Vehicleservice;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Ex2Vehicleservice);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
