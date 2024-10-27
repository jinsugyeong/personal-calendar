package calendar.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import calendar.dto.Member;

@Mapper
public interface MemberMapper {
	List<Member> findAll();
}
