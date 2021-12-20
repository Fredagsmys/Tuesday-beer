/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public final class CreateDogUserWsdl {
	private CreateDogUserWsdl(){}
	public static class Schema {
		
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #CreateDogUserRequest} <ul><b>Type:</b> wse.generated.definitions.CreateDogUserSchema.CreateDogUserRequestType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class CreateDogUserRequestMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.CreateDogUserSchema.CreateDogUserRequestType CreateDogUserRequest;
		
		protected void load_CreateDogUserRequest(XMLElement xml) {
			this.CreateDogUserRequest = parseComplex(xml, "CreateDogUserRequest", "wse:CreateDogUser", wse.generated.definitions.CreateDogUserSchema.CreateDogUserRequestType.class, true);
		}
		protected void create_CreateDogUserRequest(XMLElement xml) {
			printComplex(xml, "CreateDogUserRequest", "wse:CreateDogUser", this.CreateDogUserRequest, true);
		}
		public void load(XMLElement xml) {
			try {
				load_CreateDogUserRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:CreateDogUser':'CreateDogUserRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_CreateDogUserRequest(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:CreateDogUser':'CreateDogUserRequestMessage':\n" + e.getMessage(), e);
			}
		}
		public CreateDogUserRequestMessage(CreateDogUserRequestMessage copy) { load(copy); }
		public void load(CreateDogUserRequestMessage copy) {
			if (copy == null) return;
			this.CreateDogUserRequest = copy.CreateDogUserRequest;
		}
		public CreateDogUserRequestMessage CreateDogUserRequest(wse.generated.definitions.CreateDogUserSchema.CreateDogUserRequestType CreateDogUserRequest){ this.CreateDogUserRequest = CreateDogUserRequest; return this;}
		public CreateDogUserRequestMessage() {}
		public CreateDogUserRequestMessage(XMLElement xml) { this.load(xml); }
		public CreateDogUserRequestMessage(
			wse.generated.definitions.CreateDogUserSchema.CreateDogUserRequestType CreateDogUserRequest
			) {
			this.CreateDogUserRequest = CreateDogUserRequest;
		}
		// Additional
	} // class CreateDogUserRequestMessage
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #CreateDogUserResponse} <ul><b>Type:</b> wse.generated.definitions.CreateDogUserSchema.CreateDogUserResponseType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class CreateDogUserResponseMessage extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.CreateDogUserSchema.CreateDogUserResponseType CreateDogUserResponse;
		
		protected void load_CreateDogUserResponse(XMLElement xml) {
			this.CreateDogUserResponse = parseComplex(xml, "CreateDogUserResponse", "wse:CreateDogUser", wse.generated.definitions.CreateDogUserSchema.CreateDogUserResponseType.class, true);
		}
		protected void create_CreateDogUserResponse(XMLElement xml) {
			printComplex(xml, "CreateDogUserResponse", "wse:CreateDogUser", this.CreateDogUserResponse, true);
		}
		public void load(XMLElement xml) {
			try {
				load_CreateDogUserResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:CreateDogUser':'CreateDogUserResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_CreateDogUserResponse(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:CreateDogUser':'CreateDogUserResponseMessage':\n" + e.getMessage(), e);
			}
		}
		public CreateDogUserResponseMessage(CreateDogUserResponseMessage copy) { load(copy); }
		public void load(CreateDogUserResponseMessage copy) {
			if (copy == null) return;
			this.CreateDogUserResponse = copy.CreateDogUserResponse;
		}
		public CreateDogUserResponseMessage CreateDogUserResponse(wse.generated.definitions.CreateDogUserSchema.CreateDogUserResponseType CreateDogUserResponse){ this.CreateDogUserResponse = CreateDogUserResponse; return this;}
		public CreateDogUserResponseMessage() {}
		public CreateDogUserResponseMessage(XMLElement xml) { this.load(xml); }
		public CreateDogUserResponseMessage(
			wse.generated.definitions.CreateDogUserSchema.CreateDogUserResponseType CreateDogUserResponse
			) {
			this.CreateDogUserResponse = CreateDogUserResponse;
		}
		// Additional
	} // class CreateDogUserResponseMessage
	protected static final class PT_CreateDogUserPort {
		private PT_CreateDogUserPort(){}
		protected static class CreateDogUser extends wse.utils.WrappedOperation<
		wse.generated.definitions.CreateDogUserWsdl.CreateDogUserRequestMessage,
		wse.generated.definitions.CreateDogUserSchema.CreateDogUserRequestType,
		wse.generated.definitions.CreateDogUserWsdl.CreateDogUserResponseMessage,
		wse.generated.definitions.CreateDogUserSchema.CreateDogUserResponseType
		> {
			public CreateDogUser(String defaultSoapAction, String defaultURI) {
				super(wse.generated.definitions.CreateDogUserWsdl.CreateDogUserResponseMessage.class, defaultSoapAction, defaultURI);
			}
			protected final wse.generated.definitions.CreateDogUserWsdl.CreateDogUserRequestMessage wrapInput(wse.generated.definitions.CreateDogUserSchema.CreateDogUserRequestType input) {
				return new wse.generated.definitions.CreateDogUserWsdl.CreateDogUserRequestMessage(input);
			}
			protected final wse.generated.definitions.CreateDogUserSchema.CreateDogUserResponseType unwrapOutput(wse.generated.definitions.CreateDogUserWsdl.CreateDogUserResponseMessage output) {
				return output.CreateDogUserResponse;
			}
		}
	}
	public static final class B_CreateDogUserBinding {
		private B_CreateDogUserBinding(){}
		public static class CreateDogUser extends wse.generated.definitions.CreateDogUserWsdl.PT_CreateDogUserPort.CreateDogUser {
			protected CreateDogUser(String uri) {
				super("wse:CreateDogUser", uri);
			}
		}
	}
}
