package studyJava.java;

import java.net.ServerSocket;
import java.net.Socket;

public class MainClass {

	public static void main(String[] args) {
//클라이언트와 서버는 소켓을 사용해 통신한다 
//이때 InputStream OutputStream을 이용해서 양방향 통신을 할 수 있따.
		
		// 요청을 받아야 하기 때문에 ServerSocket 생성
		ServerSocket serverSoket = null;
		Socket socket = null;
		
		try {
			serverSoket = new ServerSocket(9000);
			System.out.println("클라이언트 맞을 준비 완료!");
			//ServerSocket에서 accept 메소드가 클라이언트를 맞는다
			socket = serverSoket.accept();
			//accept메소드는 socket객체를 반환
			System.out.println("클라이언트 연결!");
			System.out.println("socket : "+socket);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(socket != null) socket.close();
				if(serverSoket != null) serverSoket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
//git commit test