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

public final class GetSensorDatasWsdl {
	private GetSensorDatasWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #GetSensorDatasRequest} <ul><b>Type:</b> wse.generated.definitions.GetSensorDatasSchema.GetSensorDatasRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetSensorDatasRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.GetSensorDatasSchema.GetSensorDatasRequestType GetSensorDatasRequest;
		
		protected void load_GetSensorDatasRequest(IElement xml) {
			this.GetSensorDatasRequest = parseComplex(xml, "GetSensorDatasRequest", "wse:GetSensorDatas", wse.generated.definitions.GetSensorDatasSchema.GetSensorDatasRequestType.class, true);
		}
		protected void create_GetSensorDatasRequest(IElement xml) {
			printComplex(xml, "GetSensorDatasRequest", "wse:GetSensorDatas", this.GetSensorDatasRequest, true);
		}
		public void load(IElement xml) {
			try {
				load_GetSensorDatasRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetSensorDatas':'GetSensorDatasRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_GetSensorDatasRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetSensorDatas':'GetSensorDatasRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public GetSensorDatasRequestMessage(GetSensorDatasRequestMessage copy) { load(copy); }
		public void load(GetSensorDatasRequestMessage copy) {
			if (copy == null) return;
			this.GetSensorDatasRequest = copy.GetSensorDatasRequest;
		}
		public GetSensorDatasRequestMessage GetSensorDatasRequest(wse.generated.definitions.GetSensorDatasSchema.GetSensorDatasRequestType GetSensorDatasRequest){ this.GetSensorDatasRequest = GetSensorDatasRequest; return this;}
		public GetSensorDatasRequestMessage() {}
		public GetSensorDatasRequestMessage(IElement xml) { this.load(xml); }
		public GetSensorDatasRequestMessage(
			wse.generated.definitions.GetSensorDatasSchema.GetSensorDatasRequestType GetSensorDatasRequest
			) {
			this.GetSensorDatasRequest = GetSensorDatasRequest;
		}
		// Additional
	} // class GetSensorDatasRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #GetSensorDatasResponse} <ul><b>Type:</b> wse.generated.definitions.GetSensorDatasSchema.GetSensorDatasResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetSensorDatasResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.GetSensorDatasSchema.GetSensorDatasResponseType GetSensorDatasResponse;
		
		protected void load_GetSensorDatasResponse(IElement xml) {
			this.GetSensorDatasResponse = parseComplex(xml, "GetSensorDatasResponse", "wse:GetSensorDatas", wse.generated.definitions.GetSensorDatasSchema.GetSensorDatasResponseType.class, true);
		}
		protected void create_GetSensorDatasResponse(IElement xml) {
			printComplex(xml, "GetSensorDatasResponse", "wse:GetSensorDatas", this.GetSensorDatasResponse, true);
		}
		public void load(IElement xml) {
			try {
				load_GetSensorDatasResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetSensorDatas':'GetSensorDatasResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_GetSensorDatasResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetSensorDatas':'GetSensorDatasResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public GetSensorDatasResponseMessage(GetSensorDatasResponseMessage copy) { load(copy); }
		public void load(GetSensorDatasResponseMessage copy) {
			if (copy == null) return;
			this.GetSensorDatasResponse = copy.GetSensorDatasResponse;
		}
		public GetSensorDatasResponseMessage GetSensorDatasResponse(wse.generated.definitions.GetSensorDatasSchema.GetSensorDatasResponseType GetSensorDatasResponse){ this.GetSensorDatasResponse = GetSensorDatasResponse; return this;}
		public GetSensorDatasResponseMessage() {}
		public GetSensorDatasResponseMessage(IElement xml) { this.load(xml); }
		public GetSensorDatasResponseMessage(
			wse.generated.definitions.GetSensorDatasSchema.GetSensorDatasResponseType GetSensorDatasResponse
			) {
			this.GetSensorDatasResponse = GetSensorDatasResponse;
		}
		// Additional
	} // class GetSensorDatasResponseMessage
	protected static final class PT_GetSensorDatasPort {
		private PT_GetSensorDatasPort(){}
		protected static class GetSensorDatas extends wse.utils.WrappedOperation<
		wse.generated.definitions.GetSensorDatasWsdl.GetSensorDatasRequestMessage,
		wse.generated.definitions.GetSensorDatasSchema.GetSensorDatasRequestType,
		wse.generated.definitions.GetSensorDatasWsdl.GetSensorDatasResponseMessage,
		wse.generated.definitions.GetSensorDatasSchema.GetSensorDatasResponseType
		> {
			public GetSensorDatas(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.GetSensorDatasWsdl.GetSensorDatasResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.GetSensorDatasWsdl.GetSensorDatasRequestMessage wrapInput(wse.generated.definitions.GetSensorDatasSchema.GetSensorDatasRequestType input) {
				return new wse.generated.definitions.GetSensorDatasWsdl.GetSensorDatasRequestMessage(input);
			}
			protected final wse.generated.definitions.GetSensorDatasSchema.GetSensorDatasResponseType unwrapOutput(wse.generated.definitions.GetSensorDatasWsdl.GetSensorDatasResponseMessage output) {
				return output.GetSensorDatasResponse;
			}
		}
	}
	public static final class B_GetSensorDatasBinding {
		private B_GetSensorDatasBinding(){}
		public static class GetSensorDatas extends wse.generated.definitions.GetSensorDatasWsdl.PT_GetSensorDatasPort.GetSensorDatas {
			protected GetSensorDatas(String uri) {
				super("wse:GetSensorDatas", uri);
			}
		}
	}
}
