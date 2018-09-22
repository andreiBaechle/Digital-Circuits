package hw3;

import api.Endpoint;
import api.IComponent;

/**
*@Author Andrei Baechle
*/

public abstract class AbstractComponent implements IComponent {
	private Endpoint[] inputs;

	private Endpoint[] outputs;

	private boolean valid;

	public AbstractComponent(int i, int j) {

		inputs = new Endpoint[i];
		outputs = new Endpoint[j];
		valid = false;
	}

	@Override
	public Endpoint[] inputs() {
		return inputs;
	}

	@Override
	public Endpoint[] outputs() {
		return outputs;

	}

	
	public void propagate() {

	}

	public boolean inputsValid() {
		for (Endpoint t : inputs) {
			if (!t.isValid()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean outputsValid() {
		for (Endpoint t : outputs) {
			if (!t.isValid()) {
				return false;
			}
		}
		return true;

	}

	@Override
	public void invalidateInputs() {
		for (Endpoint t : inputs) {
			if (t.isValid()) {
				t.invalidate();
			}
		}
	}

	@Override
	public void invalidateOutputs() {
		for (Endpoint t : outputs) {
			if (t.isValid()) {
				t.invalidate();
			}
		}
	}

	public boolean isEnabled() {
		return true;
	}

	public void setEnabled(boolean enabled) {
		valid = enabled;
	}

}
