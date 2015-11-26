
/**
 * ServiceBankCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v14  Built on : Jul 25, 2015 (11:19:54 IST)
 */

    package com.univ.alma;

    /**
     *  ServiceBankCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ServiceBankCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ServiceBankCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ServiceBankCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for payTransaction method
            * override this method for handling normal response from payTransaction operation
            */
           public void receiveResultpayTransaction(
                    com.univ.alma.ServiceBankStub.PayTransactionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from payTransaction operation
           */
            public void receiveErrorpayTransaction(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getMoney method
            * override this method for handling normal response from getMoney operation
            */
           public void receiveResultgetMoney(
                    com.univ.alma.ServiceBankStub.GetMoneyResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMoney operation
           */
            public void receiveErrorgetMoney(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                


    }
    