/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 10 August 2021 17:00:42 +0200
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.internal.IElement;

public final class GetSensorIDsWsdl {
	private GetSensorIDsWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #GetSensorIDsRequest} <ul><b>Type:</b> wse.generated.definitions.GetSensorIDsSchema.GetSensorIDsRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetSensorIDsRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.GetSensorIDsSchema.GetSensorIDsRequestType GetSensorIDsRequest;
		
		protected void load_GetSensorIDsRequest(IElement xml) {
			this.GetSensorIDsRequest = parseComplex(xml, "GetSensorIDsRequest", "wse:GetSensorIDs", wse.generated.definitions.GetSensorIDsSchema.GetSensorIDsRequestType.class, true);
		}
		protected void create_GetSensorIDsRequest(IElement xml) {
			printComplex(xml, "GetSensorIDsRequest", "wse:GetSensorIDs", this.GetSensorIDsRequest, true);
		}
		public void load(IElement xml) {
			try {
				load_GetSensorIDsRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetSensorIDs':'GetSensorIDsRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_GetSensorIDsRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetSensorIDs':'GetSensorIDsRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public GetSensorIDsRequestMessage(GetSensorIDsRequestMessage copy) { load(copy); }
		public void load(GetSensorIDsRequestMessage copy) {
			if (copy == null) return;
			this.GetSensorIDsRequest = copy.GetSensorIDsRequest;
		}
		public GetSensorIDsRequestMessage GetSensorIDsRequest(wse.generated.definitions.GetSensorIDsSchema.GetSensorIDsRequestType GetSensorIDsRequest){ this.GetSensorIDsRequest = GetSensorIDsRequest; return this;}
		public GetSensorIDsRequestMessage() {}
		public GetSensorIDsRequestMessage(IElement xml) { this.load(xml); }
		public GetSensorIDsRequestMessage(
			wse.generated.definitions.GetSensorIDsSchema.GetSensorIDsRequestType GetSensorIDsRequest
			) {
			this.GetSensorIDsRequest = GetSensorIDsRequest;
		}
		// Additional
	} // class GetSensorIDsRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #GetSensorIDsResponse} <ul><b>Type:</b> wse.generated.definitions.GetSensorIDsSchema.GetSensorIDsResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetSensorIDsResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.GetSensorIDsSchema.GetSensorIDsResponseType GetSensorIDsResponse;
		
		protected void load_GetSensorIDsResponse(IElement xml) {
			this.GetSensorIDsResponse = parseComplex(xml, "GetSensorIDsResponse", "wse:GetSensorIDs", wse.generated.definitions.GetSensorIDsSchema.GetSensorIDsResponseType.class, true);
		}
		protected void create_GetSensorIDsResponse(IElement xml) {
			printComplex(xml, "GetSensorIDsResponse", "wse:GetSensorIDs", this.GetSensorIDsResponse, true);
		}
		public void load(IElement xml) {
			try {
				load_GetSensorIDsResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetSensorIDs':'GetSensorIDsResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_GetSensorIDsResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetSensorIDs':'GetSensorIDsResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public GetSensorIDsResponseMessage(GetSensorIDsResponseMessage copy) { load(copy); }
		public void load(GetSensorIDsResponseMessage copy) {
			if (copy == null) return;
			this.GetSensorIDsResponse = copy.GetSensorIDsResponse;
		}
		public GetSensorIDsResponseMessage GetSensorIDsResponse(wse.generated.definitions.GetSensorIDsSchema.GetSensorIDsResponseType GetSensorIDsResponse){ this.GetSensorIDsResponse = GetSensorIDsResponse; return this;}
		public GetSensorIDsResponseMessage() {}
		public GetSensorIDsResponseMessage(IElement xml) { this.load(xml); }
		public GetSensorIDsResponseMessage(
			wse.generated.definitions.GetSensorIDsSchema.GetSensorIDsResponseType GetSensorIDsResponse
			) {
			this.GetSensorIDsResponse = GetSensorIDsResponse;
		}
		// Additional
	} // class GetSensorIDsResponseMessage
	protected static final class PT_GetSensorIDsPort {
		private PT_GetSensorIDsPort(){}
		protected static class GetSensorIDs extends wse.utils.WrappedOperation<
		wse.generated.definitions.GetSensorIDsWsdl.GetSensorIDsRequestMessage,
		wse.generated.definitions.GetSensorIDsSchema.GetSensorIDsRequestType,
		wse.generated.definitions.GetSensorIDsWsdl.GetSensorIDsResponseMessage,
		wse.generated.definitions.GetSensorIDsSchema.GetSensorIDsResponseType
		> {
			public GetSensorIDs(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.GetSensorIDsWsdl.GetSensorIDsResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.GetSensorIDsWsdl.GetSensorIDsRequestMessage wrapInput(wse.generated.definitions.GetSensorIDsSchema.GetSensorIDsRequestType input) {
				return new wse.generated.definitions.GetSensorIDsWsdl.GetSensorIDsRequestMessage(input);
			}
			protected final wse.generated.definitions.GetSensorIDsSchema.GetSensorIDsResponseType unwrapOutput(wse.generated.definitions.GetSensorIDsWsdl.GetSensorIDsResponseMessage output) {
				return output.GetSensorIDsResponse;
			}
		}
	}
	public static final class B_GetSensorIDsBinding {
		private B_GetSensorIDsBinding(){}
		public static class GetSensorIDs extends wse.generated.definitions.GetSensorIDsWsdl.PT_GetSensorIDsPort.GetSensorIDs {
			protected GetSensorIDs(String uri) {
				super("wse:GetSensorIDs", uri);
			}
		}
	}
}
