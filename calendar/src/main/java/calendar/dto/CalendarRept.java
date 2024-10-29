package calendar.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class CalendarRept {
	private String code;
	private String calendar_code;
	private String startdate;
	private String enddate;
	private String type;
	private int year;
	private int month;
	private int week;
	private String weekday;
	private int day;
}
