/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public final class GetWorkoutsWsdl {
	private GetWorkoutsWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #GetWorkoutsRequest} <ul><b>Type:</b> wse.generated.definitions.GetWorkoutsSchema.GetWorkoutsRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetWorkoutsRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.GetWorkoutsSchema.GetWorkoutsRequestType GetWorkoutsRequest;
		
		protected void load_GetWorkoutsRequest(XMLElement xml) {
			this.GetWorkoutsRequest = parseComplex(xml, "GetWorkoutsRequest", "wse:GetWorkouts", wse.generated.definitions.GetWorkoutsSchema.GetWorkoutsRequestType.class, true);
		}
		protected void create_GetWorkoutsRequest(XMLElement xml) {
			printComplex(xml, "GetWorkoutsRequest", "wse:GetWorkouts", this.GetWorkoutsRequest, true);
		}
		public void load(XMLElement xml) {
			try {
				load_GetWorkoutsRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetWorkouts':'GetWorkoutsRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_GetWorkoutsRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetWorkouts':'GetWorkoutsRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public GetWorkoutsRequestMessage(GetWorkoutsRequestMessage copy) { load(copy); }
		public void load(GetWorkoutsRequestMessage copy) {
			if (copy == null) return;
			this.GetWorkoutsRequest = copy.GetWorkoutsRequest;
		}
		public GetWorkoutsRequestMessage GetWorkoutsRequest(wse.generated.definitions.GetWorkoutsSchema.GetWorkoutsRequestType GetWorkoutsRequest){ this.GetWorkoutsRequest = GetWorkoutsRequest; return this;}
		public GetWorkoutsRequestMessage() {}
		public GetWorkoutsRequestMessage(XMLElement xml) { this.load(xml); }
		public GetWorkoutsRequestMessage(
			wse.generated.definitions.GetWorkoutsSchema.GetWorkoutsRequestType GetWorkoutsRequest
			) {
			this.GetWorkoutsRequest = GetWorkoutsRequest;
		}
		// Additional
	} // class GetWorkoutsRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #GetWorkoutsResponse} <ul><b>Type:</b> wse.generated.definitions.GetWorkoutsSchema.GetWorkoutsResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetWorkoutsResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.GetWorkoutsSchema.GetWorkoutsResponseType GetWorkoutsResponse;
		
		protected void load_GetWorkoutsResponse(XMLElement xml) {
			this.GetWorkoutsResponse = parseComplex(xml, "GetWorkoutsResponse", "wse:GetWorkouts", wse.generated.definitions.GetWorkoutsSchema.GetWorkoutsResponseType.class, true);
		}
		protected void create_GetWorkoutsResponse(XMLElement xml) {
			printComplex(xml, "GetWorkoutsResponse", "wse:GetWorkouts", this.GetWorkoutsResponse, true);
		}
		public void load(XMLElement xml) {
			try {
				load_GetWorkoutsResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetWorkouts':'GetWorkoutsResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_GetWorkoutsResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetWorkouts':'GetWorkoutsResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public GetWorkoutsResponseMessage(GetWorkoutsResponseMessage copy) { load(copy); }
		public void load(GetWorkoutsResponseMessage copy) {
			if (copy == null) return;
			this.GetWorkoutsResponse = copy.GetWorkoutsResponse;
		}
		public GetWorkoutsResponseMessage GetWorkoutsResponse(wse.generated.definitions.GetWorkoutsSchema.GetWorkoutsResponseType GetWorkoutsResponse){ this.GetWorkoutsResponse = GetWorkoutsResponse; return this;}
		public GetWorkoutsResponseMessage() {}
		public GetWorkoutsResponseMessage(XMLElement xml) { this.load(xml); }
		public GetWorkoutsResponseMessage(
			wse.generated.definitions.GetWorkoutsSchema.GetWorkoutsResponseType GetWorkoutsResponse
			) {
			this.GetWorkoutsResponse = GetWorkoutsResponse;
		}
		// Additional
	} // class GetWorkoutsResponseMessage
	protected static final class PT_GetWorkoutsPort {
		private PT_GetWorkoutsPort(){}
		protected static class GetWorkouts extends wse.utils.WrappedOperation<
		wse.generated.definitions.GetWorkoutsWsdl.GetWorkoutsRequestMessage,
		wse.generated.definitions.GetWorkoutsSchema.GetWorkoutsRequestType,
		wse.generated.definitions.GetWorkoutsWsdl.GetWorkoutsResponseMessage,
		wse.generated.definitions.GetWorkoutsSchema.GetWorkoutsResponseType
		> {
			public GetWorkouts(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.GetWorkoutsWsdl.GetWorkoutsResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.GetWorkoutsWsdl.GetWorkoutsRequestMessage wrapInput(wse.generated.definitions.GetWorkoutsSchema.GetWorkoutsRequestType input) {
				return new wse.generated.definitions.GetWorkoutsWsdl.GetWorkoutsRequestMessage(input);
			}
			protected final wse.generated.definitions.GetWorkoutsSchema.GetWorkoutsResponseType unwrapOutput(wse.generated.definitions.GetWorkoutsWsdl.GetWorkoutsResponseMessage output) {
				return output.GetWorkoutsResponse;
			}
		}
	}
	public static final class B_GetWorkoutsBinding {
		private B_GetWorkoutsBinding(){}
		public static class GetWorkouts extends wse.generated.definitions.GetWorkoutsWsdl.PT_GetWorkoutsPort.GetWorkouts {
			protected GetWorkouts(String uri) {
				super("wse:GetWorkouts", uri);
			}
		}
	}
}
