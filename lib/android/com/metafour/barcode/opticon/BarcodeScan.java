package com.metafour.barcode.opticon;

public class BarcodeScan {
	public String LabelType;
	public String Barcode;
	public BarcodeScan (String label, String code){
		this.LabelType = label;
		this.Barcode = code;
	}
}