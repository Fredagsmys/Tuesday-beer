/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 9 December 2021 16:32:15 +0100
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.internal.IElement;

public class LoginSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #username} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #password} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class LoginRequest extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String username;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String password;
		
		protected void load_username(IElement xml) {
			this.username = parse(xml, "username", "wse:Login", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_username(IElement xml) {
			print(xml, "username", "wse:Login", this.username, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_password(IElement xml) {
			this.password = parse(xml, "password", "wse:Login", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_password(IElement xml) {
			print(xml, "password", "wse:Login", this.password, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		public void load(IElement xml) {
			try {
				load_username(xml);
				load_password(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:Login':'LoginRequest':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_username(xml);
				create_password(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:Login':'LoginRequest':\n" + e.getMessage(), e);
			}
		}
		public LoginRequest(LoginRequest copy) { load(copy); }
		public void load(LoginRequest copy) {
			if (copy == null) return;
			this.username = copy.username;
			this.password = copy.password;
		}
		public LoginRequest username(String username){ this.username = username; return this;}
		public LoginRequest password(String password){ this.password = password; return this;}
		public LoginRequest() {}
		public LoginRequest(IElement xml) { this.load(xml); }
		public LoginRequest(
			String username,
			String password
			) {
			this.username = username;
			this.password = password;
		}
		// Additional
	} // class LoginRequest
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #sessionID} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class LoginResponse extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String sessionID;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		
		protected void load_sessionID(IElement xml) {
			this.sessionID = parse(xml, "sessionID", "wse:Login", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_sessionID(IElement xml) {
			print(xml, "sessionID", "wse:Login", this.sessionID, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_status(IElement xml) {
			this.status = parse(xml, "status", "wse:Login", wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void create_status(IElement xml) {
			print(xml, "status", "wse:Login", this.status, wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		public void load(IElement xml) {
			try {
				load_sessionID(xml);
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:Login':'LoginResponse':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_sessionID(xml);
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:Login':'LoginResponse':\n" + e.getMessage(), e);
			}
		}
		public LoginResponse(LoginResponse copy) { load(copy); }
		public void load(LoginResponse copy) {
			if (copy == null) return;
			this.sessionID = copy.sessionID;
			this.status = copy.status;
		}
		public LoginResponse sessionID(String sessionID){ this.sessionID = sessionID; return this;}
		public LoginResponse status(Integer status){ this.status = status; return this;}
		public LoginResponse() {}
		public LoginResponse(IElement xml) { this.load(xml); }
		public LoginResponse(
			String sessionID,
			Integer status
			) {
			this.sessionID = sessionID;
			this.status = status;
		}
		// Additional
	} // class LoginResponse
	
}
