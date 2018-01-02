import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AngularFireModule } from 'angularfire2';
import {RouterModule, Routes} from "@angular/router";
import { FormsModule } from '@angular/forms';
import {MdTabsModule} from '@angular/material';

import { AppComponent } from './app.component';
import { SignupComponent } from './signup/signup.component';
import { HomeComponent } from './home/home.component';
import { MyaccountComponent } from './myaccount/myaccount.component';
import { FindbuddyComponent } from './findbuddy/findbuddy.component';
import { BecomebuddyComponent } from './becomebuddy/becomebuddy.component';
import { LookbuddyComponent } from './lookbuddy/lookbuddy.component';
import { CardiofitComponent } from './cardiofit/cardiofit.component';
import { SaunapoolComponent } from './saunapool/saunapool.component';
import { ChildrenfacComponent } from './childrenfac/childrenfac.component';
import { SportsfacComponent } from './sportsfac/sportsfac.component';
import { GetbuddyComponent } from './getbuddy/getbuddy.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { MembershipComponent } from './membership/membership.component';
import { GencoursesComponent } from './gencourses/gencourses.component';
import { GeneventsComponent } from './genevents/genevents.component';
import { GensportsComponent } from './gensports/gensports.component';

export const firebaseConfig = {
  apiKey: "AIzaSyAVKnxYJjvQvTQKnbx8Q2ZYgm7eRVVkGHU",
  authDomain: "campussport-65ef3.firebaseapp.com",
  databaseURL: "https://campussport-65ef3.firebaseio.com",
  projectId: "campussport-65ef3",
  storageBucket: "campussport-65ef3.appspot.com",
  messagingSenderId: "369914576594"
};

const routes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  { path: 'signup', component: SignupComponent },
  { path: 'home', component: HomeComponent },
  { path: 'myaccount', component: MyaccountComponent },
  { path: 'getbuddy', component: GetbuddyComponent },
  { path: 'becomebuddy', component: BecomebuddyComponent },
  { path: 'cardiofitness', component: CardiofitComponent},
  { path: 'childrenfac', component: ChildrenfacComponent },
  { path: 'saunapool', component: SaunapoolComponent },
  { path: 'sportsfac', component: SportsfacComponent },
  { path: 'aboutus', component: AboutusComponent },
  { path: 'membership', component: MembershipComponent },
  { path: 'gencourses', component: GencoursesComponent },
  { path: 'genevents', component: GeneventsComponent },
  { path: 'gensports', component: GensportsComponent },



];




@NgModule({
  declarations: [
    AppComponent,
    SignupComponent,
    HomeComponent,
    MyaccountComponent,
    FindbuddyComponent,
    BecomebuddyComponent,
    LookbuddyComponent,
    CardiofitComponent,
    SaunapoolComponent,
    ChildrenfacComponent,
    SportsfacComponent,
    GetbuddyComponent,
    AboutusComponent,
    MembershipComponent,
    GencoursesComponent,
    GeneventsComponent,
    GensportsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AngularFireModule.initializeApp(firebaseConfig),
    RouterModule.forRoot(routes)

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
