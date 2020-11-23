package cn.st4rlight.selflearning.utils.impl;

import cn.hutool.http.Header;
import cn.hutool.http.HttpRequest;
import cn.st4rlight.selflearning.utils.IGetDOM;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Component;


@Component
public class JavDBGetter implements IGetDOM {
	public static final String ACTRESS_BASE_URL = "https://javdb.com/actors/";
	public static final String VIDEO_BASE_URL = "https://javdb.com/v/";
	public static final int TIME_OUT = 10_000;

	@Override
	public Document getActressDOM(String actorCode) {
		HttpRequest request = HttpRequest.get(ACTRESS_BASE_URL + actorCode);
		request = setHeader(request);
		String domStr = request.timeout(TIME_OUT).execute().body();

		System.out.println(domStr);
		return Jsoup.parse(domStr);
	}


	@Override
	public Document getVideoDOM(String videoCode) {
		HttpRequest request = HttpRequest.get(VIDEO_BASE_URL + videoCode);
		request = setHeader(request);
		String domStr = request.timeout(TIME_OUT).execute().body();

		System.out.println(domStr);
		return Jsoup.parse(domStr);
	}


	public HttpRequest setHeader(HttpRequest request) {
		return request.header(Header.ACCEPT, "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
				.header(Header.ACCEPT_CHARSET, "utf-8")
				.header(Header.ACCEPT_LANGUAGE, "zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2")
				.header(Header.ACCEPT_ENCODING, "gzip, deflate, br")
				.header(Header.CACHE_CONTROL, "max-age=0")
				.header(Header.COOKIE, "__cf_bm=b211973dedf15b8260d0695bd822ffc37ecefe2c-1606149391-1800-AQCa2Ce34supWcfHIYnuD1HieUJd1Jyd6o3McmH1sN8p48Z6lk0XFImkxYSB6K7x31KvqrQzGjR+yEp1yOjC5LSS3tKzRi7Tw8KUoiDpf2miLeOjMErfSHMbGu4/YTsPh3WvW8JoVfugNHerhJ13/Gs=; __cfduid=db2463f3a7d8a7aab5e7196d5f73197161606146394; _jdb_session=peeulkFl7o276xyKSHT0EXID9kdl4IgkBurFJBaEzj0xcJsmiZ%2B3CFTEYzWutyTwilzSunJGCe%2FVr1jSuE4M1Vrx3ROIEmc3XemQKalb%2F16MyQxhWW9orqPZ%2BEco89C9DiAaEQ5qYdFauhxJqa2tV8CcgivCcukQE%2BGiwvyWNynr9bCztf%2F4ojCKnjMevujZXTP5QITIsIABT0r8M6G6DrBJYXADZI3wOxihQ0YWD1C0fumb6boqcCy7KNnuLYTZCW3rXbOUyCsDNHSpyjYpaBwuvV3c1PtNREWLWgRkQtmhxY%2Fpr6USgiY1--CDShDL0DwfL9Ixc6--6xP%2BcWW2qlkOYBZcehoCPQ%3D%3D; over18=1; _ga=GA1.2.275871288.1606146400; _gid=GA1.2.239763836.1606146400; theme=auto; locale=zh; _gat_gtag_UA_160995389_2=1")
				.header(Header.HOST, "javdb.com")
				.header(Header.REFERER, "https://javdb.com")
				.header(Header.USER_AGENT, "Mozilla/5.0 (X11; Linux x86_64; rv:68.0) Gecko/20100101 Firefox/68.0");
	}
}
