package com.sample.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class BoardDao {
	
	@Autowired
	SqlSession sqlSession;
	
	public BoardDao() {}

	public BoardDao(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public List<BoardVo> boardList() {
		List<BoardVo> boardVo = sqlSession.selectList("BoardVo.boardList");
		return boardVo;
	}
}
