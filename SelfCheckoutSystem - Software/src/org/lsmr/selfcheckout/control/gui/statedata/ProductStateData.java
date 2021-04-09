package org.lsmr.selfcheckout.control.gui.statedata;

import java.util.ArrayList;

import org.lsmr.selfcheckout.control.ReceiptItem;

public class ProductStateData implements StateData<ArrayList<ReceiptItem>> {
	
	private ArrayList<ReceiptItem> items;
	
	public ProductStateData(ArrayList<ReceiptItem> items) {
		this.items = items;
	}

	@Override
	public ArrayList<ReceiptItem> obtain() {
		return items;
	}

}
