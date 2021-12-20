/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public final class EditTrickStateWsdl {
	private EditTrickStateWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #EditTrickStateRequest} <ul><b>Type:</b> wse.generated.definitions.EditTrickStateSchema.EditTrickStateRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class EditTrickStateRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.EditTrickStateSchema.EditTrickStateRequestType EditTrickStateRequest;
		
		protected void load_EditTrickStateRequest(XMLElement xml) {
			this.EditTrickStateRequest = parseComplex(xml, "EditTrickStateRequest", "wse:EditTrickState", wse.generated.definitions.EditTrickStateSchema.EditTrickStateRequestType.class, true);
		}
		protected void create_EditTrickStateRequest(XMLElement xml) {
			printComplex(xml, "EditTrickStateRequest", "wse:EditTrickState", this.EditTrickStateRequest, true);
		}
		public void load(XMLElement xml) {
			try {
				load_EditTrickStateRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:EditTrickState':'EditTrickStateRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_EditTrickStateRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:EditTrickState':'EditTrickStateRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public EditTrickStateRequestMessage(EditTrickStateRequestMessage copy) { load(copy); }
		public void load(EditTrickStateRequestMessage copy) {
			if (copy == null) return;
			this.EditTrickStateRequest = copy.EditTrickStateRequest;
		}
		public EditTrickStateRequestMessage EditTrickStateRequest(wse.generated.definitions.EditTrickStateSchema.EditTrickStateRequestType EditTrickStateRequest){ this.EditTrickStateRequest = EditTrickStateRequest; return this;}
		public EditTrickStateRequestMessage() {}
		public EditTrickStateRequestMessage(XMLElement xml) { this.load(xml); }
		public EditTrickStateRequestMessage(
			wse.generated.definitions.EditTrickStateSchema.EditTrickStateRequestType EditTrickStateRequest
			) {
			this.EditTrickStateRequest = EditTrickStateRequest;
		}
		// Additional
	} // class EditTrickStateRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #EditTrickStateResponse} <ul><b>Type:</b> wse.generated.definitions.EditTrickStateSchema.EditTrickStateResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class EditTrickStateResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.EditTrickStateSchema.EditTrickStateResponseType EditTrickStateResponse;
		
		protected void load_EditTrickStateResponse(XMLElement xml) {
			this.EditTrickStateResponse = parseComplex(xml, "EditTrickStateResponse", "wse:EditTrickState", wse.generated.definitions.EditTrickStateSchema.EditTrickStateResponseType.class, true);
		}
		protected void create_EditTrickStateResponse(XMLElement xml) {
			printComplex(xml, "EditTrickStateResponse", "wse:EditTrickState", this.EditTrickStateResponse, true);
		}
		public void load(XMLElement xml) {
			try {
				load_EditTrickStateResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:EditTrickState':'EditTrickStateResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_EditTrickStateResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:EditTrickState':'EditTrickStateResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public EditTrickStateResponseMessage(EditTrickStateResponseMessage copy) { load(copy); }
		public void load(EditTrickStateResponseMessage copy) {
			if (copy == null) return;
			this.EditTrickStateResponse = copy.EditTrickStateResponse;
		}
		public EditTrickStateResponseMessage EditTrickStateResponse(wse.generated.definitions.EditTrickStateSchema.EditTrickStateResponseType EditTrickStateResponse){ this.EditTrickStateResponse = EditTrickStateResponse; return this;}
		public EditTrickStateResponseMessage() {}
		public EditTrickStateResponseMessage(XMLElement xml) { this.load(xml); }
		public EditTrickStateResponseMessage(
			wse.generated.definitions.EditTrickStateSchema.EditTrickStateResponseType EditTrickStateResponse
			) {
			this.EditTrickStateResponse = EditTrickStateResponse;
		}
		// Additional
	} // class EditTrickStateResponseMessage
	protected static final class PT_EditTrickStatePort {
		private PT_EditTrickStatePort(){}
		protected static class EditTrickState extends wse.utils.WrappedOperation<
		wse.generated.definitions.EditTrickStateWsdl.EditTrickStateRequestMessage,
		wse.generated.definitions.EditTrickStateSchema.EditTrickStateRequestType,
		wse.generated.definitions.EditTrickStateWsdl.EditTrickStateResponseMessage,
		wse.generated.definitions.EditTrickStateSchema.EditTrickStateResponseType
		> {
			public EditTrickState(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.EditTrickStateWsdl.EditTrickStateResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.EditTrickStateWsdl.EditTrickStateRequestMessage wrapInput(wse.generated.definitions.EditTrickStateSchema.EditTrickStateRequestType input) {
				return new wse.generated.definitions.EditTrickStateWsdl.EditTrickStateRequestMessage(input);
			}
			protected final wse.generated.definitions.EditTrickStateSchema.EditTrickStateResponseType unwrapOutput(wse.generated.definitions.EditTrickStateWsdl.EditTrickStateResponseMessage output) {
				return output.EditTrickStateResponse;
			}
		}
	}
	public static final class B_EditTrickStateBinding {
		private B_EditTrickStateBinding(){}
		public static class EditTrickState extends wse.generated.definitions.EditTrickStateWsdl.PT_EditTrickStatePort.EditTrickState {
			protected EditTrickState(String uri) {
				super("wse:EditTrickState", uri);
			}
		}
	}
}
