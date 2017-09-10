package cn.jbit.epet.dao;

import cn.jbit.epet.entity.Pet;

/**
 * 宠物DAO接口
 * 
 * @author HSAEE
 * 
 */
public interface PetDao {
	/**
	 * 增加宠物
	 */
	public abstract int save(Pet pet);
	/**
	 * 删除宠物
	 */
	public abstract int del(Pet pet);
	/**
	 * 修改宠物
	 */
	public abstract int update(Pet pet);
}
