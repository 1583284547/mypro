package cn.jbit.epet.Test;
import cn.jbit.epet.manager.MasterManager;
public class Test1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MasterManager masterManager=new MasterManager();
		masterManager.login();
		masterManager.adoptPet();
	}
	}

