/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public final class SaveDogEventWsdl {
	private SaveDogEventWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #SaveDogEventRequest} <ul><b>Type:</b> wse.generated.definitions.SaveDogEventSchema.SaveDogEventRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class SaveDogEventRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.SaveDogEventSchema.SaveDogEventRequestType SaveDogEventRequest;
		
		protected void load_SaveDogEventRequest(XMLElement xml) {
			this.SaveDogEventRequest = parseComplex(xml, "SaveDogEventRequest", "wse:SaveDogEvent", wse.generated.definitions.SaveDogEventSchema.SaveDogEventRequestType.class, true);
		}
		protected void create_SaveDogEventRequest(XMLElement xml) {
			printComplex(xml, "SaveDogEventRequest", "wse:SaveDogEvent", this.SaveDogEventRequest, true);
		}
		public void load(XMLElement xml) {
			try {
				load_SaveDogEventRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:SaveDogEvent':'SaveDogEventRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_SaveDogEventRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:SaveDogEvent':'SaveDogEventRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public SaveDogEventRequestMessage(SaveDogEventRequestMessage copy) { load(copy); }
		public void load(SaveDogEventRequestMessage copy) {
			if (copy == null) return;
			this.SaveDogEventRequest = copy.SaveDogEventRequest;
		}
		public SaveDogEventRequestMessage SaveDogEventRequest(wse.generated.definitions.SaveDogEventSchema.SaveDogEventRequestType SaveDogEventRequest){ this.SaveDogEventRequest = SaveDogEventRequest; return this;}
		public SaveDogEventRequestMessage() {}
		public SaveDogEventRequestMessage(XMLElement xml) { this.load(xml); }
		public SaveDogEventRequestMessage(
			wse.generated.definitions.SaveDogEventSchema.SaveDogEventRequestType SaveDogEventRequest
			) {
			this.SaveDogEventRequest = SaveDogEventRequest;
		}
		// Additional
	} // class SaveDogEventRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #SaveDogEventResponse} <ul><b>Type:</b> wse.generated.definitions.SaveDogEventSchema.SaveDogEventResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class SaveDogEventResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.SaveDogEventSchema.SaveDogEventResponseType SaveDogEventResponse;
		
		protected void load_SaveDogEventResponse(XMLElement xml) {
			this.SaveDogEventResponse = parseComplex(xml, "SaveDogEventResponse", "wse:SaveDogEvent", wse.generated.definitions.SaveDogEventSchema.SaveDogEventResponseType.class, true);
		}
		protected void create_SaveDogEventResponse(XMLElement xml) {
			printComplex(xml, "SaveDogEventResponse", "wse:SaveDogEvent", this.SaveDogEventResponse, true);
		}
		public void load(XMLElement xml) {
			try {
				load_SaveDogEventResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:SaveDogEvent':'SaveDogEventResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_SaveDogEventResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:SaveDogEvent':'SaveDogEventResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public SaveDogEventResponseMessage(SaveDogEventResponseMessage copy) { load(copy); }
		public void load(SaveDogEventResponseMessage copy) {
			if (copy == null) return;
			this.SaveDogEventResponse = copy.SaveDogEventResponse;
		}
		public SaveDogEventResponseMessage SaveDogEventResponse(wse.generated.definitions.SaveDogEventSchema.SaveDogEventResponseType SaveDogEventResponse){ this.SaveDogEventResponse = SaveDogEventResponse; return this;}
		public SaveDogEventResponseMessage() {}
		public SaveDogEventResponseMessage(XMLElement xml) { this.load(xml); }
		public SaveDogEventResponseMessage(
			wse.generated.definitions.SaveDogEventSchema.SaveDogEventResponseType SaveDogEventResponse
			) {
			this.SaveDogEventResponse = SaveDogEventResponse;
		}
		// Additional
	} // class SaveDogEventResponseMessage
	protected static final class PT_SaveDogEventPort {
		private PT_SaveDogEventPort(){}
		protected static class SaveDogEvent extends wse.utils.WrappedOperation<
		wse.generated.definitions.SaveDogEventWsdl.SaveDogEventRequestMessage,
		wse.generated.definitions.SaveDogEventSchema.SaveDogEventRequestType,
		wse.generated.definitions.SaveDogEventWsdl.SaveDogEventResponseMessage,
		wse.generated.definitions.SaveDogEventSchema.SaveDogEventResponseType
		> {
			public SaveDogEvent(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.SaveDogEventWsdl.SaveDogEventResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.SaveDogEventWsdl.SaveDogEventRequestMessage wrapInput(wse.generated.definitions.SaveDogEventSchema.SaveDogEventRequestType input) {
				return new wse.generated.definitions.SaveDogEventWsdl.SaveDogEventRequestMessage(input);
			}
			protected final wse.generated.definitions.SaveDogEventSchema.SaveDogEventResponseType unwrapOutput(wse.generated.definitions.SaveDogEventWsdl.SaveDogEventResponseMessage output) {
				return output.SaveDogEventResponse;
			}
		}
	}
	public static final class B_SaveDogEventBinding {
		private B_SaveDogEventBinding(){}
		public static class SaveDogEvent extends wse.generated.definitions.SaveDogEventWsdl.PT_SaveDogEventPort.SaveDogEvent {
			protected SaveDogEvent(String uri) {
				super("wse:SaveDogEvent", uri);
			}
		}
	}
}
