# Log in

tags: account

   |user_access|
   |-----------|
   |user       |

* Open YCG homepage
* Hover over Account button and select Login/Registration

## Successful login

tags: login, successful

* Enter <user_access> credentials and click on Login button
* Close the successful login modal which appeared after page reload
* Hover over Account button and check email address of <user_access>

  teardown step defined in execution hook

## Failed login with bad username

tags: login, failed

* Enter "bad_username" credentials and click on Login button
* Login fails and an error message appears after page reload
* Hover over Account button and see Login/Registration button

## Failed login with bad password

tags: login, failed

* Enter "bad_password" credentials and click on Login button
* Hover over Account button and see Login/Registration button