/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public class GetCombosSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #sessionID} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetCombosRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String sessionID;
		
		protected void load_sessionID(XMLElement xml) {
			this.sessionID = parse(xml, "sessionID", "wse:GetCombos", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_sessionID(XMLElement xml) {
			print(xml, "sessionID", "wse:GetCombos", this.sessionID, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		public void load(XMLElement xml) {
			try {
				load_sessionID(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetCombos':'GetCombosRequestType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_sessionID(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetCombos':'GetCombosRequestType':\n" + e.getMessage(), e);
			}
		}
		public GetCombosRequestType(GetCombosRequestType copy) { load(copy); }
		public void load(GetCombosRequestType copy) {
			if (copy == null) return;
			this.sessionID = copy.sessionID;
		}
		public GetCombosRequestType sessionID(String sessionID){ this.sessionID = sessionID; return this;}
		public GetCombosRequestType() {}
		public GetCombosRequestType(XMLElement xml) { this.load(xml); }
		public GetCombosRequestType(
			String sessionID
			) {
			this.sessionID = sessionID;
		}
		// Additional
	} // class GetCombosRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #combos} <ul><b>Type:</b> java.util.List&lt;wse.generated.definitions.Turbo_DBSchema.Combo&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetCombosResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<wse.generated.definitions.Turbo_DBSchema.Combo> combos;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		
		protected void load_combos(XMLElement xml) {
			this.combos = parseComplexList(xml, "combos", "wse:GetCombos", wse.generated.definitions.Turbo_DBSchema.Combo.class, 0, null);
		}
		protected void create_combos(XMLElement xml) {
			printComplexList(xml, "combos", "wse:GetCombos", this.combos, 0, null);
		}
		protected void load_status(XMLElement xml) {
			this.status = parse(xml, "status", "wse:GetCombos", wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void create_status(XMLElement xml) {
			print(xml, "status", "wse:GetCombos", this.status, wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		public void load(XMLElement xml) {
			try {
				load_combos(xml);
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetCombos':'GetCombosResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_combos(xml);
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetCombos':'GetCombosResponseType':\n" + e.getMessage(), e);
			}
		}
		public GetCombosResponseType(GetCombosResponseType copy) { load(copy); }
		public void load(GetCombosResponseType copy) {
			if (copy == null) return;
			this.combos = copy.combos;
			this.status = copy.status;
		}
		public GetCombosResponseType combos(java.util.List<wse.generated.definitions.Turbo_DBSchema.Combo> combos){ this.combos = combos; return this;}
		public GetCombosResponseType status(Integer status){ this.status = status; return this;}
		public GetCombosResponseType() {}
		public GetCombosResponseType(XMLElement xml) { this.load(xml); }
		public GetCombosResponseType(
			java.util.List<wse.generated.definitions.Turbo_DBSchema.Combo> combos,
			Integer status
			) {
			this.combos = combos;
			this.status = status;
		}
		// Additional
	} // class GetCombosResponseType
	
}
