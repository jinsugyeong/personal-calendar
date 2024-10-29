package calendar.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Team {
	private String name;
	private String depth;
    private String parentTeam;
    private String createdAt;
    private String updateddAt;
}
