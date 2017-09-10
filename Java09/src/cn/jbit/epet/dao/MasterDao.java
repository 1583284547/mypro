package cn.jbit.epet.dao;

import cn.jbit.epet.entity.Master;
/**
 * 主人DAO接口
 * @author HSAEE
 *
 */
public interface MasterDao {
	/*
	 * 登录
	 */
 public abstract Master findmMaster(Master master);
}
