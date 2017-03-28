package com.sd.sort.v0;

public class Sorter {
	public void sort(Integer[] data){
		for(int i=0;i<data.length-1;i++){
			for(int j=i+1;j<data.length;j++){
				if(data[i]>=data[j]){
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		
		for(int i=0; i<data.length; i++)
		    System.out.println("data["+i+"]="+data[i]);
	}
	
	public void sort(String[] data){
		for(int i=0;i<data.length-1;i++){
			for(int j=i+1;j<data.length;j++){
				if(data[i].compareTo(data[j])>0){
					String temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		
		for(int i=0; i<data.length; i++)
		    System.out.println("data["+i+"]="+data[i]);
	}
	
	public static void main(String[] args){
		Sorter sort = new Sorter();
		
		String[] data={"John", "Adam", "Skrien", "Smith", "Jones"};
		Integer[] data2={new Integer(3), new Integer(1), new Integer(4), new Integer(2)};
		sort.sort(data);
		sort.sort(data2);
	}
}
