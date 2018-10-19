package edume.feignsentenceserver.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import edume.feignsentenceserver.model.Word;

@FeignClient("Verb")
public interface IVerb
{
	@GetMapping("/")
	public Word getWord();
}
