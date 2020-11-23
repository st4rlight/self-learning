package cn.st4rlight.selflearning.model;

import lombok.Data;

@Data
public class FavoriteAV {
	private Integer id;
	private Integer videoId;

	private Integer startTime;
	private Integer endTime;
}
