package cn.jbit.epet.manager;
import java.util.Scanner;

import cn.jbit.epet.dao.*;
import cn.jbit.epet.dao.impl.MasterDaoSQLServerImpl;
import cn.jbit.epet.dao.impl.PetDaoSQLServerImpl;
import cn.jbit.epet.entity.Master;
import cn.jbit.epet.entity.Pet;
/**
 * 主人业务类
 * @author HSAEE
 *
 */
public class MasterManager {
	 Master master1 =null;
 /**
  * 主人登录
  */
 public void login(){
	 Master master =new Master();
	 Scanner input=new Scanner(System.in);
	 System.out.println("----欢迎光临宠物乐园----");
	 System.out.print("请输入登录名：");
	 String loginId=input.next();
	 System.out.print("请输入密码：");
	 String passWord=input.next();
	 master.setLoginId(loginId);
	 master.setPassWord(passWord);
	 MasterDao masterDao=new MasterDaoSQLServerImpl();
	 master1=masterDao.findmMaster(master);
	 if(master1!=null){
		 System.out.println("登录成功！");
	 }else{
		 System.out.println("用户名或密码错误，登录失败！");
	 } 
 }
 public void adoptPet(){
	Scanner input=new Scanner(System.in) ;
	if(master1==null){
		login();
		adoptPet();
	}else{
		PetDao petDao =new PetDaoSQLServerImpl();
	System.out.println("请输入宠物类型");
	System.out.println("狗狗|企鹅|猫咪|");
	Pet pet =new Pet();
	pet.setName(input.nextLine().trim());
	int num=petDao.save(pet);
	if(num==1){
		System.out.println("领养成功！");
	}else{
		System.out.println("输入类型有误，领养失败");	
	}
		
		
		
		
		
		
	}
 }
}
