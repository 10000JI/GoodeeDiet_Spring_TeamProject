package com.goody.diet.cart;

import java.util.List;

import com.goody.diet.healthMachine.HealthMachineDTO;
import com.goody.diet.healthMachine.MachineReviewDTO;
import com.goody.diet.healthMachine.RealHealthMachineDTO;
import com.goody.diet.study.StudyDTO;

public class CartDTO {


	private Long num;
	private String id;
	private Long realMachineNum;
	private Long studyNum;
	private Long count;
	private Long status;
	private Long cartPrice;
	private Long orderNum;
	private RealHealthMachineDTO realHealthMachineDTO;
	private HealthMachineDTO healthMachineDTO;
	private List<StudyDTO> studyDTOs;
	

	public Long getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Long orderNum) {
		this.orderNum = orderNum;
	}

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getRealMachineNum() {
		return realMachineNum;
	}

	public void setRealMachineNum(Long realMachineNum) {
		this.realMachineNum = realMachineNum;
	}

	public Long getStudyNum() {
		return studyNum;
	}

	public void setStudyNum(Long studyNum) {
		this.studyNum = studyNum;
	}

	
	public Long getCount() {
		if(this.count==null || this.count<1) {
			this.count=1L;
		}
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public Long getStatus() {
		if(this.status==null || this.status<1) {
			this.status=0L;
		}
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getCartPrice() {
		return cartPrice;
	}

	public void setCartPrice(Long cartPrice) {
		this.cartPrice = cartPrice;
	}

	public RealHealthMachineDTO getRealHealthMachineDTO() {
		return realHealthMachineDTO;
	}

	public void setRealHealthMachineDTO(RealHealthMachineDTO realHealthMachineDTO) {
		this.realHealthMachineDTO = realHealthMachineDTO;
	}

	public HealthMachineDTO getHealthMachineDTO() {
		return healthMachineDTO;
	}

	public void setHealthMachineDTO(HealthMachineDTO healthMachineDTO) {
		this.healthMachineDTO = healthMachineDTO;
	}

	public List<StudyDTO> getStudyDTOs() {
		return studyDTOs;
	}

	public void setStudyDTOs(List<StudyDTO> studyDTOs) {
		this.studyDTOs = studyDTOs;
	}

	}
