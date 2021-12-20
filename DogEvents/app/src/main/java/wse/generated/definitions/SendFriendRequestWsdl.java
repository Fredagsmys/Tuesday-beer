/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public final class SendFriendRequestWsdl {
	private SendFriendRequestWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #SendFriendRequestRequest} <ul><b>Type:</b> wse.generated.definitions.SendFriendRequestSchema.SendFriendRequestRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class SendFriendRequestRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.SendFriendRequestSchema.SendFriendRequestRequestType SendFriendRequestRequest;
		
		protected void load_SendFriendRequestRequest(XMLElement xml) {
			this.SendFriendRequestRequest = parseComplex(xml, "SendFriendRequestRequest", "wse:SendFriendRequest", wse.generated.definitions.SendFriendRequestSchema.SendFriendRequestRequestType.class, true);
		}
		protected void create_SendFriendRequestRequest(XMLElement xml) {
			printComplex(xml, "SendFriendRequestRequest", "wse:SendFriendRequest", this.SendFriendRequestRequest, true);
		}
		public void load(XMLElement xml) {
			try {
				load_SendFriendRequestRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:SendFriendRequest':'SendFriendRequestRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_SendFriendRequestRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:SendFriendRequest':'SendFriendRequestRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public SendFriendRequestRequestMessage(SendFriendRequestRequestMessage copy) { load(copy); }
		public void load(SendFriendRequestRequestMessage copy) {
			if (copy == null) return;
			this.SendFriendRequestRequest = copy.SendFriendRequestRequest;
		}
		public SendFriendRequestRequestMessage SendFriendRequestRequest(wse.generated.definitions.SendFriendRequestSchema.SendFriendRequestRequestType SendFriendRequestRequest){ this.SendFriendRequestRequest = SendFriendRequestRequest; return this;}
		public SendFriendRequestRequestMessage() {}
		public SendFriendRequestRequestMessage(XMLElement xml) { this.load(xml); }
		public SendFriendRequestRequestMessage(
			wse.generated.definitions.SendFriendRequestSchema.SendFriendRequestRequestType SendFriendRequestRequest
			) {
			this.SendFriendRequestRequest = SendFriendRequestRequest;
		}
		// Additional
	} // class SendFriendRequestRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #SendFriendRequestResponse} <ul><b>Type:</b> wse.generated.definitions.SendFriendRequestSchema.SendFriendRequestResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class SendFriendRequestResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.SendFriendRequestSchema.SendFriendRequestResponseType SendFriendRequestResponse;
		
		protected void load_SendFriendRequestResponse(XMLElement xml) {
			this.SendFriendRequestResponse = parseComplex(xml, "SendFriendRequestResponse", "wse:SendFriendRequest", wse.generated.definitions.SendFriendRequestSchema.SendFriendRequestResponseType.class, true);
		}
		protected void create_SendFriendRequestResponse(XMLElement xml) {
			printComplex(xml, "SendFriendRequestResponse", "wse:SendFriendRequest", this.SendFriendRequestResponse, true);
		}
		public void load(XMLElement xml) {
			try {
				load_SendFriendRequestResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:SendFriendRequest':'SendFriendRequestResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_SendFriendRequestResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:SendFriendRequest':'SendFriendRequestResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public SendFriendRequestResponseMessage(SendFriendRequestResponseMessage copy) { load(copy); }
		public void load(SendFriendRequestResponseMessage copy) {
			if (copy == null) return;
			this.SendFriendRequestResponse = copy.SendFriendRequestResponse;
		}
		public SendFriendRequestResponseMessage SendFriendRequestResponse(wse.generated.definitions.SendFriendRequestSchema.SendFriendRequestResponseType SendFriendRequestResponse){ this.SendFriendRequestResponse = SendFriendRequestResponse; return this;}
		public SendFriendRequestResponseMessage() {}
		public SendFriendRequestResponseMessage(XMLElement xml) { this.load(xml); }
		public SendFriendRequestResponseMessage(
			wse.generated.definitions.SendFriendRequestSchema.SendFriendRequestResponseType SendFriendRequestResponse
			) {
			this.SendFriendRequestResponse = SendFriendRequestResponse;
		}
		// Additional
	} // class SendFriendRequestResponseMessage
	protected static final class PT_SendFriendRequestPort {
		private PT_SendFriendRequestPort(){}
		protected static class SendFriendRequest extends wse.utils.WrappedOperation<
		wse.generated.definitions.SendFriendRequestWsdl.SendFriendRequestRequestMessage,
		wse.generated.definitions.SendFriendRequestSchema.SendFriendRequestRequestType,
		wse.generated.definitions.SendFriendRequestWsdl.SendFriendRequestResponseMessage,
		wse.generated.definitions.SendFriendRequestSchema.SendFriendRequestResponseType
		> {
			public SendFriendRequest(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.SendFriendRequestWsdl.SendFriendRequestResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.SendFriendRequestWsdl.SendFriendRequestRequestMessage wrapInput(wse.generated.definitions.SendFriendRequestSchema.SendFriendRequestRequestType input) {
				return new wse.generated.definitions.SendFriendRequestWsdl.SendFriendRequestRequestMessage(input);
			}
			protected final wse.generated.definitions.SendFriendRequestSchema.SendFriendRequestResponseType unwrapOutput(wse.generated.definitions.SendFriendRequestWsdl.SendFriendRequestResponseMessage output) {
				return output.SendFriendRequestResponse;
			}
		}
	}
	public static final class B_SendFriendRequestBinding {
		private B_SendFriendRequestBinding(){}
		public static class SendFriendRequest extends wse.generated.definitions.SendFriendRequestWsdl.PT_SendFriendRequestPort.SendFriendRequest {
			protected SendFriendRequest(String uri) {
				super("wse:SendFriendRequest", uri);
			}
		}
	}
}
