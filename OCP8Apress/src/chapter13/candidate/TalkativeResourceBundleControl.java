package chapter13.candidate;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class TalkativeResourceBundleControl extends ResourceBundle.Control {
	@Override
	public List<Locale> getCandidateLocales(String baseName, Locale locale) {
		List<Locale> candidateLocales = super.getCandidateLocales(baseName, locale);
		System.out.printf("Candidate locales for base bundle name %s and locale %s %n", baseName,
				locale.getDisplayName());
		candidateLocales.forEach(System.out::println);
		return candidateLocales;
	}

}
