import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SportsfacComponent } from './sportsfac.component';

describe('SportsfacComponent', () => {
  let component: SportsfacComponent;
  let fixture: ComponentFixture<SportsfacComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SportsfacComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SportsfacComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
