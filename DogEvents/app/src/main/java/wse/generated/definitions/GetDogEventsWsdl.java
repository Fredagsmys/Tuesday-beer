/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public final class GetDogEventsWsdl {
	private GetDogEventsWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #GetDogEventsRequest} <ul><b>Type:</b> wse.generated.definitions.GetDogEventsSchema.GetDogEventsRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetDogEventsRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.GetDogEventsSchema.GetDogEventsRequestType GetDogEventsRequest;
		
		protected void load_GetDogEventsRequest(XMLElement xml) {
			this.GetDogEventsRequest = parseComplex(xml, "GetDogEventsRequest", "wse:GetDogEvents", wse.generated.definitions.GetDogEventsSchema.GetDogEventsRequestType.class, true);
		}
		protected void create_GetDogEventsRequest(XMLElement xml) {
			printComplex(xml, "GetDogEventsRequest", "wse:GetDogEvents", this.GetDogEventsRequest, true);
		}
		public void load(XMLElement xml) {
			try {
				load_GetDogEventsRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetDogEvents':'GetDogEventsRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_GetDogEventsRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetDogEvents':'GetDogEventsRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public GetDogEventsRequestMessage(GetDogEventsRequestMessage copy) { load(copy); }
		public void load(GetDogEventsRequestMessage copy) {
			if (copy == null) return;
			this.GetDogEventsRequest = copy.GetDogEventsRequest;
		}
		public GetDogEventsRequestMessage GetDogEventsRequest(wse.generated.definitions.GetDogEventsSchema.GetDogEventsRequestType GetDogEventsRequest){ this.GetDogEventsRequest = GetDogEventsRequest; return this;}
		public GetDogEventsRequestMessage() {}
		public GetDogEventsRequestMessage(XMLElement xml) { this.load(xml); }
		public GetDogEventsRequestMessage(
			wse.generated.definitions.GetDogEventsSchema.GetDogEventsRequestType GetDogEventsRequest
			) {
			this.GetDogEventsRequest = GetDogEventsRequest;
		}
		// Additional
	} // class GetDogEventsRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #GetDogEventsResponse} <ul><b>Type:</b> wse.generated.definitions.GetDogEventsSchema.GetDogEventsResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetDogEventsResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.GetDogEventsSchema.GetDogEventsResponseType GetDogEventsResponse;
		
		protected void load_GetDogEventsResponse(XMLElement xml) {
			this.GetDogEventsResponse = parseComplex(xml, "GetDogEventsResponse", "wse:GetDogEvents", wse.generated.definitions.GetDogEventsSchema.GetDogEventsResponseType.class, true);
		}
		protected void create_GetDogEventsResponse(XMLElement xml) {
			printComplex(xml, "GetDogEventsResponse", "wse:GetDogEvents", this.GetDogEventsResponse, true);
		}
		public void load(XMLElement xml) {
			try {
				load_GetDogEventsResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetDogEvents':'GetDogEventsResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_GetDogEventsResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetDogEvents':'GetDogEventsResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public GetDogEventsResponseMessage(GetDogEventsResponseMessage copy) { load(copy); }
		public void load(GetDogEventsResponseMessage copy) {
			if (copy == null) return;
			this.GetDogEventsResponse = copy.GetDogEventsResponse;
		}
		public GetDogEventsResponseMessage GetDogEventsResponse(wse.generated.definitions.GetDogEventsSchema.GetDogEventsResponseType GetDogEventsResponse){ this.GetDogEventsResponse = GetDogEventsResponse; return this;}
		public GetDogEventsResponseMessage() {}
		public GetDogEventsResponseMessage(XMLElement xml) { this.load(xml); }
		public GetDogEventsResponseMessage(
			wse.generated.definitions.GetDogEventsSchema.GetDogEventsResponseType GetDogEventsResponse
			) {
			this.GetDogEventsResponse = GetDogEventsResponse;
		}
		// Additional
	} // class GetDogEventsResponseMessage
	protected static final class PT_GetDogEventsPort {
		private PT_GetDogEventsPort(){}
		protected static class GetDogEvents extends wse.utils.WrappedOperation<
		wse.generated.definitions.GetDogEventsWsdl.GetDogEventsRequestMessage,
		wse.generated.definitions.GetDogEventsSchema.GetDogEventsRequestType,
		wse.generated.definitions.GetDogEventsWsdl.GetDogEventsResponseMessage,
		wse.generated.definitions.GetDogEventsSchema.GetDogEventsResponseType
		> {
			public GetDogEvents(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.GetDogEventsWsdl.GetDogEventsResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.GetDogEventsWsdl.GetDogEventsRequestMessage wrapInput(wse.generated.definitions.GetDogEventsSchema.GetDogEventsRequestType input) {
				return new wse.generated.definitions.GetDogEventsWsdl.GetDogEventsRequestMessage(input);
			}
			protected final wse.generated.definitions.GetDogEventsSchema.GetDogEventsResponseType unwrapOutput(wse.generated.definitions.GetDogEventsWsdl.GetDogEventsResponseMessage output) {
				return output.GetDogEventsResponse;
			}
		}
	}
	public static final class B_GetDogEventsBinding {
		private B_GetDogEventsBinding(){}
		public static class GetDogEvents extends wse.generated.definitions.GetDogEventsWsdl.PT_GetDogEventsPort.GetDogEvents {
			protected GetDogEvents(String uri) {
				super("wse:GetDogEvents", uri);
			}
		}
	}
}
