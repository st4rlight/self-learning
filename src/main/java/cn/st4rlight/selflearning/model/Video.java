package cn.st4rlight.selflearning.model;

import lombok.Data;
import java.time.LocalDate;


@Data
public class Video {
	private Integer id;
	private String avCode;
	private String title;
	private String coverUrl;
	private LocalDate releaseDate;

	private Boolean canDownload;
	private Boolean hasChineseSub;
}