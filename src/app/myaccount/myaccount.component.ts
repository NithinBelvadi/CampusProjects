import { Component, OnInit } from '@angular/core';
import { AngularFire, AuthProviders, AuthMethods, FirebaseListObservable } from 'angularfire2';
import {MdTabsModule} from '@angular/material';
import { Router } from '@angular/router';


@Component({
  selector: 'app-myaccount',
  templateUrl: './myaccount.component.html',
  styleUrls: ['./myaccount.component.css']
})
export class MyaccountComponent implements OnInit {

courses: FirebaseListObservable<any[]>;
user: FirebaseListObservable<any[]>;
public newcourse: String ='';
public regevent: String ='';
public courseinfo: String ='';
allcourses: FirebaseListObservable<any[]>;
public memtype: String ='';
showmemtype: FirebaseListObservable<any[]>;
myevents: FirebaseListObservable<any[]>;

constructor(public af: AngularFire, private router: Router) {

var userId = firebase.auth().currentUser.uid;
this.courses = af.database.list('/users/'+ userId+'/Courses');
this.user = af.database.list('/users/'+ userId);
this.allcourses = af.database.list('/Courses/');
this.showmemtype = af.database.list('/users/'+ userId+'/Membership');
this.myevents = af.database.list('/users/'+ userId+'/Events');
}

changemem()
{
var userIda = firebase.auth().currentUser.uid;
return firebase.database().ref('/users/'+ userIda +'/Membership').update({
    'Member_type':this.memtype

});
}

eventupdate()
{
var userIda = firebase.auth().currentUser.uid;
return firebase.database().ref('/users/'+ userIda +'/Events').update({
    'Event_name':this.regevent

});
}

regmara()
{
var userIda = firebase.auth().currentUser.uid;
return firebase.database().ref('/users/'+ userIda +'/Events').update({
    '10K Marathon - HD-Mannheim':'18 Jun; 12:30pm; Start Point: BismarckPlatz'
});
}



regzumba()
{
var userIda = firebase.auth().currentUser.uid;
return firebase.database().ref('/users/'+ userIda +'/Courses').update({
    'Zumba for Everyone':'13th July - 30th Aug; Tue,Sat,Fri; 18:00-20:00'
});
}

regsalsa()
{
var userIda = firebase.auth().currentUser.uid;
return firebase.database().ref('/users/'+ userIda +'/Courses').update({
    'Salsa for Beginners':'20th May - 4th Aug; Fri, Sat, Sun; 16:30-20:00'
});
}

regballdance()
{
var userIda = firebase.auth().currentUser.uid;
return firebase.database().ref('/users/'+ userIda +'/Courses').update({
    'Professional BallRoom Dancing':'8th Sept - 16th Nov; Fri, Sat, Sun; 20:00-22:30'
});
}

regyogboot()
{
var userIda = firebase.auth().currentUser.uid;
return firebase.database().ref('/users/'+ userIda +'/Courses').update({
    'Yoga Booty Balley':'22nd Jul - 26th Aug; mon, Fri, Sat; 16:30-20:30'
});
}

regthaibo()
{
var userIda = firebase.auth().currentUser.uid;
return firebase.database().ref('/users/'+ userIda +'/Courses').update({
    'Thai Bo for Beginners':'15th Jul - 26th Aug; mon, Fri, Sat; 16:30-20:00'
});
}

changeMemType()
{
var userIda = firebase.auth().currentUser.uid;
return firebase.database().ref('/users/'+ userIda +'/Membership').update({
    'Member_Type': this.memtype
});
}

savecourse()
{
var userId = firebase.auth().currentUser.uid;
return firebase.database().ref('/users/'+ userId +'/Courses').update({

});
}

clearallcourses(){
var userIda = firebase.auth().currentUser.uid;
return firebase.database().ref('/users/'+ userIda +'/Courses').remove();
}

clearallevents(){
var userIda = firebase.auth().currentUser.uid;
return firebase.database().ref('/users/'+ userIda +'/Events').remove();
}

onSubmit(BuddyForm) {
  if(BuddyForm.valid) {
    console.log(BuddyForm.value);
    var userIdb = firebase.auth().currentUser.uid;

    return this.af.database.object(`/users/`+ userIdb ).update({
        firstName: BuddyForm.value.first_name,
        lastName: BuddyForm.value.last_name,
        Sport: BuddyForm.value.sport_selected,
        Sex: BuddyForm.value.sex,
        Expertise: BuddyForm.value.expertise,
        Age: BuddyForm.value.age,
        Status: BuddyForm.value.status,
        Email: BuddyForm.value.email,
        Address: BuddyForm.value.address,

    }).then(
      (success) => {
      console.log(success);
      this.router.navigate(['myaccount'])
    });
  }
}

ChangeMemType(MemForm) {
  if(MemForm.valid) {
    console.log(MemForm.value);
        var userId = firebase.auth().currentUser.uid;

    return this.af.database.object(`/users/`+ userId + '/Membership' ).update({
        'Member_type': MemForm.value.memtype,


    }).then(
      (success) => {
      console.log(success);
      this.router.navigate(['myaccount'])
    });
  }
}

  ngOnInit() {
  }

}
