import { TestBed } from '@angular/core/testing';

import { Ex3Purchaseservice } from './ex3-purchaseservice';

describe('Ex3Purchaseservice', () => {
  let service: Ex3Purchaseservice;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Ex3Purchaseservice);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
