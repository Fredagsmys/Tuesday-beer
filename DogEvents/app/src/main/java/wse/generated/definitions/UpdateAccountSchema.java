/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public class UpdateAccountSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #username} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #password} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #sessionID} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class UpdateAccountRequestType extends wse.utils.ComplexType {
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
		public String sessionID;
		
		protected void load_username(XMLElement xml) {
			this.username = parse(xml, "username", "wse:UpdateAccount", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_username(XMLElement xml) {
			print(xml, "username", "wse:UpdateAccount", this.username, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_password(XMLElement xml) {
			this.password = parse(xml, "password", "wse:UpdateAccount", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_password(XMLElement xml) {
			print(xml, "password", "wse:UpdateAccount", this.password, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_sessionID(XMLElement xml) {
			this.sessionID = parse(xml, "sessionID", "wse:UpdateAccount", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_sessionID(XMLElement xml) {
			print(xml, "sessionID", "wse:UpdateAccount", this.sessionID, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		public void load(XMLElement xml) {
			try {
				load_username(xml);
				load_password(xml);
				load_sessionID(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:UpdateAccount':'UpdateAccountRequestType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_username(xml);
				create_password(xml);
				create_sessionID(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:UpdateAccount':'UpdateAccountRequestType':\n" + e.getMessage(), e);
			}
		}
		public UpdateAccountRequestType(UpdateAccountRequestType copy) { load(copy); }
		public void load(UpdateAccountRequestType copy) {
			if (copy == null) return;
			this.username = copy.username;
			this.password = copy.password;
			this.sessionID = copy.sessionID;
		}
		public UpdateAccountRequestType username(String username){ this.username = username; return this;}
		public UpdateAccountRequestType password(String password){ this.password = password; return this;}
		public UpdateAccountRequestType sessionID(String sessionID){ this.sessionID = sessionID; return this;}
		public UpdateAccountRequestType() {}
		public UpdateAccountRequestType(XMLElement xml) { this.load(xml); }
		public UpdateAccountRequestType(
			String username,
			String password,
			String sessionID
			) {
			this.username = username;
			this.password = password;
			this.sessionID = sessionID;
		}
		// Additional
	} // class UpdateAccountRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class UpdateAccountResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		
		protected void load_status(XMLElement xml) {
			this.status = parse(xml, "status", "wse:UpdateAccount", wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void create_status(XMLElement xml) {
			print(xml, "status", "wse:UpdateAccount", this.status, wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		public void load(XMLElement xml) {
			try {
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:UpdateAccount':'UpdateAccountResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:UpdateAccount':'UpdateAccountResponseType':\n" + e.getMessage(), e);
			}
		}
		public UpdateAccountResponseType(UpdateAccountResponseType copy) { load(copy); }
		public void load(UpdateAccountResponseType copy) {
			if (copy == null) return;
			this.status = copy.status;
		}
		public UpdateAccountResponseType status(Integer status){ this.status = status; return this;}
		public UpdateAccountResponseType() {}
		public UpdateAccountResponseType(XMLElement xml) { this.load(xml); }
		public UpdateAccountResponseType(
			Integer status
			) {
			this.status = status;
		}
		// Additional
	} // class UpdateAccountResponseType
	
}
