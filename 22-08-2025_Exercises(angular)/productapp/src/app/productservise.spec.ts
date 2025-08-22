import { TestBed } from '@angular/core/testing';

import { Productservise } from './productservise';

describe('Productservise', () => {
  let service: Productservise;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Productservise);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
