package edume.feignsentenceserver.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import edume.feignsentenceserver.model.Word;

@FeignClient("Noun")
public interface INoun
{
	@GetMapping("/")
	public Word getWord();
}
