import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule} from '@angular/http';
import { RouterModule} from '@angular/router';
import { AppComponent } from './app.component';
import { RedmineElasticsearchComponent } from './redmine-elasticsearch/redmine-elasticsearch.component';

@NgModule({
  declarations: [
    AppComponent,
    RedmineElasticsearchComponent,
  ],
  imports: [
    BrowserModule,
    HttpModule,
    RouterModule.forRoot([
      {
        path: 'redmine',
        component: RedmineElasticsearchComponent
      }
    ]),
  ],
  
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
