package com.java.freeboard.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.java.freeboard.mapper.MemberSQLMapper;

@Service
public class MemberService {
	
	@Autowired MemberSQLMapper memberSQLMapper;
	
	
	public String selectNow() {
		return memberSQLMapper.selectNow();
	}
	
	
	
}
