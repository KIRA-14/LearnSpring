package qa.kira.dev.encryption.encryptiontool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="qa.kira.dev")
public class EncryptionToolApplication  {

	public static void main(String[] args) {
		SpringApplication.run(EncryptionToolApplication.class, args);
	}

}
