import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GetbuddyComponent } from './getbuddy.component';

describe('GetbuddyComponent', () => {
  let component: GetbuddyComponent;
  let fixture: ComponentFixture<GetbuddyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GetbuddyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GetbuddyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
