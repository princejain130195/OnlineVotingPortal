package Controller;

import java.util.Date;

public class Voter {
	
	//Voter Register Parameters
	private  int voter_id;
	private  String voter_firstName;
	private  String voter_lastName;
	private  String voter_fatherName;
	private  String voter_motherName;
	private  String voter_DOB;
	private  int voter_gender;
	private  int isActive;
	private  String voter_Addhar;
	private  String voter_userName;
	private  String voter_password;
	private  Date createtime;
	private  Date modtime;
	
	//Voter SignIn Parameters
	private  String voter_signin_userName;
	private  String voter_signin_password;
	
	/*
	 * public Voter Voter(Candidate candidate) { Voter voter = new Voter(); voter.
	 * 
	 * 
	 * return voter; }
	 */
	
	
	//Voter Hidden Status
	private  String hidden_status;
	
	/**
	 * @return the voter_id
	 */
	public int getVoter_id() {
		return voter_id;
	}
	/**
	 * @return the voter_firstName
	 */
	public String getVoter_firstName() {
		return voter_firstName;
	}
	/**
	 * @return the voter_lastName
	 */
	public String getVoter_lastName() {
		return voter_lastName;
	}
	/**
	 * @return the voter_fatherName
	 */
	public String getVoter_fatherName() {
		return voter_fatherName;
	}
	/**
	 * @return the voter_motherName
	 */
	public String getVoter_motherName() {
		return voter_motherName;
	}
	/**
	 * @return the voter_DOB
	 */
	public String getVoter_DOB() {
		return voter_DOB;
	}
	/**
	 * @return the voter_gender
	 */
	public int getVoter_gender() {
		return voter_gender;
	}
	/**
	 * @return the isActive
	 */
	public int getIsActive() {
		return isActive;
	}
	/**
	 * @return the voter_Addhar
	 */
	public String getVoter_Addhar() {
		return voter_Addhar;
	}
	/**
	 * @return the voter_userName
	 */
	public String getVoter_userName() {
		return voter_userName;
	}
	/**
	 * @return the voter_password
	 */
	public String getVoter_password() {
		return voter_password;
	}
	/**
	 * @return the createtime
	 */
	public Date getCreatetime() {
		return createtime;
	}
	/**
	 * @return the modtime
	 */
	public Date getModtime() {
		return modtime;
	}
	/**
	 * @param voter_id the voter_id to set
	 */
	public void setVoter_id(int voter_id) {
		this.voter_id = voter_id;
	}
	/**
	 * @param voter_firstName the voter_firstName to set
	 */
	public void setVoter_firstName(String voter_firstName) {
		this.voter_firstName = voter_firstName;
	}
	/**
	 * @param voter_lastName the voter_lastName to set
	 */
	public void setVoter_lastName(String voter_lastName) {
		this.voter_lastName = voter_lastName;
	}
	/**
	 * @param voter_fatherName the voter_fatherName to set
	 */
	public void setVoter_fatherName(String voter_fatherName) {
		this.voter_fatherName = voter_fatherName;
	}
	/**
	 * @param voter_motherName the voter_motherName to set
	 */
	public void setVoter_motherName(String voter_motherName) {
		this.voter_motherName = voter_motherName;
	}
	/**
	 * @param voter_DOB the voter_DOB to set
	 */
	public void setVoter_DOB(String voter_DOB) {
		this.voter_DOB = voter_DOB;
	}
	/**
	 * @param voter_gender the voter_gender to set
	 */
	public void setVoter_gender(int voter_gender) {
		this.voter_gender = voter_gender;
	}
	/**
	 * @param isActive the isActive to set
	 */
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	/**
	 * @param voter_Addhar the voter_Addhar to set
	 */
	public void setVoter_Addhar(String voter_Addhar) {
		this.voter_Addhar = voter_Addhar;
	}
	/**
	 * @param voter_userName the voter_userName to set
	 */
	public void setVoter_userName(String voter_userName) {
		this.voter_userName = voter_userName;
	}
	/**
	 * @param voter_password the voter_password to set
	 */
	public void setVoter_password(String voter_password) {
		this.voter_password = voter_password;
	}
	/**
	 * @param createtime the createtime to set
	 */
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	/**
	 * @param modtime the modtime to set
	 */
	public void setModtime(Date modtime) {
		this.modtime = modtime;
	}
	
	/**
	 * @return the voter_signin_userName
	 */
	public String getVoter_signin_userName() {
		return voter_signin_userName;
	}
	/**
	 * @return the voter_signin_password
	 */
	public String getVoter_signin_password() {
		return voter_signin_password;
	}
	/**
	 * @return the hidden_status
	 */
	public String getHidden_status() {
		return hidden_status;
	}
	/**
	 * @param voter_signin_userName the voter_signin_userName to set
	 */
	public void setVoter_signin_userName(String voter_signin_userName) {
		this.voter_signin_userName = voter_signin_userName;
	}
	/**
	 * @param voter_signin_password the voter_signin_password to set
	 */
	public void setVoter_signin_password(String voter_signin_password) {
		this.voter_signin_password = voter_signin_password;
	}
	/**
	 * @param hidden_status the hidden_status to set
	 */
	public void setHidden_status(String hidden_status) {
		this.hidden_status = hidden_status;
	}
	
	
}
