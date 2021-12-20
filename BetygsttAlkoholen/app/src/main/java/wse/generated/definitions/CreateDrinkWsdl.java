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

public final class CreateDrinkWsdl {
	private CreateDrinkWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #CreateDrinkRequest} <ul><b>Type:</b> wse.generated.definitions.CreateDrinkSchema.CreateDrinkRequest <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class CreateDrinkRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.CreateDrinkSchema.CreateDrinkRequest CreateDrinkRequest;
		
		protected void load_CreateDrinkRequest(IElement xml) {
			this.CreateDrinkRequest = parseComplex(xml, "CreateDrinkRequest", "wse:CreateDrink", wse.generated.definitions.CreateDrinkSchema.CreateDrinkRequest.class, true);
		}
		protected void create_CreateDrinkRequest(IElement xml) {
			printComplex(xml, "CreateDrinkRequest", "wse:CreateDrink", this.CreateDrinkRequest, true);
		}
		public void load(IElement xml) {
			try {
				load_CreateDrinkRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:CreateDrink':'CreateDrinkRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_CreateDrinkRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:CreateDrink':'CreateDrinkRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public CreateDrinkRequestMessage(CreateDrinkRequestMessage copy) { load(copy); }
		public void load(CreateDrinkRequestMessage copy) {
			if (copy == null) return;
			this.CreateDrinkRequest = copy.CreateDrinkRequest;
		}
		public CreateDrinkRequestMessage CreateDrinkRequest(wse.generated.definitions.CreateDrinkSchema.CreateDrinkRequest CreateDrinkRequest){ this.CreateDrinkRequest = CreateDrinkRequest; return this;}
		public CreateDrinkRequestMessage() {}
		public CreateDrinkRequestMessage(IElement xml) { this.load(xml); }
		public CreateDrinkRequestMessage(
			wse.generated.definitions.CreateDrinkSchema.CreateDrinkRequest CreateDrinkRequest
			) {
			this.CreateDrinkRequest = CreateDrinkRequest;
		}
		// Additional
	} // class CreateDrinkRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #CreateDrinkResponse} <ul><b>Type:</b> wse.generated.definitions.CreateDrinkSchema.CreateDrinkResponse <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class CreateDrinkResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.CreateDrinkSchema.CreateDrinkResponse CreateDrinkResponse;
		
		protected void load_CreateDrinkResponse(IElement xml) {
			this.CreateDrinkResponse = parseComplex(xml, "CreateDrinkResponse", "wse:CreateDrink", wse.generated.definitions.CreateDrinkSchema.CreateDrinkResponse.class, true);
		}
		protected void create_CreateDrinkResponse(IElement xml) {
			printComplex(xml, "CreateDrinkResponse", "wse:CreateDrink", this.CreateDrinkResponse, true);
		}
		public void load(IElement xml) {
			try {
				load_CreateDrinkResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:CreateDrink':'CreateDrinkResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_CreateDrinkResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:CreateDrink':'CreateDrinkResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public CreateDrinkResponseMessage(CreateDrinkResponseMessage copy) { load(copy); }
		public void load(CreateDrinkResponseMessage copy) {
			if (copy == null) return;
			this.CreateDrinkResponse = copy.CreateDrinkResponse;
		}
		public CreateDrinkResponseMessage CreateDrinkResponse(wse.generated.definitions.CreateDrinkSchema.CreateDrinkResponse CreateDrinkResponse){ this.CreateDrinkResponse = CreateDrinkResponse; return this;}
		public CreateDrinkResponseMessage() {}
		public CreateDrinkResponseMessage(IElement xml) { this.load(xml); }
		public CreateDrinkResponseMessage(
			wse.generated.definitions.CreateDrinkSchema.CreateDrinkResponse CreateDrinkResponse
			) {
			this.CreateDrinkResponse = CreateDrinkResponse;
		}
		// Additional
	} // class CreateDrinkResponseMessage
	protected static final class PT_CreateDrinkPort {
		private PT_CreateDrinkPort(){}
		protected static class CreateDrink extends wse.utils.WrappedOperation<
		wse.generated.definitions.CreateDrinkWsdl.CreateDrinkRequestMessage,
		wse.generated.definitions.CreateDrinkSchema.CreateDrinkRequest,
		wse.generated.definitions.CreateDrinkWsdl.CreateDrinkResponseMessage,
		wse.generated.definitions.CreateDrinkSchema.CreateDrinkResponse
		> {
			public CreateDrink(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.CreateDrinkWsdl.CreateDrinkResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.CreateDrinkWsdl.CreateDrinkRequestMessage wrapInput(wse.generated.definitions.CreateDrinkSchema.CreateDrinkRequest input) {
				return new wse.generated.definitions.CreateDrinkWsdl.CreateDrinkRequestMessage(input);
			}
			protected final wse.generated.definitions.CreateDrinkSchema.CreateDrinkResponse unwrapOutput(wse.generated.definitions.CreateDrinkWsdl.CreateDrinkResponseMessage output) {
				return output.CreateDrinkResponse;
			}
		}
	}
	public static final class B_CreateDrinkBinding {
		private B_CreateDrinkBinding(){}
		public static class CreateDrink extends wse.generated.definitions.CreateDrinkWsdl.PT_CreateDrinkPort.CreateDrink {
			protected CreateDrink(String uri) {
				super("wse:CreateDrink", uri);
			}
		}
	}
}
