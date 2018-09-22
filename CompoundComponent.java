package hw3;
import api.IComponent;
import java.util.ArrayList;

/**
*@Author Andrei Baechle
*/

public class CompoundComponent extends AbstractComponent{
	
	private ArrayList<IComponent> compList;

	public CompoundComponent(int inputs, int output){
		
		super(inputs, output);
		compList = new ArrayList<>();
		
	}
	
	public void addComponent(IComponent c) {
		compList.add(c);
	}
	
	public ArrayList<IComponent> getComponents(){
		return compList;
	}
	
	@Override
	public void propagate() {
		for(IComponent c: compList) {
			if(c.inputsValid()) {
				c.propagate();
			}
		}
	}
  
}
