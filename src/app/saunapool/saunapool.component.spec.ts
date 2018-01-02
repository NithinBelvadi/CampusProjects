import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SaunapoolComponent } from './saunapool.component';

describe('SaunapoolComponent', () => {
  let component: SaunapoolComponent;
  let fixture: ComponentFixture<SaunapoolComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SaunapoolComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SaunapoolComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
