
/**
 * SupplierCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v14  Built on : Jul 25, 2015 (11:19:54 IST)
 */

    package com.univ.alma;

    /**
     *  SupplierCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class SupplierCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public SupplierCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public SupplierCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getProductsList method
            * override this method for handling normal response from getProductsList operation
            */
           public void receiveResultgetProductsList(
                    com.univ.alma.SupplierStub.GetProductsListResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getProductsList operation
           */
            public void receiveErrorgetProductsList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for cartItems method
            * override this method for handling normal response from cartItems operation
            */
           public void receiveResultcartItems(
                    com.univ.alma.SupplierStub.CartItemsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from cartItems operation
           */
            public void receiveErrorcartItems(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addToCart method
            * override this method for handling normal response from addToCart operation
            */
           public void receiveResultaddToCart(
                    com.univ.alma.SupplierStub.AddToCartResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addToCart operation
           */
            public void receiveErroraddToCart(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for getCartList method
            * override this method for handling normal response from getCartList operation
            */
           public void receiveResultgetCartList(
                    com.univ.alma.SupplierStub.GetCartListResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getCartList operation
           */
            public void receiveErrorgetCartList(java.lang.Exception e) {
            }
                


    }
    