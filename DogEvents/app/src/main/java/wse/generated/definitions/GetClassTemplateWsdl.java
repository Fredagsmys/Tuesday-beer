/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public final class GetClassTemplateWsdl {
	private GetClassTemplateWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #GetClassTemplateRequest} <ul><b>Type:</b> wse.generated.definitions.GetClassTemplateSchema.GetClassTemplateRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetClassTemplateRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.GetClassTemplateSchema.GetClassTemplateRequestType GetClassTemplateRequest;
		
		protected void load_GetClassTemplateRequest(XMLElement xml) {
			this.GetClassTemplateRequest = parseComplex(xml, "GetClassTemplateRequest", "wse:GetClassTemplate", wse.generated.definitions.GetClassTemplateSchema.GetClassTemplateRequestType.class, true);
		}
		protected void create_GetClassTemplateRequest(XMLElement xml) {
			printComplex(xml, "GetClassTemplateRequest", "wse:GetClassTemplate", this.GetClassTemplateRequest, true);
		}
		public void load(XMLElement xml) {
			try {
				load_GetClassTemplateRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetClassTemplate':'GetClassTemplateRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_GetClassTemplateRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetClassTemplate':'GetClassTemplateRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public GetClassTemplateRequestMessage(GetClassTemplateRequestMessage copy) { load(copy); }
		public void load(GetClassTemplateRequestMessage copy) {
			if (copy == null) return;
			this.GetClassTemplateRequest = copy.GetClassTemplateRequest;
		}
		public GetClassTemplateRequestMessage GetClassTemplateRequest(wse.generated.definitions.GetClassTemplateSchema.GetClassTemplateRequestType GetClassTemplateRequest){ this.GetClassTemplateRequest = GetClassTemplateRequest; return this;}
		public GetClassTemplateRequestMessage() {}
		public GetClassTemplateRequestMessage(XMLElement xml) { this.load(xml); }
		public GetClassTemplateRequestMessage(
			wse.generated.definitions.GetClassTemplateSchema.GetClassTemplateRequestType GetClassTemplateRequest
			) {
			this.GetClassTemplateRequest = GetClassTemplateRequest;
		}
		// Additional
	} // class GetClassTemplateRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #GetClassTemplateResponse} <ul><b>Type:</b> wse.generated.definitions.GetClassTemplateSchema.GetClassTemplateResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetClassTemplateResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.GetClassTemplateSchema.GetClassTemplateResponseType GetClassTemplateResponse;
		
		protected void load_GetClassTemplateResponse(XMLElement xml) {
			this.GetClassTemplateResponse = parseComplex(xml, "GetClassTemplateResponse", "wse:GetClassTemplate", wse.generated.definitions.GetClassTemplateSchema.GetClassTemplateResponseType.class, true);
		}
		protected void create_GetClassTemplateResponse(XMLElement xml) {
			printComplex(xml, "GetClassTemplateResponse", "wse:GetClassTemplate", this.GetClassTemplateResponse, true);
		}
		public void load(XMLElement xml) {
			try {
				load_GetClassTemplateResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetClassTemplate':'GetClassTemplateResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_GetClassTemplateResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetClassTemplate':'GetClassTemplateResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public GetClassTemplateResponseMessage(GetClassTemplateResponseMessage copy) { load(copy); }
		public void load(GetClassTemplateResponseMessage copy) {
			if (copy == null) return;
			this.GetClassTemplateResponse = copy.GetClassTemplateResponse;
		}
		public GetClassTemplateResponseMessage GetClassTemplateResponse(wse.generated.definitions.GetClassTemplateSchema.GetClassTemplateResponseType GetClassTemplateResponse){ this.GetClassTemplateResponse = GetClassTemplateResponse; return this;}
		public GetClassTemplateResponseMessage() {}
		public GetClassTemplateResponseMessage(XMLElement xml) { this.load(xml); }
		public GetClassTemplateResponseMessage(
			wse.generated.definitions.GetClassTemplateSchema.GetClassTemplateResponseType GetClassTemplateResponse
			) {
			this.GetClassTemplateResponse = GetClassTemplateResponse;
		}
		// Additional
	} // class GetClassTemplateResponseMessage
	protected static final class PT_GetClassTemplatePort {
		private PT_GetClassTemplatePort(){}
		protected static class GetClassTemplate extends wse.utils.WrappedOperation<
		wse.generated.definitions.GetClassTemplateWsdl.GetClassTemplateRequestMessage,
		wse.generated.definitions.GetClassTemplateSchema.GetClassTemplateRequestType,
		wse.generated.definitions.GetClassTemplateWsdl.GetClassTemplateResponseMessage,
		wse.generated.definitions.GetClassTemplateSchema.GetClassTemplateResponseType
		> {
			public GetClassTemplate(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.GetClassTemplateWsdl.GetClassTemplateResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.GetClassTemplateWsdl.GetClassTemplateRequestMessage wrapInput(wse.generated.definitions.GetClassTemplateSchema.GetClassTemplateRequestType input) {
				return new wse.generated.definitions.GetClassTemplateWsdl.GetClassTemplateRequestMessage(input);
			}
			protected final wse.generated.definitions.GetClassTemplateSchema.GetClassTemplateResponseType unwrapOutput(wse.generated.definitions.GetClassTemplateWsdl.GetClassTemplateResponseMessage output) {
				return output.GetClassTemplateResponse;
			}
		}
	}
	public static final class B_GetClassTemplateBinding {
		private B_GetClassTemplateBinding(){}
		public static class GetClassTemplate extends wse.generated.definitions.GetClassTemplateWsdl.PT_GetClassTemplatePort.GetClassTemplate {
			protected GetClassTemplate(String uri) {
				super("wse:GetClassTemplate", uri);
			}
		}
	}
}
