package kr.co.acomp.hello.service;

import kr.co.acomp.hello.dao.HelloDAO;
import kr.co.acomp.hello.dao.AnotherDAO;

//생성자 <constructor-arg ref="helloDAO"></constructor-arg>                                     
public class HelloService {                   
	private HelloDAO helloDAO;                
	//Another DAO
	private AnotherDAO anotherDAO;
	
	//생성자 생성
	//public HelloService(HelloDAO helloDAO) {
	//	this.helloDAO = helloDAO;
	//}
	
	public void setHelloDAO(HelloDAO dao) {
		this.helloDAO = dao;
	}
	
	public void setAnotherDAO(AnotherDAO dao) {
		this.anotherDAO = dao;
	}
	                                        
	                                          
	public int calcTwoNumbersAndSquare(int a, int b) { 
		                                      
		
		int result = helloDAO.addTwoNumber(a, b); 
		return  anotherDAO.square(result);
		                                      
	}                                         
	                                          
                                            
}                                             


//기본
//public class HelloService {
//	private HelloDAO dao;
//	
//	public int calcTwoNumbers(int a, int b) {
//		
//		dao = new HelloDAO();
//		return dao.addTwoNumber(a, b);
//		
//	}
//	
//
//}

////setter
//public class HelloService {                
//	private HelloDAO helloDAO;                    
//	
//	//여기가 setter고 resources(설정)파일 가서 등록해줘야함
//	public void setHelloDAO(HelloDAO dao) {
//		this.helloDAO = dao;
//	}
//	
//	public int calcTwoNumbers(int a, int b) {
//		                                     
//		return helloDAO.addTwoNumber(a, b);       
//		                                     
//	}                                        
//	                                         
//                                           
//}                                          