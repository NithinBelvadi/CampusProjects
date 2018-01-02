import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CardiofitComponent } from './cardiofit.component';

describe('CardiofitComponent', () => {
  let component: CardiofitComponent;
  let fixture: ComponentFixture<CardiofitComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CardiofitComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CardiofitComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
