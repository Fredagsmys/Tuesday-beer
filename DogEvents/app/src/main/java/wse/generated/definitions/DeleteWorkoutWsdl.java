/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public final class DeleteWorkoutWsdl {
	private DeleteWorkoutWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #DeleteWorkoutRequest} <ul><b>Type:</b> wse.generated.definitions.DeleteWorkoutSchema.DeleteWorkoutRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class DeleteWorkoutRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.DeleteWorkoutSchema.DeleteWorkoutRequestType DeleteWorkoutRequest;
		
		protected void load_DeleteWorkoutRequest(XMLElement xml) {
			this.DeleteWorkoutRequest = parseComplex(xml, "DeleteWorkoutRequest", "wse:DeleteWorkout", wse.generated.definitions.DeleteWorkoutSchema.DeleteWorkoutRequestType.class, true);
		}
		protected void create_DeleteWorkoutRequest(XMLElement xml) {
			printComplex(xml, "DeleteWorkoutRequest", "wse:DeleteWorkout", this.DeleteWorkoutRequest, true);
		}
		public void load(XMLElement xml) {
			try {
				load_DeleteWorkoutRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:DeleteWorkout':'DeleteWorkoutRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_DeleteWorkoutRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:DeleteWorkout':'DeleteWorkoutRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public DeleteWorkoutRequestMessage(DeleteWorkoutRequestMessage copy) { load(copy); }
		public void load(DeleteWorkoutRequestMessage copy) {
			if (copy == null) return;
			this.DeleteWorkoutRequest = copy.DeleteWorkoutRequest;
		}
		public DeleteWorkoutRequestMessage DeleteWorkoutRequest(wse.generated.definitions.DeleteWorkoutSchema.DeleteWorkoutRequestType DeleteWorkoutRequest){ this.DeleteWorkoutRequest = DeleteWorkoutRequest; return this;}
		public DeleteWorkoutRequestMessage() {}
		public DeleteWorkoutRequestMessage(XMLElement xml) { this.load(xml); }
		public DeleteWorkoutRequestMessage(
			wse.generated.definitions.DeleteWorkoutSchema.DeleteWorkoutRequestType DeleteWorkoutRequest
			) {
			this.DeleteWorkoutRequest = DeleteWorkoutRequest;
		}
		// Additional
	} // class DeleteWorkoutRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #DeleteWorkoutResponse} <ul><b>Type:</b> wse.generated.definitions.DeleteWorkoutSchema.DeleteWorkoutResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class DeleteWorkoutResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.DeleteWorkoutSchema.DeleteWorkoutResponseType DeleteWorkoutResponse;
		
		protected void load_DeleteWorkoutResponse(XMLElement xml) {
			this.DeleteWorkoutResponse = parseComplex(xml, "DeleteWorkoutResponse", "wse:DeleteWorkout", wse.generated.definitions.DeleteWorkoutSchema.DeleteWorkoutResponseType.class, true);
		}
		protected void create_DeleteWorkoutResponse(XMLElement xml) {
			printComplex(xml, "DeleteWorkoutResponse", "wse:DeleteWorkout", this.DeleteWorkoutResponse, true);
		}
		public void load(XMLElement xml) {
			try {
				load_DeleteWorkoutResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:DeleteWorkout':'DeleteWorkoutResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_DeleteWorkoutResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:DeleteWorkout':'DeleteWorkoutResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public DeleteWorkoutResponseMessage(DeleteWorkoutResponseMessage copy) { load(copy); }
		public void load(DeleteWorkoutResponseMessage copy) {
			if (copy == null) return;
			this.DeleteWorkoutResponse = copy.DeleteWorkoutResponse;
		}
		public DeleteWorkoutResponseMessage DeleteWorkoutResponse(wse.generated.definitions.DeleteWorkoutSchema.DeleteWorkoutResponseType DeleteWorkoutResponse){ this.DeleteWorkoutResponse = DeleteWorkoutResponse; return this;}
		public DeleteWorkoutResponseMessage() {}
		public DeleteWorkoutResponseMessage(XMLElement xml) { this.load(xml); }
		public DeleteWorkoutResponseMessage(
			wse.generated.definitions.DeleteWorkoutSchema.DeleteWorkoutResponseType DeleteWorkoutResponse
			) {
			this.DeleteWorkoutResponse = DeleteWorkoutResponse;
		}
		// Additional
	} // class DeleteWorkoutResponseMessage
	protected static final class PT_DeleteWorkoutPort {
		private PT_DeleteWorkoutPort(){}
		protected static class DeleteWorkout extends wse.utils.WrappedOperation<
		wse.generated.definitions.DeleteWorkoutWsdl.DeleteWorkoutRequestMessage,
		wse.generated.definitions.DeleteWorkoutSchema.DeleteWorkoutRequestType,
		wse.generated.definitions.DeleteWorkoutWsdl.DeleteWorkoutResponseMessage,
		wse.generated.definitions.DeleteWorkoutSchema.DeleteWorkoutResponseType
		> {
			public DeleteWorkout(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.DeleteWorkoutWsdl.DeleteWorkoutResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.DeleteWorkoutWsdl.DeleteWorkoutRequestMessage wrapInput(wse.generated.definitions.DeleteWorkoutSchema.DeleteWorkoutRequestType input) {
				return new wse.generated.definitions.DeleteWorkoutWsdl.DeleteWorkoutRequestMessage(input);
			}
			protected final wse.generated.definitions.DeleteWorkoutSchema.DeleteWorkoutResponseType unwrapOutput(wse.generated.definitions.DeleteWorkoutWsdl.DeleteWorkoutResponseMessage output) {
				return output.DeleteWorkoutResponse;
			}
		}
	}
	public static final class B_DeleteWorkoutBinding {
		private B_DeleteWorkoutBinding(){}
		public static class DeleteWorkout extends wse.generated.definitions.DeleteWorkoutWsdl.PT_DeleteWorkoutPort.DeleteWorkout {
			protected DeleteWorkout(String uri) {
				super("wse:DeleteWorkout", uri);
			}
		}
	}
}
