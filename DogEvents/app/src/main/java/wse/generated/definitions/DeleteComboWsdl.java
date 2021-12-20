/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public final class DeleteComboWsdl {
	private DeleteComboWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #DeleteComboRequest} <ul><b>Type:</b> wse.generated.definitions.DeleteComboSchema.DeleteComboRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class DeleteComboRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.DeleteComboSchema.DeleteComboRequestType DeleteComboRequest;
		
		protected void load_DeleteComboRequest(XMLElement xml) {
			this.DeleteComboRequest = parseComplex(xml, "DeleteComboRequest", "wse:DeleteCombo", wse.generated.definitions.DeleteComboSchema.DeleteComboRequestType.class, true);
		}
		protected void create_DeleteComboRequest(XMLElement xml) {
			printComplex(xml, "DeleteComboRequest", "wse:DeleteCombo", this.DeleteComboRequest, true);
		}
		public void load(XMLElement xml) {
			try {
				load_DeleteComboRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:DeleteCombo':'DeleteComboRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_DeleteComboRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:DeleteCombo':'DeleteComboRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public DeleteComboRequestMessage(DeleteComboRequestMessage copy) { load(copy); }
		public void load(DeleteComboRequestMessage copy) {
			if (copy == null) return;
			this.DeleteComboRequest = copy.DeleteComboRequest;
		}
		public DeleteComboRequestMessage DeleteComboRequest(wse.generated.definitions.DeleteComboSchema.DeleteComboRequestType DeleteComboRequest){ this.DeleteComboRequest = DeleteComboRequest; return this;}
		public DeleteComboRequestMessage() {}
		public DeleteComboRequestMessage(XMLElement xml) { this.load(xml); }
		public DeleteComboRequestMessage(
			wse.generated.definitions.DeleteComboSchema.DeleteComboRequestType DeleteComboRequest
			) {
			this.DeleteComboRequest = DeleteComboRequest;
		}
		// Additional
	} // class DeleteComboRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #DeleteComboResponse} <ul><b>Type:</b> wse.generated.definitions.DeleteComboSchema.DeleteComboResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class DeleteComboResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.DeleteComboSchema.DeleteComboResponseType DeleteComboResponse;
		
		protected void load_DeleteComboResponse(XMLElement xml) {
			this.DeleteComboResponse = parseComplex(xml, "DeleteComboResponse", "wse:DeleteCombo", wse.generated.definitions.DeleteComboSchema.DeleteComboResponseType.class, true);
		}
		protected void create_DeleteComboResponse(XMLElement xml) {
			printComplex(xml, "DeleteComboResponse", "wse:DeleteCombo", this.DeleteComboResponse, true);
		}
		public void load(XMLElement xml) {
			try {
				load_DeleteComboResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:DeleteCombo':'DeleteComboResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_DeleteComboResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:DeleteCombo':'DeleteComboResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public DeleteComboResponseMessage(DeleteComboResponseMessage copy) { load(copy); }
		public void load(DeleteComboResponseMessage copy) {
			if (copy == null) return;
			this.DeleteComboResponse = copy.DeleteComboResponse;
		}
		public DeleteComboResponseMessage DeleteComboResponse(wse.generated.definitions.DeleteComboSchema.DeleteComboResponseType DeleteComboResponse){ this.DeleteComboResponse = DeleteComboResponse; return this;}
		public DeleteComboResponseMessage() {}
		public DeleteComboResponseMessage(XMLElement xml) { this.load(xml); }
		public DeleteComboResponseMessage(
			wse.generated.definitions.DeleteComboSchema.DeleteComboResponseType DeleteComboResponse
			) {
			this.DeleteComboResponse = DeleteComboResponse;
		}
		// Additional
	} // class DeleteComboResponseMessage
	protected static final class PT_DeleteComboPort {
		private PT_DeleteComboPort(){}
		protected static class DeleteCombo extends wse.utils.WrappedOperation<
		wse.generated.definitions.DeleteComboWsdl.DeleteComboRequestMessage,
		wse.generated.definitions.DeleteComboSchema.DeleteComboRequestType,
		wse.generated.definitions.DeleteComboWsdl.DeleteComboResponseMessage,
		wse.generated.definitions.DeleteComboSchema.DeleteComboResponseType
		> {
			public DeleteCombo(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.DeleteComboWsdl.DeleteComboResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.DeleteComboWsdl.DeleteComboRequestMessage wrapInput(wse.generated.definitions.DeleteComboSchema.DeleteComboRequestType input) {
				return new wse.generated.definitions.DeleteComboWsdl.DeleteComboRequestMessage(input);
			}
			protected final wse.generated.definitions.DeleteComboSchema.DeleteComboResponseType unwrapOutput(wse.generated.definitions.DeleteComboWsdl.DeleteComboResponseMessage output) {
				return output.DeleteComboResponse;
			}
		}
	}
	public static final class B_DeleteComboBinding {
		private B_DeleteComboBinding(){}
		public static class DeleteCombo extends wse.generated.definitions.DeleteComboWsdl.PT_DeleteComboPort.DeleteCombo {
			protected DeleteCombo(String uri) {
				super("wse:DeleteCombo", uri);
			}
		}
	}
}
