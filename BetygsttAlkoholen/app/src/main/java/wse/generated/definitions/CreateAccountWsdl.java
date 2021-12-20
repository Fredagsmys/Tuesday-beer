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

public final class CreateAccountWsdl {
	private CreateAccountWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #CreateAccountRequest} <ul><b>Type:</b> wse.generated.definitions.CreateAccountSchema.CreateAccountRequest <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class CreateAccountRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.CreateAccountSchema.CreateAccountRequest CreateAccountRequest;
		
		protected void load_CreateAccountRequest(IElement xml) {
			this.CreateAccountRequest = parseComplex(xml, "CreateAccountRequest", "wse:CreateAccount", wse.generated.definitions.CreateAccountSchema.CreateAccountRequest.class, true);
		}
		protected void create_CreateAccountRequest(IElement xml) {
			printComplex(xml, "CreateAccountRequest", "wse:CreateAccount", this.CreateAccountRequest, true);
		}
		public void load(IElement xml) {
			try {
				load_CreateAccountRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:CreateAccount':'CreateAccountRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
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
		public CreateAccountRequestMessage CreateAccountRequest(wse.generated.definitions.CreateAccountSchema.CreateAccountRequest CreateAccountRequest){ this.CreateAccountRequest = CreateAccountRequest; return this;}
		public CreateAccountRequestMessage() {}
		public CreateAccountRequestMessage(IElement xml) { this.load(xml); }
		public CreateAccountRequestMessage(
			wse.generated.definitions.CreateAccountSchema.CreateAccountRequest CreateAccountRequest
			) {
			this.CreateAccountRequest = CreateAccountRequest;
		}
		// Additional
	} // class CreateAccountRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #CreateAccountResponse} <ul><b>Type:</b> wse.generated.definitions.CreateAccountSchema.CreateAccountResponse <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class CreateAccountResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.CreateAccountSchema.CreateAccountResponse CreateAccountResponse;
		
		protected void load_CreateAccountResponse(IElement xml) {
			this.CreateAccountResponse = parseComplex(xml, "CreateAccountResponse", "wse:CreateAccount", wse.generated.definitions.CreateAccountSchema.CreateAccountResponse.class, true);
		}
		protected void create_CreateAccountResponse(IElement xml) {
			printComplex(xml, "CreateAccountResponse", "wse:CreateAccount", this.CreateAccountResponse, true);
		}
		public void load(IElement xml) {
			try {
				load_CreateAccountResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:CreateAccount':'CreateAccountResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
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
		public CreateAccountResponseMessage CreateAccountResponse(wse.generated.definitions.CreateAccountSchema.CreateAccountResponse CreateAccountResponse){ this.CreateAccountResponse = CreateAccountResponse; return this;}
		public CreateAccountResponseMessage() {}
		public CreateAccountResponseMessage(IElement xml) { this.load(xml); }
		public CreateAccountResponseMessage(
			wse.generated.definitions.CreateAccountSchema.CreateAccountResponse CreateAccountResponse
			) {
			this.CreateAccountResponse = CreateAccountResponse;
		}
		// Additional
	} // class CreateAccountResponseMessage
	protected static final class PT_CreateAccountPort {
		private PT_CreateAccountPort(){}
		protected static class CreateAccount extends wse.utils.WrappedOperation<
		wse.generated.definitions.CreateAccountWsdl.CreateAccountRequestMessage,
		wse.generated.definitions.CreateAccountSchema.CreateAccountRequest,
		wse.generated.definitions.CreateAccountWsdl.CreateAccountResponseMessage,
		wse.generated.definitions.CreateAccountSchema.CreateAccountResponse
		> {
			public CreateAccount(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.CreateAccountWsdl.CreateAccountResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.CreateAccountWsdl.CreateAccountRequestMessage wrapInput(wse.generated.definitions.CreateAccountSchema.CreateAccountRequest input) {
				return new wse.generated.definitions.CreateAccountWsdl.CreateAccountRequestMessage(input);
			}
			protected final wse.generated.definitions.CreateAccountSchema.CreateAccountResponse unwrapOutput(wse.generated.definitions.CreateAccountWsdl.CreateAccountResponseMessage output) {
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
