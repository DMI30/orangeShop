package com.orange.shop.service;

import java.util.List;

import com.orange.shop.domain.Line;

/**
 * Recherche de boutiques Orange.
 * 
 * Le point d'entr�e doit impl�menter cette interface.
 * 
 * 
 */
public interface OrangeShopFinder {

	String findOrangeShopWithMobileAvailable(double longitude, double latitude, String nameMobile);
	
	double distance(double lat1,  double lat2, double lon1, double lon2);
	
	List<Line> existStock(List<Line> listShop, String nameMobile);
}
