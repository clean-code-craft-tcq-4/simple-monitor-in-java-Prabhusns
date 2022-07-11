package vitals.utils;

import vitals.enums.Status;
import vitals.enums.Unit;
import vitals.model.RangeInputPOJO;

public class RangeValidator {

	public static boolean lowRangeCheck(RangeInputPOJO inputPOJO) {
		if (inputPOJO.getInputValue() < inputPOJO.getlLimit()) {
			return true;
		}
		return false;
	}

	public static boolean highRangeCheck(RangeInputPOJO inputPOJO) {
		if (inputPOJO.getInputValue() > inputPOJO.getuLimit()) {
			return true;
		}
		return false;
	}

	public static RangeInputPOJO constructRangePOJO(float inputValue, float lLimit, float uLimit) {
		return new RangeInputPOJO(inputValue, lLimit, uLimit);
	}

	public static RangeInputPOJO constructRangePOJO(float inputValue, float lLimit, float uLimit, Unit unit) {
		return new RangeInputPOJO(inputValue, lLimit, uLimit, unit);
	}

	public static Status checkWarnings(RangeInputPOJO inputPOJO) {
		if ((inputPOJO
				.getInputValue() < (inputPOJO.getlLimit() + Constants.getWarningLimit(inputPOJO.getInputValue())))) {
			return Status.LOW;
		} else if (inputPOJO
				.getInputValue() < (inputPOJO.getuLimit() - Constants.getWarningLimit(inputPOJO.getInputValue()))) {
			return Status.HIGH;
		} else {
			return Status.NORMAL;
		}

	}

}
