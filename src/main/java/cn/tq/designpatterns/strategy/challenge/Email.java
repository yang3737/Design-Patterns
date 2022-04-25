package cn.tq.designpatterns.strategy.challenge;

public class Email implements ShareStrategy {
	public void share() {
		System.out.println("I'm emailing the photo");
	}
}
