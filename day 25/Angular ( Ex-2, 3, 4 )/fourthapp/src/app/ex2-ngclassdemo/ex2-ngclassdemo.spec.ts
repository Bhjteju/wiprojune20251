import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex2Ngclassdemo } from './ex2-ngclassdemo';

describe('Ex2Ngclassdemo', () => {
  let component: Ex2Ngclassdemo;
  let fixture: ComponentFixture<Ex2Ngclassdemo>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex2Ngclassdemo]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex2Ngclassdemo);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
