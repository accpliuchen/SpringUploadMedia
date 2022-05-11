package media.baton;

import media.baton.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class UploadFileDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(UploadFileDemoApplication.class, args);
    }
}