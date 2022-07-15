package com.iu.main;

import com.iu.himart.Client;
import com.iu.himart.Computer;
import com.iu.himart.Tv;
import com.iu.himart.Phone;


public class Main {

	public static void main(String[] args) {

	
		Computer c = new Computer();
		Tv t = new Tv();
		Phone p = new Phone();
		c.info();
		t.info();
		p.info();
		Client client = new Client();
		client.buy(c.getPrice(),c.getPoint());
		client.buy(t.getPrice(),t.getPoint());
		client.buy(p.getPrice(),p.getPoint());

		
	}
	
}


