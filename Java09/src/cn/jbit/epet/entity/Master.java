package cn.jbit.epet.entity;

/**
 * ����ʵ����
 * @author HSAEE
 */
public class Master {

	private int id; //���˱��
     private String loginId; //��¼�ʺ�
     private String  passWord;//��¼����
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
