package com.wso2telco.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.codehaus.jettison.json.JSONObject;


@Path("/payment/")
public class PaymentJSONService {
	@GET
	@Path("/{msisdn}/transactions")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTrackInJSON(@QueryParam("sleeptime") long slp) {

		String listresponse = "{  \n" +
				"   \"paymentTransactionList\":{  \n" +
				"      \"amountTransaction\":[  \n" +
				"         {  \n" +
				"            \"endUserId\":\"tel:+9412345678\",\n" +
				"            \"paymentAmount\":{  \n" +
				"               \"chargingInformation\":{  \n" +
				"                  \"amount\":\"9\",\n" +
				"                  \"currency\":\"USD\",\n" +
				"                  \"description\":\"Alien Invaders\"\n" +
				"               }\n" +
				"            },\n" +
				"            \"referenceCode\":\"REF-ASM600-239238\",\n" +
				"            \"serverReferenceCode\":\"tx-a3c0e4e006da40a8a5b5-045972478cc3\",\n" +
				"            \"resourceURL\":\"https://operatorurl:8243/payment/v1/tel:+93771564812/transactions/amount/789754CHA123\",\n" +
				"            \"transactionOperationStatus\":\"Charged\"\n" +
				"         },\n" +
				"         {  \n" +
				"            \"endUserId\":\" tel:+9412345678\",\n" +
				"            \"paymentAmount\":{  \n" +
				"               \"chargingInformation\":{  \n" +
				"                  \"amount\":\"6\",\n" +
				"                  \"currency\":\"USD\",\n" +
				"                  \"description\":\" Snakes Alive \"\n" +
				"               }\n" +
				"            },\n" +
				"            \"referenceCode\":\"REF-ASM600-2392344\",\n" +
				"            \"serverReferenceCode\":\"tx-a3c0e4e006da60a8a5b5-044972478cc3\",\n" +
				"            \"resourceURL\":\"https://operatorurl:8243/payment/v1/tel:+93771564812/transactions/amount/789754CHA123\",\n" +
				"            \"transactionOperationStatus\":\"Charged\"\n" +
				"         }\n" +
				"      ],\n" +
				"      \"resourceURL\":\"https://operatorurl:8243/payment/v1/tel:+93771564812/transactions/amount/\"\n" +
				"   }\n" +
				"}";
 try {
	 Thread.sleep(slp);
 }catch (InterruptedException ie){

 }
		return Response.status(200).entity(listresponse).build();

	}

	@POST
	@Path("/{msisdn}/transactions/amount")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(String paymentJson) {
		JSONObject jsonObject;
		try {
			jsonObject =  new JSONObject(paymentJson);
			jsonObject = jsonObject.getJSONObject("amountTransaction");
			String clientCorrelator = jsonObject.getString("clientCorrelator");
			jsonObject = jsonObject.getJSONObject("paymentAmount");
            jsonObject = jsonObject.getJSONObject("chargingMetaData");
			int sleeptime = jsonObject.getInt("taxAmount");
			paymentJson = "{  \n" +
					"   \"amountTransaction\":{  \n" +
					"      \"clientCorrelator\":\""+clientCorrelator+"\",\n" +
					"      \"endUserId\":\"tel:+93771564812\",\n" +
					"      \"paymentAmount\":{  \n" +
					"         \"chargingInformation\":{  \n" +
					"            \"amount\":\"100\",\n" +
					"            \"currency\":\"USD\",\n" +
					"            \"description\":\"Alien Invaders Game\"\n" +
					"         },\n" +
					"         \"totalAmountCharged\":\"100\",\n" +
					"         \"chargingMetaData\":{  \n" +
					"            \"onBehalfOf\":\"Example Games Inc\",\n" +
					"            \"channel\":\"5\",\n" +
					"            \"serviceId\":\"APPLE\",\n" +
					"            \"taxAmount\":\"0\"\n" +
					"         }\n" +
					"      },\n" +
					"      \"referenceCode\":\"REF-1234567\",\n" +
					"      \"serverReferenceCode\":\"ABC-123\",\n" +
					"      \"resourceURL\":\"http://54.193.104.15:8290/payment/v1/acr%3AOrangeAPIToken/transactions/amount/abc123\",\n" +
					"      \"transactionOperationStatus\":\"Charged\"\n" +
					"   }\n" +
					"}";


			Thread.sleep(sleeptime);

		}catch (Exception ex){

		}

		return Response.status(201).entity(paymentJson).build();

	}
}
