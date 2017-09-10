package cn.jbit.epet.entity;

/**
 * 主人实体类
 * @author HSAEE
 */
public class Master {

	private int id; //主人编号
     private String loginId; //登录帐号
     private String  passWord;//登录密码
     public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}
