package calendar.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class VacationApply {
	private String code;
	private String member_id;
    private String category;
    private String startdate;
    private String enddate;
    private String days;
    private String reaseon;
    private String progress;
}
