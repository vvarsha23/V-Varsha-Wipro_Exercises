import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import { Ex8home } from './app/ex8home/ex8home';

bootstrapApplication(Ex8home, appConfig)
  .catch((err) => console.error(err));
