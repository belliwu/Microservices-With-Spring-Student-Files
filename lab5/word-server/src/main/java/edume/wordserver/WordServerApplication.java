package edume.wordserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WordServerApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(WordServerApplication.class, args);
	}
}