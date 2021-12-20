/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public class EditTrickStateSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #trick} <ul><b>Type:</b> wse.generated.definitions.Turbo_DBSchema.Trick <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #sessionID} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class EditTrickStateRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.Turbo_DBSchema.Trick trick;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String sessionID;
		
		protected void load_trick(XMLElement xml) {
			this.trick = parseComplex(xml, "trick", "wse:EditTrickState", wse.generated.definitions.Turbo_DBSchema.Trick.class, true);
		}
		protected void create_trick(XMLElement xml) {
			printComplex(xml, "trick", "wse:EditTrickState", this.trick, true);
		}
		protected void load_sessionID(XMLElement xml) {
			this.sessionID = parse(xml, "sessionID", "wse:EditTrickState", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_sessionID(XMLElement xml) {
			print(xml, "sessionID", "wse:EditTrickState", this.sessionID, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		public void load(XMLElement xml) {
			try {
				load_trick(xml);
				load_sessionID(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:EditTrickState':'EditTrickStateRequestType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_trick(xml);
				create_sessionID(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:EditTrickState':'EditTrickStateRequestType':\n" + e.getMessage(), e);
			}
		}
		public EditTrickStateRequestType(EditTrickStateRequestType copy) { load(copy); }
		public void load(EditTrickStateRequestType copy) {
			if (copy == null) return;
			this.trick = copy.trick;
			this.sessionID = copy.sessionID;
		}
		public EditTrickStateRequestType trick(wse.generated.definitions.Turbo_DBSchema.Trick trick){ this.trick = trick; return this;}
		public EditTrickStateRequestType sessionID(String sessionID){ this.sessionID = sessionID; return this;}
		public EditTrickStateRequestType() {}
		public EditTrickStateRequestType(XMLElement xml) { this.load(xml); }
		public EditTrickStateRequestType(
			wse.generated.definitions.Turbo_DBSchema.Trick trick,
			String sessionID
			) {
			this.trick = trick;
			this.sessionID = sessionID;
		}
		// Additional
	} // class EditTrickStateRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #trickamt} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class EditTrickStateResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer trickamt;
		
		protected void load_status(XMLElement xml) {
			this.status = parse(xml, "status", "wse:EditTrickState", wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void create_status(XMLElement xml) {
			print(xml, "status", "wse:EditTrickState", this.status, wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void load_trickamt(XMLElement xml) {
			this.trickamt = parse(xml, "trickamt", "wse:EditTrickState", wse.utils.types.xsd.xsd_int.class, true, null);
		}
		protected void create_trickamt(XMLElement xml) {
			print(xml, "trickamt", "wse:EditTrickState", this.trickamt, wse.utils.types.xsd.xsd_int.class, true, null);
		}
		public void load(XMLElement xml) {
			try {
				load_status(xml);
				load_trickamt(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:EditTrickState':'EditTrickStateResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_status(xml);
				create_trickamt(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:EditTrickState':'EditTrickStateResponseType':\n" + e.getMessage(), e);
			}
		}
		public EditTrickStateResponseType(EditTrickStateResponseType copy) { load(copy); }
		public void load(EditTrickStateResponseType copy) {
			if (copy == null) return;
			this.status = copy.status;
			this.trickamt = copy.trickamt;
		}
		public EditTrickStateResponseType status(Integer status){ this.status = status; return this;}
		public EditTrickStateResponseType trickamt(Integer trickamt){ this.trickamt = trickamt; return this;}
		public EditTrickStateResponseType() {}
		public EditTrickStateResponseType(XMLElement xml) { this.load(xml); }
		public EditTrickStateResponseType(
			Integer status,
			Integer trickamt
			) {
			this.status = status;
			this.trickamt = trickamt;
		}
		// Additional
	} // class EditTrickStateResponseType
	
}
