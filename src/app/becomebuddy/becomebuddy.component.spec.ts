import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BecomebuddyComponent } from './becomebuddy.component';

describe('BecomebuddyComponent', () => {
  let component: BecomebuddyComponent;
  let fixture: ComponentFixture<BecomebuddyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BecomebuddyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BecomebuddyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
