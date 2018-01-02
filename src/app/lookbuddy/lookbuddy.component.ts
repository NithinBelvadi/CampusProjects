import { Component, OnInit } from '@angular/core';
import { AngularFire, AuthProviders, AuthMethods, FirebaseListObservable } from 'angularfire2';

@Component({
  selector: 'app-lookbuddy',
  templateUrl: './lookbuddy.component.html',
  styleUrls: ['./lookbuddy.component.css']
})
export class LookbuddyComponent implements OnInit {
public af:AngularFire;
getbuddy:FirebaseListObservable<any[]>;


constructor(af: AngularFire) {

this.getbuddy =  this.af.database.list('/buddy/', {
    query: {
        orderByChild: 'Sex',
        equalTo: 'W'
    }
});
}

sexfilter()
{

}





  ngOnInit() {

  }

}
