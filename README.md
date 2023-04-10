# restapisystem
springboot assignment


Steps:


1.Download the source code


2.run the springboot application (via Java application)


3.
public apis- "/","/login","/register","/index"- 
private apis-"/user/"



register through register page:
(enter role -ROLE_USER otherwise not permited to access the private api)
![Screenshot (32)](https://user-images.githubusercontent.com/71774839/230842309-0fc061b1-6ed5-4921-8d9f-79896b2c4dcd.png)
![Screenshot (33)](https://user-images.githubusercontent.com/71774839/230842337-eacc1370-0dfd-4768-95b8-7ad02de30191.png)
![Screenshot (34)](https://user-images.githubusercontent.com/71774839/230842360-5d99ba97-1d3d-4109-93d1-45671a8a2e2d.png)


![Screenshot (35)](https://user-images.githubusercontent.com/71774839/230842289-d23e91a9-6495-4077-83f0-5281d1c02841.png)


4.login through login page



5.you will get Success url page



Techstack:-
frontend-thymelef ,bootstrap
backend-springboot,Java
database-mysql
tool-eclipse




track:
commit1- "created html pagaes for register,login,index for restapi system and controller,repository,entity and services classes as well-by Neeraj Sharma(neerajsharmaa2101@gmail.com)"


commit2-”created createUser() for register
integrated spbootstarter security framework
 created  and reused base page and designed login,register and index pages using bootstrap cdn-by Neeraj Sharma(neerajsharmaa2101@gmail.com)"


commit3 ”created findbyemail() for register, private api’s user page,usercontroller class
-by Neeraj Sharma(neerajsharmaa2101@gmail.com)"


commit4-”created securityconfig class and specified role access for the private login api,integrated password encoder with userpassword,created userdetailsserviceImpl,CustomUserDetails-by Neeraj Sharma(neerajsharmaa2101@gmail.com”


issues resolved:
pom.xml file-third party dependencies compatibility issues with java version<17->  updated pom file with java 1.8 version and spbparent 2.7.7 version


Unsatisfied dependency while creating filterchain bean due to role=“ROLE_USER”-->”USER”


Pushing the branch into github repository:authentication failed
