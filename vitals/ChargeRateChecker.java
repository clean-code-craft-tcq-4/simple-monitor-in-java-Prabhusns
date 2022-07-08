package vitals;

public class ChargeRateChecker implements ValidatorInterface {

	@Override
	public boolean validateRange(RangeInputPOJO inputPOJO) {
		if (RangeValidator.highRangeCheck(inputPOJO)) {
			System.out.println("Charge rate is out of range");
			return false;
		}
		System.out.println("Charge rate is okay");
		return true;
	}

}
