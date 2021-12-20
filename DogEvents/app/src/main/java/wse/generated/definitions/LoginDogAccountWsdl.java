/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public final class LoginDogAccountWsdl {
	private LoginDogAccountWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #LoginDogAccountRequest} <ul><b>Type:</b> wse.generated.definitions.LoginDogAccountSchema.LoginDogAccountRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class LoginDogAccountRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.LoginDogAccountSchema.LoginDogAccountRequestType LoginDogAccountRequest;
		
		protected void load_LoginDogAccountRequest(XMLElement xml) {
			this.LoginDogAccountRequest = parseComplex(xml, "LoginDogAccountRequest", "wse:LoginDogAccount", wse.generated.definitions.LoginDogAccountSchema.LoginDogAccountRequestType.class, true);
		}
		protected void create_LoginDogAccountRequest(XMLElement xml) {
			printComplex(xml, "LoginDogAccountRequest", "wse:LoginDogAccount", this.LoginDogAccountRequest, true);
		}
		public void load(XMLElement xml) {
			try {
				load_LoginDogAccountRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:LoginDogAccount':'LoginDogAccountRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_LoginDogAccountRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:LoginDogAccount':'LoginDogAccountRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public LoginDogAccountRequestMessage(LoginDogAccountRequestMessage copy) { load(copy); }
		public void load(LoginDogAccountRequestMessage copy) {
			if (copy == null) return;
			this.LoginDogAccountRequest = copy.LoginDogAccountRequest;
		}
		public LoginDogAccountRequestMessage LoginDogAccountRequest(wse.generated.definitions.LoginDogAccountSchema.LoginDogAccountRequestType LoginDogAccountRequest){ this.LoginDogAccountRequest = LoginDogAccountRequest; return this;}
		public LoginDogAccountRequestMessage() {}
		public LoginDogAccountRequestMessage(XMLElement xml) { this.load(xml); }
		public LoginDogAccountRequestMessage(
			wse.generated.definitions.LoginDogAccountSchema.LoginDogAccountRequestType LoginDogAccountRequest
			) {
			this.LoginDogAccountRequest = LoginDogAccountRequest;
		}
		// Additional
	} // class LoginDogAccountRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #LoginDogAccountResponse} <ul><b>Type:</b> wse.generated.definitions.LoginDogAccountSchema.LoginDogAccountResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class LoginDogAccountResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.LoginDogAccountSchema.LoginDogAccountResponseType LoginDogAccountResponse;
		
		protected void load_LoginDogAccountResponse(XMLElement xml) {
			this.LoginDogAccountResponse = parseComplex(xml, "LoginDogAccountResponse", "wse:LoginDogAccount", wse.generated.definitions.LoginDogAccountSchema.LoginDogAccountResponseType.class, true);
		}
		protected void create_LoginDogAccountResponse(XMLElement xml) {
			printComplex(xml, "LoginDogAccountResponse", "wse:LoginDogAccount", this.LoginDogAccountResponse, true);
		}
		public void load(XMLElement xml) {
			try {
				load_LoginDogAccountResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:LoginDogAccount':'LoginDogAccountResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_LoginDogAccountResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:LoginDogAccount':'LoginDogAccountResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public LoginDogAccountResponseMessage(LoginDogAccountResponseMessage copy) { load(copy); }
		public void load(LoginDogAccountResponseMessage copy) {
			if (copy == null) return;
			this.LoginDogAccountResponse = copy.LoginDogAccountResponse;
		}
		public LoginDogAccountResponseMessage LoginDogAccountResponse(wse.generated.definitions.LoginDogAccountSchema.LoginDogAccountResponseType LoginDogAccountResponse){ this.LoginDogAccountResponse = LoginDogAccountResponse; return this;}
		public LoginDogAccountResponseMessage() {}
		public LoginDogAccountResponseMessage(XMLElement xml) { this.load(xml); }
		public LoginDogAccountResponseMessage(
			wse.generated.definitions.LoginDogAccountSchema.LoginDogAccountResponseType LoginDogAccountResponse
			) {
			this.LoginDogAccountResponse = LoginDogAccountResponse;
		}
		// Additional
	} // class LoginDogAccountResponseMessage
	protected static final class PT_LoginDogAccountPort {
		private PT_LoginDogAccountPort(){}
		protected static class LoginDogAccount extends wse.utils.WrappedOperation<
		wse.generated.definitions.LoginDogAccountWsdl.LoginDogAccountRequestMessage,
		wse.generated.definitions.LoginDogAccountSchema.LoginDogAccountRequestType,
		wse.generated.definitions.LoginDogAccountWsdl.LoginDogAccountResponseMessage,
		wse.generated.definitions.LoginDogAccountSchema.LoginDogAccountResponseType
		> {
			public LoginDogAccount(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.LoginDogAccountWsdl.LoginDogAccountResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.LoginDogAccountWsdl.LoginDogAccountRequestMessage wrapInput(wse.generated.definitions.LoginDogAccountSchema.LoginDogAccountRequestType input) {
				return new wse.generated.definitions.LoginDogAccountWsdl.LoginDogAccountRequestMessage(input);
			}
			protected final wse.generated.definitions.LoginDogAccountSchema.LoginDogAccountResponseType unwrapOutput(wse.generated.definitions.LoginDogAccountWsdl.LoginDogAccountResponseMessage output) {
				return output.LoginDogAccountResponse;
			}
		}
	}
	public static final class B_LoginDogAccountBinding {
		private B_LoginDogAccountBinding(){}
		public static class LoginDogAccount extends wse.generated.definitions.LoginDogAccountWsdl.PT_LoginDogAccountPort.LoginDogAccount {
			protected LoginDogAccount(String uri) {
				super("wse:LoginDogAccount", uri);
			}
		}
	}
}
