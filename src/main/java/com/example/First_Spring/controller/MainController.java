package com.example.First_Spring.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.First_Spring.service.MainService;
import com.example.First_Spring.vo.UserVO;
//@Controller : url 요청받는 곳
//ctrl+shift+o : import받는 키
//자바로 만든 시버 : 192.168.0.???:8080(식별자)/index
//localhost: 개인의 ip


@RestController

class MainController {
	@Autowired //new대신 써줌 spring이 해준다 해당클래스에 @Serive를써줘야한다
				//@Autowired 해당 객체(클래스)를 관여해줌.Ioc(Inversion of Control)
				//IOC 객체의 생성부터 소멸까지 Spring에서 관리함
				//DI(Dependency Injection) Spring이 객체(클래스)가 필요하다면 외부에서 가져다가 주입하는 방식.
				//객체(클레스)를 외부에서 가져다가 쓰기 때문에 new연산자가 사라짐.
				//new = 주입=대입 
				//Spring 3대장 개념 IOC,DI, AOP(나중에 수업)(Aspect Oriented Programming)관점지향 프로그래밍
				//여러 메소드(함수)에서 중복되는 코드가 있다면,따로 모아서 재활용 하는 것
	private MainService service; //필드변수 전역변수
	
	@GetMapping("/index")
	public String call() { //index라는주소를 요청하면 call()메소드 실행할까~
		//vo는 겟터셋터만
		String word = "승택 Hello world";
		return word;
	}
	@GetMapping("/sum")
	public int callSum() {
		int x = 10;
		int y = 200;
		return x+y;
	}
	@GetMapping("/user")
	public UserVO callUser() { //callLoad
		UserVO("dd",30,"dd");
		return vo;
	}
	@GetMapping("/userList") //VO는 getter.setter,생성자밖에없다
	public List<UserVO> callUserList(){
		
		return list;
	}
	@Autowired
	private MainService mainService;
	//문제 1. 나이가 60 이하인 배우만 리턴하시오.
	@GetMapping("/actor/list")
	public List<UserVO> callUserList(HttpServletRequest request){
		String ip = request.getHeader("X-forwarded-For");
		if (ip == null) {
			ip = request.getRemoteAddr();
		}
		System.out.println("IP =====> "+ip);
		return mainService.getUserList();
	}
	//문제 2. 나이가 가장많은 배우의 나이를 리턴하시오.
	@GetMapping("/actor/age")
	public int callUserAgeMax(){
		int count = mainService.getUserAgeMax();
		return count;
	}
	//문제 3. list에 배우이름 배성우가 있다면 리턴하시오.
	@GetMapping("/actor")
	public UserVO callUser(){
		return mainService.getUser();
	}
	//문제 4. list에 성이 이씨인 배우가 몇명인지 리턴하시오.
	@GetMapping("/actor/count")
	public int callUserCount(){
		return mainService.getUserCount();
	}
	
	}
}
//공유폴더 옮긴다음 git hash here -java-jar lombok.jar 스페이스바 텝 인스톨 -이클립스 재시작
	

