package com.abc.service;

import com.abc.bean.Employee;
import com.abc.bean.Equipment;
import com.abc.bean.Programmer;

//import com.abc.utils.Data;
import static com.abc.utils.Data.*;

public class NameListService {
	private Employee[] all; // 用来存储全公司的员工对象
	
	// 初始化all数组的方法, 数据的来源是Data.java
	private void init() {
		// 1.创建all数组, 并指定长度
		//all = new Employee[Data.EMPLOYEES.length];
		all = new Employee[EMPLOYEES.length];
		// 2.遍历Data种EMPLOYEES中的二维数组, 把一行一行的数据封装为一个一个的Employee,Programmer等的对象,放到all数组中
		for (int i = 0; i<EMPLOYEES.length; i++) {
			// EMPLOYEES[i][0]是员工类型
			int empType = Integer.parseInt(EMPLOYEES[i][0]);
			
			// 因为每一种员工都有id,name,age,salary 所以这些数据的读取转换 ,放在switch上面
			int id = Integer.parseInt(EMPLOYEES[i][1]); // id
			String name = EMPLOYEES[i][2]; // 姓名
			int age = Integer.parseInt(EMPLOYEES[i][3]); // age
			double salary = Double.parseDouble(EMPLOYEES[i][4]); // 薪资
			
			switch(empType) {
				case EMPLOYEE:
					// all[i] = 创建Employee对象
					all[i] = new Employee(id, name, age, salary);
					break;
				case PROGRAMMER:
					// all[i] = 创建Programmer对象
					all[i] = new Programmer();
//					all[i] = new Programmer(id, name, age, salary, getEquipmentByLineNumber(i));
					break;
				case DESIGNER:
					// all[i] = 创建Designer对象
					break;
				case ARCHITECT:
					// all[i] = 创建Architect对象
					break;
			}
		}
	}
	
	// 读取第i行的设备对象
	private Equipment getEquipmentByLineNumber(int i) {
		// 设备类型: EQIPMENTS[i][0]
		int eType = Integer.parseInt(EQIPMENTS[i][0]);
		
		switch(eType) {
			case PC:
				return new PC(EQIPMENTS[i][1],EQIPMENTS[i][2]);
			case NOTEBOOK:
				return new NoteBook(EQIPMENTS[i][1],Double.parseDouble(EQIPMENTS[i][2]));
			case PRINTER:
				return new Printer(EQIPMENTS[i][1],EQIPMENTS[i][2]);
		}
		return null;
	}
}
