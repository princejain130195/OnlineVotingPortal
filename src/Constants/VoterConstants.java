package Constants;

public class VoterConstants {
	
	public static final String VOTER_TABLE = " tt_voter";
	
	public static final String INSERT = "insert into ";
	public static final String SELECT = "select ";
	public static final String STAR = " *";
	public static final String FROM = " from";
	public static final String SPACE = " ";
	public static final String SEMI_COLON = ";";
	public static final String EQUAL = "=";
	public static final String PARAMETER = "?";
	public static final String VALUE = "value(";
	public static final String OPEN_BRACE = "(";
	public static final String CLOSE_BRACE = ")";
	public static final String COMMA = ", ";
	public static final String EQUAL_PARAM = " = ? ";
	public static final String WHERE = " where ";
	public static final String IN = " in ";
	public static final String AND = " and";
	
	public static final String ID = "id";
	public static final String FIRSTNAME = "firstname";
	public static final String LAST_NAME = "lastname";
	public static final String FATHER_NAME = "fathername";
	public static final String MOTHER_NAME = "mothername";
	public static final String DOB = "DOB";
	public static final String GENDER = "gender";
	public static final String ISACTIVE = "isactive";
	public static final String ADDHAR_NUMBER = "addharNumber";
	public static final String USER_NAME = "username";
	public static final String PASSWORD = "Password";
	public static final String CREATE_TIME ="Createtime";
	public static final String MOD_TIME = "modtime";

	//GENDER
	public static final int MALE = 1;
	public static final int FEMALE = 2;
	public static final int OTHER = 3;
	public static final String MALEs = "male";
	public static final String FEMALEs = "female";
	public static final String OTHERs = "other";
	
	public static final String STATUS_VOTER_REGISTER = "1";
	public static final String STATUS_VOTER_SIGNIN = "2";
	
	
	public static String configGender(int gender) {
		if(MALE == gender) {
			return MALEs;
		}else if(FEMALE == gender) {
			return FEMALEs;
		}else if(OTHER == gender) {
			return OTHERs;
		}
		return null;
		
	}
	

}
