import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Checkboxcomp } from './checkboxcomp';

describe('Checkboxcomp', () => {
  let component: Checkboxcomp;
  let fixture: ComponentFixture<Checkboxcomp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Checkboxcomp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Checkboxcomp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
