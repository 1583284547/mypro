package cn.jbit.epet.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.jbit.epet.dao.BaseDao;
import cn.jbit.epet.dao.PetDao;
import cn.jbit.epet.entity.Pet;

public class PetDaoSQLServerImpl extends BaseDao implements PetDao{

	@Override
	public int save(Pet pet) {
		int num=0;
		PreparedStatement preparedStatement=null;
		conn=getConnection();
		try {
			String sql="select typeId from Pet_type where typeName=?";
			preparedStatement=conn.prepareStatement(sql);
			preparedStatement.setString(1, pet.getName());
			ResultSet set=preparedStatement.executeQuery();
			if(set.next()){
				num=set.getInt("typeId");
			}else {
				return num;
			}
			closeAll(conn, preparedStatement, set);
			return num;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	public int del(Pet pet) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Pet pet) {
		String sql="update Pet set status=0 where id=?";
		Object[] param={pet.getId()};
		int result=this.exceuteUpate(sql, param);
		return result;
	}

}
