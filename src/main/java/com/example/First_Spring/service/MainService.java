package com.example.First_Spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.First_Spring.vo.UserVO;

@Service
//비즈니스 로직, 계산 숳ㅇ, 외부 apI호출을 수행하는 java클래스를 표시ㅣ
//controll URL 호출 응답 담당 spring한테 연락한다
//1.클래스를 만들면 어노테이션을 먼저 만들자.
//2.@Autowrid 객체 생성과 소멸을 Spring이 관리해준다
public class MainService {
	
	public List<UserVO> getUserList() {
		ArrayList<UserVO> lsit = new ArrayList<UserVO>(); //파리미터 값이 없어서 새로운 값을 만들어야 한다
		list.add(new UserVO("이병원",51,"사원"));
		return list; //파라미터 타입이 없다
					//controll는 요청만 받는것만 온다.
	}
    //문제 1. 나이가 60 이하인 배우만 리턴하시오.
    public List<UserVO> getUserList(){
		List<UserVO> list = new ArrayList<UserVO>();
		list.add(new UserVO("이병헌",51,"서울"));
        list.add(new UserVO("조승우",42,"서울"));
        list.add(new UserVO("이경영",61,"서울"));
        list.add(new UserVO("배성우",49,"서울"));
        list.add(new UserVO("백윤식",75,"서울"));
        for(int i=0; i<list.size(); i++) {
        	int age = list.get(i).getAge();
        	if(age >=60) {
        	list.remove(i);
        	--i;
        	}
        }
		return list;
	}
    //문제 2. 나이가 가장많은 배우의 나이를 리턴하시오.
    public int getUserAgeMax(){
		List<UserVO> list = new ArrayList<UserVO>();
		list.add(new UserVO("이병헌",51,"서울"));
        list.add(new UserVO("조승우",42,"서울"));
        list.add(new UserVO("이경영",61,"서울"));
        list.add(new UserVO("배성우",49,"서울"));
        list.add(new UserVO("백윤식",75,"서울"));
        int age = 0;
        for(int i=0; i<list.size(); i++) {
        	int actorAge = list.get(i).getAge();
        	if(age>actorAge) {
        	age =actorAge;
        	}
        }
		return age;
		

    //문제 3. list에 배우이름 배성우가 있다면 리턴하시오.
    public UserVO getUser(){
		List<UserVO> list = new ArrayList<UserVO>();
		list.add(new UserVO("이병헌",51,"서울"));
        list.add(new UserVO("조승우",42,"서울"));
        list.add(new UserVO("이경영",61,"서울"));
        list.add(new UserVO("배성우",49,"서울"));
        list.add(new UserVO("백윤식",75,"서울"));
        for(int i=0; i<list.size(); i++) {
        	String actorName = list.get(i).getName();
        	if(actorName.equals("배성우")) {
        		return list.get(i);
        	}
        }
		return null;
	}
    //문제 4. list에 성이 이씨인 배우가 몇명인지 리턴하시오.
    public int getUserCount(){
		List<UserVO> list = new ArrayList<UserVO>();
		list.add(new UserVO("이병헌",51,"서울"));
        list.add(new UserVO("조승우",42,"서울"));
        list.add(new UserVO("이경영",61,"서울"));
        list.add(new UserVO("배성우",49,"서울"));
        list.add(new UserVO("백윤식",75,"서울"));
        int count = 0;
        for(int i=0; i<list.size(); i++) {
        	String actorName = list.get(i).getAge();
        	String lastName = actorName.substring(0, 1);
        	if(lastName.equals("이")) {
        		
        	}
        	return count;
        }
	}
}
