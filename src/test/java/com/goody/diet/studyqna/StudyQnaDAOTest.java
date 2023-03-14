package com.goody.diet.studyqna;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.goody.diet.MyTestCase;
import com.goody.diet.board.BbsDTO;
import com.goody.diet.board.studyqna.StudyQnaDAO;
import com.goody.diet.util.Pager;

public class StudyQnaDAOTest extends MyTestCase {

	@Autowired
	private StudyQnaDAO studyQnaDAO;
	
	@Test
	public void getBoardList() throws Exception {
		Pager pager = new Pager();
		List<BbsDTO> ar = studyQnaDAO.getBoardList(pager);
		assertNotEquals(0, ar.size());
	}

}
