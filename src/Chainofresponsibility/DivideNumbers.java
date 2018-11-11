package Chainofresponsibility;

public class DivideNumbers implements Chain {
	private Chain nextInChain;
	   
	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;
	
	}

	@Override
	public double calculate(Numbers requests) {
		if(requests.getCalculationWanted() == "divid"){
			//System.out.println(requests.getNumber1() + "/" + requests.getNumber2() + "=" +
					return (requests.getNumber1() / requests.getNumber2());
		}
		else {
			System.out.println("only,add,sub,mult,div accepted");
			return -1.065;
		}
	}

}
