import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildrenfacComponent } from './childrenfac.component';

describe('ChildrenfacComponent', () => {
  let component: ChildrenfacComponent;
  let fixture: ComponentFixture<ChildrenfacComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChildrenfacComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChildrenfacComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
