package edume.feignsentenceserver.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import edume.feignsentenceserver.model.Word;

@FeignClient("Article")
public interface IArticle
{
	@GetMapping("/")
	public Word getWord();
}
