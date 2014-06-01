package org.hnm736.pattern.creational;

import java.lang.reflect.Proxy;

public class AbsFactory2 {
	public static void main(String [] args){
		AbsGameFactory a = new BasketBallFactory();
		AbsGameFactory b = new FootBallFactory();
		
		Ball proxy = (Ball)Proxy.newProxyInstance(FootBall.class.getClassLoader(),
					new Class [] { FootBall.class }, null);
		
	}
}

interface Ball	{
	void action();
}


//comment something on master branch only

interface Player	{
	void kick(Ball ball);
}

class BasketBall implements Ball	{
	@Override
	public void action() {
		System.out.println("Ball to basket going");
	}
}

class FootBall implements Ball	{
	@Override
	public void action() {
		System.out.println("Ball to gate going");
	}
}

class FootPlayer implements Player	{
	@Override
	public void kick(Ball ball) {
		System.out.println("PLayer ");
		ball.action();
	}
}

class BasketPlayer implements Player 	{
	@Override
	public void kick(Ball ball) {
		System.out.println("PLAYER");
		ball.action();
	}
}

interface AbsGameFactory	{
	Player makePlayer();
	Ball makeBall();
}


class BasketBallFactory implements AbsGameFactory	{
	@Override
	public Player makePlayer() {
		return new BasketPlayer();
	}
	
	@Override
	public Ball makeBall() {
		return new BasketBall();
	}
}

class FootBallFactory implements AbsGameFactory	{
	@Override
	public Player makePlayer() {
		return new FootPlayer();
	}
	
	@Override
	public Ball makeBall() {
		return new FootBall();
	}
}

class Match	{
	private Player p;
	private Ball b;
	
	public Match(AbsGameFactory abs)	{
		p = abs.makePlayer();
		b = abs.makeBall();
	}
}



