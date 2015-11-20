package com.utgame.qmeng;

public abstract class Duck {
	public FlyBehaviour fb;
	
	Duck(){
		//
	}
	
	public void swim(){
		System.out.println("Every duck can swim!");
	}
	
	public void performFly(){
		fb.fly();
	}
	
	//改变飞行模式
	public void setFly(FlyBehaviour fb){
		this.fb = fb;
	}
}
