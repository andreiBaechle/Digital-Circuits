package hw3;

import api.Endpoint;

/**
*@Author Andrei Baechle
*/

public class NandGate extends AbstractComponent
{
  public NandGate()
  {
	//2 inputs and 1 output
    super(2, 1);
  }
  
  @Override
  public void propagate()
  {
	Endpoint[] in = inputs();
    if (inputsValid())
    {
      int newValue = 0;
      if (in[0].getValue() == 1 && in[1].getValue() == 1)
      {
        newValue = 0; 
      }
      else if (in[0].getValue() == 0 && in[1].getValue() == 0) {
    	newValue = 1;
      }
      outputs()[0].set(newValue);
    }

    
  }

}
