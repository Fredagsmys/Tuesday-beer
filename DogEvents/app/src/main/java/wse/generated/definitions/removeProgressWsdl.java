/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public final class removeProgressWsdl {
	private removeProgressWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #removeProgressRequest} <ul><b>Type:</b> wse.generated.definitions.removeProgressSchema.removeProgressRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class removeProgressRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.removeProgressSchema.removeProgressRequestType removeProgressRequest;
		
		protected void load_removeProgressRequest(XMLElement xml) {
			this.removeProgressRequest = parseComplex(xml, "removeProgressRequest", "wse:removeProgress", wse.generated.definitions.removeProgressSchema.removeProgressRequestType.class, true);
		}
		protected void create_removeProgressRequest(XMLElement xml) {
			printComplex(xml, "removeProgressRequest", "wse:removeProgress", this.removeProgressRequest, true);
		}
		public void load(XMLElement xml) {
			try {
				load_removeProgressRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:removeProgress':'removeProgressRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_removeProgressRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:removeProgress':'removeProgressRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public removeProgressRequestMessage(removeProgressRequestMessage copy) { load(copy); }
		public void load(removeProgressRequestMessage copy) {
			if (copy == null) return;
			this.removeProgressRequest = copy.removeProgressRequest;
		}
		public removeProgressRequestMessage removeProgressRequest(wse.generated.definitions.removeProgressSchema.removeProgressRequestType removeProgressRequest){ this.removeProgressRequest = removeProgressRequest; return this;}
		public removeProgressRequestMessage() {}
		public removeProgressRequestMessage(XMLElement xml) { this.load(xml); }
		public removeProgressRequestMessage(
			wse.generated.definitions.removeProgressSchema.removeProgressRequestType removeProgressRequest
			) {
			this.removeProgressRequest = removeProgressRequest;
		}
		// Additional
	} // class removeProgressRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #removeProgressResponse} <ul><b>Type:</b> wse.generated.definitions.removeProgressSchema.removeProgressResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class removeProgressResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.removeProgressSchema.removeProgressResponseType removeProgressResponse;
		
		protected void load_removeProgressResponse(XMLElement xml) {
			this.removeProgressResponse = parseComplex(xml, "removeProgressResponse", "wse:removeProgress", wse.generated.definitions.removeProgressSchema.removeProgressResponseType.class, true);
		}
		protected void create_removeProgressResponse(XMLElement xml) {
			printComplex(xml, "removeProgressResponse", "wse:removeProgress", this.removeProgressResponse, true);
		}
		public void load(XMLElement xml) {
			try {
				load_removeProgressResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:removeProgress':'removeProgressResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_removeProgressResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:removeProgress':'removeProgressResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public removeProgressResponseMessage(removeProgressResponseMessage copy) { load(copy); }
		public void load(removeProgressResponseMessage copy) {
			if (copy == null) return;
			this.removeProgressResponse = copy.removeProgressResponse;
		}
		public removeProgressResponseMessage removeProgressResponse(wse.generated.definitions.removeProgressSchema.removeProgressResponseType removeProgressResponse){ this.removeProgressResponse = removeProgressResponse; return this;}
		public removeProgressResponseMessage() {}
		public removeProgressResponseMessage(XMLElement xml) { this.load(xml); }
		public removeProgressResponseMessage(
			wse.generated.definitions.removeProgressSchema.removeProgressResponseType removeProgressResponse
			) {
			this.removeProgressResponse = removeProgressResponse;
		}
		// Additional
	} // class removeProgressResponseMessage
	protected static final class PT_removeProgressPort {
		private PT_removeProgressPort(){}
		protected static class removeProgress extends wse.utils.WrappedOperation<
		wse.generated.definitions.removeProgressWsdl.removeProgressRequestMessage,
		wse.generated.definitions.removeProgressSchema.removeProgressRequestType,
		wse.generated.definitions.removeProgressWsdl.removeProgressResponseMessage,
		wse.generated.definitions.removeProgressSchema.removeProgressResponseType
		> {
			public removeProgress(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.removeProgressWsdl.removeProgressResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.removeProgressWsdl.removeProgressRequestMessage wrapInput(wse.generated.definitions.removeProgressSchema.removeProgressRequestType input) {
				return new wse.generated.definitions.removeProgressWsdl.removeProgressRequestMessage(input);
			}
			protected final wse.generated.definitions.removeProgressSchema.removeProgressResponseType unwrapOutput(wse.generated.definitions.removeProgressWsdl.removeProgressResponseMessage output) {
				return output.removeProgressResponse;
			}
		}
	}
	public static final class B_removeProgressBinding {
		private B_removeProgressBinding(){}
		public static class removeProgress extends wse.generated.definitions.removeProgressWsdl.PT_removeProgressPort.removeProgress {
			protected removeProgress(String uri) {
				super("wse:removeProgress", uri);
			}
		}
	}
}
