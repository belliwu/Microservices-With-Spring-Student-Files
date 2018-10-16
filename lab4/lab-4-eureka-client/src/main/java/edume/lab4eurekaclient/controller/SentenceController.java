package edume.lab4eurekaclient.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SentenceController
{
	@Value("${words}")
	private String words;

	@Autowired
	private DiscoveryClient client;

	@GetMapping("/sentence")
	public @ResponseBody String getSentence()
	{
		return getWord("LAB-4-SUBJECT") + " " + getWord("LAB-4-VERB") + " " + getWord("LAB-4-ARTICLE") + " "
		+ getWord("LAB-4-ADJECTIVE") + " " + getWord("LAB-4-NOUN") + ".";
	}

	public String getWord(String service)
	{
		List<ServiceInstance> list = this.client.getInstances(service);
		if (list != null && list.size() > 0)
		{
			URI uri = list.get(0).getUri();
			if (uri != null)
			{
				return (new RestTemplate()).getForObject(uri, String.class);
			}
		}

		return null;
	}

	@GetMapping("/")
	public @ResponseBody String getWord()
	{
		System.out.println(">>>> words ---> " + words);
		String[] wordArray = words.split(",");
		int i = (int) Math.round(Math.random() * (wordArray.length - 1));

		return wordArray[i];
	}
}
