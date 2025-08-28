import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex8Tasklistcomponent } from './ex8-tasklistcomponent';

describe('Ex8Tasklistcomponent', () => {
  let component: Ex8Tasklistcomponent;
  let fixture: ComponentFixture<Ex8Tasklistcomponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex8Tasklistcomponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex8Tasklistcomponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
