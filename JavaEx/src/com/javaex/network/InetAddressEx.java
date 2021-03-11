package com.javaex.network;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class InetAddressEx {

	public static void main(String[] args) {
		printLocalIp();
		//	서버의 주소릃 g환인
		printSeverIp("www.naver.com");
		printSeverIp("www.google.com");

	}
	private static void printSeverIp(String hostname) {
		try {
			InetAddress[]  adrs= InetAddress.getAllByName(hostname);
			for (InetAddress remote : adrs ) {
				System.out.println(hostname +  " : IP" + 
						remote.getHostAddress());
			}catch (UnknownHostException e) {
				e.printStackTrace();
			}
		}
	}
	//	내 컴퓨터가 할당 받은 ip 확인 (localhost)
	private static void printLocalIp() {
		try {
			//	내 Ip주소 확인
			InetAdress local = InetAddress.getLocalHost();	
			System.out.printlm("Local IP: "  +local.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
