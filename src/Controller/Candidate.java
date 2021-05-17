package Controller;

import java.util.Date;

public class Candidate {
	
	private static int id;
	private static String candidate_firstName;
	private static String candidate_lastName;
	private static char candidate_gender;
	private static Date candidate_DOB;
	private static int candidate_signid;
	private static String candidate_userName;
	private static String candidate_password;
	private static Date createtime;
	private static Date modtime;
	
	/**
	 * @return the id
	 */
	public static int getId() {
		return id;
	}
	/**
	 * @return the candidate_firstName
	 */
	public static String getCandidate_firstName() {
		return candidate_firstName;
	}
	/**
	 * @return the candidate_lastName
	 */
	public static String getCandidate_lastName() {
		return candidate_lastName;
	}
	/**
	 * @return the candidate_gender
	 */
	public static int getCandidate_gender() {
		return candidate_gender;
	}
	/**
	 * @return the candidate_age
	 */
	public static Date getCandidate_DOB() {
		return candidate_DOB;
	}
	/**
	 * @return the candidate_signid
	 */
	public static int getCandidate_signid() {
		return candidate_signid;
	}
	/**
	 * @return the candidate_userName
	 */
	public static String getCandidate_userName() {
		return candidate_userName;
	}
	/**
	 * @return the candidate_password
	 */
	public static String getCandidate_password() {
		return candidate_password;
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
	 * @param id the id to set
	 */
	public static void setId(int id) {
		Candidate.id = id;
	}
	/**
	 * @param candidate_firstName the candidate_firstName to set
	 */
	public static void setCandidate_firstName(String candidate_firstName) {
		Candidate.candidate_firstName = candidate_firstName;
	}
	/**
	 * @param candidate_lastName the candidate_lastName to set
	 */
	public static void setCandidate_lastName(String candidate_lastName) {
		Candidate.candidate_lastName = candidate_lastName;
	}
	/**
	 * @param candidate_gender the candidate_gender to set
	 */
	public static void setCandidate_gender(char candidate_gender) {
		Candidate.candidate_gender = candidate_gender;
	}
	/**
	 * @param candidate_age the candidate_DOB to set
	 */
	public static void setCandidate_age(Date candidate_DOB) {
		Candidate.candidate_DOB = candidate_DOB;
	}
	/**
	 * @param candidate_signid the candidate_signid to set
	 */
	public static void setCandidate_signid(int candidate_signid) {
		Candidate.candidate_signid = candidate_signid;
	}
	/**
	 * @param candidate_userName the candidate_userName to set
	 */
	public static void setCandidate_userName(String candidate_userName) {
		Candidate.candidate_userName = candidate_userName;
	}
	/**
	 * @param candidate_password the candidate_password to set
	 */
	public static void setCandidate_password(String candidate_password) {
		Candidate.candidate_password = candidate_password;
	}
	/**
	 * @param createtime the createtime to set
	 */
	public static void setCreatetime(Date createtime) {
		Candidate.createtime = createtime;
	}
	/**
	 * @param modtime the modtime to set
	 */
	public static void setModtime(Date modtime) {
		Candidate.modtime = modtime;
	}
	
	
	
	

}
