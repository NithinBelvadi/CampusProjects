import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FindbuddyComponent } from './findbuddy.component';

describe('FindbuddyComponent', () => {
  let component: FindbuddyComponent;
  let fixture: ComponentFixture<FindbuddyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FindbuddyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FindbuddyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
