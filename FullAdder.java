package hw3;

import api.IComponent;

/**
*@Author Andrei Baechle
*/

public class FullAdder extends CompoundComponent {
	public FullAdder() {
		super(3, 2);

		// create the contained components and add them to the list
		IComponent orGate = new OrGate();
		IComponent halfAdder = new HalfAdder();
		IComponent halfAdder1 = new HalfAdder();

		addComponent(orGate);
		addComponent(halfAdder);
		addComponent(halfAdder1);
		// wire inputs
		inputs()[0].connectTo(halfAdder.inputs()[0]);
		inputs()[1].connectTo(halfAdder.inputs()[1]);

		halfAdder.outputs()[1].connectTo(halfAdder1.inputs()[0]);
		inputs()[1].connectTo(halfAdder1.inputs()[1]);

		halfAdder.outputs()[0].connectTo(halfAdder1.inputs()[0]);
		halfAdder1.outputs()[1].connectTo(orGate.inputs()[1]);
	}
}
