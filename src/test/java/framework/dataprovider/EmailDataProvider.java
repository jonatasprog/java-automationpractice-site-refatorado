package framework.dataprovider;

import java.util.Random;

public class EmailDataProvider {
	private static final String CHAR_LIST = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	private static final int RANDOM_STRING_LENGTH = 5;

	/**
	 * This method generates random string
	 * 
	 * @return
	 */
	public String generateRandomString() {
		StringBuffer randomString = new StringBuffer();
		for (int i = 0; i < RANDOM_STRING_LENGTH; i++) {
			int number = getRandomNumber();
			char ch = CHAR_LIST.charAt(number);
			randomString.append(ch);
		}
		return randomString.toString();
	}

	/**
	 * This method generates random numbers
	 * 
	 * @return int
	 */
	private int getRandomNumber() {
		int randomInt = 0;
		Random randomGenerator = new Random();
		randomInt = randomGenerator.nextInt(CHAR_LIST.length());
		if (randomInt - 1 == -1) {
			return randomInt;
		} else {
			return randomInt - 1;
		}
	}

	public String gerarEmail() {
		EmailDataProvider instance = new EmailDataProvider();

		String emailFirstSection = instance.generateRandomString();
		String emailSecondSection = instance.generateRandomString();
		String emailDominio = "com";

		return emailFirstSection + "@" + emailSecondSection + "." + emailDominio;

	}

	@Override
	public String toString() {
		return gerarEmail();
	}
}
