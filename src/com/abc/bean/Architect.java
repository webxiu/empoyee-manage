package com.abc.bean;

/**
 * º‹ππ ¶¿‡
 * @author lixiuhai
 *
 */
public class Architect extends Designer {
	private int stock;

	public Architect() {
		super();
	}

	public Architect(int id, String name, double salary, Equipment equipment, double bonus, int stock) {
		super(id, name, salary, equipment, bonus);
		this.stock = stock;
	}

	public Architect(int id, String name, double salary, int memberId, Status status, Equipment equipment, double bonus,
			int stock) {
		super(id, name, salary, memberId, status, equipment, bonus);
		this.stock = stock;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Architect [stock=" + stock + "]";
	}
	
}
