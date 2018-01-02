import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GensportsComponent } from './gensports.component';

describe('GensportsComponent', () => {
  let component: GensportsComponent;
  let fixture: ComponentFixture<GensportsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GensportsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GensportsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
