/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public final class AcceptFriendRequestWsdl {
	private AcceptFriendRequestWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #AcceptFriendRequestRequest} <ul><b>Type:</b> wse.generated.definitions.AcceptFriendRequestSchema.AcceptFriendRequestRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class AcceptFriendRequestRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.AcceptFriendRequestSchema.AcceptFriendRequestRequestType AcceptFriendRequestRequest;
		
		protected void load_AcceptFriendRequestRequest(XMLElement xml) {
			this.AcceptFriendRequestRequest = parseComplex(xml, "AcceptFriendRequestRequest", "wse:AcceptFriendRequest", wse.generated.definitions.AcceptFriendRequestSchema.AcceptFriendRequestRequestType.class, true);
		}
		protected void create_AcceptFriendRequestRequest(XMLElement xml) {
			printComplex(xml, "AcceptFriendRequestRequest", "wse:AcceptFriendRequest", this.AcceptFriendRequestRequest, true);
		}
		public void load(XMLElement xml) {
			try {
				load_AcceptFriendRequestRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:AcceptFriendRequest':'AcceptFriendRequestRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_AcceptFriendRequestRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:AcceptFriendRequest':'AcceptFriendRequestRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public AcceptFriendRequestRequestMessage(AcceptFriendRequestRequestMessage copy) { load(copy); }
		public void load(AcceptFriendRequestRequestMessage copy) {
			if (copy == null) return;
			this.AcceptFriendRequestRequest = copy.AcceptFriendRequestRequest;
		}
		public AcceptFriendRequestRequestMessage AcceptFriendRequestRequest(wse.generated.definitions.AcceptFriendRequestSchema.AcceptFriendRequestRequestType AcceptFriendRequestRequest){ this.AcceptFriendRequestRequest = AcceptFriendRequestRequest; return this;}
		public AcceptFriendRequestRequestMessage() {}
		public AcceptFriendRequestRequestMessage(XMLElement xml) { this.load(xml); }
		public AcceptFriendRequestRequestMessage(
			wse.generated.definitions.AcceptFriendRequestSchema.AcceptFriendRequestRequestType AcceptFriendRequestRequest
			) {
			this.AcceptFriendRequestRequest = AcceptFriendRequestRequest;
		}
		// Additional
	} // class AcceptFriendRequestRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #AcceptFriendRequestResponse} <ul><b>Type:</b> wse.generated.definitions.AcceptFriendRequestSchema.AcceptFriendRequestResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class AcceptFriendRequestResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.AcceptFriendRequestSchema.AcceptFriendRequestResponseType AcceptFriendRequestResponse;
		
		protected void load_AcceptFriendRequestResponse(XMLElement xml) {
			this.AcceptFriendRequestResponse = parseComplex(xml, "AcceptFriendRequestResponse", "wse:AcceptFriendRequest", wse.generated.definitions.AcceptFriendRequestSchema.AcceptFriendRequestResponseType.class, true);
		}
		protected void create_AcceptFriendRequestResponse(XMLElement xml) {
			printComplex(xml, "AcceptFriendRequestResponse", "wse:AcceptFriendRequest", this.AcceptFriendRequestResponse, true);
		}
		public void load(XMLElement xml) {
			try {
				load_AcceptFriendRequestResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:AcceptFriendRequest':'AcceptFriendRequestResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_AcceptFriendRequestResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:AcceptFriendRequest':'AcceptFriendRequestResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public AcceptFriendRequestResponseMessage(AcceptFriendRequestResponseMessage copy) { load(copy); }
		public void load(AcceptFriendRequestResponseMessage copy) {
			if (copy == null) return;
			this.AcceptFriendRequestResponse = copy.AcceptFriendRequestResponse;
		}
		public AcceptFriendRequestResponseMessage AcceptFriendRequestResponse(wse.generated.definitions.AcceptFriendRequestSchema.AcceptFriendRequestResponseType AcceptFriendRequestResponse){ this.AcceptFriendRequestResponse = AcceptFriendRequestResponse; return this;}
		public AcceptFriendRequestResponseMessage() {}
		public AcceptFriendRequestResponseMessage(XMLElement xml) { this.load(xml); }
		public AcceptFriendRequestResponseMessage(
			wse.generated.definitions.AcceptFriendRequestSchema.AcceptFriendRequestResponseType AcceptFriendRequestResponse
			) {
			this.AcceptFriendRequestResponse = AcceptFriendRequestResponse;
		}
		// Additional
	} // class AcceptFriendRequestResponseMessage
	protected static final class PT_AcceptFriendRequestPort {
		private PT_AcceptFriendRequestPort(){}
		protected static class AcceptFriendRequest extends wse.utils.WrappedOperation<
		wse.generated.definitions.AcceptFriendRequestWsdl.AcceptFriendRequestRequestMessage,
		wse.generated.definitions.AcceptFriendRequestSchema.AcceptFriendRequestRequestType,
		wse.generated.definitions.AcceptFriendRequestWsdl.AcceptFriendRequestResponseMessage,
		wse.generated.definitions.AcceptFriendRequestSchema.AcceptFriendRequestResponseType
		> {
			public AcceptFriendRequest(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.AcceptFriendRequestWsdl.AcceptFriendRequestResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.AcceptFriendRequestWsdl.AcceptFriendRequestRequestMessage wrapInput(wse.generated.definitions.AcceptFriendRequestSchema.AcceptFriendRequestRequestType input) {
				return new wse.generated.definitions.AcceptFriendRequestWsdl.AcceptFriendRequestRequestMessage(input);
			}
			protected final wse.generated.definitions.AcceptFriendRequestSchema.AcceptFriendRequestResponseType unwrapOutput(wse.generated.definitions.AcceptFriendRequestWsdl.AcceptFriendRequestResponseMessage output) {
				return output.AcceptFriendRequestResponse;
			}
		}
	}
	public static final class B_AcceptFriendRequestBinding {
		private B_AcceptFriendRequestBinding(){}
		public static class AcceptFriendRequest extends wse.generated.definitions.AcceptFriendRequestWsdl.PT_AcceptFriendRequestPort.AcceptFriendRequest {
			protected AcceptFriendRequest(String uri) {
				super("wse:AcceptFriendRequest", uri);
			}
		}
	}
}
