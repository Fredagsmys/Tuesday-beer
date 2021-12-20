/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public final class GetAchievementsWsdl {
	private GetAchievementsWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #GetAchievementsRequest} <ul><b>Type:</b> wse.generated.definitions.GetAchievementsSchema.GetAchievementsRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetAchievementsRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.GetAchievementsSchema.GetAchievementsRequestType GetAchievementsRequest;
		
		protected void load_GetAchievementsRequest(XMLElement xml) {
			this.GetAchievementsRequest = parseComplex(xml, "GetAchievementsRequest", "wse:GetAchievements", wse.generated.definitions.GetAchievementsSchema.GetAchievementsRequestType.class, true);
		}
		protected void create_GetAchievementsRequest(XMLElement xml) {
			printComplex(xml, "GetAchievementsRequest", "wse:GetAchievements", this.GetAchievementsRequest, true);
		}
		public void load(XMLElement xml) {
			try {
				load_GetAchievementsRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetAchievements':'GetAchievementsRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_GetAchievementsRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetAchievements':'GetAchievementsRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public GetAchievementsRequestMessage(GetAchievementsRequestMessage copy) { load(copy); }
		public void load(GetAchievementsRequestMessage copy) {
			if (copy == null) return;
			this.GetAchievementsRequest = copy.GetAchievementsRequest;
		}
		public GetAchievementsRequestMessage GetAchievementsRequest(wse.generated.definitions.GetAchievementsSchema.GetAchievementsRequestType GetAchievementsRequest){ this.GetAchievementsRequest = GetAchievementsRequest; return this;}
		public GetAchievementsRequestMessage() {}
		public GetAchievementsRequestMessage(XMLElement xml) { this.load(xml); }
		public GetAchievementsRequestMessage(
			wse.generated.definitions.GetAchievementsSchema.GetAchievementsRequestType GetAchievementsRequest
			) {
			this.GetAchievementsRequest = GetAchievementsRequest;
		}
		// Additional
	} // class GetAchievementsRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #GetAchievementsResponse} <ul><b>Type:</b> wse.generated.definitions.GetAchievementsSchema.GetAchievementsResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetAchievementsResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.GetAchievementsSchema.GetAchievementsResponseType GetAchievementsResponse;
		
		protected void load_GetAchievementsResponse(XMLElement xml) {
			this.GetAchievementsResponse = parseComplex(xml, "GetAchievementsResponse", "wse:GetAchievements", wse.generated.definitions.GetAchievementsSchema.GetAchievementsResponseType.class, true);
		}
		protected void create_GetAchievementsResponse(XMLElement xml) {
			printComplex(xml, "GetAchievementsResponse", "wse:GetAchievements", this.GetAchievementsResponse, true);
		}
		public void load(XMLElement xml) {
			try {
				load_GetAchievementsResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetAchievements':'GetAchievementsResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_GetAchievementsResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetAchievements':'GetAchievementsResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public GetAchievementsResponseMessage(GetAchievementsResponseMessage copy) { load(copy); }
		public void load(GetAchievementsResponseMessage copy) {
			if (copy == null) return;
			this.GetAchievementsResponse = copy.GetAchievementsResponse;
		}
		public GetAchievementsResponseMessage GetAchievementsResponse(wse.generated.definitions.GetAchievementsSchema.GetAchievementsResponseType GetAchievementsResponse){ this.GetAchievementsResponse = GetAchievementsResponse; return this;}
		public GetAchievementsResponseMessage() {}
		public GetAchievementsResponseMessage(XMLElement xml) { this.load(xml); }
		public GetAchievementsResponseMessage(
			wse.generated.definitions.GetAchievementsSchema.GetAchievementsResponseType GetAchievementsResponse
			) {
			this.GetAchievementsResponse = GetAchievementsResponse;
		}
		// Additional
	} // class GetAchievementsResponseMessage
	protected static final class PT_GetAchievementsPort {
		private PT_GetAchievementsPort(){}
		protected static class GetAchievements extends wse.utils.WrappedOperation<
		wse.generated.definitions.GetAchievementsWsdl.GetAchievementsRequestMessage,
		wse.generated.definitions.GetAchievementsSchema.GetAchievementsRequestType,
		wse.generated.definitions.GetAchievementsWsdl.GetAchievementsResponseMessage,
		wse.generated.definitions.GetAchievementsSchema.GetAchievementsResponseType
		> {
			public GetAchievements(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.GetAchievementsWsdl.GetAchievementsResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.GetAchievementsWsdl.GetAchievementsRequestMessage wrapInput(wse.generated.definitions.GetAchievementsSchema.GetAchievementsRequestType input) {
				return new wse.generated.definitions.GetAchievementsWsdl.GetAchievementsRequestMessage(input);
			}
			protected final wse.generated.definitions.GetAchievementsSchema.GetAchievementsResponseType unwrapOutput(wse.generated.definitions.GetAchievementsWsdl.GetAchievementsResponseMessage output) {
				return output.GetAchievementsResponse;
			}
		}
	}
	public static final class B_GetAchievementsBinding {
		private B_GetAchievementsBinding(){}
		public static class GetAchievements extends wse.generated.definitions.GetAchievementsWsdl.PT_GetAchievementsPort.GetAchievements {
			protected GetAchievements(String uri) {
				super("wse:GetAchievements", uri);
			}
		}
	}
}
