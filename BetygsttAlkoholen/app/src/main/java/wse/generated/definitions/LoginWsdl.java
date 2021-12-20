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

public final class LoginWsdl {
	private LoginWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #LoginRequest} <ul><b>Type:</b> wse.generated.definitions.LoginSchema.LoginRequest <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class LoginRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.LoginSchema.LoginRequest LoginRequest;
		
		protected void load_LoginRequest(IElement xml) {
			this.LoginRequest = parseComplex(xml, "LoginRequest", "wse:Login", wse.generated.definitions.LoginSchema.LoginRequest.class, true);
		}
		protected void create_LoginRequest(IElement xml) {
			printComplex(xml, "LoginRequest", "wse:Login", this.LoginRequest, true);
		}
		public void load(IElement xml) {
			try {
				load_LoginRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:Login':'LoginRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_LoginRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:Login':'LoginRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public LoginRequestMessage(LoginRequestMessage copy) { load(copy); }
		public void load(LoginRequestMessage copy) {
			if (copy == null) return;
			this.LoginRequest = copy.LoginRequest;
		}
		public LoginRequestMessage LoginRequest(wse.generated.definitions.LoginSchema.LoginRequest LoginRequest){ this.LoginRequest = LoginRequest; return this;}
		public LoginRequestMessage() {}
		public LoginRequestMessage(IElement xml) { this.load(xml); }
		public LoginRequestMessage(
			wse.generated.definitions.LoginSchema.LoginRequest LoginRequest
			) {
			this.LoginRequest = LoginRequest;
		}
		// Additional
	} // class LoginRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #LoginResponse} <ul><b>Type:</b> wse.generated.definitions.LoginSchema.LoginResponse <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class LoginResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.LoginSchema.LoginResponse LoginResponse;
		
		protected void load_LoginResponse(IElement xml) {
			this.LoginResponse = parseComplex(xml, "LoginResponse", "wse:Login", wse.generated.definitions.LoginSchema.LoginResponse.class, true);
		}
		protected void create_LoginResponse(IElement xml) {
			printComplex(xml, "LoginResponse", "wse:Login", this.LoginResponse, true);
		}
		public void load(IElement xml) {
			try {
				load_LoginResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:Login':'LoginResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_LoginResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:Login':'LoginResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public LoginResponseMessage(LoginResponseMessage copy) { load(copy); }
		public void load(LoginResponseMessage copy) {
			if (copy == null) return;
			this.LoginResponse = copy.LoginResponse;
		}
		public LoginResponseMessage LoginResponse(wse.generated.definitions.LoginSchema.LoginResponse LoginResponse){ this.LoginResponse = LoginResponse; return this;}
		public LoginResponseMessage() {}
		public LoginResponseMessage(IElement xml) { this.load(xml); }
		public LoginResponseMessage(
			wse.generated.definitions.LoginSchema.LoginResponse LoginResponse
			) {
			this.LoginResponse = LoginResponse;
		}
		// Additional
	} // class LoginResponseMessage
	protected static final class PT_LoginPort {
		private PT_LoginPort(){}
		protected static class Login extends wse.utils.WrappedOperation<
		wse.generated.definitions.LoginWsdl.LoginRequestMessage,
		wse.generated.definitions.LoginSchema.LoginRequest,
		wse.generated.definitions.LoginWsdl.LoginResponseMessage,
		wse.generated.definitions.LoginSchema.LoginResponse
		> {
			public Login(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.LoginWsdl.LoginResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.LoginWsdl.LoginRequestMessage wrapInput(wse.generated.definitions.LoginSchema.LoginRequest input) {
				return new wse.generated.definitions.LoginWsdl.LoginRequestMessage(input);
			}
			protected final wse.generated.definitions.LoginSchema.LoginResponse unwrapOutput(wse.generated.definitions.LoginWsdl.LoginResponseMessage output) {
				return output.LoginResponse;
			}
		}
	}
	public static final class B_LoginBinding {
		private B_LoginBinding(){}
		public static class Login extends wse.generated.definitions.LoginWsdl.PT_LoginPort.Login {
			protected Login(String uri) {
				super("wse:Login", uri);
			}
		}
	}
}
