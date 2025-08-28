import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex3Orderhistorycomp } from './ex3-orderhistorycomp';

describe('Ex3Orderhistorycomp', () => {
  let component: Ex3Orderhistorycomp;
  let fixture: ComponentFixture<Ex3Orderhistorycomp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex3Orderhistorycomp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex3Orderhistorycomp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
