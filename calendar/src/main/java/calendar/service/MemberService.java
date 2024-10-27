package calendar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import calendar.dto.Member;
import calendar.mapper.MemberMapper;

@Service
@Transactional
public class MemberService {
	private final MemberMapper memberMapper;
	
	
	public MemberService(MemberMapper memberMapper) {
		this.memberMapper = memberMapper;
	}
	
	@Autowired
	public List<Member> findAll() {
		return memberMapper.findAll();
	}

}
