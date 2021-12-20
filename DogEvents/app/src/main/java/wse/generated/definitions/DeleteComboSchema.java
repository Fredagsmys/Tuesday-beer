/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public class DeleteComboSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #comboID} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #sessionID} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class DeleteComboRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String comboID;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String sessionID;
		
		protected void load_comboID(XMLElement xml) {
			this.comboID = parse(xml, "comboID", "wse:DeleteCombo", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_comboID(XMLElement xml) {
			print(xml, "comboID", "wse:DeleteCombo", this.comboID, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_sessionID(XMLElement xml) {
			this.sessionID = parse(xml, "sessionID", "wse:DeleteCombo", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_sessionID(XMLElement xml) {
			print(xml, "sessionID", "wse:DeleteCombo", this.sessionID, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		public void load(XMLElement xml) {
			try {
				load_comboID(xml);
				load_sessionID(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:DeleteCombo':'DeleteComboRequestType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_comboID(xml);
				create_sessionID(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:DeleteCombo':'DeleteComboRequestType':\n" + e.getMessage(), e);
			}
		}
		public DeleteComboRequestType(DeleteComboRequestType copy) { load(copy); }
		public void load(DeleteComboRequestType copy) {
			if (copy == null) return;
			this.comboID = copy.comboID;
			this.sessionID = copy.sessionID;
		}
		public DeleteComboRequestType comboID(String comboID){ this.comboID = comboID; return this;}
		public DeleteComboRequestType sessionID(String sessionID){ this.sessionID = sessionID; return this;}
		public DeleteComboRequestType() {}
		public DeleteComboRequestType(XMLElement xml) { this.load(xml); }
		public DeleteComboRequestType(
			String comboID,
			String sessionID
			) {
			this.comboID = comboID;
			this.sessionID = sessionID;
		}
		// Additional
	} // class DeleteComboRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class DeleteComboResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		
		protected void load_status(XMLElement xml) {
			this.status = parse(xml, "status", "wse:DeleteCombo", wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void create_status(XMLElement xml) {
			print(xml, "status", "wse:DeleteCombo", this.status, wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		public void load(XMLElement xml) {
			try {
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:DeleteCombo':'DeleteComboResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:DeleteCombo':'DeleteComboResponseType':\n" + e.getMessage(), e);
			}
		}
		public DeleteComboResponseType(DeleteComboResponseType copy) { load(copy); }
		public void load(DeleteComboResponseType copy) {
			if (copy == null) return;
			this.status = copy.status;
		}
		public DeleteComboResponseType status(Integer status){ this.status = status; return this;}
		public DeleteComboResponseType() {}
		public DeleteComboResponseType(XMLElement xml) { this.load(xml); }
		public DeleteComboResponseType(
			Integer status
			) {
			this.status = status;
		}
		// Additional
	} // class DeleteComboResponseType
	
}
