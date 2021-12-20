/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public final class SaveClassTemplateWsdl {
	private SaveClassTemplateWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #SaveClassTemplateRequest} <ul><b>Type:</b> wse.generated.definitions.SaveClassTemplateSchema.SaveClassTemplateRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class SaveClassTemplateRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.SaveClassTemplateSchema.SaveClassTemplateRequestType SaveClassTemplateRequest;
		
		protected void load_SaveClassTemplateRequest(XMLElement xml) {
			this.SaveClassTemplateRequest = parseComplex(xml, "SaveClassTemplateRequest", "wse:SaveClassTemplate", wse.generated.definitions.SaveClassTemplateSchema.SaveClassTemplateRequestType.class, true);
		}
		protected void create_SaveClassTemplateRequest(XMLElement xml) {
			printComplex(xml, "SaveClassTemplateRequest", "wse:SaveClassTemplate", this.SaveClassTemplateRequest, true);
		}
		public void load(XMLElement xml) {
			try {
				load_SaveClassTemplateRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:SaveClassTemplate':'SaveClassTemplateRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_SaveClassTemplateRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:SaveClassTemplate':'SaveClassTemplateRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public SaveClassTemplateRequestMessage(SaveClassTemplateRequestMessage copy) { load(copy); }
		public void load(SaveClassTemplateRequestMessage copy) {
			if (copy == null) return;
			this.SaveClassTemplateRequest = copy.SaveClassTemplateRequest;
		}
		public SaveClassTemplateRequestMessage SaveClassTemplateRequest(wse.generated.definitions.SaveClassTemplateSchema.SaveClassTemplateRequestType SaveClassTemplateRequest){ this.SaveClassTemplateRequest = SaveClassTemplateRequest; return this;}
		public SaveClassTemplateRequestMessage() {}
		public SaveClassTemplateRequestMessage(XMLElement xml) { this.load(xml); }
		public SaveClassTemplateRequestMessage(
			wse.generated.definitions.SaveClassTemplateSchema.SaveClassTemplateRequestType SaveClassTemplateRequest
			) {
			this.SaveClassTemplateRequest = SaveClassTemplateRequest;
		}
		// Additional
	} // class SaveClassTemplateRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #SaveClassTemplateResponse} <ul><b>Type:</b> wse.generated.definitions.SaveClassTemplateSchema.SaveClassTemplateResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class SaveClassTemplateResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.SaveClassTemplateSchema.SaveClassTemplateResponseType SaveClassTemplateResponse;
		
		protected void load_SaveClassTemplateResponse(XMLElement xml) {
			this.SaveClassTemplateResponse = parseComplex(xml, "SaveClassTemplateResponse", "wse:SaveClassTemplate", wse.generated.definitions.SaveClassTemplateSchema.SaveClassTemplateResponseType.class, true);
		}
		protected void create_SaveClassTemplateResponse(XMLElement xml) {
			printComplex(xml, "SaveClassTemplateResponse", "wse:SaveClassTemplate", this.SaveClassTemplateResponse, true);
		}
		public void load(XMLElement xml) {
			try {
				load_SaveClassTemplateResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:SaveClassTemplate':'SaveClassTemplateResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_SaveClassTemplateResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:SaveClassTemplate':'SaveClassTemplateResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public SaveClassTemplateResponseMessage(SaveClassTemplateResponseMessage copy) { load(copy); }
		public void load(SaveClassTemplateResponseMessage copy) {
			if (copy == null) return;
			this.SaveClassTemplateResponse = copy.SaveClassTemplateResponse;
		}
		public SaveClassTemplateResponseMessage SaveClassTemplateResponse(wse.generated.definitions.SaveClassTemplateSchema.SaveClassTemplateResponseType SaveClassTemplateResponse){ this.SaveClassTemplateResponse = SaveClassTemplateResponse; return this;}
		public SaveClassTemplateResponseMessage() {}
		public SaveClassTemplateResponseMessage(XMLElement xml) { this.load(xml); }
		public SaveClassTemplateResponseMessage(
			wse.generated.definitions.SaveClassTemplateSchema.SaveClassTemplateResponseType SaveClassTemplateResponse
			) {
			this.SaveClassTemplateResponse = SaveClassTemplateResponse;
		}
		// Additional
	} // class SaveClassTemplateResponseMessage
	protected static final class PT_SaveClassTemplatePort {
		private PT_SaveClassTemplatePort(){}
		protected static class SaveClassTemplate extends wse.utils.WrappedOperation<
		wse.generated.definitions.SaveClassTemplateWsdl.SaveClassTemplateRequestMessage,
		wse.generated.definitions.SaveClassTemplateSchema.SaveClassTemplateRequestType,
		wse.generated.definitions.SaveClassTemplateWsdl.SaveClassTemplateResponseMessage,
		wse.generated.definitions.SaveClassTemplateSchema.SaveClassTemplateResponseType
		> {
			public SaveClassTemplate(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.SaveClassTemplateWsdl.SaveClassTemplateResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.SaveClassTemplateWsdl.SaveClassTemplateRequestMessage wrapInput(wse.generated.definitions.SaveClassTemplateSchema.SaveClassTemplateRequestType input) {
				return new wse.generated.definitions.SaveClassTemplateWsdl.SaveClassTemplateRequestMessage(input);
			}
			protected final wse.generated.definitions.SaveClassTemplateSchema.SaveClassTemplateResponseType unwrapOutput(wse.generated.definitions.SaveClassTemplateWsdl.SaveClassTemplateResponseMessage output) {
				return output.SaveClassTemplateResponse;
			}
		}
	}
	public static final class B_SaveClassTemplateBinding {
		private B_SaveClassTemplateBinding(){}
		public static class SaveClassTemplate extends wse.generated.definitions.SaveClassTemplateWsdl.PT_SaveClassTemplatePort.SaveClassTemplate {
			protected SaveClassTemplate(String uri) {
				super("wse:SaveClassTemplate", uri);
			}
		}
	}
}
