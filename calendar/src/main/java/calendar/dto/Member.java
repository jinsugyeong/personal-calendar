package calendar.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Member {
	private String id;
	private String pw;
    private String name;
    private String email;
    private String level_code;
    private String team_name;
    private String createdAt;
    private String updateddAt;
}
