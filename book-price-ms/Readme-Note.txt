The application is using springboot with bootstrap and jquery.
Run application as bootJar

Application may not run if webapp is not a source package

to run using executable fat jar, need to do some modification in build.
Currently the jar created does not have compiled jsp included.

Currently there is not customer error handling code written so it will display default message Bad credential with below url
http://localhost:12345/login?error
if username and password is not authenticated or authorized.
default login and logout provided by adding spring securities.
It does not create fat-jar to execute jar.


Check the following URL's
http://localhost:12345/login
http://localhost:12345/logout
http://localhost:12345/
http://localhost:12345/viewBooks
http://localhost:12345/addBook
http://localhost:12345/editBook
http://localhost:12345/deleteBook
http://localhost:12345/placeOrder

Improvements required in Lab28:
A) Display either login/Register or logout
B) Display the Links accordning to Role.
C) Customize Login Page and Error Messages.
D) Customize Logout Page
E) Display the Role after the username.
•Display the following for Authenticated Users
Home Welcome : sri [ROLE_CUSTOMER] Logout
•Display the following for Un-Authenticated Users
Home Login Register

