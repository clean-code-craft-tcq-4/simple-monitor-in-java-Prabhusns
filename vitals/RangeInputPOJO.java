package vitals;

public class RangeInputPOJO {
	float inputValue;
	float lLimit = 0.0f;
	float uLimit;

	public RangeInputPOJO(float inputValue, float lLimit, float uLimit) {
		super();
		this.inputValue = inputValue;
		this.lLimit = lLimit;
		this.uLimit = uLimit;
	}

	public float getInputValue() {
		return inputValue;
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
