package calendar.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class VacationApproval {
	private String apply_code;
	private String member_id;
    private String reaseon;
    private String progress;
    private String category;
}
