package vitals;

@FunctionalInterface
public interface ValidatorInterface {
	public boolean validateRange(RangeInputPOJO inputPOJO);
}
