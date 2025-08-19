import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex1Displaylist } from './ex1-displaylist';

describe('Ex1Displaylist', () => {
  let component: Ex1Displaylist;
  let fixture: ComponentFixture<Ex1Displaylist>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex1Displaylist]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex1Displaylist);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
