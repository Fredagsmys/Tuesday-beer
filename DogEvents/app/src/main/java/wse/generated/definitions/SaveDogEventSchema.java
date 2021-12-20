/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public class SaveDogEventSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #username} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #event} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #time} <ul><b>Type:</b> Long <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class SaveDogEventRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String username;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String event;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Long time;
		
		protected void load_username(XMLElement xml) {
			this.username = parse(xml, "username", "wse:SaveDogEvent", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_username(XMLElement xml) {
			print(xml, "username", "wse:SaveDogEvent", this.username, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_event(XMLElement xml) {
			this.event = parse(xml, "event", "wse:SaveDogEvent", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_event(XMLElement xml) {
			print(xml, "event", "wse:SaveDogEvent", this.event, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_time(XMLElement xml) {
			this.time = parse(xml, "time", "wse:SaveDogEvent", wse.utils.types.xsd.xsd_long.class, true, null);
		}
		protected void create_time(XMLElement xml) {
			print(xml, "time", "wse:SaveDogEvent", this.time, wse.utils.types.xsd.xsd_long.class, true, null);
		}
		public void load(XMLElement xml) {
			try {
				load_username(xml);
				load_event(xml);
				load_time(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:SaveDogEvent':'SaveDogEventRequestType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_username(xml);
				create_event(xml);
				create_time(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:SaveDogEvent':'SaveDogEventRequestType':\n" + e.getMessage(), e);
			}
		}
		public SaveDogEventRequestType(SaveDogEventRequestType copy) { load(copy); }
		public void load(SaveDogEventRequestType copy) {
			if (copy == null) return;
			this.username = copy.username;
			this.event = copy.event;
			this.time = copy.time;
		}
		public SaveDogEventRequestType username(String username){ this.username = username; return this;}
		public SaveDogEventRequestType event(String event){ this.event = event; return this;}
		public SaveDogEventRequestType time(Long time){ this.time = time; return this;}
		public SaveDogEventRequestType() {}
		public SaveDogEventRequestType(XMLElement xml) { this.load(xml); }
		public SaveDogEventRequestType(
			String username,
			String event,
			Long time
			) {
			this.username = username;
			this.event = event;
			this.time = time;
		}
		// Additional
	} // class SaveDogEventRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class SaveDogEventResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		
		protected void load_status(XMLElement xml) {
			this.status = parse(xml, "status", "wse:SaveDogEvent", wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void create_status(XMLElement xml) {
			print(xml, "status", "wse:SaveDogEvent", this.status, wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		public void load(XMLElement xml) {
			try {
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:SaveDogEvent':'SaveDogEventResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:SaveDogEvent':'SaveDogEventResponseType':\n" + e.getMessage(), e);
			}
		}
		public SaveDogEventResponseType(SaveDogEventResponseType copy) { load(copy); }
		public void load(SaveDogEventResponseType copy) {
			if (copy == null) return;
			this.status = copy.status;
		}
		public SaveDogEventResponseType status(Integer status){ this.status = status; return this;}
		public SaveDogEventResponseType() {}
		public SaveDogEventResponseType(XMLElement xml) { this.load(xml); }
		public SaveDogEventResponseType(
			Integer status
			) {
			this.status = status;
		}
		// Additional
	} // class SaveDogEventResponseType
	
}
