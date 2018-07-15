package com.lames.client.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 * @author HONGTO
 * @date 7/12/2018 1:32 PM
 */
public class ContextAttributeListener implements ServletContextAttributeListener {
   
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("application added a attribute");    }

	public void attributeRemoved(ServletContextAttributeEvent event) {
		// TODO Auto-generated method stub
		
	}

	public void attributeReplaced(ServletContextAttributeEvent event) {
		// TODO Auto-generated method stub
		
	}

}
