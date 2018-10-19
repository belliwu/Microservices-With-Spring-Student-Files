package edume.feignsentenceserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edume.feignsentenceserver.dao.IAdjective;
import edume.feignsentenceserver.dao.IArticle;
import edume.feignsentenceserver.dao.INoun;
import edume.feignsentenceserver.dao.ISubject;
import edume.feignsentenceserver.dao.IVerb;

@Service
public class SentenceServiceImpl implements SentenceService
{
	private IVerb verbService;
	private ISubject subjectService;
	private IArticle articleService;
	private IAdjective adjectiveService;
	private INoun nounService;

	/**
	 * Assemble a sentence by gathering random words of each part of speech:
	 */
	public String buildSentence()
	{
		String sentence = "There was a problem assembling the sentence!";
		sentence = String.format("%s %s %s %s %s.", subjectService.getWord().getString(), verbService.getWord().getString(),
		articleService.getWord().getString(), adjectiveService.getWord().getString(), nounService.getWord().getString());
		
		return sentence;
	}

	@Autowired
	public void setVerbService(IVerb verbService)
	{
		this.verbService = verbService;
	}

	@Autowired
	public void setSubjectService(ISubject subjectService)
	{
		this.subjectService = subjectService;
	}

	@Autowired
	public void setArticleService(IArticle articleService)
	{
		this.articleService = articleService;
	}

	@Autowired
	public void setAdjectiveService(IAdjective adjectiveService)
	{
		this.adjectiveService = adjectiveService;
	}

	@Autowired
	public void setNounService(INoun nounService)
	{
		this.nounService = nounService;
	}

}
