import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { Ex2Ngclassdemo } from './app/ex2-ngclassdemo/ex2-ngclassdemo';
// import { App } from './app/app';

bootstrapApplication(Ex2Ngclassdemo, appConfig)
  .catch((err) => console.error(err));
