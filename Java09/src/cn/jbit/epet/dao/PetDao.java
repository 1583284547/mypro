package cn.jbit.epet.dao;

import cn.jbit.epet.entity.Pet;

/**
 * ����DAO�ӿ�
 * 
 * @author HSAEE
 * 
 */
public interface PetDao {
	/**
	 * ���ӳ���
	 */
	public abstract int save(Pet pet);
	/**
	 * ɾ������
	 */
	public abstract int del(Pet pet);
	/**
	 * �޸ĳ���
	 */
	public abstract int update(Pet pet);
}
