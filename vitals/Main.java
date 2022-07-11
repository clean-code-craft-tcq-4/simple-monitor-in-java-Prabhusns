package vitals;

import java.util.Locale;

import vitals.Utils.Constants;
import vitals.Utils.LanguageHelper;
import vitals.tests.BatteryTest;

public class Main {

	static LanguageHelper languageUtils;
	static {
		languageUtils = new LanguageHelper(Locale.US);
	}

	public static void main(String[] args) {
		BatteryTest.testBattery(languageUtils);
		System.out.println(Constants.getWarningLimit(20));
	}

}
