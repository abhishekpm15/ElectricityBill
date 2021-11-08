package com.eb.entity;

 public abstract class Connection {
     int previousReading;
	 int currentReading;
	 float[] slabs;
	
	public Connection(int currentReading,int previousReading,float slabs[]) {
		super();
		this.currentReading =currentReading;
		this.previousReading=previousReading;
		this.slabs=slabs;
	}

	public abstract float computeBill();

	public int getPreviousReading() {
		return previousReading;
	}

	public void setPreviousReading(int previousReading) {
		this.previousReading = previousReading;
	}

	public int getCurrentReading() {
		return currentReading;
	}

	public void setCurrentReading(int currentReading) {
		this.currentReading = currentReading;
	}

	public float[] getSlabs() {
		return slabs;
	}

	public void setSlabs(float[] slabs) {
		this.slabs = slabs;
	}
	
	
}
