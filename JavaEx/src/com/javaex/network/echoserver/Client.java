package com.javaex.network.echoserver;

import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {
	public static void (String[] args) {
		Socket socket = null;
		
		try {
			//	소켓 객체 생성
			socket = new Socket();
			
			//	서버 메시지
			System.out.println("<클라이언트 시작>");
			System.out.println("CLIENT : [연결을 요청합니다.]");
			
			//	접속 시도
			InetSocketAddress remote = new InetSocketAddress("127.0.0.1", 10000);
			Socket.connect(remote);
			
			//	접속 성공
			System.out.println("CLIENT : [서버에 연결되었습니다.]");
			
			//	후처리
			System.out.println("<클라이트 종료>");
		} catch (ConnectException e) {
			System.err.println("[접속이 거부되었습니다.]");
		}finally {
			try {
				socket.close();
			} catch(IOException e)
		}
	}
}
