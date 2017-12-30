package chapter13.candidate;

import java.util.Locale;
import java.util.ResourceBundle;

class CandidateLocales {
	public static void loadResourceBundle(String resourceBundleName, Locale locale) {
		// Pass an instance of TalkativeResourceBundleControl
		// to print candidate locales
		ResourceBundle resourceBundle = ResourceBundle.getBundle(resourceBundleName, locale,
				new TalkativeResourceBundleControl());
		String rbLocaleName = resourceBundle.getLocale().toString();
		// if the resource bundle locale name is empty,
		// it means default property file
		if (rbLocaleName.equals("")) {
			System.out.println("Loaded the default property file with name: " + resourceBundleName);
		} else {
			System.out.println("Loaded the resource bundle for the locale: " + resourceBundleName + "." + rbLocaleName);
		}
	}

	public static void main(String[] args) {
		// trace how ResourceBundle_it_IT_Rome.properties is resolved
		loadResourceBundle("chapter13.candidate.Candidate", new Locale("it", "IT", "Rome"));
	}
}