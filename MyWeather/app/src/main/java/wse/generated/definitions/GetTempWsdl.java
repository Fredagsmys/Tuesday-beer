/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public final class GetTempWsdl {
	private GetTempWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #GetTempRequest} <ul><b>Type:</b> wse.generated.definitions.GetTempSchema.GetTempRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetTempRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.GetTempSchema.GetTempRequestType GetTempRequest;
		
		protected void load_GetTempRequest(XMLElement xml) {
			this.GetTempRequest = parseComplex(xml, "GetTempRequest", "wse:GetTemp", wse.generated.definitions.GetTempSchema.GetTempRequestType.class, true);
		}
		protected void create_GetTempRequest(XMLElement xml) {
			printComplex(xml, "GetTempRequest", "wse:GetTemp", this.GetTempRequest, true);
		}
		public void load(XMLElement xml) {
			try {
				load_GetTempRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetTemp':'GetTempRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_GetTempRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetTemp':'GetTempRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public GetTempRequestMessage(GetTempRequestMessage copy) { load(copy); }
		public void load(GetTempRequestMessage copy) {
			if (copy == null) return;
			this.GetTempRequest = copy.GetTempRequest;
		}
		public GetTempRequestMessage GetTempRequest(wse.generated.definitions.GetTempSchema.GetTempRequestType GetTempRequest){ this.GetTempRequest = GetTempRequest; return this;}
		public GetTempRequestMessage() {}
		public GetTempRequestMessage(XMLElement xml) { this.load(xml); }
		public GetTempRequestMessage(
			wse.generated.definitions.GetTempSchema.GetTempRequestType GetTempRequest
			) {
			this.GetTempRequest = GetTempRequest;
		}
		// Additional
	} // class GetTempRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #GetTempResponse} <ul><b>Type:</b> wse.generated.definitions.GetTempSchema.GetTempResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetTempResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.GetTempSchema.GetTempResponseType GetTempResponse;
		
		protected void load_GetTempResponse(XMLElement xml) {
			this.GetTempResponse = parseComplex(xml, "GetTempResponse", "wse:GetTemp", wse.generated.definitions.GetTempSchema.GetTempResponseType.class, true);
		}
		protected void create_GetTempResponse(XMLElement xml) {
			printComplex(xml, "GetTempResponse", "wse:GetTemp", this.GetTempResponse, true);
		}
		public void load(XMLElement xml) {
			try {
				load_GetTempResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetTemp':'GetTempResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_GetTempResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetTemp':'GetTempResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public GetTempResponseMessage(GetTempResponseMessage copy) { load(copy); }
		public void load(GetTempResponseMessage copy) {
			if (copy == null) return;
			this.GetTempResponse = copy.GetTempResponse;
		}
		public GetTempResponseMessage GetTempResponse(wse.generated.definitions.GetTempSchema.GetTempResponseType GetTempResponse){ this.GetTempResponse = GetTempResponse; return this;}
		public GetTempResponseMessage() {}
		public GetTempResponseMessage(XMLElement xml) { this.load(xml); }
		public GetTempResponseMessage(
			wse.generated.definitions.GetTempSchema.GetTempResponseType GetTempResponse
			) {
			this.GetTempResponse = GetTempResponse;
		}
		// Additional
	} // class GetTempResponseMessage
	protected static final class PT_GetTempPort {
		private PT_GetTempPort(){}
		protected static class GetTemp extends wse.utils.WrappedOperation<
		wse.generated.definitions.GetTempWsdl.GetTempRequestMessage,
		wse.generated.definitions.GetTempSchema.GetTempRequestType,
		wse.generated.definitions.GetTempWsdl.GetTempResponseMessage,
		wse.generated.definitions.GetTempSchema.GetTempResponseType
		> {
			public GetTemp(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.GetTempWsdl.GetTempResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.GetTempWsdl.GetTempRequestMessage wrapInput(wse.generated.definitions.GetTempSchema.GetTempRequestType input) {
				return new wse.generated.definitions.GetTempWsdl.GetTempRequestMessage(input);
			}
			protected final wse.generated.definitions.GetTempSchema.GetTempResponseType unwrapOutput(wse.generated.definitions.GetTempWsdl.GetTempResponseMessage output) {
				return output.GetTempResponse;
			}
		}
	}
	public static final class B_GetTempBinding {
		private B_GetTempBinding(){}
		public static class GetTemp extends wse.generated.definitions.GetTempWsdl.PT_GetTempPort.GetTemp {
			protected GetTemp(String uri) {
				super("wse:GetTemp", uri);
			}
		}
	}
}
