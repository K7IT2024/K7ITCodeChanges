package com.deva.vara.nani;

public class SystemProperties {
	public static void main(String[] args) {

		String name = System.getProperty("name");
		int sai = Integer.parseInt(System.getProperty("sai"));
		double rock = Double.parseDouble(System.getProperty("rock"));
		double deva = Double.parseDouble(System.getProperty("deva"));
		System.out.println("name->" + name + ",sai" + sai + ",rock:" + rock + ",deva:" + deva);
		System.out.println("name->" + name + " sai->" + sai + " rock->" + rock + " deva->" + deva);
		System.out.println(name + "  " + sai + "  " + rock + "  " + deva);

		System.out.println(" name:"+name+" sai:"+sai+" rock:"+rock+" deva:"+deva);
		

 System.out.println("name"+name);
	}

}
