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

public class CreateAccountSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #username} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #password} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class CreateAccountRequest extends wse.utils.ComplexType {
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
			this.username = parse(xml, "username", "wse:CreateAccount", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_username(IElement xml) {
			print(xml, "username", "wse:CreateAccount", this.username, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_password(IElement xml) {
			this.password = parse(xml, "password", "wse:CreateAccount", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_password(IElement xml) {
			print(xml, "password", "wse:CreateAccount", this.password, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		public void load(IElement xml) {
			try {
				load_username(xml);
				load_password(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:CreateAccount':'CreateAccountRequest':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_username(xml);
				create_password(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:CreateAccount':'CreateAccountRequest':\n" + e.getMessage(), e);
			}
		}
		public CreateAccountRequest(CreateAccountRequest copy) { load(copy); }
		public void load(CreateAccountRequest copy) {
			if (copy == null) return;
			this.username = copy.username;
			this.password = copy.password;
		}
		public CreateAccountRequest username(String username){ this.username = username; return this;}
		public CreateAccountRequest password(String password){ this.password = password; return this;}
		public CreateAccountRequest() {}
		public CreateAccountRequest(IElement xml) { this.load(xml); }
		public CreateAccountRequest(
			String username,
			String password
			) {
			this.username = username;
			this.password = password;
		}
		// Additional
	} // class CreateAccountRequest
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class CreateAccountResponse extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		
		protected void load_status(IElement xml) {
			this.status = parse(xml, "status", "wse:CreateAccount", wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void create_status(IElement xml) {
			print(xml, "status", "wse:CreateAccount", this.status, wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		public void load(IElement xml) {
			try {
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:CreateAccount':'CreateAccountResponse':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:CreateAccount':'CreateAccountResponse':\n" + e.getMessage(), e);
			}
		}
		public CreateAccountResponse(CreateAccountResponse copy) { load(copy); }
		public void load(CreateAccountResponse copy) {
			if (copy == null) return;
			this.status = copy.status;
		}
		public CreateAccountResponse status(Integer status){ this.status = status; return this;}
		public CreateAccountResponse() {}
		public CreateAccountResponse(IElement xml) { this.load(xml); }
		public CreateAccountResponse(
			Integer status
			) {
			this.status = status;
		}
		// Additional
	} // class CreateAccountResponse
	
}
