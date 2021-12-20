/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public class CreateDogAccountSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #dogAccount} <ul><b>Type:</b> wse.generated.definitions.Turbo_DBSchema.DogAccount <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class CreateDogAccountRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.Turbo_DBSchema.DogAccount dogAccount;
		
		protected void load_dogAccount(XMLElement xml) {
			this.dogAccount = parseComplex(xml, "dogAccount", "wse:CreateDogAccount", wse.generated.definitions.Turbo_DBSchema.DogAccount.class, true);
		}
		protected void create_dogAccount(XMLElement xml) {
			printComplex(xml, "dogAccount", "wse:CreateDogAccount", this.dogAccount, true);
		}
		public void load(XMLElement xml) {
			try {
				load_dogAccount(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:CreateDogAccount':'CreateDogAccountRequestType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_dogAccount(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:CreateDogAccount':'CreateDogAccountRequestType':\n" + e.getMessage(), e);
			}
		}
		public CreateDogAccountRequestType(CreateDogAccountRequestType copy) { load(copy); }
		public void load(CreateDogAccountRequestType copy) {
			if (copy == null) return;
			this.dogAccount = copy.dogAccount;
		}
		public CreateDogAccountRequestType dogAccount(wse.generated.definitions.Turbo_DBSchema.DogAccount dogAccount){ this.dogAccount = dogAccount; return this;}
		public CreateDogAccountRequestType() {}
		public CreateDogAccountRequestType(XMLElement xml) { this.load(xml); }
		public CreateDogAccountRequestType(
			wse.generated.definitions.Turbo_DBSchema.DogAccount dogAccount
			) {
			this.dogAccount = dogAccount;
		}
		// Additional
	} // class CreateDogAccountRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class CreateDogAccountResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		
		protected void load_status(XMLElement xml) {
			this.status = parse(xml, "status", "wse:CreateDogAccount", wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void create_status(XMLElement xml) {
			print(xml, "status", "wse:CreateDogAccount", this.status, wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		public void load(XMLElement xml) {
			try {
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:CreateDogAccount':'CreateDogAccountResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:CreateDogAccount':'CreateDogAccountResponseType':\n" + e.getMessage(), e);
			}
		}
		public CreateDogAccountResponseType(CreateDogAccountResponseType copy) { load(copy); }
		public void load(CreateDogAccountResponseType copy) {
			if (copy == null) return;
			this.status = copy.status;
		}
		public CreateDogAccountResponseType status(Integer status){ this.status = status; return this;}
		public CreateDogAccountResponseType() {}
		public CreateDogAccountResponseType(XMLElement xml) { this.load(xml); }
		public CreateDogAccountResponseType(
			Integer status
			) {
			this.status = status;
		}
		// Additional
	} // class CreateDogAccountResponseType
	
}
