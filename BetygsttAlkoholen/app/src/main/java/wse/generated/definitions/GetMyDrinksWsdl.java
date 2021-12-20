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

public final class GetMyDrinksWsdl {
	private GetMyDrinksWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #GetMyDrinksRequest} <ul><b>Type:</b> wse.generated.definitions.GetMyDrinksSchema.GetMyDrinksRequest <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetMyDrinksRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.GetMyDrinksSchema.GetMyDrinksRequest GetMyDrinksRequest;
		
		protected void load_GetMyDrinksRequest(IElement xml) {
			this.GetMyDrinksRequest = parseComplex(xml, "GetMyDrinksRequest", "wse:GetMyDrinks", wse.generated.definitions.GetMyDrinksSchema.GetMyDrinksRequest.class, true);
		}
		protected void create_GetMyDrinksRequest(IElement xml) {
			printComplex(xml, "GetMyDrinksRequest", "wse:GetMyDrinks", this.GetMyDrinksRequest, true);
		}
		public void load(IElement xml) {
			try {
				load_GetMyDrinksRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetMyDrinks':'GetMyDrinksRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_GetMyDrinksRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetMyDrinks':'GetMyDrinksRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public GetMyDrinksRequestMessage(GetMyDrinksRequestMessage copy) { load(copy); }
		public void load(GetMyDrinksRequestMessage copy) {
			if (copy == null) return;
			this.GetMyDrinksRequest = copy.GetMyDrinksRequest;
		}
		public GetMyDrinksRequestMessage GetMyDrinksRequest(wse.generated.definitions.GetMyDrinksSchema.GetMyDrinksRequest GetMyDrinksRequest){ this.GetMyDrinksRequest = GetMyDrinksRequest; return this;}
		public GetMyDrinksRequestMessage() {}
		public GetMyDrinksRequestMessage(IElement xml) { this.load(xml); }
		public GetMyDrinksRequestMessage(
			wse.generated.definitions.GetMyDrinksSchema.GetMyDrinksRequest GetMyDrinksRequest
			) {
			this.GetMyDrinksRequest = GetMyDrinksRequest;
		}
		// Additional
	} // class GetMyDrinksRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #GetMyDrinksResponse} <ul><b>Type:</b> wse.generated.definitions.GetMyDrinksSchema.GetMyDrinksResponse <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetMyDrinksResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.GetMyDrinksSchema.GetMyDrinksResponse GetMyDrinksResponse;
		
		protected void load_GetMyDrinksResponse(IElement xml) {
			this.GetMyDrinksResponse = parseComplex(xml, "GetMyDrinksResponse", "wse:GetMyDrinks", wse.generated.definitions.GetMyDrinksSchema.GetMyDrinksResponse.class, true);
		}
		protected void create_GetMyDrinksResponse(IElement xml) {
			printComplex(xml, "GetMyDrinksResponse", "wse:GetMyDrinks", this.GetMyDrinksResponse, true);
		}
		public void load(IElement xml) {
			try {
				load_GetMyDrinksResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetMyDrinks':'GetMyDrinksResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_GetMyDrinksResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetMyDrinks':'GetMyDrinksResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public GetMyDrinksResponseMessage(GetMyDrinksResponseMessage copy) { load(copy); }
		public void load(GetMyDrinksResponseMessage copy) {
			if (copy == null) return;
			this.GetMyDrinksResponse = copy.GetMyDrinksResponse;
		}
		public GetMyDrinksResponseMessage GetMyDrinksResponse(wse.generated.definitions.GetMyDrinksSchema.GetMyDrinksResponse GetMyDrinksResponse){ this.GetMyDrinksResponse = GetMyDrinksResponse; return this;}
		public GetMyDrinksResponseMessage() {}
		public GetMyDrinksResponseMessage(IElement xml) { this.load(xml); }
		public GetMyDrinksResponseMessage(
			wse.generated.definitions.GetMyDrinksSchema.GetMyDrinksResponse GetMyDrinksResponse
			) {
			this.GetMyDrinksResponse = GetMyDrinksResponse;
		}
		// Additional
	} // class GetMyDrinksResponseMessage
	protected static final class PT_GetMyDrinksPort {
		private PT_GetMyDrinksPort(){}
		protected static class GetMyDrinks extends wse.utils.WrappedOperation<
		wse.generated.definitions.GetMyDrinksWsdl.GetMyDrinksRequestMessage,
		wse.generated.definitions.GetMyDrinksSchema.GetMyDrinksRequest,
		wse.generated.definitions.GetMyDrinksWsdl.GetMyDrinksResponseMessage,
		wse.generated.definitions.GetMyDrinksSchema.GetMyDrinksResponse
		> {
			public GetMyDrinks(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.GetMyDrinksWsdl.GetMyDrinksResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.GetMyDrinksWsdl.GetMyDrinksRequestMessage wrapInput(wse.generated.definitions.GetMyDrinksSchema.GetMyDrinksRequest input) {
				return new wse.generated.definitions.GetMyDrinksWsdl.GetMyDrinksRequestMessage(input);
			}
			protected final wse.generated.definitions.GetMyDrinksSchema.GetMyDrinksResponse unwrapOutput(wse.generated.definitions.GetMyDrinksWsdl.GetMyDrinksResponseMessage output) {
				return output.GetMyDrinksResponse;
			}
		}
	}
	public static final class B_GetMyDrinksBinding {
		private B_GetMyDrinksBinding(){}
		public static class GetMyDrinks extends wse.generated.definitions.GetMyDrinksWsdl.PT_GetMyDrinksPort.GetMyDrinks {
			protected GetMyDrinks(String uri) {
				super("wse:GetMyDrinks", uri);
			}
		}
	}
}
