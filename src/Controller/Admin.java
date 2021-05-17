package Controller;

import java.util.Date;

public class Admin {
	
	private static int admin_id;
	private static String admin_firstName;
	private static String admin_lastName;
	private static String admin_userName;
	private static String admin_password;
	private static Date createtime;
	private static Date modtime;
	
	/**
	 * @return the admin_id
	 */
	public static int getAdmin_id() {
		return admin_id;
	}
	/**
	 * @return the admin_firstName
	 */
	public static String getAdmin_firstName() {
		return admin_firstName;
	}
	/**
	 * @return the admin_lastName
	 */
	public static String getAdmin_lastName() {
		return admin_lastName;
	}
	/**
	 * @return the admin_userName
	 */
	public static String getAdmin_userName() {
		return admin_userName;
	}
	/**
	 * @return the admin_password
	 */
	public static String getAdmin_password() {
		return admin_password;
	}
	/**
	 * @return the createtime
	 */
	public static Date getCreatetime() {
		return createtime;
	}
	/**
	 * @return the modtime
	 */
	public static Date getModtime() {
		return modtime;
	}
	/**
	 * @param admin_id the admin_id to set
	 */
	public static void setAdmin_id(int admin_id) {
		Admin.admin_id = admin_id;
	}
	/**
	 * @param admin_firstName the admin_firstName to set
	 */
	public static void setAdmin_firstName(String admin_firstName) {
		Admin.admin_firstName = admin_firstName;
	}
	/**
	 * @param admin_lastName the admin_lastName to set
	 */
	public static void setAdmin_lastName(String admin_lastName) {
		Admin.admin_lastName = admin_lastName;
	}
	/**
	 * @param admin_userName the admin_userName to set
	 */
	public static void setAdmin_userName(String admin_userName) {
		Admin.admin_userName = admin_userName;
	}
	/**
	 * @param admin_password the admin_password to set
	 */
	public static void setAdmin_password(String admin_password) {
		Admin.admin_password = admin_password;
	}
	/**
	 * @param createtime the createtime to set
	 */
	public static void setCreatetime(Date createtime) {
		Admin.createtime = createtime;
	}
	/**
	 * @param modtime the modtime to set
	 */
	public static void setModtime(Date modtime) {
		Admin.modtime = modtime;
	}
	

}
