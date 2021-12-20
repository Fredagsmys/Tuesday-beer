/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public final class GetDogAccountsWsdl {
	private GetDogAccountsWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #GetDogAccountsRequest} <ul><b>Type:</b> wse.generated.definitions.GetDogAccountsSchema.GetDogAccountsRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetDogAccountsRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.GetDogAccountsSchema.GetDogAccountsRequestType GetDogAccountsRequest;
		
		protected void load_GetDogAccountsRequest(XMLElement xml) {
			this.GetDogAccountsRequest = parseComplex(xml, "GetDogAccountsRequest", "wse:GetDogAccounts", wse.generated.definitions.GetDogAccountsSchema.GetDogAccountsRequestType.class, true);
		}
		protected void create_GetDogAccountsRequest(XMLElement xml) {
			printComplex(xml, "GetDogAccountsRequest", "wse:GetDogAccounts", this.GetDogAccountsRequest, true);
		}
		public void load(XMLElement xml) {
			try {
				load_GetDogAccountsRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetDogAccounts':'GetDogAccountsRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_GetDogAccountsRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetDogAccounts':'GetDogAccountsRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public GetDogAccountsRequestMessage(GetDogAccountsRequestMessage copy) { load(copy); }
		public void load(GetDogAccountsRequestMessage copy) {
			if (copy == null) return;
			this.GetDogAccountsRequest = copy.GetDogAccountsRequest;
		}
		public GetDogAccountsRequestMessage GetDogAccountsRequest(wse.generated.definitions.GetDogAccountsSchema.GetDogAccountsRequestType GetDogAccountsRequest){ this.GetDogAccountsRequest = GetDogAccountsRequest; return this;}
		public GetDogAccountsRequestMessage() {}
		public GetDogAccountsRequestMessage(XMLElement xml) { this.load(xml); }
		public GetDogAccountsRequestMessage(
			wse.generated.definitions.GetDogAccountsSchema.GetDogAccountsRequestType GetDogAccountsRequest
			) {
			this.GetDogAccountsRequest = GetDogAccountsRequest;
		}
		// Additional
	} // class GetDogAccountsRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #GetDogAccountsResponse} <ul><b>Type:</b> wse.generated.definitions.GetDogAccountsSchema.GetDogAccountsResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetDogAccountsResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.GetDogAccountsSchema.GetDogAccountsResponseType GetDogAccountsResponse;
		
		protected void load_GetDogAccountsResponse(XMLElement xml) {
			this.GetDogAccountsResponse = parseComplex(xml, "GetDogAccountsResponse", "wse:GetDogAccounts", wse.generated.definitions.GetDogAccountsSchema.GetDogAccountsResponseType.class, true);
		}
		protected void create_GetDogAccountsResponse(XMLElement xml) {
			printComplex(xml, "GetDogAccountsResponse", "wse:GetDogAccounts", this.GetDogAccountsResponse, true);
		}
		public void load(XMLElement xml) {
			try {
				load_GetDogAccountsResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetDogAccounts':'GetDogAccountsResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_GetDogAccountsResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetDogAccounts':'GetDogAccountsResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public GetDogAccountsResponseMessage(GetDogAccountsResponseMessage copy) { load(copy); }
		public void load(GetDogAccountsResponseMessage copy) {
			if (copy == null) return;
			this.GetDogAccountsResponse = copy.GetDogAccountsResponse;
		}
		public GetDogAccountsResponseMessage GetDogAccountsResponse(wse.generated.definitions.GetDogAccountsSchema.GetDogAccountsResponseType GetDogAccountsResponse){ this.GetDogAccountsResponse = GetDogAccountsResponse; return this;}
		public GetDogAccountsResponseMessage() {}
		public GetDogAccountsResponseMessage(XMLElement xml) { this.load(xml); }
		public GetDogAccountsResponseMessage(
			wse.generated.definitions.GetDogAccountsSchema.GetDogAccountsResponseType GetDogAccountsResponse
			) {
			this.GetDogAccountsResponse = GetDogAccountsResponse;
		}
		// Additional
	} // class GetDogAccountsResponseMessage
	protected static final class PT_GetDogAccountsPort {
		private PT_GetDogAccountsPort(){}
		protected static class GetDogAccounts extends wse.utils.WrappedOperation<
		wse.generated.definitions.GetDogAccountsWsdl.GetDogAccountsRequestMessage,
		wse.generated.definitions.GetDogAccountsSchema.GetDogAccountsRequestType,
		wse.generated.definitions.GetDogAccountsWsdl.GetDogAccountsResponseMessage,
		wse.generated.definitions.GetDogAccountsSchema.GetDogAccountsResponseType
		> {
			public GetDogAccounts(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.GetDogAccountsWsdl.GetDogAccountsResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.GetDogAccountsWsdl.GetDogAccountsRequestMessage wrapInput(wse.generated.definitions.GetDogAccountsSchema.GetDogAccountsRequestType input) {
				return new wse.generated.definitions.GetDogAccountsWsdl.GetDogAccountsRequestMessage(input);
			}
			protected final wse.generated.definitions.GetDogAccountsSchema.GetDogAccountsResponseType unwrapOutput(wse.generated.definitions.GetDogAccountsWsdl.GetDogAccountsResponseMessage output) {
				return output.GetDogAccountsResponse;
			}
		}
	}
	public static final class B_GetDogAccountsBinding {
		private B_GetDogAccountsBinding(){}
		public static class GetDogAccounts extends wse.generated.definitions.GetDogAccountsWsdl.PT_GetDogAccountsPort.GetDogAccounts {
			protected GetDogAccounts(String uri) {
				super("wse:GetDogAccounts", uri);
			}
		}
	}
}
