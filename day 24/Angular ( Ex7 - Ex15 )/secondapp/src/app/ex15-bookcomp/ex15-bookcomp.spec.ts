import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex15Bookcomp } from './ex15-bookcomp';

describe('Ex16Bookcomp', () => {
  let component: Ex15Bookcomp;
  let fixture: ComponentFixture<Ex15Bookcomp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex15Bookcomp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex15Bookcomp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
