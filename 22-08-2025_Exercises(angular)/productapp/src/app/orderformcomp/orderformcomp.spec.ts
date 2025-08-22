import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Orderformcomp } from './orderformcomp';

describe('Orderformcomp', () => {
  let component: Orderformcomp;
  let fixture: ComponentFixture<Orderformcomp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Orderformcomp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Orderformcomp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
