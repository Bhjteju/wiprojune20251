import { TestBed } from '@angular/core/testing';

import { Ex1Productservice } from './ex1-productservice';

describe('Ex1Productservice', () => {
  let service: Ex1Productservice;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Ex1Productservice);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
