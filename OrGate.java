package hw3;

import api.Endpoint;
import api.IComponent;

/**
*@Author Andrei Baechle
*/

public class OrGate extends AbstractComponent
{
  public OrGate()
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
      if (in[0].getValue() == 1 || in[1].getValue() == 1)
      {
        newValue = 1;
      }
      outputs()[0].set(newValue);
    }

  }

}
