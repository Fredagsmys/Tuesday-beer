/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 9 December 2021 16:32:15 +0100
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.internal.IElement;

public final class RemoveDrinkWsdl {
	private RemoveDrinkWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #RemoveDrinkRequest} <ul><b>Type:</b> wse.generated.definitions.RemoveDrinkSchema.RemoveDrinkRequest <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class RemoveDrinkRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.RemoveDrinkSchema.RemoveDrinkRequest RemoveDrinkRequest;
		
		protected void load_RemoveDrinkRequest(IElement xml) {
			this.RemoveDrinkRequest = parseComplex(xml, "RemoveDrinkRequest", "wse:RemoveDrink", wse.generated.definitions.RemoveDrinkSchema.RemoveDrinkRequest.class, true);
		}
		protected void create_RemoveDrinkRequest(IElement xml) {
			printComplex(xml, "RemoveDrinkRequest", "wse:RemoveDrink", this.RemoveDrinkRequest, true);
		}
		public void load(IElement xml) {
			try {
				load_RemoveDrinkRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:RemoveDrink':'RemoveDrinkRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_RemoveDrinkRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:RemoveDrink':'RemoveDrinkRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public RemoveDrinkRequestMessage(RemoveDrinkRequestMessage copy) { load(copy); }
		public void load(RemoveDrinkRequestMessage copy) {
			if (copy == null) return;
			this.RemoveDrinkRequest = copy.RemoveDrinkRequest;
		}
		public RemoveDrinkRequestMessage RemoveDrinkRequest(wse.generated.definitions.RemoveDrinkSchema.RemoveDrinkRequest RemoveDrinkRequest){ this.RemoveDrinkRequest = RemoveDrinkRequest; return this;}
		public RemoveDrinkRequestMessage() {}
		public RemoveDrinkRequestMessage(IElement xml) { this.load(xml); }
		public RemoveDrinkRequestMessage(
			wse.generated.definitions.RemoveDrinkSchema.RemoveDrinkRequest RemoveDrinkRequest
			) {
			this.RemoveDrinkRequest = RemoveDrinkRequest;
		}
		// Additional
	} // class RemoveDrinkRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #RemoveDrinkResponse} <ul><b>Type:</b> wse.generated.definitions.RemoveDrinkSchema.RemoveDrinkResponse <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class RemoveDrinkResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.RemoveDrinkSchema.RemoveDrinkResponse RemoveDrinkResponse;
		
		protected void load_RemoveDrinkResponse(IElement xml) {
			this.RemoveDrinkResponse = parseComplex(xml, "RemoveDrinkResponse", "wse:RemoveDrink", wse.generated.definitions.RemoveDrinkSchema.RemoveDrinkResponse.class, true);
		}
		protected void create_RemoveDrinkResponse(IElement xml) {
			printComplex(xml, "RemoveDrinkResponse", "wse:RemoveDrink", this.RemoveDrinkResponse, true);
		}
		public void load(IElement xml) {
			try {
				load_RemoveDrinkResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:RemoveDrink':'RemoveDrinkResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_RemoveDrinkResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:RemoveDrink':'RemoveDrinkResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public RemoveDrinkResponseMessage(RemoveDrinkResponseMessage copy) { load(copy); }
		public void load(RemoveDrinkResponseMessage copy) {
			if (copy == null) return;
			this.RemoveDrinkResponse = copy.RemoveDrinkResponse;
		}
		public RemoveDrinkResponseMessage RemoveDrinkResponse(wse.generated.definitions.RemoveDrinkSchema.RemoveDrinkResponse RemoveDrinkResponse){ this.RemoveDrinkResponse = RemoveDrinkResponse; return this;}
		public RemoveDrinkResponseMessage() {}
		public RemoveDrinkResponseMessage(IElement xml) { this.load(xml); }
		public RemoveDrinkResponseMessage(
			wse.generated.definitions.RemoveDrinkSchema.RemoveDrinkResponse RemoveDrinkResponse
			) {
			this.RemoveDrinkResponse = RemoveDrinkResponse;
		}
		// Additional
	} // class RemoveDrinkResponseMessage
	protected static final class PT_RemoveDrinkPort {
		private PT_RemoveDrinkPort(){}
		protected static class RemoveDrink extends wse.utils.WrappedOperation<
		wse.generated.definitions.RemoveDrinkWsdl.RemoveDrinkRequestMessage,
		wse.generated.definitions.RemoveDrinkSchema.RemoveDrinkRequest,
		wse.generated.definitions.RemoveDrinkWsdl.RemoveDrinkResponseMessage,
		wse.generated.definitions.RemoveDrinkSchema.RemoveDrinkResponse
		> {
			public RemoveDrink(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.RemoveDrinkWsdl.RemoveDrinkResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.RemoveDrinkWsdl.RemoveDrinkRequestMessage wrapInput(wse.generated.definitions.RemoveDrinkSchema.RemoveDrinkRequest input) {
				return new wse.generated.definitions.RemoveDrinkWsdl.RemoveDrinkRequestMessage(input);
			}
			protected final wse.generated.definitions.RemoveDrinkSchema.RemoveDrinkResponse unwrapOutput(wse.generated.definitions.RemoveDrinkWsdl.RemoveDrinkResponseMessage output) {
				return output.RemoveDrinkResponse;
			}
		}
	}
	public static final class B_RemoveDrinkBinding {
		private B_RemoveDrinkBinding(){}
		public static class RemoveDrink extends wse.generated.definitions.RemoveDrinkWsdl.PT_RemoveDrinkPort.RemoveDrink {
			protected RemoveDrink(String uri) {
				super("wse:RemoveDrink", uri);
			}
		}
	}
}
