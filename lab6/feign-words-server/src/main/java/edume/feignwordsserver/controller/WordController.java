package edume.feignwordsserver.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WordController
{
	@Value("${words}")
	String[] words;
	private final Random random = new Random();

	@GetMapping("/")
	public Word getWord()
	{
		return new Word(words[random.nextInt(words.length)]);
	}
}
