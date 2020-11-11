package com.placideh.springcoreannotationn2;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary here it is where we want to mention which type we could use
public class MediaTek implements MobileProcessor {

	public void process() {
		// TODO Auto-generated method stub
		System.out.println("Second best cpu just fun!!");

	}

}
