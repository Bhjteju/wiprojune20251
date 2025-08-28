import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
// import { App } from './app/app';
// import { Listcomp } from './app/listcomp/listcomp';
import { Checkboxcomp } from './app/checkboxcomp/checkboxcomp';

bootstrapApplication(Checkboxcomp, appConfig)
  .catch((err) => console.error(err));
