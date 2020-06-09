package com.abc.service;

import com.abc.bean.Employee;
import com.abc.bean.Equipment;
import com.abc.bean.Programmer;

//import com.abc.utils.Data;
import static com.abc.utils.Data.*;

public class NameListService {
	private Employee[] all; // �����洢ȫ��˾��Ա������
	
	// ��ʼ��all����ķ���, ���ݵ���Դ��Data.java
	private void init() {
		// 1.����all����, ��ָ������
		//all = new Employee[Data.EMPLOYEES.length];
		all = new Employee[EMPLOYEES.length];
		// 2.����Data��EMPLOYEES�еĶ�ά����, ��һ��һ�е����ݷ�װΪһ��һ����Employee,Programmer�ȵĶ���,�ŵ�all������
		for (int i = 0; i<EMPLOYEES.length; i++) {
			// EMPLOYEES[i][0]��Ա������
			int empType = Integer.parseInt(EMPLOYEES[i][0]);
			
			// ��Ϊÿһ��Ա������id,name,age,salary ������Щ���ݵĶ�ȡת�� ,����switch����
			int id = Integer.parseInt(EMPLOYEES[i][1]); // id
			String name = EMPLOYEES[i][2]; // ����
			int age = Integer.parseInt(EMPLOYEES[i][3]); // age
			double salary = Double.parseDouble(EMPLOYEES[i][4]); // н��
			
			switch(empType) {
				case EMPLOYEE:
					// all[i] = ����Employee����
					all[i] = new Employee(id, name, age, salary);
					break;
				case PROGRAMMER:
					// all[i] = ����Programmer����
					all[i] = new Programmer();
//					all[i] = new Programmer(id, name, age, salary, getEquipmentByLineNumber(i));
					break;
				case DESIGNER:
					// all[i] = ����Designer����
					break;
				case ARCHITECT:
					// all[i] = ����Architect����
					break;
			}
		}
	}
	
	// ��ȡ��i�е��豸����
	private Equipment getEquipmentByLineNumber(int i) {
		// �豸����: EQIPMENTS[i][0]
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
