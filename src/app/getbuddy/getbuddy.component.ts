import { Component, OnInit } from '@angular/core';
import { AngularFire, AuthProviders, AuthMethods, FirebaseListObservable } from 'angularfire2';

@Component({
  selector: 'app-getbuddy',
  templateUrl: './getbuddy.component.html',
  styleUrls: ['./getbuddy.component.css']
})
export class GetbuddyComponent implements OnInit {
getbuddy:FirebaseListObservable<any[]>;

  constructor(public af: AngularFire) {

  }
  public sex: String ='';
  public age: String ='';
  public expertise: String ='';


  sexfilter(BuddyFindForm)
  {
  this.getbuddy =  this.af.database.list('/buddy/', {
      query: {
          orderByChild: 'Sex',
          equalTo: this.sex,
          limitToFirst: 5
      }
  });

  }

  agefilter(BuddyFindForm)
  {
  this.getbuddy =  this.af.database.list('/buddy/', {
      query: {
          orderByChild: 'Age',
          endAt: this.age,
          limitToFirst: 5
      }
  });

  }

  expfilter(BuddyFindForm)
  {
  this.getbuddy =  this.af.database.list('/buddy/', {
      query: {
          orderByChild: 'Expertise',
          endAt: this.expertise,
          limitToFirst: 5
      }
  });

  }

  ngOnInit() {
  }

}
