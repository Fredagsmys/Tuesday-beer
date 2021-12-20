/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public class SaveComboSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #sessionID} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #combo} <ul><b>Type:</b> wse.generated.definitions.Turbo_DBSchema.Combo <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class SaveComboRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String sessionID;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.Turbo_DBSchema.Combo combo;
		
		protected void load_sessionID(XMLElement xml) {
			this.sessionID = parse(xml, "sessionID", "wse:SaveCombo", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_sessionID(XMLElement xml) {
			print(xml, "sessionID", "wse:SaveCombo", this.sessionID, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_combo(XMLElement xml) {
			this.combo = parseComplex(xml, "combo", "wse:SaveCombo", wse.generated.definitions.Turbo_DBSchema.Combo.class, true);
		}
		protected void create_combo(XMLElement xml) {
			printComplex(xml, "combo", "wse:SaveCombo", this.combo, true);
		}
		public void load(XMLElement xml) {
			try {
				load_sessionID(xml);
				load_combo(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:SaveCombo':'SaveComboRequestType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_sessionID(xml);
				create_combo(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:SaveCombo':'SaveComboRequestType':\n" + e.getMessage(), e);
			}
		}
		public SaveComboRequestType(SaveComboRequestType copy) { load(copy); }
		public void load(SaveComboRequestType copy) {
			if (copy == null) return;
			this.sessionID = copy.sessionID;
			this.combo = copy.combo;
		}
		public SaveComboRequestType sessionID(String sessionID){ this.sessionID = sessionID; return this;}
		public SaveComboRequestType combo(wse.generated.definitions.Turbo_DBSchema.Combo combo){ this.combo = combo; return this;}
		public SaveComboRequestType() {}
		public SaveComboRequestType(XMLElement xml) { this.load(xml); }
		public SaveComboRequestType(
			String sessionID,
			wse.generated.definitions.Turbo_DBSchema.Combo combo
			) {
			this.sessionID = sessionID;
			this.combo = combo;
		}
		// Additional
	} // class SaveComboRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class SaveComboResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		
		protected void load_status(XMLElement xml) {
			this.status = parse(xml, "status", "wse:SaveCombo", wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void create_status(XMLElement xml) {
			print(xml, "status", "wse:SaveCombo", this.status, wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		public void load(XMLElement xml) {
			try {
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:SaveCombo':'SaveComboResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:SaveCombo':'SaveComboResponseType':\n" + e.getMessage(), e);
			}
		}
		public SaveComboResponseType(SaveComboResponseType copy) { load(copy); }
		public void load(SaveComboResponseType copy) {
			if (copy == null) return;
			this.status = copy.status;
		}
		public SaveComboResponseType status(Integer status){ this.status = status; return this;}
		public SaveComboResponseType() {}
		public SaveComboResponseType(XMLElement xml) { this.load(xml); }
		public SaveComboResponseType(
			Integer status
			) {
			this.status = status;
		}
		// Additional
	} // class SaveComboResponseType
	
}
