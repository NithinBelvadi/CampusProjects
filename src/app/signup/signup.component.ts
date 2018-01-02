import { Component, OnInit } from '@angular/core';
import { AngularFire, AuthProviders, AuthMethods,  } from 'angularfire2';
import { Router } from '@angular/router';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

state: string = '';
error: any;

constructor(public af: AngularFire, private router: Router) {

}



onSubmit(formData) {
  if(formData.valid) {
    console.log(formData.value);
    this.af.auth.createUser({
      email: formData.value.email,
      password: formData.value.password
    }).then((user) => {
        // User created now create Firebase Database user
        return this.af.database.object(`/users/${user.uid}`).update({
            firstName: formData.value.first_name,
            lastName: formData.value.last_name
        });
    }).then(
      (success) => {
      console.log(success);
      this.router.navigate(['home'])
    }).catch(
      (err) => {
      console.log(err);
      this.error = err;
    })
  }
}



onSubmitlogin(formDataLogin) {
  if(formDataLogin.valid) {
    console.log(formDataLogin.value);
    this.af.auth.login({
      email: formDataLogin.value.Usernamelogin,
      password: formDataLogin.value.Passwordlogin
    },
    {
      provider: AuthProviders.Password,
      method: AuthMethods.Password,
    }).then(
      (success) => {
      console.log(success);
      this.router.navigate(['myaccount']);
    }).catch(
      (err) => {
      console.log(err);
      this.error = err;
    })
  }
}
loginGoogle() {
    this.af.auth.login({
      provider: AuthProviders.Google,
      method: AuthMethods.Popup,
    }).then(
        (success) => {
        this.router.navigate(['/members']);
      }).catch(
        (err) => {
        this.error = err;
      })
  }



  ngOnInit() {
  }

}
