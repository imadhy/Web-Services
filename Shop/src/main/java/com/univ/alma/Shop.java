package com.univ.alma;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import org.apache.axis2.AxisFault;

import com.univ.alma.SupplierStub.Product;
import com.univ.alma.ServiceBankStub.*;
import com.univ.alma.SupplierStub.*;


public class Shop {
    
	private SupplierStub supplier;
	private ServiceBankStub bank;
	private List<Product> cart = new ArrayList<Product>();
	
	public Shop() throws AxisFault {
		
		this.supplier = new SupplierStub("http://localhost:9763/services/Supplier/");
		this.bank = new ServiceBankStub("http://localhost:9763/services/serviceBank/");
		
	}
	
	public Product[] getProducts() throws RemoteException{
		
		GetProductsList productList = new GetProductsList();
		return this.supplier.getProductsList(productList).get_return();
	}
	
	public boolean addItems(int productID) throws RemoteException{
		
		Product [] prdt = this.getProducts();
		
		if(prdt[productID].getQuantity() > 0) {
			this.cart.add(prdt[productID]);
			return true;
		}
		else
			return false;
	}
	
	public List<Product> getCartItems() throws RemoteException {
		return this.cart;
	}
	
	public int nbOfItems() throws RemoteException {
		return this.cart.size();
	}
}
