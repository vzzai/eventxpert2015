/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circulous.xpert.event.comparator;

import java.util.Comparator;

import com.circulous.xpert.jpa.entities.EventInfo;

/**
 *
 * @author SANJANA
 */

public class EventCostComparator implements Comparator<EventInfo> {


	@Override
	public int compare(EventInfo arg0, EventInfo arg1) {
		// TODO Auto-generated method stub
		return arg0.getCost().compareTo(arg1.getCost());
	}
    
}
