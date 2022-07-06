package vitals;

public class RangeValidator {

	@FunctionalInterface
	public interface Validate {
		public boolean validateRange(RangeInputPOJO inputPOJO);
	}

	public static boolean rangeValidator(RangeInputPOJO inputPOJO) {
		if (inputPOJO.isLowLimitCheck()) {
			return lowRangeCheck(inputPOJO);
		} else if (!inputPOJO.isLowLimitCheck()) {
			return highRangeCheck(inputPOJO);
		}
		System.out.println(inputPOJO.getComputationName() + " is OKAY");
		return true;
	}

	public static boolean lowRangeCheck(RangeInputPOJO inputPOJO) {
		if (inputPOJO.getInputValue() < inputPOJO.getlLimit()) {
			System.out.println(inputPOJO.getComputationName() + " is LOW");
			return false;
		}
		return true;
	}

	public static boolean highRangeCheck(RangeInputPOJO inputPOJO) {
		if (inputPOJO.getInputValue() > inputPOJO.getlLimit()) {
			System.out.println(inputPOJO.getComputationName() + " is HIGH");
			return false;
		}
		return true;
	}

	public static Validate rangeValidator = (RangeInputPOJO inputPOJO) -> {
		return rangeValidator(inputPOJO);
	};

	public static RangeInputPOJO constructRangePOJO(float inputValue, float lLimit, float uLimit,
			String computationName, boolean isLowLimitCheck) {
		return new RangeInputPOJO(inputValue, lLimit, uLimit, computationName, isLowLimitCheck);
	}

}
