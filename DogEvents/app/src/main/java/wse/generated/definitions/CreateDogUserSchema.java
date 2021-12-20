/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public class CreateDogUserSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #username} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class CreateDogUserRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String username;
		
		protected void load_username(XMLElement xml) {
			this.username = parse(xml, "username", "wse:CreateDogUser", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_username(XMLElement xml) {
			print(xml, "username", "wse:CreateDogUser", this.username, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		public void load(XMLElement xml) {
			try {
				load_username(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:CreateDogUser':'CreateDogUserRequestType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_username(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:CreateDogUser':'CreateDogUserRequestType':\n" + e.getMessage(), e);
			}
		}
		public CreateDogUserRequestType(CreateDogUserRequestType copy) { load(copy); }
		public void load(CreateDogUserRequestType copy) {
			if (copy == null) return;
			this.username = copy.username;
		}
		public CreateDogUserRequestType username(String username){ this.username = username; return this;}
		public CreateDogUserRequestType() {}
		public CreateDogUserRequestType(XMLElement xml) { this.load(xml); }
		public CreateDogUserRequestType(
			String username
			) {
			this.username = username;
		}
		// Additional
	} // class CreateDogUserRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class CreateDogUserResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		
		protected void load_status(XMLElement xml) {
			this.status = parse(xml, "status", "wse:CreateDogUser", wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void create_status(XMLElement xml) {
			print(xml, "status", "wse:CreateDogUser", this.status, wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		public void load(XMLElement xml) {
			try {
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:CreateDogUser':'CreateDogUserResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:CreateDogUser':'CreateDogUserResponseType':\n" + e.getMessage(), e);
			}
		}
		public CreateDogUserResponseType(CreateDogUserResponseType copy) { load(copy); }
		public void load(CreateDogUserResponseType copy) {
			if (copy == null) return;
			this.status = copy.status;
		}
		public CreateDogUserResponseType status(Integer status){ this.status = status; return this;}
		public CreateDogUserResponseType() {}
		public CreateDogUserResponseType(XMLElement xml) { this.load(xml); }
		public CreateDogUserResponseType(
			Integer status
			) {
			this.status = status;
		}
		// Additional
	} // class CreateDogUserResponseType
	
}
