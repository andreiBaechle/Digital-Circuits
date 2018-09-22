package hw3;

import api.IStatefulComponent;

/**
*@Author Andrei Baechle
*/

public class Counter extends AbstractComponent implements IStatefulComponent
{
 private int n;
 private int p;
 public Counter(int n) {
	 super (0, n);
	 clear();
	 p = 0;
 }
	 
	 @Override
	 public void tick() {
		 if(inputsValid() && isEnabled()) {
			 p++;
		 }
	 }
	 
	 @Override
	 public void clear() {
		 
	 }
}


