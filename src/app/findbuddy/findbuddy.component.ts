import { Component, OnInit } from '@angular/core';
import { AngularFire, AuthProviders, AuthMethods, FirebaseListObservable } from 'angularfire2';

@Component({
  selector: 'app-findbuddy',
  templateUrl: './findbuddy.component.html',
  styleUrls: ['./findbuddy.component.css']
})
export class FindbuddyComponent implements OnInit {
   getbuddy:FirebaseListObservable<any[]>;

  constructor(af: AngularFire) {
  this.getbuddy =  af.database.list("/buddy/+${buddy.uid}", {query: {orderByChild : "Sex", equalTo:'W'}});

}









  ngOnInit() {
  }


}
