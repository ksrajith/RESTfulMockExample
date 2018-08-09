package com.wso2telco.rest;

/**
 * Created by ksrajith on 7/27/18.
 */

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.codehaus.jettison.json.JSONObject;

@Path("/smsmessaging/")
public class SmsmessagingJSONService {

    @POST
    @Path("outbound/{shortcode}/requests")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createTrackInJSON(String smsJson) {
        JSONObject jsonObject;
        try {
            jsonObject = new JSONObject(smsJson);
            jsonObject = jsonObject.getJSONObject("outboundSMSMessageRequest");
            String clientCorrelator = jsonObject.getString("clientCorrelator");
            int sleeptime = jsonObject.getInt("senderName");
            smsJson = "{\n" +
                    "    \"outboundSMSMessageRequest\": {\n" +
                    "        \"deliveryInfoList\": {\n" +
                    "            \"deliveryInfo\": [\n" +
                    "                {\n" +
                    "                    \"address\": \"tel:+9xxxx16080\",\n" +
                    "                    \"deliveryStatus\": \"MessageWaiting\",\n" +
                    "                    \"messageReferenceCode\": \"0a50xxxx1a43aca77db4991f3-0\"\n" +
                    "                }\n" +
                    "            ],\n" +
                    "            \"resourceURL\": \"https://operator-url.com/smsmessaging/v2/outbound/tel:+xxx1/requests/1xx2711413904SM14021/deliveryInfos\"\n" +
                    "        },\n" +
                    "        \"serverReferenceCode\": \"OB-3003-xxx1a4xx4991f3\",\n" +
                    "        \"address\": [\n" +
                    "            \"tel:+94770616080\"\n" +
                    "        ],\n" +
                    "        \"senderAddress\": \"tel:+xxx1\",\n" +
                    "        \"clientCorrelator\": \"" + clientCorrelator + "\",\n" +
                    "        \"senderName\": \"\",\n" +
                    "        \"outboundSMSTextMessage\": {\n" +
                    "            \"message\": \"Test1\"\n" +
                    "        },\n" +
                    "        \"receiptRequest\": {\n" +
                    "            \"notifyURL\": \"http://application.example.com/notifications/DeliveryInfoNotification\",\n" +
                    "            \"callbackData\": \"some-data-useful-to-the-requester\"\n" +
                    "        },\n" +
                    "        \"resourceURL\": \"https://operator-url.com/smsmessaging/v3/outbound/xxxx1/requests/xxxx-0a50ef2d9ed441f1a43aca77db4991f3\"\n" +
                    "    }\n" +
                    "}";


            Thread.sleep(sleeptime);
        } catch (Exception ex) {

        }

        return Response.status(201).entity(smsJson).build();
    }

}
