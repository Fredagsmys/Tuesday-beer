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

public final class GetSensorDataWsdl {
	private GetSensorDataWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #GetSensorDataRequest} <ul><b>Type:</b> wse.generated.definitions.GetSensorDataSchema.GetSensorDataRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetSensorDataRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.GetSensorDataSchema.GetSensorDataRequestType GetSensorDataRequest;
		
		protected void load_GetSensorDataRequest(IElement xml) {
			this.GetSensorDataRequest = parseComplex(xml, "GetSensorDataRequest", "wse:GetSensorData", wse.generated.definitions.GetSensorDataSchema.GetSensorDataRequestType.class, true);
		}
		protected void create_GetSensorDataRequest(IElement xml) {
			printComplex(xml, "GetSensorDataRequest", "wse:GetSensorData", this.GetSensorDataRequest, true);
		}
		public void load(IElement xml) {
			try {
				load_GetSensorDataRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetSensorData':'GetSensorDataRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_GetSensorDataRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetSensorData':'GetSensorDataRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public GetSensorDataRequestMessage(GetSensorDataRequestMessage copy) { load(copy); }
		public void load(GetSensorDataRequestMessage copy) {
			if (copy == null) return;
			this.GetSensorDataRequest = copy.GetSensorDataRequest;
		}
		public GetSensorDataRequestMessage GetSensorDataRequest(wse.generated.definitions.GetSensorDataSchema.GetSensorDataRequestType GetSensorDataRequest){ this.GetSensorDataRequest = GetSensorDataRequest; return this;}
		public GetSensorDataRequestMessage() {}
		public GetSensorDataRequestMessage(IElement xml) { this.load(xml); }
		public GetSensorDataRequestMessage(
			wse.generated.definitions.GetSensorDataSchema.GetSensorDataRequestType GetSensorDataRequest
			) {
			this.GetSensorDataRequest = GetSensorDataRequest;
		}
		// Additional
	} // class GetSensorDataRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #GetSensorDataResponse} <ul><b>Type:</b> wse.generated.definitions.GetSensorDataSchema.GetSensorDataResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetSensorDataResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.GetSensorDataSchema.GetSensorDataResponseType GetSensorDataResponse;
		
		protected void load_GetSensorDataResponse(IElement xml) {
			this.GetSensorDataResponse = parseComplex(xml, "GetSensorDataResponse", "wse:GetSensorData", wse.generated.definitions.GetSensorDataSchema.GetSensorDataResponseType.class, true);
		}
		protected void create_GetSensorDataResponse(IElement xml) {
			printComplex(xml, "GetSensorDataResponse", "wse:GetSensorData", this.GetSensorDataResponse, true);
		}
		public void load(IElement xml) {
			try {
				load_GetSensorDataResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetSensorData':'GetSensorDataResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_GetSensorDataResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetSensorData':'GetSensorDataResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public GetSensorDataResponseMessage(GetSensorDataResponseMessage copy) { load(copy); }
		public void load(GetSensorDataResponseMessage copy) {
			if (copy == null) return;
			this.GetSensorDataResponse = copy.GetSensorDataResponse;
		}
		public GetSensorDataResponseMessage GetSensorDataResponse(wse.generated.definitions.GetSensorDataSchema.GetSensorDataResponseType GetSensorDataResponse){ this.GetSensorDataResponse = GetSensorDataResponse; return this;}
		public GetSensorDataResponseMessage() {}
		public GetSensorDataResponseMessage(IElement xml) { this.load(xml); }
		public GetSensorDataResponseMessage(
			wse.generated.definitions.GetSensorDataSchema.GetSensorDataResponseType GetSensorDataResponse
			) {
			this.GetSensorDataResponse = GetSensorDataResponse;
		}
		// Additional
	} // class GetSensorDataResponseMessage
	protected static final class PT_GetSensorDataPort {
		private PT_GetSensorDataPort(){}
		protected static class GetSensorData extends wse.utils.WrappedOperation<
		wse.generated.definitions.GetSensorDataWsdl.GetSensorDataRequestMessage,
		wse.generated.definitions.GetSensorDataSchema.GetSensorDataRequestType,
		wse.generated.definitions.GetSensorDataWsdl.GetSensorDataResponseMessage,
		wse.generated.definitions.GetSensorDataSchema.GetSensorDataResponseType
		> {
			public GetSensorData(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.GetSensorDataWsdl.GetSensorDataResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.GetSensorDataWsdl.GetSensorDataRequestMessage wrapInput(wse.generated.definitions.GetSensorDataSchema.GetSensorDataRequestType input) {
				return new wse.generated.definitions.GetSensorDataWsdl.GetSensorDataRequestMessage(input);
			}
			protected final wse.generated.definitions.GetSensorDataSchema.GetSensorDataResponseType unwrapOutput(wse.generated.definitions.GetSensorDataWsdl.GetSensorDataResponseMessage output) {
				return output.GetSensorDataResponse;
			}
		}
	}
	public static final class B_GetSensorDataBinding {
		private B_GetSensorDataBinding(){}
		public static class GetSensorData extends wse.generated.definitions.GetSensorDataWsdl.PT_GetSensorDataPort.GetSensorData {
			protected GetSensorData(String uri) {
				super("wse:GetSensorData", uri);
			}
		}
	}
}
