/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public final class GetProgressWsdl {
	private GetProgressWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #GetProgressRequest} <ul><b>Type:</b> wse.generated.definitions.GetProgressSchema.GetProgressRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetProgressRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.GetProgressSchema.GetProgressRequestType GetProgressRequest;
		
		protected void load_GetProgressRequest(XMLElement xml) {
			this.GetProgressRequest = parseComplex(xml, "GetProgressRequest", "wse:GetProgress", wse.generated.definitions.GetProgressSchema.GetProgressRequestType.class, true);
		}
		protected void create_GetProgressRequest(XMLElement xml) {
			printComplex(xml, "GetProgressRequest", "wse:GetProgress", this.GetProgressRequest, true);
		}
		public void load(XMLElement xml) {
			try {
				load_GetProgressRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetProgress':'GetProgressRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_GetProgressRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetProgress':'GetProgressRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public GetProgressRequestMessage(GetProgressRequestMessage copy) { load(copy); }
		public void load(GetProgressRequestMessage copy) {
			if (copy == null) return;
			this.GetProgressRequest = copy.GetProgressRequest;
		}
		public GetProgressRequestMessage GetProgressRequest(wse.generated.definitions.GetProgressSchema.GetProgressRequestType GetProgressRequest){ this.GetProgressRequest = GetProgressRequest; return this;}
		public GetProgressRequestMessage() {}
		public GetProgressRequestMessage(XMLElement xml) { this.load(xml); }
		public GetProgressRequestMessage(
			wse.generated.definitions.GetProgressSchema.GetProgressRequestType GetProgressRequest
			) {
			this.GetProgressRequest = GetProgressRequest;
		}
		// Additional
	} // class GetProgressRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #GetProgressResponse} <ul><b>Type:</b> wse.generated.definitions.GetProgressSchema.GetProgressResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetProgressResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.GetProgressSchema.GetProgressResponseType GetProgressResponse;
		
		protected void load_GetProgressResponse(XMLElement xml) {
			this.GetProgressResponse = parseComplex(xml, "GetProgressResponse", "wse:GetProgress", wse.generated.definitions.GetProgressSchema.GetProgressResponseType.class, true);
		}
		protected void create_GetProgressResponse(XMLElement xml) {
			printComplex(xml, "GetProgressResponse", "wse:GetProgress", this.GetProgressResponse, true);
		}
		public void load(XMLElement xml) {
			try {
				load_GetProgressResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetProgress':'GetProgressResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_GetProgressResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetProgress':'GetProgressResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public GetProgressResponseMessage(GetProgressResponseMessage copy) { load(copy); }
		public void load(GetProgressResponseMessage copy) {
			if (copy == null) return;
			this.GetProgressResponse = copy.GetProgressResponse;
		}
		public GetProgressResponseMessage GetProgressResponse(wse.generated.definitions.GetProgressSchema.GetProgressResponseType GetProgressResponse){ this.GetProgressResponse = GetProgressResponse; return this;}
		public GetProgressResponseMessage() {}
		public GetProgressResponseMessage(XMLElement xml) { this.load(xml); }
		public GetProgressResponseMessage(
			wse.generated.definitions.GetProgressSchema.GetProgressResponseType GetProgressResponse
			) {
			this.GetProgressResponse = GetProgressResponse;
		}
		// Additional
	} // class GetProgressResponseMessage
	protected static final class PT_GetProgressPort {
		private PT_GetProgressPort(){}
		protected static class GetProgress extends wse.utils.WrappedOperation<
		wse.generated.definitions.GetProgressWsdl.GetProgressRequestMessage,
		wse.generated.definitions.GetProgressSchema.GetProgressRequestType,
		wse.generated.definitions.GetProgressWsdl.GetProgressResponseMessage,
		wse.generated.definitions.GetProgressSchema.GetProgressResponseType
		> {
			public GetProgress(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.GetProgressWsdl.GetProgressResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.GetProgressWsdl.GetProgressRequestMessage wrapInput(wse.generated.definitions.GetProgressSchema.GetProgressRequestType input) {
				return new wse.generated.definitions.GetProgressWsdl.GetProgressRequestMessage(input);
			}
			protected final wse.generated.definitions.GetProgressSchema.GetProgressResponseType unwrapOutput(wse.generated.definitions.GetProgressWsdl.GetProgressResponseMessage output) {
				return output.GetProgressResponse;
			}
		}
	}
	public static final class B_GetProgressBinding {
		private B_GetProgressBinding(){}
		public static class GetProgress extends wse.generated.definitions.GetProgressWsdl.PT_GetProgressPort.GetProgress {
			protected GetProgress(String uri) {
				super("wse:GetProgress", uri);
			}
		}
	}
}
