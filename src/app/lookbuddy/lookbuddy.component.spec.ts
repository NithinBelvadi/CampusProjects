import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LookbuddyComponent } from './lookbuddy.component';

describe('LookbuddyComponent', () => {
  let component: LookbuddyComponent;
  let fixture: ComponentFixture<LookbuddyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LookbuddyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LookbuddyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
