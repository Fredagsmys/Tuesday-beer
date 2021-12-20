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

public class GetMyDrinksSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #sessionID} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetMyDrinksRequest extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String sessionID;
		
		protected void load_sessionID(IElement xml) {
			this.sessionID = parse(xml, "sessionID", "wse:GetMyDrinks", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_sessionID(IElement xml) {
			print(xml, "sessionID", "wse:GetMyDrinks", this.sessionID, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		public void load(IElement xml) {
			try {
				load_sessionID(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetMyDrinks':'GetMyDrinksRequest':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_sessionID(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetMyDrinks':'GetMyDrinksRequest':\n" + e.getMessage(), e);
			}
		}
		public GetMyDrinksRequest(GetMyDrinksRequest copy) { load(copy); }
		public void load(GetMyDrinksRequest copy) {
			if (copy == null) return;
			this.sessionID = copy.sessionID;
		}
		public GetMyDrinksRequest sessionID(String sessionID){ this.sessionID = sessionID; return this;}
		public GetMyDrinksRequest() {}
		public GetMyDrinksRequest(IElement xml) { this.load(xml); }
		public GetMyDrinksRequest(
			String sessionID
			) {
			this.sessionID = sessionID;
		}
		// Additional
	} // class GetMyDrinksRequest
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #drinks} <ul><b>Type:</b> java.util.List&lt;wse.generated.definitions.Drink_DBSchema.Drink&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetMyDrinksResponse extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<wse.generated.definitions.Drink_DBSchema.Drink> drinks;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		
		protected void load_drinks(IElement xml) {
			this.drinks = parseComplexList(xml, "drinks", "wse:GetMyDrinks", wse.generated.definitions.Drink_DBSchema.Drink.class, 0, null);
		}
		protected void create_drinks(IElement xml) {
			printComplexList(xml, "drinks", "wse:GetMyDrinks", this.drinks, 0, null);
		}
		protected void load_status(IElement xml) {
			this.status = parse(xml, "status", "wse:GetMyDrinks", wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void create_status(IElement xml) {
			print(xml, "status", "wse:GetMyDrinks", this.status, wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		public void load(IElement xml) {
			try {
				load_drinks(xml);
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetMyDrinks':'GetMyDrinksResponse':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_drinks(xml);
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetMyDrinks':'GetMyDrinksResponse':\n" + e.getMessage(), e);
			}
		}
		public GetMyDrinksResponse(GetMyDrinksResponse copy) { load(copy); }
		public void load(GetMyDrinksResponse copy) {
			if (copy == null) return;
			this.drinks = copy.drinks;
			this.status = copy.status;
		}
		public GetMyDrinksResponse drinks(java.util.List<wse.generated.definitions.Drink_DBSchema.Drink> drinks){ this.drinks = drinks; return this;}
		public GetMyDrinksResponse status(Integer status){ this.status = status; return this;}
		public GetMyDrinksResponse() {}
		public GetMyDrinksResponse(IElement xml) { this.load(xml); }
		public GetMyDrinksResponse(
			java.util.List<wse.generated.definitions.Drink_DBSchema.Drink> drinks,
			Integer status
			) {
			this.drinks = drinks;
			this.status = status;
		}
		// Additional
	} // class GetMyDrinksResponse
	
}
