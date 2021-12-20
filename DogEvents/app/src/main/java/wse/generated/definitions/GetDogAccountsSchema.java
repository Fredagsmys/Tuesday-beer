/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public class GetDogAccountsSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #username} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetDogAccountsRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String username;
		
		protected void load_username(XMLElement xml) {
			this.username = parse(xml, "username", "wse:GetDogAccounts", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_username(XMLElement xml) {
			print(xml, "username", "wse:GetDogAccounts", this.username, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		public void load(XMLElement xml) {
			try {
				load_username(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetDogAccounts':'GetDogAccountsRequestType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_username(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetDogAccounts':'GetDogAccountsRequestType':\n" + e.getMessage(), e);
			}
		}
		public GetDogAccountsRequestType(GetDogAccountsRequestType copy) { load(copy); }
		public void load(GetDogAccountsRequestType copy) {
			if (copy == null) return;
			this.username = copy.username;
		}
		public GetDogAccountsRequestType username(String username){ this.username = username; return this;}
		public GetDogAccountsRequestType() {}
		public GetDogAccountsRequestType(XMLElement xml) { this.load(xml); }
		public GetDogAccountsRequestType(
			String username
			) {
			this.username = username;
		}
		// Additional
	} // class GetDogAccountsRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #dogAccounts} <ul><b>Type:</b> java.util.List&lt;wse.generated.definitions.Turbo_DBSchema.DogAccount&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetDogAccountsResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<wse.generated.definitions.Turbo_DBSchema.DogAccount> dogAccounts;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		
		protected void load_dogAccounts(XMLElement xml) {
			this.dogAccounts = parseComplexList(xml, "dogAccounts", "wse:GetDogAccounts", wse.generated.definitions.Turbo_DBSchema.DogAccount.class, 0, null);
		}
		protected void create_dogAccounts(XMLElement xml) {
			printComplexList(xml, "dogAccounts", "wse:GetDogAccounts", this.dogAccounts, 0, null);
		}
		protected void load_status(XMLElement xml) {
			this.status = parse(xml, "status", "wse:GetDogAccounts", wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void create_status(XMLElement xml) {
			print(xml, "status", "wse:GetDogAccounts", this.status, wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		public void load(XMLElement xml) {
			try {
				load_dogAccounts(xml);
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetDogAccounts':'GetDogAccountsResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_dogAccounts(xml);
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetDogAccounts':'GetDogAccountsResponseType':\n" + e.getMessage(), e);
			}
		}
		public GetDogAccountsResponseType(GetDogAccountsResponseType copy) { load(copy); }
		public void load(GetDogAccountsResponseType copy) {
			if (copy == null) return;
			this.dogAccounts = copy.dogAccounts;
			this.status = copy.status;
		}
		public GetDogAccountsResponseType dogAccounts(java.util.List<wse.generated.definitions.Turbo_DBSchema.DogAccount> dogAccounts){ this.dogAccounts = dogAccounts; return this;}
		public GetDogAccountsResponseType status(Integer status){ this.status = status; return this;}
		public GetDogAccountsResponseType() {}
		public GetDogAccountsResponseType(XMLElement xml) { this.load(xml); }
		public GetDogAccountsResponseType(
			java.util.List<wse.generated.definitions.Turbo_DBSchema.DogAccount> dogAccounts,
			Integer status
			) {
			this.dogAccounts = dogAccounts;
			this.status = status;
		}
		// Additional
	} // class GetDogAccountsResponseType
	
}
