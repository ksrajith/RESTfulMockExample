# RESTfulMockExample

What this can do
============================
You can use this as 'RESTful Mock Example' http rest mock server samples.
This contain both GET and POST methods.
And sample expected rests which server can response.   

How to use
===========================
Download the sample and bulid the arificat -Clone and builf the war file. (using mavn build command) </br>
Use webserver (example: tomcat) to deploy the artifact (tomcatmocks.war) </br>
Send the : POST/GET as needs (consider below example) </br>

test API 1
===========================
charge:</br>
Expect: http://localhost:8080/tomcatmocks/payment/{msisdn}/transactions/amount </br>
Example: </br>
http://localhost:8080/tomcatmocks/payment/tel%3A%2B9xxxxx16080/transactions/amount </br>
thread sleep fo the as per the taxamout field </br>

list charge </br>
Expect: http://localhost:8080/tomcatmocks/payment/{msisdn}/transactions </br>
Example: </br>
http://localhost:8080/tomcatmocks/payment/tel%3A%2B9xxxxx16080/transactions </br>
or </br>
http://localhost:8080/tomcatmocks/payment/tel%3A%2B9xxxxx16080/transactions?sleeptime=1000 </br>
sleeptime - optional </br>
[sleeptime=1000 thread is sleep for 1000 s] </br>

===================================================================

test API 2
=====================

send sms request </br>
Expect: http://localhost:8080/tomcatmocks/smsmessaging/outbound/{shortcode}/requests </br>
Example: </br>
http://localhost:8080/tomcatmocks/smsmessaging/outbound/tel%3A%2Bxxx11/requests </br>
thread sleep fo the as per the senderName field </br>

