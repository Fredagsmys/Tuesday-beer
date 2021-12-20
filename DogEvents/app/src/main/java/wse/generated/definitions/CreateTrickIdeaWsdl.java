/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public final class CreateTrickIdeaWsdl {
	private CreateTrickIdeaWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #CreateTrickIdeaRequest} <ul><b>Type:</b> wse.generated.definitions.CreateTrickIdeaSchema.CreateTrickIdeaRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class CreateTrickIdeaRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.CreateTrickIdeaSchema.CreateTrickIdeaRequestType CreateTrickIdeaRequest;
		
		protected void load_CreateTrickIdeaRequest(XMLElement xml) {
			this.CreateTrickIdeaRequest = parseComplex(xml, "CreateTrickIdeaRequest", "wse:CreateTrickIdea", wse.generated.definitions.CreateTrickIdeaSchema.CreateTrickIdeaRequestType.class, true);
		}
		protected void create_CreateTrickIdeaRequest(XMLElement xml) {
			printComplex(xml, "CreateTrickIdeaRequest", "wse:CreateTrickIdea", this.CreateTrickIdeaRequest, true);
		}
		public void load(XMLElement xml) {
			try {
				load_CreateTrickIdeaRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:CreateTrickIdea':'CreateTrickIdeaRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_CreateTrickIdeaRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:CreateTrickIdea':'CreateTrickIdeaRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public CreateTrickIdeaRequestMessage(CreateTrickIdeaRequestMessage copy) { load(copy); }
		public void load(CreateTrickIdeaRequestMessage copy) {
			if (copy == null) return;
			this.CreateTrickIdeaRequest = copy.CreateTrickIdeaRequest;
		}
		public CreateTrickIdeaRequestMessage CreateTrickIdeaRequest(wse.generated.definitions.CreateTrickIdeaSchema.CreateTrickIdeaRequestType CreateTrickIdeaRequest){ this.CreateTrickIdeaRequest = CreateTrickIdeaRequest; return this;}
		public CreateTrickIdeaRequestMessage() {}
		public CreateTrickIdeaRequestMessage(XMLElement xml) { this.load(xml); }
		public CreateTrickIdeaRequestMessage(
			wse.generated.definitions.CreateTrickIdeaSchema.CreateTrickIdeaRequestType CreateTrickIdeaRequest
			) {
			this.CreateTrickIdeaRequest = CreateTrickIdeaRequest;
		}
		// Additional
	} // class CreateTrickIdeaRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #CreateTrickIdeaResponse} <ul><b>Type:</b> wse.generated.definitions.CreateTrickIdeaSchema.CreateTrickIdeaResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class CreateTrickIdeaResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.CreateTrickIdeaSchema.CreateTrickIdeaResponseType CreateTrickIdeaResponse;
		
		protected void load_CreateTrickIdeaResponse(XMLElement xml) {
			this.CreateTrickIdeaResponse = parseComplex(xml, "CreateTrickIdeaResponse", "wse:CreateTrickIdea", wse.generated.definitions.CreateTrickIdeaSchema.CreateTrickIdeaResponseType.class, true);
		}
		protected void create_CreateTrickIdeaResponse(XMLElement xml) {
			printComplex(xml, "CreateTrickIdeaResponse", "wse:CreateTrickIdea", this.CreateTrickIdeaResponse, true);
		}
		public void load(XMLElement xml) {
			try {
				load_CreateTrickIdeaResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:CreateTrickIdea':'CreateTrickIdeaResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_CreateTrickIdeaResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:CreateTrickIdea':'CreateTrickIdeaResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public CreateTrickIdeaResponseMessage(CreateTrickIdeaResponseMessage copy) { load(copy); }
		public void load(CreateTrickIdeaResponseMessage copy) {
			if (copy == null) return;
			this.CreateTrickIdeaResponse = copy.CreateTrickIdeaResponse;
		}
		public CreateTrickIdeaResponseMessage CreateTrickIdeaResponse(wse.generated.definitions.CreateTrickIdeaSchema.CreateTrickIdeaResponseType CreateTrickIdeaResponse){ this.CreateTrickIdeaResponse = CreateTrickIdeaResponse; return this;}
		public CreateTrickIdeaResponseMessage() {}
		public CreateTrickIdeaResponseMessage(XMLElement xml) { this.load(xml); }
		public CreateTrickIdeaResponseMessage(
			wse.generated.definitions.CreateTrickIdeaSchema.CreateTrickIdeaResponseType CreateTrickIdeaResponse
			) {
			this.CreateTrickIdeaResponse = CreateTrickIdeaResponse;
		}
		// Additional
	} // class CreateTrickIdeaResponseMessage
	protected static final class PT_CreateTrickIdeaPort {
		private PT_CreateTrickIdeaPort(){}
		protected static class CreateTrickIdea extends wse.utils.WrappedOperation<
		wse.generated.definitions.CreateTrickIdeaWsdl.CreateTrickIdeaRequestMessage,
		wse.generated.definitions.CreateTrickIdeaSchema.CreateTrickIdeaRequestType,
		wse.generated.definitions.CreateTrickIdeaWsdl.CreateTrickIdeaResponseMessage,
		wse.generated.definitions.CreateTrickIdeaSchema.CreateTrickIdeaResponseType
		> {
			public CreateTrickIdea(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.CreateTrickIdeaWsdl.CreateTrickIdeaResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.CreateTrickIdeaWsdl.CreateTrickIdeaRequestMessage wrapInput(wse.generated.definitions.CreateTrickIdeaSchema.CreateTrickIdeaRequestType input) {
				return new wse.generated.definitions.CreateTrickIdeaWsdl.CreateTrickIdeaRequestMessage(input);
			}
			protected final wse.generated.definitions.CreateTrickIdeaSchema.CreateTrickIdeaResponseType unwrapOutput(wse.generated.definitions.CreateTrickIdeaWsdl.CreateTrickIdeaResponseMessage output) {
				return output.CreateTrickIdeaResponse;
			}
		}
	}
	public static final class B_CreateTrickIdeaBinding {
		private B_CreateTrickIdeaBinding(){}
		public static class CreateTrickIdea extends wse.generated.definitions.CreateTrickIdeaWsdl.PT_CreateTrickIdeaPort.CreateTrickIdea {
			protected CreateTrickIdea(String uri) {
				super("wse:CreateTrickIdea", uri);
			}
		}
	}
}
