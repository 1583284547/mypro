package cn.jbit.epet.entity;

import java.sql.Date;

/**
 * ����ʵ����
 * 
 * @author HSAEE
 */
public class Pet {
private	int id;// ����id
private int masterId;// ����id
private String name; // ��������
private int health;// ����ֵ
private int love; // ���ܶ�
private Date adoptTime;// ����ʱ��
private String status; // ״̬

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMasterId() {
		return masterId;
	}

	public void setMasterId(int masterId) {
		this.masterId = masterId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}

	public Date getAdoptTime() {
		return adoptTime;
	}

	public void setAdoptTime(Date adoptTime) {
		this.adoptTime = adoptTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
