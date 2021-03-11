package com.java.freeboard.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberSQLMapper {
	String selectNow();
}
