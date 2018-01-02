import { Component, OnInit } from '@angular/core';
import { AngularFire, AuthProviders, AuthMethods,  } from 'angularfire2';
import { Router } from '@angular/router';

@Component({
  selector: 'app-becomebuddy',
  templateUrl: './becomebuddy.component.html',
  styleUrls: ['./becomebuddy.component.css']
})
export class BecomebuddyComponent implements OnInit {

  constructor(public af: AngularFire, private router: Router) { }


  onSubmit(BuddyForm) {
    if(BuddyForm.valid) {
      console.log(BuddyForm.value);
      var newPostKey = firebase.database().ref().child('buddy').push().key;
      return this.af.database.object(`/buddy/`+ newPostKey ).update({
          firstName: BuddyForm.value.first_name,
          lastName: BuddyForm.value.last_name,
          Sport: BuddyForm.value.sport_selected,
          Sex: BuddyForm.value.sex,
          Expertise: BuddyForm.value.expertise,
          Age: BuddyForm.value.age,
          Status: BuddyForm.value.status,
          Email: BuddyForm.value.email,
          Description: BuddyForm.value.desc,

      }).then(
        (success) => {
        console.log(success);
        this.router.navigate(['home'])
      });
    }
  }


  ngOnInit() {
  }

}
