package hw3;

import api.IStatefulComponent;

/**
*@Author Andrei Baechle
*/

public class Register extends AbstractComponent implements IStatefulComponent{
	
	public Register(int n) {
		super(n, n);
		clear();
	}
	
	@Override
	public void tick() {
		int[] tick = new int[inputs().length];
		
		if (isEnabled() && inputsValid()) {
			for (int i = 0; i < inputs().length; i++) {
				tick[i] = inputs()[i].getValue();
			}
			
			for (int j = 0; j < outputs().length; j++) {
				outputs()[j].set(tick[j]);
			}
		}
		
	}
	
	@Override
	public void clear() { 
		for(int i = 0; i < outputs().length; i++) {
			outputs()[i].set(0);
			
		}
		
	}
}
