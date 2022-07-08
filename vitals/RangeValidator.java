package vitals;

public class RangeValidator {

	public static boolean lowRangeCheck(RangeInputPOJO inputPOJO) {
		if (inputPOJO.getInputValue() < inputPOJO.getlLimit()) {
			return false;
		}
		return true;
	}

	public static boolean highRangeCheck(RangeInputPOJO inputPOJO) {
		if (inputPOJO.getInputValue() > inputPOJO.getuLimit()) {
			return false;
		}
		return true;
	}

	public static RangeInputPOJO constructRangePOJO(float inputValue, float lLimit, float uLimit) {
		return new RangeInputPOJO(inputValue, lLimit, uLimit);
	}

}
