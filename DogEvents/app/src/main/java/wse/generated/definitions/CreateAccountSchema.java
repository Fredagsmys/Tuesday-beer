/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public class CreateAccountSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #username} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #password} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #userType} <ul><b>Type:</b> wse.generated.definitions.Turbo_DBSchema.UserType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class CreateAccountRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String username;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String password;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.Turbo_DBSchema.UserType userType;
		
		protected void load_username(XMLElement xml) {
			this.username = parse(xml, "username", "wse:CreateAccount", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_username(XMLElement xml) {
			print(xml, "username", "wse:CreateAccount", this.username, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_password(XMLElement xml) {
			this.password = parse(xml, "password", "wse:CreateAccount", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_password(XMLElement xml) {
			print(xml, "password", "wse:CreateAccount", this.password, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_userType(XMLElement xml) {
			this.userType = parseComplex(xml, "userType", "wse:CreateAccount", wse.generated.definitions.Turbo_DBSchema.UserType.class, true);
		}
		protected void create_userType(XMLElement xml) {
			printComplex(xml, "userType", "wse:CreateAccount", this.userType, true);
		}
		public void load(XMLElement xml) {
			try {
				load_username(xml);
				load_password(xml);
				load_userType(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:CreateAccount':'CreateAccountRequestType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_username(xml);
				create_password(xml);
				create_userType(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:CreateAccount':'CreateAccountRequestType':\n" + e.getMessage(), e);
			}
		}
		public CreateAccountRequestType(CreateAccountRequestType copy) { load(copy); }
		public void load(CreateAccountRequestType copy) {
			if (copy == null) return;
			this.username = copy.username;
			this.password = copy.password;
			this.userType = copy.userType;
		}
		public CreateAccountRequestType username(String username){ this.username = username; return this;}
		public CreateAccountRequestType password(String password){ this.password = password; return this;}
		public CreateAccountRequestType userType(wse.generated.definitions.Turbo_DBSchema.UserType userType){ this.userType = userType; return this;}
		public CreateAccountRequestType() {}
		public CreateAccountRequestType(XMLElement xml) { this.load(xml); }
		public CreateAccountRequestType(
			String username,
			String password,
			wse.generated.definitions.Turbo_DBSchema.UserType userType
			) {
			this.username = username;
			this.password = password;
			this.userType = userType;
		}
		// Additional
	} // class CreateAccountRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #sessionID} <ul><b>Type:</b> String <br><b>Occurs:</b> 0-1 <br></ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class CreateAccountResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 0-1 <p>
		 */
		public String sessionID;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		
		protected void load_sessionID(XMLElement xml) {
			this.sessionID = parse(xml, "sessionID", "wse:CreateAccount", wse.utils.types.xsd.xsd_string.class, false, null);
		}
		protected void create_sessionID(XMLElement xml) {
			print(xml, "sessionID", "wse:CreateAccount", this.sessionID, wse.utils.types.xsd.xsd_string.class, false, null);
		}
		protected void load_status(XMLElement xml) {
			this.status = parse(xml, "status", "wse:CreateAccount", wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void create_status(XMLElement xml) {
			print(xml, "status", "wse:CreateAccount", this.status, wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		public void load(XMLElement xml) {
			try {
				load_sessionID(xml);
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:CreateAccount':'CreateAccountResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_sessionID(xml);
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:CreateAccount':'CreateAccountResponseType':\n" + e.getMessage(), e);
			}
		}
		public CreateAccountResponseType(CreateAccountResponseType copy) { load(copy); }
		public void load(CreateAccountResponseType copy) {
			if (copy == null) return;
			this.sessionID = copy.sessionID;
			this.status = copy.status;
		}
		public CreateAccountResponseType sessionID(String sessionID){ this.sessionID = sessionID; return this;}
		public CreateAccountResponseType status(Integer status){ this.status = status; return this;}
		public CreateAccountResponseType() {}
		public CreateAccountResponseType(XMLElement xml) { this.load(xml); }
		public CreateAccountResponseType(
			String sessionID,
			Integer status
			) {
			this.sessionID = sessionID;
			this.status = status;
		}
		// Additional
	} // class CreateAccountResponseType
	
}
