package hw3;
import api.IComponent;

/**
*@Author Andrei Baechle
*/

public class Multiplexer extends AbstractComponent{
	
	private int intVal;
	
	
	public Multiplexer( int k) {
		super((int) (Math.pow(2, k) + k), 1);
		intVal = k;
		
	}
	
	@Override
	public void propagate(){
		if (inputsValid()) {
			while(intVal >= 1) {
				
				String s = "";
				String r = "";
				for(int i = (int) Math.pow(2,  intVal) + intVal -1; i >= (int) Math.pow(2,  intVal);i++) {
					s += inputs()[i].getValue();
					intVal--;
				}
				
				for(int i = s.length() - 1 ; i >= 0; i--) {
					r += s.charAt(i);
				}
				int index = Integer.parseInt(r,2);
				outputs()[0].set(inputs()[index].getValue());
					
						
			}
		}
		
	}

  
}
