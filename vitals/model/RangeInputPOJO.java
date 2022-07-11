package vitals.model;

import vitals.Unit;

public class RangeInputPOJO {
	float inputValue;
	float lLimit = 0.0f;
	float uLimit;
	Unit unit;

	public RangeInputPOJO(float inputValue, float lLimit, float uLimit) {
		super();
		this.inputValue = inputValue;
		this.lLimit = lLimit;
		this.uLimit = uLimit;
	}

	public RangeInputPOJO(float inputValue, float lLimit, float uLimit, Unit unit) {
		super();
		this.inputValue = inputValue;
		this.lLimit = lLimit;
		this.uLimit = uLimit;
		this.unit = unit;
		assignInputValue();

	}

	private void assignInputValue() {
		if (this.unit != null) {

			float value = 0.0f;
			switch (this.unit) {
			case CELSIUS:
				value = inputValue;
			case FAHRENHEIT:
				value = ((inputValue - 32) * 5) / 9;
			}
			this.inputValue = value;
		}

	}

	/**
	 * convert all values to celusis
	 * 
	 * @return
	 */
	public float getInputValue() {
		return this.inputValue;
	}

	public void setInputValue(float inputValue) {
		this.inputValue = inputValue;
	}

	public float getlLimit() {
		return lLimit;
	}

	public void setlLimit(float lLimit) {
		this.lLimit = lLimit;
	}

	public float getuLimit() {
		return uLimit;
	}

	public void setuLimit(float uLimit) {
		this.uLimit = uLimit;
	}

}
