import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex3Purchagecomp } from './ex3-purchagecomp';

describe('Ex3Purchagecomp', () => {
  let component: Ex3Purchagecomp;
  let fixture: ComponentFixture<Ex3Purchagecomp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex3Purchagecomp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex3Purchagecomp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
