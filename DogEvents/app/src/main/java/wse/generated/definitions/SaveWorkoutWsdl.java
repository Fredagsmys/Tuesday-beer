/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public final class SaveWorkoutWsdl {
	private SaveWorkoutWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #SaveWorkoutRequest} <ul><b>Type:</b> wse.generated.definitions.SaveWorkoutSchema.SaveWorkoutRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class SaveWorkoutRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.SaveWorkoutSchema.SaveWorkoutRequestType SaveWorkoutRequest;
		
		protected void load_SaveWorkoutRequest(XMLElement xml) {
			this.SaveWorkoutRequest = parseComplex(xml, "SaveWorkoutRequest", "wse:SaveWorkout", wse.generated.definitions.SaveWorkoutSchema.SaveWorkoutRequestType.class, true);
		}
		protected void create_SaveWorkoutRequest(XMLElement xml) {
			printComplex(xml, "SaveWorkoutRequest", "wse:SaveWorkout", this.SaveWorkoutRequest, true);
		}
		public void load(XMLElement xml) {
			try {
				load_SaveWorkoutRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:SaveWorkout':'SaveWorkoutRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_SaveWorkoutRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:SaveWorkout':'SaveWorkoutRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public SaveWorkoutRequestMessage(SaveWorkoutRequestMessage copy) { load(copy); }
		public void load(SaveWorkoutRequestMessage copy) {
			if (copy == null) return;
			this.SaveWorkoutRequest = copy.SaveWorkoutRequest;
		}
		public SaveWorkoutRequestMessage SaveWorkoutRequest(wse.generated.definitions.SaveWorkoutSchema.SaveWorkoutRequestType SaveWorkoutRequest){ this.SaveWorkoutRequest = SaveWorkoutRequest; return this;}
		public SaveWorkoutRequestMessage() {}
		public SaveWorkoutRequestMessage(XMLElement xml) { this.load(xml); }
		public SaveWorkoutRequestMessage(
			wse.generated.definitions.SaveWorkoutSchema.SaveWorkoutRequestType SaveWorkoutRequest
			) {
			this.SaveWorkoutRequest = SaveWorkoutRequest;
		}
		// Additional
	} // class SaveWorkoutRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #SaveWorkoutResponse} <ul><b>Type:</b> wse.generated.definitions.SaveWorkoutSchema.SaveWorkoutResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class SaveWorkoutResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.SaveWorkoutSchema.SaveWorkoutResponseType SaveWorkoutResponse;
		
		protected void load_SaveWorkoutResponse(XMLElement xml) {
			this.SaveWorkoutResponse = parseComplex(xml, "SaveWorkoutResponse", "wse:SaveWorkout", wse.generated.definitions.SaveWorkoutSchema.SaveWorkoutResponseType.class, true);
		}
		protected void create_SaveWorkoutResponse(XMLElement xml) {
			printComplex(xml, "SaveWorkoutResponse", "wse:SaveWorkout", this.SaveWorkoutResponse, true);
		}
		public void load(XMLElement xml) {
			try {
				load_SaveWorkoutResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:SaveWorkout':'SaveWorkoutResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_SaveWorkoutResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:SaveWorkout':'SaveWorkoutResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public SaveWorkoutResponseMessage(SaveWorkoutResponseMessage copy) { load(copy); }
		public void load(SaveWorkoutResponseMessage copy) {
			if (copy == null) return;
			this.SaveWorkoutResponse = copy.SaveWorkoutResponse;
		}
		public SaveWorkoutResponseMessage SaveWorkoutResponse(wse.generated.definitions.SaveWorkoutSchema.SaveWorkoutResponseType SaveWorkoutResponse){ this.SaveWorkoutResponse = SaveWorkoutResponse; return this;}
		public SaveWorkoutResponseMessage() {}
		public SaveWorkoutResponseMessage(XMLElement xml) { this.load(xml); }
		public SaveWorkoutResponseMessage(
			wse.generated.definitions.SaveWorkoutSchema.SaveWorkoutResponseType SaveWorkoutResponse
			) {
			this.SaveWorkoutResponse = SaveWorkoutResponse;
		}
		// Additional
	} // class SaveWorkoutResponseMessage
	protected static final class PT_SaveWorkoutPort {
		private PT_SaveWorkoutPort(){}
		protected static class SaveWorkout extends wse.utils.WrappedOperation<
		wse.generated.definitions.SaveWorkoutWsdl.SaveWorkoutRequestMessage,
		wse.generated.definitions.SaveWorkoutSchema.SaveWorkoutRequestType,
		wse.generated.definitions.SaveWorkoutWsdl.SaveWorkoutResponseMessage,
		wse.generated.definitions.SaveWorkoutSchema.SaveWorkoutResponseType
		> {
			public SaveWorkout(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.SaveWorkoutWsdl.SaveWorkoutResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.SaveWorkoutWsdl.SaveWorkoutRequestMessage wrapInput(wse.generated.definitions.SaveWorkoutSchema.SaveWorkoutRequestType input) {
				return new wse.generated.definitions.SaveWorkoutWsdl.SaveWorkoutRequestMessage(input);
			}
			protected final wse.generated.definitions.SaveWorkoutSchema.SaveWorkoutResponseType unwrapOutput(wse.generated.definitions.SaveWorkoutWsdl.SaveWorkoutResponseMessage output) {
				return output.SaveWorkoutResponse;
			}
		}
	}
	public static final class B_SaveWorkoutBinding {
		private B_SaveWorkoutBinding(){}
		public static class SaveWorkout extends wse.generated.definitions.SaveWorkoutWsdl.PT_SaveWorkoutPort.SaveWorkout {
			protected SaveWorkout(String uri) {
				super("wse:SaveWorkout", uri);
			}
		}
	}
}
