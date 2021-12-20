/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public final class GetFriendsWsdl {
	private GetFriendsWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #GetFriendsRequest} <ul><b>Type:</b> wse.generated.definitions.GetFriendsSchema.GetFriendsRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetFriendsRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.GetFriendsSchema.GetFriendsRequestType GetFriendsRequest;
		
		protected void load_GetFriendsRequest(XMLElement xml) {
			this.GetFriendsRequest = parseComplex(xml, "GetFriendsRequest", "wse:GetFriends", wse.generated.definitions.GetFriendsSchema.GetFriendsRequestType.class, true);
		}
		protected void create_GetFriendsRequest(XMLElement xml) {
			printComplex(xml, "GetFriendsRequest", "wse:GetFriends", this.GetFriendsRequest, true);
		}
		public void load(XMLElement xml) {
			try {
				load_GetFriendsRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetFriends':'GetFriendsRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_GetFriendsRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetFriends':'GetFriendsRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public GetFriendsRequestMessage(GetFriendsRequestMessage copy) { load(copy); }
		public void load(GetFriendsRequestMessage copy) {
			if (copy == null) return;
			this.GetFriendsRequest = copy.GetFriendsRequest;
		}
		public GetFriendsRequestMessage GetFriendsRequest(wse.generated.definitions.GetFriendsSchema.GetFriendsRequestType GetFriendsRequest){ this.GetFriendsRequest = GetFriendsRequest; return this;}
		public GetFriendsRequestMessage() {}
		public GetFriendsRequestMessage(XMLElement xml) { this.load(xml); }
		public GetFriendsRequestMessage(
			wse.generated.definitions.GetFriendsSchema.GetFriendsRequestType GetFriendsRequest
			) {
			this.GetFriendsRequest = GetFriendsRequest;
		}
		// Additional
	} // class GetFriendsRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #GetFriendsResponse} <ul><b>Type:</b> wse.generated.definitions.GetFriendsSchema.GetFriendsResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetFriendsResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.GetFriendsSchema.GetFriendsResponseType GetFriendsResponse;
		
		protected void load_GetFriendsResponse(XMLElement xml) {
			this.GetFriendsResponse = parseComplex(xml, "GetFriendsResponse", "wse:GetFriends", wse.generated.definitions.GetFriendsSchema.GetFriendsResponseType.class, true);
		}
		protected void create_GetFriendsResponse(XMLElement xml) {
			printComplex(xml, "GetFriendsResponse", "wse:GetFriends", this.GetFriendsResponse, true);
		}
		public void load(XMLElement xml) {
			try {
				load_GetFriendsResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetFriends':'GetFriendsResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_GetFriendsResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetFriends':'GetFriendsResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public GetFriendsResponseMessage(GetFriendsResponseMessage copy) { load(copy); }
		public void load(GetFriendsResponseMessage copy) {
			if (copy == null) return;
			this.GetFriendsResponse = copy.GetFriendsResponse;
		}
		public GetFriendsResponseMessage GetFriendsResponse(wse.generated.definitions.GetFriendsSchema.GetFriendsResponseType GetFriendsResponse){ this.GetFriendsResponse = GetFriendsResponse; return this;}
		public GetFriendsResponseMessage() {}
		public GetFriendsResponseMessage(XMLElement xml) { this.load(xml); }
		public GetFriendsResponseMessage(
			wse.generated.definitions.GetFriendsSchema.GetFriendsResponseType GetFriendsResponse
			) {
			this.GetFriendsResponse = GetFriendsResponse;
		}
		// Additional
	} // class GetFriendsResponseMessage
	protected static final class PT_GetFriendsPort {
		private PT_GetFriendsPort(){}
		protected static class GetFriends extends wse.utils.WrappedOperation<
		wse.generated.definitions.GetFriendsWsdl.GetFriendsRequestMessage,
		wse.generated.definitions.GetFriendsSchema.GetFriendsRequestType,
		wse.generated.definitions.GetFriendsWsdl.GetFriendsResponseMessage,
		wse.generated.definitions.GetFriendsSchema.GetFriendsResponseType
		> {
			public GetFriends(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.GetFriendsWsdl.GetFriendsResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.GetFriendsWsdl.GetFriendsRequestMessage wrapInput(wse.generated.definitions.GetFriendsSchema.GetFriendsRequestType input) {
				return new wse.generated.definitions.GetFriendsWsdl.GetFriendsRequestMessage(input);
			}
			protected final wse.generated.definitions.GetFriendsSchema.GetFriendsResponseType unwrapOutput(wse.generated.definitions.GetFriendsWsdl.GetFriendsResponseMessage output) {
				return output.GetFriendsResponse;
			}
		}
	}
	public static final class B_GetFriendsBinding {
		private B_GetFriendsBinding(){}
		public static class GetFriends extends wse.generated.definitions.GetFriendsWsdl.PT_GetFriendsPort.GetFriends {
			protected GetFriends(String uri) {
				super("wse:GetFriends", uri);
			}
		}
	}
}
