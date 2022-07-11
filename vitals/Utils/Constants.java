package vitals.Utils;

public interface Constants {

	String localeFolderName = "vitals.locale.MessageBundle";

	String tempStr = "Temperature";
	float tempLowLimit = 0;
	float tempUpLimit = 45;

	String socStr = "State of Charge";
	float socLowLimit = 20;
	float socUpLimit = 80;

	String crStr = "Charging Rate";
	float crLowLimit = 0.0f;
	float crUpLimit = 0.8f;

	float warningPercentage = 5.0f;

	static float getWarningLimit(float limit) {
		return limit * (warningPercentage / 100.0f);
	}

}
