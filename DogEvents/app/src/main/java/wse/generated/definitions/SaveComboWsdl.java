/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public final class SaveComboWsdl {
	private SaveComboWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #SaveComboRequest} <ul><b>Type:</b> wse.generated.definitions.SaveComboSchema.SaveComboRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class SaveComboRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.SaveComboSchema.SaveComboRequestType SaveComboRequest;
		
		protected void load_SaveComboRequest(XMLElement xml) {
			this.SaveComboRequest = parseComplex(xml, "SaveComboRequest", "wse:SaveCombo", wse.generated.definitions.SaveComboSchema.SaveComboRequestType.class, true);
		}
		protected void create_SaveComboRequest(XMLElement xml) {
			printComplex(xml, "SaveComboRequest", "wse:SaveCombo", this.SaveComboRequest, true);
		}
		public void load(XMLElement xml) {
			try {
				load_SaveComboRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:SaveCombo':'SaveComboRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_SaveComboRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:SaveCombo':'SaveComboRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public SaveComboRequestMessage(SaveComboRequestMessage copy) { load(copy); }
		public void load(SaveComboRequestMessage copy) {
			if (copy == null) return;
			this.SaveComboRequest = copy.SaveComboRequest;
		}
		public SaveComboRequestMessage SaveComboRequest(wse.generated.definitions.SaveComboSchema.SaveComboRequestType SaveComboRequest){ this.SaveComboRequest = SaveComboRequest; return this;}
		public SaveComboRequestMessage() {}
		public SaveComboRequestMessage(XMLElement xml) { this.load(xml); }
		public SaveComboRequestMessage(
			wse.generated.definitions.SaveComboSchema.SaveComboRequestType SaveComboRequest
			) {
			this.SaveComboRequest = SaveComboRequest;
		}
		// Additional
	} // class SaveComboRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #SaveComboResponse} <ul><b>Type:</b> wse.generated.definitions.SaveComboSchema.SaveComboResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class SaveComboResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.SaveComboSchema.SaveComboResponseType SaveComboResponse;
		
		protected void load_SaveComboResponse(XMLElement xml) {
			this.SaveComboResponse = parseComplex(xml, "SaveComboResponse", "wse:SaveCombo", wse.generated.definitions.SaveComboSchema.SaveComboResponseType.class, true);
		}
		protected void create_SaveComboResponse(XMLElement xml) {
			printComplex(xml, "SaveComboResponse", "wse:SaveCombo", this.SaveComboResponse, true);
		}
		public void load(XMLElement xml) {
			try {
				load_SaveComboResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:SaveCombo':'SaveComboResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_SaveComboResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:SaveCombo':'SaveComboResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public SaveComboResponseMessage(SaveComboResponseMessage copy) { load(copy); }
		public void load(SaveComboResponseMessage copy) {
			if (copy == null) return;
			this.SaveComboResponse = copy.SaveComboResponse;
		}
		public SaveComboResponseMessage SaveComboResponse(wse.generated.definitions.SaveComboSchema.SaveComboResponseType SaveComboResponse){ this.SaveComboResponse = SaveComboResponse; return this;}
		public SaveComboResponseMessage() {}
		public SaveComboResponseMessage(XMLElement xml) { this.load(xml); }
		public SaveComboResponseMessage(
			wse.generated.definitions.SaveComboSchema.SaveComboResponseType SaveComboResponse
			) {
			this.SaveComboResponse = SaveComboResponse;
		}
		// Additional
	} // class SaveComboResponseMessage
	protected static final class PT_SaveComboPort {
		private PT_SaveComboPort(){}
		protected static class SaveCombo extends wse.utils.WrappedOperation<
		wse.generated.definitions.SaveComboWsdl.SaveComboRequestMessage,
		wse.generated.definitions.SaveComboSchema.SaveComboRequestType,
		wse.generated.definitions.SaveComboWsdl.SaveComboResponseMessage,
		wse.generated.definitions.SaveComboSchema.SaveComboResponseType
		> {
			public SaveCombo(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.SaveComboWsdl.SaveComboResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.SaveComboWsdl.SaveComboRequestMessage wrapInput(wse.generated.definitions.SaveComboSchema.SaveComboRequestType input) {
				return new wse.generated.definitions.SaveComboWsdl.SaveComboRequestMessage(input);
			}
			protected final wse.generated.definitions.SaveComboSchema.SaveComboResponseType unwrapOutput(wse.generated.definitions.SaveComboWsdl.SaveComboResponseMessage output) {
				return output.SaveComboResponse;
			}
		}
	}
	public static final class B_SaveComboBinding {
		private B_SaveComboBinding(){}
		public static class SaveCombo extends wse.generated.definitions.SaveComboWsdl.PT_SaveComboPort.SaveCombo {
			protected SaveCombo(String uri) {
				super("wse:SaveCombo", uri);
			}
		}
	}
}
