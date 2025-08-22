import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Productformcomp } from './productformcomp';

describe('Productformcomp', () => {
  let component: Productformcomp;
  let fixture: ComponentFixture<Productformcomp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Productformcomp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Productformcomp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
