package com.abc.bean;


/**
 * 程序员-员工类的子类
 * @author lixiuhai
 *
 */
public class Programmer extends Employee {
	private int memberId; // 团队编号,加入到团队才分配
	private Status status;
	private Equipment equipment;
	public Programmer() {
		super();
	}
	public Programmer(int id, String name, double salary, int memberId, Status status, Equipment equipment) {
		super(id, name, salary);
		this.memberId = memberId;
		this.status = status;
		this.equipment = equipment;
	}
	public Programmer(int id, String name, double salary, Equipment equipment) {
		super(id, name, salary);
		this.equipment = equipment;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Equipment getEquipment() {
		return equipment;
	}
	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}
	@Override
	public String toString() {
		return "Programmer [memberId=" + memberId + ", status=" + status + ", equipment=" + equipment + "]";
	}
	
	
}
