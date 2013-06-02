/*******************************************************************************
 * This file is part of Pebble.
 * 
 * Copyright (c) 2012 Mitchell Bosecke.
 * 
 * This work is licensed under the Creative Commons Attribution-ShareAlike 3.0 
 * Unported License. To view a copy of this license, visit 
 * http://creativecommons.org/licenses/by-sa/3.0/
 ******************************************************************************/
package com.mitchellbosecke.pebble.loader;

import java.util.Date;

import com.mitchellbosecke.pebble.error.LoaderException;


public interface Loader {
	
	public String getSource(String templateName) throws LoaderException;

	boolean isFresh(String templateName, Date timestamp) throws LoaderException;

}
