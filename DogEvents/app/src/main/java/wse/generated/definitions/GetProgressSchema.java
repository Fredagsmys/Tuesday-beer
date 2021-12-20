/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public class GetProgressSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #sessionID} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetProgressRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String sessionID;
		
		protected void load_sessionID(XMLElement xml) {
			this.sessionID = parse(xml, "sessionID", "wse:GetProgress", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_sessionID(XMLElement xml) {
			print(xml, "sessionID", "wse:GetProgress", this.sessionID, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		public void load(XMLElement xml) {
			try {
				load_sessionID(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetProgress':'GetProgressRequestType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_sessionID(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetProgress':'GetProgressRequestType':\n" + e.getMessage(), e);
			}
		}
		public GetProgressRequestType(GetProgressRequestType copy) { load(copy); }
		public void load(GetProgressRequestType copy) {
			if (copy == null) return;
			this.sessionID = copy.sessionID;
		}
		public GetProgressRequestType sessionID(String sessionID){ this.sessionID = sessionID; return this;}
		public GetProgressRequestType() {}
		public GetProgressRequestType(XMLElement xml) { this.load(xml); }
		public GetProgressRequestType(
			String sessionID
			) {
			this.sessionID = sessionID;
		}
		// Additional
	} // class GetProgressRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #trickList} <ul><b>Type:</b> java.util.List&lt;wse.generated.definitions.Turbo_DBSchema.Trick&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetProgressResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<wse.generated.definitions.Turbo_DBSchema.Trick> trickList;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		
		protected void load_trickList(XMLElement xml) {
			this.trickList = parseComplexList(xml, "trickList", "wse:GetProgress", wse.generated.definitions.Turbo_DBSchema.Trick.class, 0, null);
		}
		protected void create_trickList(XMLElement xml) {
			printComplexList(xml, "trickList", "wse:GetProgress", this.trickList, 0, null);
		}
		protected void load_status(XMLElement xml) {
			this.status = parse(xml, "status", "wse:GetProgress", wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void create_status(XMLElement xml) {
			print(xml, "status", "wse:GetProgress", this.status, wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		public void load(XMLElement xml) {
			try {
				load_trickList(xml);
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetProgress':'GetProgressResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_trickList(xml);
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetProgress':'GetProgressResponseType':\n" + e.getMessage(), e);
			}
		}
		public GetProgressResponseType(GetProgressResponseType copy) { load(copy); }
		public void load(GetProgressResponseType copy) {
			if (copy == null) return;
			this.trickList = copy.trickList;
			this.status = copy.status;
		}
		public GetProgressResponseType trickList(java.util.List<wse.generated.definitions.Turbo_DBSchema.Trick> trickList){ this.trickList = trickList; return this;}
		public GetProgressResponseType status(Integer status){ this.status = status; return this;}
		public GetProgressResponseType() {}
		public GetProgressResponseType(XMLElement xml) { this.load(xml); }
		public GetProgressResponseType(
			java.util.List<wse.generated.definitions.Turbo_DBSchema.Trick> trickList,
			Integer status
			) {
			this.trickList = trickList;
			this.status = status;
		}
		// Additional
	} // class GetProgressResponseType
	
}
