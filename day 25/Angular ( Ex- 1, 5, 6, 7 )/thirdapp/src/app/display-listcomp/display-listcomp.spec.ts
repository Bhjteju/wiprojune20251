import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplayListcomp } from './display-listcomp';

describe('DisplayListcomp', () => {
  let component: DisplayListcomp;
  let fixture: ComponentFixture<DisplayListcomp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [DisplayListcomp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DisplayListcomp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
