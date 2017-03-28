package com.sd.sort.v2;

import com.sd.turtle.WeightTurtle;

public class TurtleComplarator {
	public int compare(Object t1, Object t2) {
		return ((WeightTurtle) t1).getWeight() - ((WeightTurtle) t2).getWeight();
	}
}
