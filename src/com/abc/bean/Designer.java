package com.abc.bean;
/**
 * …Ëº∆ ¶
 * @author lixiuhai
 *
 */
public class Designer extends Programmer {
	private double bonus;

	public Designer() {
		super();
	}

	public Designer(int id, String name, double salary, Equipment equipment, double bonus) {
		super(id, name, salary, equipment);
		this.bonus = bonus;
	}

	public Designer(int id, String name, double salary, int memberId, Status status, Equipment equipment,
			double bonus) {
		super(id, name, salary, memberId, status, equipment);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Designer [bonus=" + bonus + "]";
	}
	
}
