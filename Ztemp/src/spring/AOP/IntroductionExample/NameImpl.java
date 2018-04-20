package spring.AOP.IntroductionExample;

public class NameImpl implements Name {

	@Override
	public String getName() {
		System.out.println("*****This is getName() in Nameimple******");
		return "Nitin Paul";
	}

}
