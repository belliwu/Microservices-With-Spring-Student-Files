package edume.feignsentenceserver.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import edume.feignsentenceserver.model.Word;

@FeignClient("SUBJECT")
public interface ISubject
{
	@GetMapping("/")
	public Word getWord();
}
