/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public final class UpdateAccountWsdl {
	private UpdateAccountWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #UpdateAccountRequest} <ul><b>Type:</b> wse.generated.definitions.UpdateAccountSchema.UpdateAccountRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class UpdateAccountRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.UpdateAccountSchema.UpdateAccountRequestType UpdateAccountRequest;
		
		protected void load_UpdateAccountRequest(XMLElement xml) {
			this.UpdateAccountRequest = parseComplex(xml, "UpdateAccountRequest", "wse:UpdateAccount", wse.generated.definitions.UpdateAccountSchema.UpdateAccountRequestType.class, true);
		}
		protected void create_UpdateAccountRequest(XMLElement xml) {
			printComplex(xml, "UpdateAccountRequest", "wse:UpdateAccount", this.UpdateAccountRequest, true);
		}
		public void load(XMLElement xml) {
			try {
				load_UpdateAccountRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:UpdateAccount':'UpdateAccountRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_UpdateAccountRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:UpdateAccount':'UpdateAccountRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public UpdateAccountRequestMessage(UpdateAccountRequestMessage copy) { load(copy); }
		public void load(UpdateAccountRequestMessage copy) {
			if (copy == null) return;
			this.UpdateAccountRequest = copy.UpdateAccountRequest;
		}
		public UpdateAccountRequestMessage UpdateAccountRequest(wse.generated.definitions.UpdateAccountSchema.UpdateAccountRequestType UpdateAccountRequest){ this.UpdateAccountRequest = UpdateAccountRequest; return this;}
		public UpdateAccountRequestMessage() {}
		public UpdateAccountRequestMessage(XMLElement xml) { this.load(xml); }
		public UpdateAccountRequestMessage(
			wse.generated.definitions.UpdateAccountSchema.UpdateAccountRequestType UpdateAccountRequest
			) {
			this.UpdateAccountRequest = UpdateAccountRequest;
		}
		// Additional
	} // class UpdateAccountRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #UpdateAccountResponse} <ul><b>Type:</b> wse.generated.definitions.UpdateAccountSchema.UpdateAccountResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class UpdateAccountResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.UpdateAccountSchema.UpdateAccountResponseType UpdateAccountResponse;
		
		protected void load_UpdateAccountResponse(XMLElement xml) {
			this.UpdateAccountResponse = parseComplex(xml, "UpdateAccountResponse", "wse:UpdateAccount", wse.generated.definitions.UpdateAccountSchema.UpdateAccountResponseType.class, true);
		}
		protected void create_UpdateAccountResponse(XMLElement xml) {
			printComplex(xml, "UpdateAccountResponse", "wse:UpdateAccount", this.UpdateAccountResponse, true);
		}
		public void load(XMLElement xml) {
			try {
				load_UpdateAccountResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:UpdateAccount':'UpdateAccountResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_UpdateAccountResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:UpdateAccount':'UpdateAccountResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public UpdateAccountResponseMessage(UpdateAccountResponseMessage copy) { load(copy); }
		public void load(UpdateAccountResponseMessage copy) {
			if (copy == null) return;
			this.UpdateAccountResponse = copy.UpdateAccountResponse;
		}
		public UpdateAccountResponseMessage UpdateAccountResponse(wse.generated.definitions.UpdateAccountSchema.UpdateAccountResponseType UpdateAccountResponse){ this.UpdateAccountResponse = UpdateAccountResponse; return this;}
		public UpdateAccountResponseMessage() {}
		public UpdateAccountResponseMessage(XMLElement xml) { this.load(xml); }
		public UpdateAccountResponseMessage(
			wse.generated.definitions.UpdateAccountSchema.UpdateAccountResponseType UpdateAccountResponse
			) {
			this.UpdateAccountResponse = UpdateAccountResponse;
		}
		// Additional
	} // class UpdateAccountResponseMessage
	protected static final class PT_UpdateAccountPort {
		private PT_UpdateAccountPort(){}
		protected static class UpdateAccount extends wse.utils.WrappedOperation<
		wse.generated.definitions.UpdateAccountWsdl.UpdateAccountRequestMessage,
		wse.generated.definitions.UpdateAccountSchema.UpdateAccountRequestType,
		wse.generated.definitions.UpdateAccountWsdl.UpdateAccountResponseMessage,
		wse.generated.definitions.UpdateAccountSchema.UpdateAccountResponseType
		> {
			public UpdateAccount(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.UpdateAccountWsdl.UpdateAccountResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.UpdateAccountWsdl.UpdateAccountRequestMessage wrapInput(wse.generated.definitions.UpdateAccountSchema.UpdateAccountRequestType input) {
				return new wse.generated.definitions.UpdateAccountWsdl.UpdateAccountRequestMessage(input);
			}
			protected final wse.generated.definitions.UpdateAccountSchema.UpdateAccountResponseType unwrapOutput(wse.generated.definitions.UpdateAccountWsdl.UpdateAccountResponseMessage output) {
				return output.UpdateAccountResponse;
			}
		}
	}
	public static final class B_UpdateAccountBinding {
		private B_UpdateAccountBinding(){}
		public static class UpdateAccount extends wse.generated.definitions.UpdateAccountWsdl.PT_UpdateAccountPort.UpdateAccount {
			protected UpdateAccount(String uri) {
				super("wse:UpdateAccount", uri);
			}
		}
	}
}
