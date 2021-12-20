/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public final class SaveProgressWsdl {
	private SaveProgressWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #SaveProgressRequest} <ul><b>Type:</b> wse.generated.definitions.SaveProgressSchema.SaveProgressRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class SaveProgressRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.SaveProgressSchema.SaveProgressRequestType SaveProgressRequest;
		
		protected void load_SaveProgressRequest(XMLElement xml) {
			this.SaveProgressRequest = parseComplex(xml, "SaveProgressRequest", "wse:SaveProgress", wse.generated.definitions.SaveProgressSchema.SaveProgressRequestType.class, true);
		}
		protected void create_SaveProgressRequest(XMLElement xml) {
			printComplex(xml, "SaveProgressRequest", "wse:SaveProgress", this.SaveProgressRequest, true);
		}
		public void load(XMLElement xml) {
			try {
				load_SaveProgressRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:SaveProgress':'SaveProgressRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_SaveProgressRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:SaveProgress':'SaveProgressRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public SaveProgressRequestMessage(SaveProgressRequestMessage copy) { load(copy); }
		public void load(SaveProgressRequestMessage copy) {
			if (copy == null) return;
			this.SaveProgressRequest = copy.SaveProgressRequest;
		}
		public SaveProgressRequestMessage SaveProgressRequest(wse.generated.definitions.SaveProgressSchema.SaveProgressRequestType SaveProgressRequest){ this.SaveProgressRequest = SaveProgressRequest; return this;}
		public SaveProgressRequestMessage() {}
		public SaveProgressRequestMessage(XMLElement xml) { this.load(xml); }
		public SaveProgressRequestMessage(
			wse.generated.definitions.SaveProgressSchema.SaveProgressRequestType SaveProgressRequest
			) {
			this.SaveProgressRequest = SaveProgressRequest;
		}
		// Additional
	} // class SaveProgressRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #SaveProgressResponse} <ul><b>Type:</b> wse.generated.definitions.SaveProgressSchema.SaveProgressResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class SaveProgressResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.SaveProgressSchema.SaveProgressResponseType SaveProgressResponse;
		
		protected void load_SaveProgressResponse(XMLElement xml) {
			this.SaveProgressResponse = parseComplex(xml, "SaveProgressResponse", "wse:SaveProgress", wse.generated.definitions.SaveProgressSchema.SaveProgressResponseType.class, true);
		}
		protected void create_SaveProgressResponse(XMLElement xml) {
			printComplex(xml, "SaveProgressResponse", "wse:SaveProgress", this.SaveProgressResponse, true);
		}
		public void load(XMLElement xml) {
			try {
				load_SaveProgressResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:SaveProgress':'SaveProgressResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_SaveProgressResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:SaveProgress':'SaveProgressResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public SaveProgressResponseMessage(SaveProgressResponseMessage copy) { load(copy); }
		public void load(SaveProgressResponseMessage copy) {
			if (copy == null) return;
			this.SaveProgressResponse = copy.SaveProgressResponse;
		}
		public SaveProgressResponseMessage SaveProgressResponse(wse.generated.definitions.SaveProgressSchema.SaveProgressResponseType SaveProgressResponse){ this.SaveProgressResponse = SaveProgressResponse; return this;}
		public SaveProgressResponseMessage() {}
		public SaveProgressResponseMessage(XMLElement xml) { this.load(xml); }
		public SaveProgressResponseMessage(
			wse.generated.definitions.SaveProgressSchema.SaveProgressResponseType SaveProgressResponse
			) {
			this.SaveProgressResponse = SaveProgressResponse;
		}
		// Additional
	} // class SaveProgressResponseMessage
	protected static final class PT_SaveProgressPort {
		private PT_SaveProgressPort(){}
		protected static class SaveProgress extends wse.utils.WrappedOperation<
		wse.generated.definitions.SaveProgressWsdl.SaveProgressRequestMessage,
		wse.generated.definitions.SaveProgressSchema.SaveProgressRequestType,
		wse.generated.definitions.SaveProgressWsdl.SaveProgressResponseMessage,
		wse.generated.definitions.SaveProgressSchema.SaveProgressResponseType
		> {
			public SaveProgress(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.SaveProgressWsdl.SaveProgressResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.SaveProgressWsdl.SaveProgressRequestMessage wrapInput(wse.generated.definitions.SaveProgressSchema.SaveProgressRequestType input) {
				return new wse.generated.definitions.SaveProgressWsdl.SaveProgressRequestMessage(input);
			}
			protected final wse.generated.definitions.SaveProgressSchema.SaveProgressResponseType unwrapOutput(wse.generated.definitions.SaveProgressWsdl.SaveProgressResponseMessage output) {
				return output.SaveProgressResponse;
			}
		}
	}
	public static final class B_SaveProgressBinding {
		private B_SaveProgressBinding(){}
		public static class SaveProgress extends wse.generated.definitions.SaveProgressWsdl.PT_SaveProgressPort.SaveProgress {
			protected SaveProgress(String uri) {
				super("wse:SaveProgress", uri);
			}
		}
	}
}
