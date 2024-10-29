package calendar.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Calendar {
	private String code;
	private String member_id;
	private String calendar_category_code;
	private String calendar_type_code;
	private String title;
	private String memo;
	private String startdate;
	private String enddate;
	private String createdAt;
	private String updatedAt;
}
