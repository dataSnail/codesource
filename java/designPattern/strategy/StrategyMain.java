package com.utgame.qmeng;

public class StrategyMain {
	public static void main(String[] args){
		Duck dc = new RealDuck();
		FlyWithWings  fl = new FlyWithWings();
		dc.swim();
		dc.setFly(fl);
		dc.performFly();
	}
}
