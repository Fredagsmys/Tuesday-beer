/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public final class GetCombosWsdl {
	private GetCombosWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #GetCombosRequest} <ul><b>Type:</b> wse.generated.definitions.GetCombosSchema.GetCombosRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetCombosRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.GetCombosSchema.GetCombosRequestType GetCombosRequest;
		
		protected void load_GetCombosRequest(XMLElement xml) {
			this.GetCombosRequest = parseComplex(xml, "GetCombosRequest", "wse:GetCombos", wse.generated.definitions.GetCombosSchema.GetCombosRequestType.class, true);
		}
		protected void create_GetCombosRequest(XMLElement xml) {
			printComplex(xml, "GetCombosRequest", "wse:GetCombos", this.GetCombosRequest, true);
		}
		public void load(XMLElement xml) {
			try {
				load_GetCombosRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetCombos':'GetCombosRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_GetCombosRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetCombos':'GetCombosRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public GetCombosRequestMessage(GetCombosRequestMessage copy) { load(copy); }
		public void load(GetCombosRequestMessage copy) {
			if (copy == null) return;
			this.GetCombosRequest = copy.GetCombosRequest;
		}
		public GetCombosRequestMessage GetCombosRequest(wse.generated.definitions.GetCombosSchema.GetCombosRequestType GetCombosRequest){ this.GetCombosRequest = GetCombosRequest; return this;}
		public GetCombosRequestMessage() {}
		public GetCombosRequestMessage(XMLElement xml) { this.load(xml); }
		public GetCombosRequestMessage(
			wse.generated.definitions.GetCombosSchema.GetCombosRequestType GetCombosRequest
			) {
			this.GetCombosRequest = GetCombosRequest;
		}
		// Additional
	} // class GetCombosRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #GetCombosResponse} <ul><b>Type:</b> wse.generated.definitions.GetCombosSchema.GetCombosResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetCombosResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.GetCombosSchema.GetCombosResponseType GetCombosResponse;
		
		protected void load_GetCombosResponse(XMLElement xml) {
			this.GetCombosResponse = parseComplex(xml, "GetCombosResponse", "wse:GetCombos", wse.generated.definitions.GetCombosSchema.GetCombosResponseType.class, true);
		}
		protected void create_GetCombosResponse(XMLElement xml) {
			printComplex(xml, "GetCombosResponse", "wse:GetCombos", this.GetCombosResponse, true);
		}
		public void load(XMLElement xml) {
			try {
				load_GetCombosResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetCombos':'GetCombosResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_GetCombosResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetCombos':'GetCombosResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public GetCombosResponseMessage(GetCombosResponseMessage copy) { load(copy); }
		public void load(GetCombosResponseMessage copy) {
			if (copy == null) return;
			this.GetCombosResponse = copy.GetCombosResponse;
		}
		public GetCombosResponseMessage GetCombosResponse(wse.generated.definitions.GetCombosSchema.GetCombosResponseType GetCombosResponse){ this.GetCombosResponse = GetCombosResponse; return this;}
		public GetCombosResponseMessage() {}
		public GetCombosResponseMessage(XMLElement xml) { this.load(xml); }
		public GetCombosResponseMessage(
			wse.generated.definitions.GetCombosSchema.GetCombosResponseType GetCombosResponse
			) {
			this.GetCombosResponse = GetCombosResponse;
		}
		// Additional
	} // class GetCombosResponseMessage
	protected static final class PT_GetCombosPort {
		private PT_GetCombosPort(){}
		protected static class GetCombos extends wse.utils.WrappedOperation<
		wse.generated.definitions.GetCombosWsdl.GetCombosRequestMessage,
		wse.generated.definitions.GetCombosSchema.GetCombosRequestType,
		wse.generated.definitions.GetCombosWsdl.GetCombosResponseMessage,
		wse.generated.definitions.GetCombosSchema.GetCombosResponseType
		> {
			public GetCombos(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.GetCombosWsdl.GetCombosResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.GetCombosWsdl.GetCombosRequestMessage wrapInput(wse.generated.definitions.GetCombosSchema.GetCombosRequestType input) {
				return new wse.generated.definitions.GetCombosWsdl.GetCombosRequestMessage(input);
			}
			protected final wse.generated.definitions.GetCombosSchema.GetCombosResponseType unwrapOutput(wse.generated.definitions.GetCombosWsdl.GetCombosResponseMessage output) {
				return output.GetCombosResponse;
			}
		}
	}
	public static final class B_GetCombosBinding {
		private B_GetCombosBinding(){}
		public static class GetCombos extends wse.generated.definitions.GetCombosWsdl.PT_GetCombosPort.GetCombos {
			protected GetCombos(String uri) {
				super("wse:GetCombos", uri);
			}
		}
	}
}
