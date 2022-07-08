package vitals;

public class TemperatureChecker implements ValidatorInterface {

	@Override
	public boolean validateRange(RangeInputPOJO inputPOJO) {
		if (RangeValidator.lowRangeCheck(inputPOJO) || RangeValidator.highRangeCheck(inputPOJO)) {
			System.out.println("Temperature out of range");
			return false;
		}
		System.out.println("Temperature is Okay");
		return true;
	}

}
