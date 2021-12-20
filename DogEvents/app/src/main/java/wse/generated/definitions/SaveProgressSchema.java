/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public class SaveProgressSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #sessionID} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #trick} <ul><b>Type:</b> wse.generated.definitions.Turbo_DBSchema.Trick <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class SaveProgressRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String sessionID;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.Turbo_DBSchema.Trick trick;
		
		protected void load_sessionID(XMLElement xml) {
			this.sessionID = parse(xml, "sessionID", "wse:SaveProgress", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_sessionID(XMLElement xml) {
			print(xml, "sessionID", "wse:SaveProgress", this.sessionID, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_trick(XMLElement xml) {
			this.trick = parseComplex(xml, "trick", "wse:SaveProgress", wse.generated.definitions.Turbo_DBSchema.Trick.class, true);
		}
		protected void create_trick(XMLElement xml) {
			printComplex(xml, "trick", "wse:SaveProgress", this.trick, true);
		}
		public void load(XMLElement xml) {
			try {
				load_sessionID(xml);
				load_trick(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:SaveProgress':'SaveProgressRequestType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_sessionID(xml);
				create_trick(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:SaveProgress':'SaveProgressRequestType':\n" + e.getMessage(), e);
			}
		}
		public SaveProgressRequestType(SaveProgressRequestType copy) { load(copy); }
		public void load(SaveProgressRequestType copy) {
			if (copy == null) return;
			this.sessionID = copy.sessionID;
			this.trick = copy.trick;
		}
		public SaveProgressRequestType sessionID(String sessionID){ this.sessionID = sessionID; return this;}
		public SaveProgressRequestType trick(wse.generated.definitions.Turbo_DBSchema.Trick trick){ this.trick = trick; return this;}
		public SaveProgressRequestType() {}
		public SaveProgressRequestType(XMLElement xml) { this.load(xml); }
		public SaveProgressRequestType(
			String sessionID,
			wse.generated.definitions.Turbo_DBSchema.Trick trick
			) {
			this.sessionID = sessionID;
			this.trick = trick;
		}
		// Additional
	} // class SaveProgressRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class SaveProgressResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		
		protected void load_status(XMLElement xml) {
			this.status = parse(xml, "status", "wse:SaveProgress", wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void create_status(XMLElement xml) {
			print(xml, "status", "wse:SaveProgress", this.status, wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		public void load(XMLElement xml) {
			try {
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:SaveProgress':'SaveProgressResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:SaveProgress':'SaveProgressResponseType':\n" + e.getMessage(), e);
			}
		}
		public SaveProgressResponseType(SaveProgressResponseType copy) { load(copy); }
		public void load(SaveProgressResponseType copy) {
			if (copy == null) return;
			this.status = copy.status;
		}
		public SaveProgressResponseType status(Integer status){ this.status = status; return this;}
		public SaveProgressResponseType() {}
		public SaveProgressResponseType(XMLElement xml) { this.load(xml); }
		public SaveProgressResponseType(
			Integer status
			) {
			this.status = status;
		}
		// Additional
	} // class SaveProgressResponseType
	
}
