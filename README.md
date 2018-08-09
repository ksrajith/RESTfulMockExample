# RESTfulMockExample

test API 1
=====================

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

