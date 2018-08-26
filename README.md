# RESTfulMockExample

What this can do
============================
You can use this as http rest mock server samples.
This contain both GET and POST methods.
And sample expected rests which server can response.   

How to use
===========================
Download the sample and bulid the arificat -Clone and builf the war file. (using mavn build command)
Use webserver (example: tomcat) to deploy the artifact (tomcatmocks.war)
Send the : POST/GET as needs (consider below example)

test API 1
===========================
charge:
Expect: http://localhost:8080/tomcatmocks/payment/{msisdn}/transactions/amount
Example:
http://localhost:8080/tomcatmocks/payment/tel%3A%2B9xxxxx16080/transactions/amount
thread sleep fo the as per the taxamout field

list charge
Expect: http://localhost:8080/tomcatmocks/payment/{msisdn}/transactions
Example:
http://localhost:8080/tomcatmocks/payment/tel%3A%2B9xxxxx16080/transactions
or
http://localhost:8080/tomcatmocks/payment/tel%3A%2B9xxxxx16080/transactions?sleeptime=1000
sleeptime - optional
[sleeptime=1000 thread is sleep for 1000 s]

===================================================================

test API 2
=====================

send sms request
Expect: http://localhost:8080/tomcatmocks/smsmessaging/outbound/{shortcode}/requests
Example:
http://localhost:8080/tomcatmocks/smsmessaging/outbound/tel%3A%2Bxxx11/requests
thread sleep fo the as per the senderName field

