package com.goody.diet.board.machineqna;

import java.util.List;

import com.goody.diet.board.BoardDTO;
import com.goody.diet.board.BoardFileDTO;

public class MachineQnaDTO extends BoardDTO {
	private Long ref;
	private Long step;
	private Long depth;
	
	private List<BoardFileDTO> boardFileDTOs;
	
	public Long getRef() {
		return ref;
	}
	public void setRef(Long ref) {
		this.ref = ref;
	}
	public Long getStep() {
		return step;
	}
	public void setStep(Long step) {
		this.step = step;
	}
	public Long getDepth() {
		return depth;
	}
	public void setDepth(Long depth) {
		this.depth = depth;
	}
	public List<BoardFileDTO> getBoardFileDTOs() {
		return boardFileDTOs;
	}
	public void setBoardFileDTOs(List<BoardFileDTO> boardFileDTOs) {
		this.boardFileDTOs = boardFileDTOs;
	}
	
	
}