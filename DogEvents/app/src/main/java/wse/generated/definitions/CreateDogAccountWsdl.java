/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public final class CreateDogAccountWsdl {
	private CreateDogAccountWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #CreateDogAccountRequest} <ul><b>Type:</b> wse.generated.definitions.CreateDogAccountSchema.CreateDogAccountRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class CreateDogAccountRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.CreateDogAccountSchema.CreateDogAccountRequestType CreateDogAccountRequest;
		
		protected void load_CreateDogAccountRequest(XMLElement xml) {
			this.CreateDogAccountRequest = parseComplex(xml, "CreateDogAccountRequest", "wse:CreateDogAccount", wse.generated.definitions.CreateDogAccountSchema.CreateDogAccountRequestType.class, true);
		}
		protected void create_CreateDogAccountRequest(XMLElement xml) {
			printComplex(xml, "CreateDogAccountRequest", "wse:CreateDogAccount", this.CreateDogAccountRequest, true);
		}
		public void load(XMLElement xml) {
			try {
				load_CreateDogAccountRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:CreateDogAccount':'CreateDogAccountRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_CreateDogAccountRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:CreateDogAccount':'CreateDogAccountRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public CreateDogAccountRequestMessage(CreateDogAccountRequestMessage copy) { load(copy); }
		public void load(CreateDogAccountRequestMessage copy) {
			if (copy == null) return;
			this.CreateDogAccountRequest = copy.CreateDogAccountRequest;
		}
		public CreateDogAccountRequestMessage CreateDogAccountRequest(wse.generated.definitions.CreateDogAccountSchema.CreateDogAccountRequestType CreateDogAccountRequest){ this.CreateDogAccountRequest = CreateDogAccountRequest; return this;}
		public CreateDogAccountRequestMessage() {}
		public CreateDogAccountRequestMessage(XMLElement xml) { this.load(xml); }
		public CreateDogAccountRequestMessage(
			wse.generated.definitions.CreateDogAccountSchema.CreateDogAccountRequestType CreateDogAccountRequest
			) {
			this.CreateDogAccountRequest = CreateDogAccountRequest;
		}
		// Additional
	} // class CreateDogAccountRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #CreateDogAccountResponse} <ul><b>Type:</b> wse.generated.definitions.CreateDogAccountSchema.CreateDogAccountResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class CreateDogAccountResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.CreateDogAccountSchema.CreateDogAccountResponseType CreateDogAccountResponse;
		
		protected void load_CreateDogAccountResponse(XMLElement xml) {
			this.CreateDogAccountResponse = parseComplex(xml, "CreateDogAccountResponse", "wse:CreateDogAccount", wse.generated.definitions.CreateDogAccountSchema.CreateDogAccountResponseType.class, true);
		}
		protected void create_CreateDogAccountResponse(XMLElement xml) {
			printComplex(xml, "CreateDogAccountResponse", "wse:CreateDogAccount", this.CreateDogAccountResponse, true);
		}
		public void load(XMLElement xml) {
			try {
				load_CreateDogAccountResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:CreateDogAccount':'CreateDogAccountResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_CreateDogAccountResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:CreateDogAccount':'CreateDogAccountResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public CreateDogAccountResponseMessage(CreateDogAccountResponseMessage copy) { load(copy); }
		public void load(CreateDogAccountResponseMessage copy) {
			if (copy == null) return;
			this.CreateDogAccountResponse = copy.CreateDogAccountResponse;
		}
		public CreateDogAccountResponseMessage CreateDogAccountResponse(wse.generated.definitions.CreateDogAccountSchema.CreateDogAccountResponseType CreateDogAccountResponse){ this.CreateDogAccountResponse = CreateDogAccountResponse; return this;}
		public CreateDogAccountResponseMessage() {}
		public CreateDogAccountResponseMessage(XMLElement xml) { this.load(xml); }
		public CreateDogAccountResponseMessage(
			wse.generated.definitions.CreateDogAccountSchema.CreateDogAccountResponseType CreateDogAccountResponse
			) {
			this.CreateDogAccountResponse = CreateDogAccountResponse;
		}
		// Additional
	} // class CreateDogAccountResponseMessage
	protected static final class PT_CreateDogAccountPort {
		private PT_CreateDogAccountPort(){}
		protected static class CreateDogAccount extends wse.utils.WrappedOperation<
		wse.generated.definitions.CreateDogAccountWsdl.CreateDogAccountRequestMessage,
		wse.generated.definitions.CreateDogAccountSchema.CreateDogAccountRequestType,
		wse.generated.definitions.CreateDogAccountWsdl.CreateDogAccountResponseMessage,
		wse.generated.definitions.CreateDogAccountSchema.CreateDogAccountResponseType
		> {
			public CreateDogAccount(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.CreateDogAccountWsdl.CreateDogAccountResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.CreateDogAccountWsdl.CreateDogAccountRequestMessage wrapInput(wse.generated.definitions.CreateDogAccountSchema.CreateDogAccountRequestType input) {
				return new wse.generated.definitions.CreateDogAccountWsdl.CreateDogAccountRequestMessage(input);
			}
			protected final wse.generated.definitions.CreateDogAccountSchema.CreateDogAccountResponseType unwrapOutput(wse.generated.definitions.CreateDogAccountWsdl.CreateDogAccountResponseMessage output) {
				return output.CreateDogAccountResponse;
			}
		}
	}
	public static final class B_CreateDogAccountBinding {
		private B_CreateDogAccountBinding(){}
		public static class CreateDogAccount extends wse.generated.definitions.CreateDogAccountWsdl.PT_CreateDogAccountPort.CreateDogAccount {
			protected CreateDogAccount(String uri) {
				super("wse:CreateDogAccount", uri);
			}
		}
	}
}
