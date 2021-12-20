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

public class CreateDrinkSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #sessionID} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #Drink} <ul><b>Type:</b> wse.generated.definitions.Drink_DBSchema.Drink <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class CreateDrinkRequest extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String sessionID;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.Drink_DBSchema.Drink Drink;
		
		protected void load_sessionID(IElement xml) {
			this.sessionID = parse(xml, "sessionID", "wse:CreateDrink", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_sessionID(IElement xml) {
			print(xml, "sessionID", "wse:CreateDrink", this.sessionID, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_Drink(IElement xml) {
			this.Drink = parseComplex(xml, "Drink", "wse:CreateDrink", wse.generated.definitions.Drink_DBSchema.Drink.class, true);
		}
		protected void create_Drink(IElement xml) {
			printComplex(xml, "Drink", "wse:CreateDrink", this.Drink, true);
		}
		public void load(IElement xml) {
			try {
				load_sessionID(xml);
				load_Drink(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:CreateDrink':'CreateDrinkRequest':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_sessionID(xml);
				create_Drink(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:CreateDrink':'CreateDrinkRequest':\n" + e.getMessage(), e);
			}
		}
		public CreateDrinkRequest(CreateDrinkRequest copy) { load(copy); }
		public void load(CreateDrinkRequest copy) {
			if (copy == null) return;
			this.sessionID = copy.sessionID;
			this.Drink = copy.Drink;
		}
		public CreateDrinkRequest sessionID(String sessionID){ this.sessionID = sessionID; return this;}
		public CreateDrinkRequest Drink(wse.generated.definitions.Drink_DBSchema.Drink Drink){ this.Drink = Drink; return this;}
		public CreateDrinkRequest() {}
		public CreateDrinkRequest(IElement xml) { this.load(xml); }
		public CreateDrinkRequest(
			String sessionID,
			wse.generated.definitions.Drink_DBSchema.Drink Drink
			) {
			this.sessionID = sessionID;
			this.Drink = Drink;
		}
		// Additional
	} // class CreateDrinkRequest
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class CreateDrinkResponse extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		
		protected void load_status(IElement xml) {
			this.status = parse(xml, "status", "wse:CreateDrink", wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void create_status(IElement xml) {
			print(xml, "status", "wse:CreateDrink", this.status, wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		public void load(IElement xml) {
			try {
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:CreateDrink':'CreateDrinkResponse':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:CreateDrink':'CreateDrinkResponse':\n" + e.getMessage(), e);
			}
		}
		public CreateDrinkResponse(CreateDrinkResponse copy) { load(copy); }
		public void load(CreateDrinkResponse copy) {
			if (copy == null) return;
			this.status = copy.status;
		}
		public CreateDrinkResponse status(Integer status){ this.status = status; return this;}
		public CreateDrinkResponse() {}
		public CreateDrinkResponse(IElement xml) { this.load(xml); }
		public CreateDrinkResponse(
			Integer status
			) {
			this.status = status;
		}
		// Additional
	} // class CreateDrinkResponse
	
}
