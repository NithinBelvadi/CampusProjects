import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GeneventsComponent } from './genevents.component';

describe('GeneventsComponent', () => {
  let component: GeneventsComponent;
  let fixture: ComponentFixture<GeneventsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GeneventsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GeneventsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
