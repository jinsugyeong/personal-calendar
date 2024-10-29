package calendar.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class CalendarCategory {
	private String code;
	private String member_id;
	private String name;
	private String color;
	private String memo;
	private int sort;
	private String enddate;
	private String createdAt;
	private String updatedAt;
}
