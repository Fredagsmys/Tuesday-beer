/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 10 August 2021 17:00:42 +0200
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.internal.IElement;

public final class SendWaterCommandWsdl {
	private SendWaterCommandWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #SendWaterCommandRequest} <ul><b>Type:</b> wse.generated.definitions.SendWaterCommandSchema.SendWaterCommandRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class SendWaterCommandRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.SendWaterCommandSchema.SendWaterCommandRequestType SendWaterCommandRequest;
		
		protected void load_SendWaterCommandRequest(IElement xml) {
			this.SendWaterCommandRequest = parseComplex(xml, "SendWaterCommandRequest", "wse:SendWaterCommand", wse.generated.definitions.SendWaterCommandSchema.SendWaterCommandRequestType.class, true);
		}
		protected void create_SendWaterCommandRequest(IElement xml) {
			printComplex(xml, "SendWaterCommandRequest", "wse:SendWaterCommand", this.SendWaterCommandRequest, true);
		}
		public void load(IElement xml) {
			try {
				load_SendWaterCommandRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:SendWaterCommand':'SendWaterCommandRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_SendWaterCommandRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:SendWaterCommand':'SendWaterCommandRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public SendWaterCommandRequestMessage(SendWaterCommandRequestMessage copy) { load(copy); }
		public void load(SendWaterCommandRequestMessage copy) {
			if (copy == null) return;
			this.SendWaterCommandRequest = copy.SendWaterCommandRequest;
		}
		public SendWaterCommandRequestMessage SendWaterCommandRequest(wse.generated.definitions.SendWaterCommandSchema.SendWaterCommandRequestType SendWaterCommandRequest){ this.SendWaterCommandRequest = SendWaterCommandRequest; return this;}
		public SendWaterCommandRequestMessage() {}
		public SendWaterCommandRequestMessage(IElement xml) { this.load(xml); }
		public SendWaterCommandRequestMessage(
			wse.generated.definitions.SendWaterCommandSchema.SendWaterCommandRequestType SendWaterCommandRequest
			) {
			this.SendWaterCommandRequest = SendWaterCommandRequest;
		}
		// Additional
	} // class SendWaterCommandRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #SendWaterCommandResponse} <ul><b>Type:</b> wse.generated.definitions.SendWaterCommandSchema.SendWaterCommandResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class SendWaterCommandResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.SendWaterCommandSchema.SendWaterCommandResponseType SendWaterCommandResponse;
		
		protected void load_SendWaterCommandResponse(IElement xml) {
			this.SendWaterCommandResponse = parseComplex(xml, "SendWaterCommandResponse", "wse:SendWaterCommand", wse.generated.definitions.SendWaterCommandSchema.SendWaterCommandResponseType.class, true);
		}
		protected void create_SendWaterCommandResponse(IElement xml) {
			printComplex(xml, "SendWaterCommandResponse", "wse:SendWaterCommand", this.SendWaterCommandResponse, true);
		}
		public void load(IElement xml) {
			try {
				load_SendWaterCommandResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:SendWaterCommand':'SendWaterCommandResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_SendWaterCommandResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:SendWaterCommand':'SendWaterCommandResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public SendWaterCommandResponseMessage(SendWaterCommandResponseMessage copy) { load(copy); }
		public void load(SendWaterCommandResponseMessage copy) {
			if (copy == null) return;
			this.SendWaterCommandResponse = copy.SendWaterCommandResponse;
		}
		public SendWaterCommandResponseMessage SendWaterCommandResponse(wse.generated.definitions.SendWaterCommandSchema.SendWaterCommandResponseType SendWaterCommandResponse){ this.SendWaterCommandResponse = SendWaterCommandResponse; return this;}
		public SendWaterCommandResponseMessage() {}
		public SendWaterCommandResponseMessage(IElement xml) { this.load(xml); }
		public SendWaterCommandResponseMessage(
			wse.generated.definitions.SendWaterCommandSchema.SendWaterCommandResponseType SendWaterCommandResponse
			) {
			this.SendWaterCommandResponse = SendWaterCommandResponse;
		}
		// Additional
	} // class SendWaterCommandResponseMessage
	protected static final class PT_SendWaterCommandPort {
		private PT_SendWaterCommandPort(){}
		protected static class SendWaterCommand extends wse.utils.WrappedOperation<
		wse.generated.definitions.SendWaterCommandWsdl.SendWaterCommandRequestMessage,
		wse.generated.definitions.SendWaterCommandSchema.SendWaterCommandRequestType,
		wse.generated.definitions.SendWaterCommandWsdl.SendWaterCommandResponseMessage,
		wse.generated.definitions.SendWaterCommandSchema.SendWaterCommandResponseType
		> {
			public SendWaterCommand(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.SendWaterCommandWsdl.SendWaterCommandResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.SendWaterCommandWsdl.SendWaterCommandRequestMessage wrapInput(wse.generated.definitions.SendWaterCommandSchema.SendWaterCommandRequestType input) {
				return new wse.generated.definitions.SendWaterCommandWsdl.SendWaterCommandRequestMessage(input);
			}
			protected final wse.generated.definitions.SendWaterCommandSchema.SendWaterCommandResponseType unwrapOutput(wse.generated.definitions.SendWaterCommandWsdl.SendWaterCommandResponseMessage output) {
				return output.SendWaterCommandResponse;
			}
		}
	}
	public static final class B_SendWaterCommandBinding {
		private B_SendWaterCommandBinding(){}
		public static class SendWaterCommand extends wse.generated.definitions.SendWaterCommandWsdl.PT_SendWaterCommandPort.SendWaterCommand {
			protected SendWaterCommand(String uri) {
				super("wse:SendWaterCommand", uri);
			}
		}
	}
}
