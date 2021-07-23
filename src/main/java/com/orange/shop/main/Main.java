package com.orange.shop.main;

import com.orange.shop.service.impl.OrangeShopFinderImpl;

public class Main {
	
	
	public static void main(String[] args) {
		       
        OrangeShopFinderImpl shop = new OrangeShopFinderImpl();
        
        System.out.println(shop.findOrangeShopWithMobileAvailable(-3.16566, 48.56226, "sunusng"));
	}

}
