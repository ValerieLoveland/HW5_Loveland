package cs520.hw5;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Senator implements Serializable {
	
	private String 	senatorName;
	private int		sentatorYearsInOffice;
	private String 	senatorParty;
	private String 	senatorState;
	

	public Senator(String name, String party, String state, int yearsInOffice )
	{
		this.senatorName = name;
		this.senatorParty = party;
		this.senatorState = state;
		this.sentatorYearsInOffice = yearsInOffice;
	}


	@Override
	public String toString() {
		return "Senator [senatorName=" + senatorName + ", senatorParty=" + senatorParty + ", "
				+ "senatorState=" + senatorState + ", sentatorYearsInOffice=" + sentatorYearsInOffice
				+ "]";
	}


	public String getSenatorName() {
		return senatorName;
	}


	public void setSenatorName(String senatorName) {
		this.senatorName = senatorName;
	}


	public int getSentatorYearsInOffice() {
		return sentatorYearsInOffice;
	}


	public void setSentatorYearsInOffice(int sentatorYearsInOffice) {
		this.sentatorYearsInOffice = sentatorYearsInOffice;
	}


	public String getSenatorParty() {
		return senatorParty;
	}


	public void setSenatorParty(String senatorParty) {
		this.senatorParty = senatorParty;
	}


	public String getSenatorState() {
		return senatorState;
	}


	public void setSenatorState(String senatorState) {
		this.senatorState = senatorState;
	}


	//public String getName() {
		// TODO Auto-generated method stub
	//	return null;
//	}


	

}