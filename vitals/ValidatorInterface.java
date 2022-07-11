package vitals;

import vitals.model.RangeInputPOJO;

public interface ValidatorInterface {
	public boolean validateRange(RangeInputPOJO inputPOJO);

	public void checkWarnings(RangeInputPOJO inputPOJO);
}
