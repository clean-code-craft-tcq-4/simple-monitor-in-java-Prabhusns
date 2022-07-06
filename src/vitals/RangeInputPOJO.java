package vitals;

public class RangeInputPOJO {
	float inputValue;
	float lLimit = 0.0f;
	float uLimit;
	String computationName;
	boolean isLowLimitCheck;

	public RangeInputPOJO(float inputValue, float lLimit, float uLimit, String computationName,
			boolean isLowLimitCheck) {
		super();
		this.inputValue = inputValue;
		this.lLimit = lLimit;
		this.uLimit = uLimit;
		this.computationName = computationName;
		this.isLowLimitCheck = isLowLimitCheck;
	}

	public RangeInputPOJO(float inputValue, float uLimit, String computationName, boolean isLowLimitCheck) {
		super();
		this.inputValue = inputValue;
		this.uLimit = uLimit;
		this.computationName = computationName;
		this.isLowLimitCheck = isLowLimitCheck;
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

	public String getComputationName() {
		return computationName;
	}

	public void setComputationName(String computationName) {
		this.computationName = computationName;
	}

	public boolean isLowLimitCheck() {
		return isLowLimitCheck;
	}

	public void setLowLimitCheck(boolean isLowLimitCheck) {
		this.isLowLimitCheck = isLowLimitCheck;
	}

}
