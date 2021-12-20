/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public final class EditComboWsdl {
	private EditComboWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #EditComboRequest} <ul><b>Type:</b> wse.generated.definitions.EditComboSchema.EditComboRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class EditComboRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.EditComboSchema.EditComboRequestType EditComboRequest;
		
		protected void load_EditComboRequest(XMLElement xml) {
			this.EditComboRequest = parseComplex(xml, "EditComboRequest", "wse:EditCombo", wse.generated.definitions.EditComboSchema.EditComboRequestType.class, true);
		}
		protected void create_EditComboRequest(XMLElement xml) {
			printComplex(xml, "EditComboRequest", "wse:EditCombo", this.EditComboRequest, true);
		}
		public void load(XMLElement xml) {
			try {
				load_EditComboRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:EditCombo':'EditComboRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_EditComboRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:EditCombo':'EditComboRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public EditComboRequestMessage(EditComboRequestMessage copy) { load(copy); }
		public void load(EditComboRequestMessage copy) {
			if (copy == null) return;
			this.EditComboRequest = copy.EditComboRequest;
		}
		public EditComboRequestMessage EditComboRequest(wse.generated.definitions.EditComboSchema.EditComboRequestType EditComboRequest){ this.EditComboRequest = EditComboRequest; return this;}
		public EditComboRequestMessage() {}
		public EditComboRequestMessage(XMLElement xml) { this.load(xml); }
		public EditComboRequestMessage(
			wse.generated.definitions.EditComboSchema.EditComboRequestType EditComboRequest
			) {
			this.EditComboRequest = EditComboRequest;
		}
		// Additional
	} // class EditComboRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #EditComboResponse} <ul><b>Type:</b> wse.generated.definitions.EditComboSchema.EditComboResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class EditComboResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.EditComboSchema.EditComboResponseType EditComboResponse;
		
		protected void load_EditComboResponse(XMLElement xml) {
			this.EditComboResponse = parseComplex(xml, "EditComboResponse", "wse:EditCombo", wse.generated.definitions.EditComboSchema.EditComboResponseType.class, true);
		}
		protected void create_EditComboResponse(XMLElement xml) {
			printComplex(xml, "EditComboResponse", "wse:EditCombo", this.EditComboResponse, true);
		}
		public void load(XMLElement xml) {
			try {
				load_EditComboResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:EditCombo':'EditComboResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_EditComboResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:EditCombo':'EditComboResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public EditComboResponseMessage(EditComboResponseMessage copy) { load(copy); }
		public void load(EditComboResponseMessage copy) {
			if (copy == null) return;
			this.EditComboResponse = copy.EditComboResponse;
		}
		public EditComboResponseMessage EditComboResponse(wse.generated.definitions.EditComboSchema.EditComboResponseType EditComboResponse){ this.EditComboResponse = EditComboResponse; return this;}
		public EditComboResponseMessage() {}
		public EditComboResponseMessage(XMLElement xml) { this.load(xml); }
		public EditComboResponseMessage(
			wse.generated.definitions.EditComboSchema.EditComboResponseType EditComboResponse
			) {
			this.EditComboResponse = EditComboResponse;
		}
		// Additional
	} // class EditComboResponseMessage
	protected static final class PT_EditComboPort {
		private PT_EditComboPort(){}
		protected static class EditCombo extends wse.utils.WrappedOperation<
		wse.generated.definitions.EditComboWsdl.EditComboRequestMessage,
		wse.generated.definitions.EditComboSchema.EditComboRequestType,
		wse.generated.definitions.EditComboWsdl.EditComboResponseMessage,
		wse.generated.definitions.EditComboSchema.EditComboResponseType
		> {
			public EditCombo(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.EditComboWsdl.EditComboResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.EditComboWsdl.EditComboRequestMessage wrapInput(wse.generated.definitions.EditComboSchema.EditComboRequestType input) {
				return new wse.generated.definitions.EditComboWsdl.EditComboRequestMessage(input);
			}
			protected final wse.generated.definitions.EditComboSchema.EditComboResponseType unwrapOutput(wse.generated.definitions.EditComboWsdl.EditComboResponseMessage output) {
				return output.EditComboResponse;
			}
		}
	}
	public static final class B_EditComboBinding {
		private B_EditComboBinding(){}
		public static class EditCombo extends wse.generated.definitions.EditComboWsdl.PT_EditComboPort.EditCombo {
			protected EditCombo(String uri) {
				super("wse:EditCombo", uri);
			}
		}
	}
}
