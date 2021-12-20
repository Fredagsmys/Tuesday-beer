/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public class LoginDogAccountSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #username} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class LoginDogAccountRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String username;
		
		protected void load_username(XMLElement xml) {
			this.username = parse(xml, "username", "wse:LoginDogAccount", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_username(XMLElement xml) {
			print(xml, "username", "wse:LoginDogAccount", this.username, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		public void load(XMLElement xml) {
			try {
				load_username(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:LoginDogAccount':'LoginDogAccountRequestType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_username(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:LoginDogAccount':'LoginDogAccountRequestType':\n" + e.getMessage(), e);
			}
		}
		public LoginDogAccountRequestType(LoginDogAccountRequestType copy) { load(copy); }
		public void load(LoginDogAccountRequestType copy) {
			if (copy == null) return;
			this.username = copy.username;
		}
		public LoginDogAccountRequestType username(String username){ this.username = username; return this;}
		public LoginDogAccountRequestType() {}
		public LoginDogAccountRequestType(XMLElement xml) { this.load(xml); }
		public LoginDogAccountRequestType(
			String username
			) {
			this.username = username;
		}
		// Additional
	} // class LoginDogAccountRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class LoginDogAccountResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		
		protected void load_status(XMLElement xml) {
			this.status = parse(xml, "status", "wse:LoginDogAccount", wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void create_status(XMLElement xml) {
			print(xml, "status", "wse:LoginDogAccount", this.status, wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		public void load(XMLElement xml) {
			try {
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:LoginDogAccount':'LoginDogAccountResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:LoginDogAccount':'LoginDogAccountResponseType':\n" + e.getMessage(), e);
			}
		}
		public LoginDogAccountResponseType(LoginDogAccountResponseType copy) { load(copy); }
		public void load(LoginDogAccountResponseType copy) {
			if (copy == null) return;
			this.status = copy.status;
		}
		public LoginDogAccountResponseType status(Integer status){ this.status = status; return this;}
		public LoginDogAccountResponseType() {}
		public LoginDogAccountResponseType(XMLElement xml) { this.load(xml); }
		public LoginDogAccountResponseType(
			Integer status
			) {
			this.status = status;
		}
		// Additional
	} // class LoginDogAccountResponseType
	
}
