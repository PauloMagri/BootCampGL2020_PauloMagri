package mockito.example.services.impl;

import mockito.example.services.DataService;

public class DataServiceImpl implements DataService{
	
	private int[] listOfNumbers;
	
	public DataServiceImpl() {}
	
	public void setListOfNumbers(int[] list) {
		this.listOfNumbers = list;
	}
	
	@Override
	public int[] getListOfNumbers() {
		return this.listOfNumbers;
	}
}
