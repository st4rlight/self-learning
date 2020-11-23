package cn.st4rlight.selflearning.utils;

import org.jsoup.nodes.Document;

public interface IGetDOM {

	Document getActressDOM(String actorCode);
	Document getVideoDOM(String videoCode);
}
