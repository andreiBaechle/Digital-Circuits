package hw3;

import java.util.ArrayList;

import api.IComponent;

/**
*@Author Andrei Baechle
*/

public class MultiComponent extends AbstractComponent{
	
	private ArrayList<IComponent> compList;

 public MultiComponent(IComponent[] components) {
	 
	 super(components , outputs);
	 
 }
}
