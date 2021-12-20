/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public final class EditAchievementStateWsdl {
	private EditAchievementStateWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #EditAchievementStateRequest} <ul><b>Type:</b> wse.generated.definitions.EditAchievementStateSchema.EditAchievementStateRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class EditAchievementStateRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.EditAchievementStateSchema.EditAchievementStateRequestType EditAchievementStateRequest;
		
		protected void load_EditAchievementStateRequest(XMLElement xml) {
			this.EditAchievementStateRequest = parseComplex(xml, "EditAchievementStateRequest", "wse:EditAchievementState", wse.generated.definitions.EditAchievementStateSchema.EditAchievementStateRequestType.class, true);
		}
		protected void create_EditAchievementStateRequest(XMLElement xml) {
			printComplex(xml, "EditAchievementStateRequest", "wse:EditAchievementState", this.EditAchievementStateRequest, true);
		}
		public void load(XMLElement xml) {
			try {
				load_EditAchievementStateRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:EditAchievementState':'EditAchievementStateRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_EditAchievementStateRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:EditAchievementState':'EditAchievementStateRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public EditAchievementStateRequestMessage(EditAchievementStateRequestMessage copy) { load(copy); }
		public void load(EditAchievementStateRequestMessage copy) {
			if (copy == null) return;
			this.EditAchievementStateRequest = copy.EditAchievementStateRequest;
		}
		public EditAchievementStateRequestMessage EditAchievementStateRequest(wse.generated.definitions.EditAchievementStateSchema.EditAchievementStateRequestType EditAchievementStateRequest){ this.EditAchievementStateRequest = EditAchievementStateRequest; return this;}
		public EditAchievementStateRequestMessage() {}
		public EditAchievementStateRequestMessage(XMLElement xml) { this.load(xml); }
		public EditAchievementStateRequestMessage(
			wse.generated.definitions.EditAchievementStateSchema.EditAchievementStateRequestType EditAchievementStateRequest
			) {
			this.EditAchievementStateRequest = EditAchievementStateRequest;
		}
		// Additional
	} // class EditAchievementStateRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #EditAchievementStateResponse} <ul><b>Type:</b> wse.generated.definitions.EditAchievementStateSchema.EditAchievementStateResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class EditAchievementStateResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.EditAchievementStateSchema.EditAchievementStateResponseType EditAchievementStateResponse;
		
		protected void load_EditAchievementStateResponse(XMLElement xml) {
			this.EditAchievementStateResponse = parseComplex(xml, "EditAchievementStateResponse", "wse:EditAchievementState", wse.generated.definitions.EditAchievementStateSchema.EditAchievementStateResponseType.class, true);
		}
		protected void create_EditAchievementStateResponse(XMLElement xml) {
			printComplex(xml, "EditAchievementStateResponse", "wse:EditAchievementState", this.EditAchievementStateResponse, true);
		}
		public void load(XMLElement xml) {
			try {
				load_EditAchievementStateResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:EditAchievementState':'EditAchievementStateResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_EditAchievementStateResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:EditAchievementState':'EditAchievementStateResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public EditAchievementStateResponseMessage(EditAchievementStateResponseMessage copy) { load(copy); }
		public void load(EditAchievementStateResponseMessage copy) {
			if (copy == null) return;
			this.EditAchievementStateResponse = copy.EditAchievementStateResponse;
		}
		public EditAchievementStateResponseMessage EditAchievementStateResponse(wse.generated.definitions.EditAchievementStateSchema.EditAchievementStateResponseType EditAchievementStateResponse){ this.EditAchievementStateResponse = EditAchievementStateResponse; return this;}
		public EditAchievementStateResponseMessage() {}
		public EditAchievementStateResponseMessage(XMLElement xml) { this.load(xml); }
		public EditAchievementStateResponseMessage(
			wse.generated.definitions.EditAchievementStateSchema.EditAchievementStateResponseType EditAchievementStateResponse
			) {
			this.EditAchievementStateResponse = EditAchievementStateResponse;
		}
		// Additional
	} // class EditAchievementStateResponseMessage
	protected static final class PT_EditAchievementStatePort {
		private PT_EditAchievementStatePort(){}
		protected static class EditAchievementState extends wse.utils.WrappedOperation<
		wse.generated.definitions.EditAchievementStateWsdl.EditAchievementStateRequestMessage,
		wse.generated.definitions.EditAchievementStateSchema.EditAchievementStateRequestType,
		wse.generated.definitions.EditAchievementStateWsdl.EditAchievementStateResponseMessage,
		wse.generated.definitions.EditAchievementStateSchema.EditAchievementStateResponseType
		> {
			public EditAchievementState(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.EditAchievementStateWsdl.EditAchievementStateResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.EditAchievementStateWsdl.EditAchievementStateRequestMessage wrapInput(wse.generated.definitions.EditAchievementStateSchema.EditAchievementStateRequestType input) {
				return new wse.generated.definitions.EditAchievementStateWsdl.EditAchievementStateRequestMessage(input);
			}
			protected final wse.generated.definitions.EditAchievementStateSchema.EditAchievementStateResponseType unwrapOutput(wse.generated.definitions.EditAchievementStateWsdl.EditAchievementStateResponseMessage output) {
				return output.EditAchievementStateResponse;
			}
		}
	}
	public static final class B_EditAchievementStateBinding {
		private B_EditAchievementStateBinding(){}
		public static class EditAchievementState extends wse.generated.definitions.EditAchievementStateWsdl.PT_EditAchievementStatePort.EditAchievementState {
			protected EditAchievementState(String uri) {
				super("wse:EditAchievementState", uri);
			}
		}
	}
}
