package com.metafour.barcode;

public interface ScanningIntentHandler {
	
	public void start();
	
	public void stop();
	
	public void scan();
	
	public void setScanCallback(ScanCallback<BarcodeScan> callback);
	
	public void setIntentAction(String action);
	
	public boolean hasListeners();

}
