package cn.jbit.epet.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cn.jbit.epet.dao.*;
import cn.jbit.epet.entity.Master;

public class MasterDaoSQLServerImpl extends BaseDao implements MasterDao {

	@Override
	public Master findmMaster(Master master) {
		conn = getConnection();
		try {
			PreparedStatement pstmt = null;
			String sql = "select * from master where loginId=? and password=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, master.getLoginId());
			pstmt.setString(2, master.getPassWord());
			ResultSet set = pstmt.executeQuery();
			if (set.next()) {
				Master master2 = new Master();
				return master2;
			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
