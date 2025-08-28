import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex1Productedit } from './ex1-productedit';

describe('Ex1Productedit', () => {
  let component: Ex1Productedit;
  let fixture: ComponentFixture<Ex1Productedit>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex1Productedit]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex1Productedit);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
