/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public final class EditWorkoutWsdl {
	private EditWorkoutWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #EditWorkoutRequest} <ul><b>Type:</b> wse.generated.definitions.EditWorkoutSchema.EditWorkoutRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class EditWorkoutRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.EditWorkoutSchema.EditWorkoutRequestType EditWorkoutRequest;
		
		protected void load_EditWorkoutRequest(XMLElement xml) {
			this.EditWorkoutRequest = parseComplex(xml, "EditWorkoutRequest", "wse:EditWorkout", wse.generated.definitions.EditWorkoutSchema.EditWorkoutRequestType.class, true);
		}
		protected void create_EditWorkoutRequest(XMLElement xml) {
			printComplex(xml, "EditWorkoutRequest", "wse:EditWorkout", this.EditWorkoutRequest, true);
		}
		public void load(XMLElement xml) {
			try {
				load_EditWorkoutRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:EditWorkout':'EditWorkoutRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_EditWorkoutRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:EditWorkout':'EditWorkoutRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public EditWorkoutRequestMessage(EditWorkoutRequestMessage copy) { load(copy); }
		public void load(EditWorkoutRequestMessage copy) {
			if (copy == null) return;
			this.EditWorkoutRequest = copy.EditWorkoutRequest;
		}
		public EditWorkoutRequestMessage EditWorkoutRequest(wse.generated.definitions.EditWorkoutSchema.EditWorkoutRequestType EditWorkoutRequest){ this.EditWorkoutRequest = EditWorkoutRequest; return this;}
		public EditWorkoutRequestMessage() {}
		public EditWorkoutRequestMessage(XMLElement xml) { this.load(xml); }
		public EditWorkoutRequestMessage(
			wse.generated.definitions.EditWorkoutSchema.EditWorkoutRequestType EditWorkoutRequest
			) {
			this.EditWorkoutRequest = EditWorkoutRequest;
		}
		// Additional
	} // class EditWorkoutRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #EditWorkoutResponse} <ul><b>Type:</b> wse.generated.definitions.EditWorkoutSchema.EditWorkoutResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class EditWorkoutResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.EditWorkoutSchema.EditWorkoutResponseType EditWorkoutResponse;
		
		protected void load_EditWorkoutResponse(XMLElement xml) {
			this.EditWorkoutResponse = parseComplex(xml, "EditWorkoutResponse", "wse:EditWorkout", wse.generated.definitions.EditWorkoutSchema.EditWorkoutResponseType.class, true);
		}
		protected void create_EditWorkoutResponse(XMLElement xml) {
			printComplex(xml, "EditWorkoutResponse", "wse:EditWorkout", this.EditWorkoutResponse, true);
		}
		public void load(XMLElement xml) {
			try {
				load_EditWorkoutResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:EditWorkout':'EditWorkoutResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_EditWorkoutResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:EditWorkout':'EditWorkoutResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public EditWorkoutResponseMessage(EditWorkoutResponseMessage copy) { load(copy); }
		public void load(EditWorkoutResponseMessage copy) {
			if (copy == null) return;
			this.EditWorkoutResponse = copy.EditWorkoutResponse;
		}
		public EditWorkoutResponseMessage EditWorkoutResponse(wse.generated.definitions.EditWorkoutSchema.EditWorkoutResponseType EditWorkoutResponse){ this.EditWorkoutResponse = EditWorkoutResponse; return this;}
		public EditWorkoutResponseMessage() {}
		public EditWorkoutResponseMessage(XMLElement xml) { this.load(xml); }
		public EditWorkoutResponseMessage(
			wse.generated.definitions.EditWorkoutSchema.EditWorkoutResponseType EditWorkoutResponse
			) {
			this.EditWorkoutResponse = EditWorkoutResponse;
		}
		// Additional
	} // class EditWorkoutResponseMessage
	protected static final class PT_EditWorkoutPort {
		private PT_EditWorkoutPort(){}
		protected static class EditWorkout extends wse.utils.WrappedOperation<
		wse.generated.definitions.EditWorkoutWsdl.EditWorkoutRequestMessage,
		wse.generated.definitions.EditWorkoutSchema.EditWorkoutRequestType,
		wse.generated.definitions.EditWorkoutWsdl.EditWorkoutResponseMessage,
		wse.generated.definitions.EditWorkoutSchema.EditWorkoutResponseType
		> {
			public EditWorkout(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.EditWorkoutWsdl.EditWorkoutResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.EditWorkoutWsdl.EditWorkoutRequestMessage wrapInput(wse.generated.definitions.EditWorkoutSchema.EditWorkoutRequestType input) {
				return new wse.generated.definitions.EditWorkoutWsdl.EditWorkoutRequestMessage(input);
			}
			protected final wse.generated.definitions.EditWorkoutSchema.EditWorkoutResponseType unwrapOutput(wse.generated.definitions.EditWorkoutWsdl.EditWorkoutResponseMessage output) {
				return output.EditWorkoutResponse;
			}
		}
	}
	public static final class B_EditWorkoutBinding {
		private B_EditWorkoutBinding(){}
		public static class EditWorkout extends wse.generated.definitions.EditWorkoutWsdl.PT_EditWorkoutPort.EditWorkout {
			protected EditWorkout(String uri) {
				super("wse:EditWorkout", uri);
			}
		}
	}
}
