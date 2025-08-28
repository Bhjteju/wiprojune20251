import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { Homecomp } from './app/homecomp/homecomp';
// import { App } from './app/app';

bootstrapApplication(Homecomp, appConfig)
  .catch((err) => console.error(err));
