package nl.jemaja.SecurityTutorial;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderTest {

	public static void main(String[] args) {
		BCryptPasswordEncoder bpe = new BCryptPasswordEncoder();
		String encodedPWD = bpe.encode("devs@A!5003");
		System.out.println(encodedPWD);
		System.out.println("$2a$10$qnOB2PH1CqRvw8f5epvHzOlrounRkVGi.Y5ho6ENdmj/C1DmPdAsy");
	}
}