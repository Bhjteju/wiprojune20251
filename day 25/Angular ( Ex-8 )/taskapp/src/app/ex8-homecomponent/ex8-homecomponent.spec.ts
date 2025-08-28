import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex8Homecomponent } from './ex8-homecomponent';

describe('Ex8Homecomponent', () => {
  let component: Ex8Homecomponent;
  let fixture: ComponentFixture<Ex8Homecomponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex8Homecomponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex8Homecomponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
