import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GencoursesComponent } from './gencourses.component';

describe('GencoursesComponent', () => {
  let component: GencoursesComponent;
  let fixture: ComponentFixture<GencoursesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GencoursesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GencoursesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
