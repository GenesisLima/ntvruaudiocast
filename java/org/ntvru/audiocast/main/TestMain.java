package org.ntvru.audiocast.main;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestMain {

	
	public static void main(String[] args) {
		InetAddress ip;
		
		try {
			ip = InetAddress.getLocalHost();
			System.out.println("Current IP address : " + ip.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
