/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 9 December 2021 16:32:15 +0100
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.internal.IElement;

public class RemoveDrinkSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #sessionID} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #drinkName} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class RemoveDrinkRequest extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String sessionID;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String drinkName;
		
		protected void load_sessionID(IElement xml) {
			this.sessionID = parse(xml, "sessionID", "wse:RemoveDrink", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_sessionID(IElement xml) {
			print(xml, "sessionID", "wse:RemoveDrink", this.sessionID, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_drinkName(IElement xml) {
			this.drinkName = parse(xml, "drinkName", "wse:RemoveDrink", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_drinkName(IElement xml) {
			print(xml, "drinkName", "wse:RemoveDrink", this.drinkName, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		public void load(IElement xml) {
			try {
				load_sessionID(xml);
				load_drinkName(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:RemoveDrink':'RemoveDrinkRequest':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_sessionID(xml);
				create_drinkName(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:RemoveDrink':'RemoveDrinkRequest':\n" + e.getMessage(), e);
			}
		}
		public RemoveDrinkRequest(RemoveDrinkRequest copy) { load(copy); }
		public void load(RemoveDrinkRequest copy) {
			if (copy == null) return;
			this.sessionID = copy.sessionID;
			this.drinkName = copy.drinkName;
		}
		public RemoveDrinkRequest sessionID(String sessionID){ this.sessionID = sessionID; return this;}
		public RemoveDrinkRequest drinkName(String drinkName){ this.drinkName = drinkName; return this;}
		public RemoveDrinkRequest() {}
		public RemoveDrinkRequest(IElement xml) { this.load(xml); }
		public RemoveDrinkRequest(
			String sessionID,
			String drinkName
			) {
			this.sessionID = sessionID;
			this.drinkName = drinkName;
		}
		// Additional
	} // class RemoveDrinkRequest
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class RemoveDrinkResponse extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		
		protected void load_status(IElement xml) {
			this.status = parse(xml, "status", "wse:RemoveDrink", wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void create_status(IElement xml) {
			print(xml, "status", "wse:RemoveDrink", this.status, wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		public void load(IElement xml) {
			try {
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:RemoveDrink':'RemoveDrinkResponse':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:RemoveDrink':'RemoveDrinkResponse':\n" + e.getMessage(), e);
			}
		}
		public RemoveDrinkResponse(RemoveDrinkResponse copy) { load(copy); }
		public void load(RemoveDrinkResponse copy) {
			if (copy == null) return;
			this.status = copy.status;
		}
		public RemoveDrinkResponse status(Integer status){ this.status = status; return this;}
		public RemoveDrinkResponse() {}
		public RemoveDrinkResponse(IElement xml) { this.load(xml); }
		public RemoveDrinkResponse(
			Integer status
			) {
			this.status = status;
		}
		// Additional
	} // class RemoveDrinkResponse
	
}
