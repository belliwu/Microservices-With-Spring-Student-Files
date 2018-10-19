package edume.feignsentenceserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edume.feignsentenceserver.service.SentenceService;

@Controller
public class SentenceController
{
	@Autowired
	private SentenceService sentenceService;

	/**
	 * Display a small list of Sentences to the caller:
	 */
	@GetMapping("/sentence")
	public @ResponseBody String getSentences()
	{
		return "<h3>Some Sentences</h3><br/>" + 
	     this.sentenceService.buildSentence() + 
	     "<br/><br/>" + 
	     this.sentenceService.buildSentence() +
	     "<br/><br/>" + 
	     this.sentenceService.buildSentence() +
	     "<br/><br/>" +
	     this.sentenceService.buildSentence() +
	     "<br/><br/>"
		+ this.sentenceService.buildSentence() + "<br/><br/>";
	}
}
