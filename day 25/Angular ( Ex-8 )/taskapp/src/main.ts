import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
// import { App } from './app/app';
import { Ex8Homecomponent } from './app/ex8-homecomponent/ex8-homecomponent';

bootstrapApplication(Ex8Homecomponent, appConfig)
  .catch((err) => console.error(err));
