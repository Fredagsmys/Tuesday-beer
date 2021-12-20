/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public final class GetFriendRequestsWsdl {
	private GetFriendRequestsWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #GetFriendRequestsRequest} <ul><b>Type:</b> wse.generated.definitions.GetFriendRequestsSchema.GetFriendRequestsRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetFriendRequestsRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.GetFriendRequestsSchema.GetFriendRequestsRequestType GetFriendRequestsRequest;
		
		protected void load_GetFriendRequestsRequest(XMLElement xml) {
			this.GetFriendRequestsRequest = parseComplex(xml, "GetFriendRequestsRequest", "wse:GetFriendRequests", wse.generated.definitions.GetFriendRequestsSchema.GetFriendRequestsRequestType.class, true);
		}
		protected void create_GetFriendRequestsRequest(XMLElement xml) {
			printComplex(xml, "GetFriendRequestsRequest", "wse:GetFriendRequests", this.GetFriendRequestsRequest, true);
		}
		public void load(XMLElement xml) {
			try {
				load_GetFriendRequestsRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetFriendRequests':'GetFriendRequestsRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_GetFriendRequestsRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetFriendRequests':'GetFriendRequestsRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public GetFriendRequestsRequestMessage(GetFriendRequestsRequestMessage copy) { load(copy); }
		public void load(GetFriendRequestsRequestMessage copy) {
			if (copy == null) return;
			this.GetFriendRequestsRequest = copy.GetFriendRequestsRequest;
		}
		public GetFriendRequestsRequestMessage GetFriendRequestsRequest(wse.generated.definitions.GetFriendRequestsSchema.GetFriendRequestsRequestType GetFriendRequestsRequest){ this.GetFriendRequestsRequest = GetFriendRequestsRequest; return this;}
		public GetFriendRequestsRequestMessage() {}
		public GetFriendRequestsRequestMessage(XMLElement xml) { this.load(xml); }
		public GetFriendRequestsRequestMessage(
			wse.generated.definitions.GetFriendRequestsSchema.GetFriendRequestsRequestType GetFriendRequestsRequest
			) {
			this.GetFriendRequestsRequest = GetFriendRequestsRequest;
		}
		// Additional
	} // class GetFriendRequestsRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #GetFriendRequestsResponse} <ul><b>Type:</b> wse.generated.definitions.GetFriendRequestsSchema.GetFriendRequestsResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetFriendRequestsResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.GetFriendRequestsSchema.GetFriendRequestsResponseType GetFriendRequestsResponse;
		
		protected void load_GetFriendRequestsResponse(XMLElement xml) {
			this.GetFriendRequestsResponse = parseComplex(xml, "GetFriendRequestsResponse", "wse:GetFriendRequests", wse.generated.definitions.GetFriendRequestsSchema.GetFriendRequestsResponseType.class, true);
		}
		protected void create_GetFriendRequestsResponse(XMLElement xml) {
			printComplex(xml, "GetFriendRequestsResponse", "wse:GetFriendRequests", this.GetFriendRequestsResponse, true);
		}
		public void load(XMLElement xml) {
			try {
				load_GetFriendRequestsResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetFriendRequests':'GetFriendRequestsResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_GetFriendRequestsResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetFriendRequests':'GetFriendRequestsResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public GetFriendRequestsResponseMessage(GetFriendRequestsResponseMessage copy) { load(copy); }
		public void load(GetFriendRequestsResponseMessage copy) {
			if (copy == null) return;
			this.GetFriendRequestsResponse = copy.GetFriendRequestsResponse;
		}
		public GetFriendRequestsResponseMessage GetFriendRequestsResponse(wse.generated.definitions.GetFriendRequestsSchema.GetFriendRequestsResponseType GetFriendRequestsResponse){ this.GetFriendRequestsResponse = GetFriendRequestsResponse; return this;}
		public GetFriendRequestsResponseMessage() {}
		public GetFriendRequestsResponseMessage(XMLElement xml) { this.load(xml); }
		public GetFriendRequestsResponseMessage(
			wse.generated.definitions.GetFriendRequestsSchema.GetFriendRequestsResponseType GetFriendRequestsResponse
			) {
			this.GetFriendRequestsResponse = GetFriendRequestsResponse;
		}
		// Additional
	} // class GetFriendRequestsResponseMessage
	protected static final class PT_GetFriendRequestsPort {
		private PT_GetFriendRequestsPort(){}
		protected static class GetFriendRequests extends wse.utils.WrappedOperation<
		wse.generated.definitions.GetFriendRequestsWsdl.GetFriendRequestsRequestMessage,
		wse.generated.definitions.GetFriendRequestsSchema.GetFriendRequestsRequestType,
		wse.generated.definitions.GetFriendRequestsWsdl.GetFriendRequestsResponseMessage,
		wse.generated.definitions.GetFriendRequestsSchema.GetFriendRequestsResponseType
		> {
			public GetFriendRequests(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.GetFriendRequestsWsdl.GetFriendRequestsResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.GetFriendRequestsWsdl.GetFriendRequestsRequestMessage wrapInput(wse.generated.definitions.GetFriendRequestsSchema.GetFriendRequestsRequestType input) {
				return new wse.generated.definitions.GetFriendRequestsWsdl.GetFriendRequestsRequestMessage(input);
			}
			protected final wse.generated.definitions.GetFriendRequestsSchema.GetFriendRequestsResponseType unwrapOutput(wse.generated.definitions.GetFriendRequestsWsdl.GetFriendRequestsResponseMessage output) {
				return output.GetFriendRequestsResponse;
			}
		}
	}
	public static final class B_GetFriendRequestsBinding {
		private B_GetFriendRequestsBinding(){}
		public static class GetFriendRequests extends wse.generated.definitions.GetFriendRequestsWsdl.PT_GetFriendRequestsPort.GetFriendRequests {
			protected GetFriendRequests(String uri) {
				super("wse:GetFriendRequests", uri);
			}
		}
	}
}
