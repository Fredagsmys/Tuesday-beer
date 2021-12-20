/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public class LoginSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #username} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #password} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class LoginRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String username;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String password;
		
		protected void load_username(XMLElement xml) {
			this.username = parse(xml, "username", "wse:Login", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_username(XMLElement xml) {
			print(xml, "username", "wse:Login", this.username, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_password(XMLElement xml) {
			this.password = parse(xml, "password", "wse:Login", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_password(XMLElement xml) {
			print(xml, "password", "wse:Login", this.password, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		public void load(XMLElement xml) {
			try {
				load_username(xml);
				load_password(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:Login':'LoginRequestType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_username(xml);
				create_password(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:Login':'LoginRequestType':\n" + e.getMessage(), e);
			}
		}
		public LoginRequestType(LoginRequestType copy) { load(copy); }
		public void load(LoginRequestType copy) {
			if (copy == null) return;
			this.username = copy.username;
			this.password = copy.password;
		}
		public LoginRequestType username(String username){ this.username = username; return this;}
		public LoginRequestType password(String password){ this.password = password; return this;}
		public LoginRequestType() {}
		public LoginRequestType(XMLElement xml) { this.load(xml); }
		public LoginRequestType(
			String username,
			String password
			) {
			this.username = username;
			this.password = password;
		}
		// Additional
	} // class LoginRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #sessionID} <ul><b>Type:</b> String <br><b>Occurs:</b> 0-1 <br></ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class LoginResponseType extends wse.utils.ComplexType {
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
			this.sessionID = parse(xml, "sessionID", "wse:Login", wse.utils.types.xsd.xsd_string.class, false, null);
		}
		protected void create_sessionID(XMLElement xml) {
			print(xml, "sessionID", "wse:Login", this.sessionID, wse.utils.types.xsd.xsd_string.class, false, null);
		}
		protected void load_status(XMLElement xml) {
			this.status = parse(xml, "status", "wse:Login", wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void create_status(XMLElement xml) {
			print(xml, "status", "wse:Login", this.status, wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		public void load(XMLElement xml) {
			try {
				load_sessionID(xml);
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:Login':'LoginResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_sessionID(xml);
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:Login':'LoginResponseType':\n" + e.getMessage(), e);
			}
		}
		public LoginResponseType(LoginResponseType copy) { load(copy); }
		public void load(LoginResponseType copy) {
			if (copy == null) return;
			this.sessionID = copy.sessionID;
			this.status = copy.status;
		}
		public LoginResponseType sessionID(String sessionID){ this.sessionID = sessionID; return this;}
		public LoginResponseType status(Integer status){ this.status = status; return this;}
		public LoginResponseType() {}
		public LoginResponseType(XMLElement xml) { this.load(xml); }
		public LoginResponseType(
			String sessionID,
			Integer status
			) {
			this.sessionID = sessionID;
			this.status = status;
		}
		// Additional
	} // class LoginResponseType
	
}
