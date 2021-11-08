package com.eb.entity;


public class Commercial extends Connection {
	public Commercial(int currentReading,int previousReading,float slabs[]) {
		super(currentReading,previousReading,slabs);
	}
	
public float computeBill() {
	int units=currentReading-previousReading;
	float bill=0;
	if(units <=50) {
		bill = units*slabs[0];
		}
		else if (units <= 100){
		bill = 260 + (units-50)*slabs[1];
		}
		else if (units > 100){
		bill = 600 + (units-100)*slabs[2];
		}
	
	if(bill>=10000) {
		bill=bill+bill*(0.09f);
	}
	else if(bill>=5000) {
		bill=bill+bill*(0.06f);
	}
	else if(bill<5000) {
		bill=bill+bill*(0.02f);
	}
	return bill;
		
	}

}
