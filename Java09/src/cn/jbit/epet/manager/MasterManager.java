package cn.jbit.epet.manager;
import java.util.Scanner;

import cn.jbit.epet.dao.*;
import cn.jbit.epet.dao.impl.MasterDaoSQLServerImpl;
import cn.jbit.epet.dao.impl.PetDaoSQLServerImpl;
import cn.jbit.epet.entity.Master;
import cn.jbit.epet.entity.Pet;
/**
 * ����ҵ����
 * @author HSAEE
 *
 */
public class MasterManager {
	 Master master1 =null;
 /**
  * ���˵�¼
  */
 public void login(){
	 Master master =new Master();
	 Scanner input=new Scanner(System.in);
	 System.out.println("----��ӭ���ٳ�����԰----");
	 System.out.print("�������¼����");
	 String loginId=input.next();
	 System.out.print("���������룺");
	 String passWord=input.next();
	 master.setLoginId(loginId);
	 master.setPassWord(passWord);
	 MasterDao masterDao=new MasterDaoSQLServerImpl();
	 master1=masterDao.findmMaster(master);
	 if(master1!=null){
		 System.out.println("��¼�ɹ���");
	 }else{
		 System.out.println("�û�����������󣬵�¼ʧ�ܣ�");
	 } 
 }
 public void adoptPet(){
	Scanner input=new Scanner(System.in) ;
	if(master1==null){
		login();
		adoptPet();
	}else{
		PetDao petDao =new PetDaoSQLServerImpl();
	System.out.println("�������������");
	System.out.println("����|���|è��|");
	Pet pet =new Pet();
	pet.setName(input.nextLine().trim());
	int num=petDao.save(pet);
	if(num==1){
		System.out.println("�����ɹ���");
	}else{
		System.out.println("����������������ʧ��");	
	}
		
		
		
		
		
		
	}
 }
}
