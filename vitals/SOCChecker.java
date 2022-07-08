package vitals;

public class SOCChecker implements ValidatorInterface {
	@Override
	public boolean validateRange(RangeInputPOJO inputPOJO) {
		if (RangeValidator.lowRangeCheck(inputPOJO) || RangeValidator.highRangeCheck(inputPOJO)) {
			System.out.println("SOC is out of range");
			return false;
		}
		System.out.println("SOC is Okay");
		return true;
	}
}
