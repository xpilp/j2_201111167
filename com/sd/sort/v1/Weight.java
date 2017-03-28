package com.sd.sort.v1;

public class Weight implements Comparable<Weight>{
	private int kilo;
	public Weight(int k){
		kilo = k;
	}
	
	public String toString(){
		String msg = kilo+"";
		return msg;
	}

	public int compareTo(Weight obj) {
		Weight w = (Weight)obj;
		return this.kilo - w.kilo;
	}
}
