import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Taskcomponent } from './taskcomponent';

describe('Taskcomponent', () => {
  let component: Taskcomponent;
  let fixture: ComponentFixture<Taskcomponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Taskcomponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Taskcomponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
