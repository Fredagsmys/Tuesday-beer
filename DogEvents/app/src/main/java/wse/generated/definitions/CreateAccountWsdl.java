/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public final class CreateAccountWsdl {
	private CreateAccountWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #CreateAccountRequest} <ul><b>Type:</b> wse.generated.definitions.CreateAccountSchema.CreateAccountRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class CreateAccountRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.CreateAccountSchema.CreateAccountRequestType CreateAccountRequest;
		
		protected void load_CreateAccountRequest(XMLElement xml) {
			this.CreateAccountRequest = parseComplex(xml, "CreateAccountRequest", "wse:CreateAccount", wse.generated.definitions.CreateAccountSchema.CreateAccountRequestType.class, true);
		}
		protected void create_CreateAccountRequest(XMLElement xml) {
			printComplex(xml, "CreateAccountRequest", "wse:CreateAccount", this.CreateAccountRequest, true);
		}
		public void load(XMLElement xml) {
			try {
				load_CreateAccountRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:CreateAccount':'CreateAccountRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_CreateAccountRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:CreateAccount':'CreateAccountRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public CreateAccountRequestMessage(CreateAccountRequestMessage copy) { load(copy); }
		public void load(CreateAccountRequestMessage copy) {
			if (copy == null) return;
			this.CreateAccountRequest = copy.CreateAccountRequest;
		}
		public CreateAccountRequestMessage CreateAccountRequest(wse.generated.definitions.CreateAccountSchema.CreateAccountRequestType CreateAccountRequest){ this.CreateAccountRequest = CreateAccountRequest; return this;}
		public CreateAccountRequestMessage() {}
		public CreateAccountRequestMessage(XMLElement xml) { this.load(xml); }
		public CreateAccountRequestMessage(
			wse.generated.definitions.CreateAccountSchema.CreateAccountRequestType CreateAccountRequest
			) {
			this.CreateAccountRequest = CreateAccountRequest;
		}
		// Additional
	} // class CreateAccountRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #CreateAccountResponse} <ul><b>Type:</b> wse.generated.definitions.CreateAccountSchema.CreateAccountResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class CreateAccountResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.CreateAccountSchema.CreateAccountResponseType CreateAccountResponse;
		
		protected void load_CreateAccountResponse(XMLElement xml) {
			this.CreateAccountResponse = parseComplex(xml, "CreateAccountResponse", "wse:CreateAccount", wse.generated.definitions.CreateAccountSchema.CreateAccountResponseType.class, true);
		}
		protected void create_CreateAccountResponse(XMLElement xml) {
			printComplex(xml, "CreateAccountResponse", "wse:CreateAccount", this.CreateAccountResponse, true);
		}
		public void load(XMLElement xml) {
			try {
				load_CreateAccountResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:CreateAccount':'CreateAccountResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_CreateAccountResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:CreateAccount':'CreateAccountResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public CreateAccountResponseMessage(CreateAccountResponseMessage copy) { load(copy); }
		public void load(CreateAccountResponseMessage copy) {
			if (copy == null) return;
			this.CreateAccountResponse = copy.CreateAccountResponse;
		}
		public CreateAccountResponseMessage CreateAccountResponse(wse.generated.definitions.CreateAccountSchema.CreateAccountResponseType CreateAccountResponse){ this.CreateAccountResponse = CreateAccountResponse; return this;}
		public CreateAccountResponseMessage() {}
		public CreateAccountResponseMessage(XMLElement xml) { this.load(xml); }
		public CreateAccountResponseMessage(
			wse.generated.definitions.CreateAccountSchema.CreateAccountResponseType CreateAccountResponse
			) {
			this.CreateAccountResponse = CreateAccountResponse;
		}
		// Additional
	} // class CreateAccountResponseMessage
	protected static final class PT_CreateAccountPort {
		private PT_CreateAccountPort(){}
		protected static class CreateAccount extends wse.utils.WrappedOperation<
		wse.generated.definitions.CreateAccountWsdl.CreateAccountRequestMessage,
		wse.generated.definitions.CreateAccountSchema.CreateAccountRequestType,
		wse.generated.definitions.CreateAccountWsdl.CreateAccountResponseMessage,
		wse.generated.definitions.CreateAccountSchema.CreateAccountResponseType
		> {
			public CreateAccount(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.CreateAccountWsdl.CreateAccountResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.CreateAccountWsdl.CreateAccountRequestMessage wrapInput(wse.generated.definitions.CreateAccountSchema.CreateAccountRequestType input) {
				return new wse.generated.definitions.CreateAccountWsdl.CreateAccountRequestMessage(input);
			}
			protected final wse.generated.definitions.CreateAccountSchema.CreateAccountResponseType unwrapOutput(wse.generated.definitions.CreateAccountWsdl.CreateAccountResponseMessage output) {
				return output.CreateAccountResponse;
			}
		}
	}
	public static final class B_CreateAccountBinding {
		private B_CreateAccountBinding(){}
		public static class CreateAccount extends wse.generated.definitions.CreateAccountWsdl.PT_CreateAccountPort.CreateAccount {
			protected CreateAccount(String uri) {
				super("wse:CreateAccount", uri);
			}
		}
	}
}
