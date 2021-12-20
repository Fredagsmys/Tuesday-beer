/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public class GetDogEventsSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #dogAccount} <ul><b>Type:</b> wse.generated.definitions.Turbo_DBSchema.DogAccount <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetDogEventsRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.Turbo_DBSchema.DogAccount dogAccount;
		
		protected void load_dogAccount(XMLElement xml) {
			this.dogAccount = parseComplex(xml, "dogAccount", "wse:GetDogEvents", wse.generated.definitions.Turbo_DBSchema.DogAccount.class, true);
		}
		protected void create_dogAccount(XMLElement xml) {
			printComplex(xml, "dogAccount", "wse:GetDogEvents", this.dogAccount, true);
		}
		public void load(XMLElement xml) {
			try {
				load_dogAccount(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetDogEvents':'GetDogEventsRequestType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_dogAccount(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetDogEvents':'GetDogEventsRequestType':\n" + e.getMessage(), e);
			}
		}
		public GetDogEventsRequestType(GetDogEventsRequestType copy) { load(copy); }
		public void load(GetDogEventsRequestType copy) {
			if (copy == null) return;
			this.dogAccount = copy.dogAccount;
		}
		public GetDogEventsRequestType dogAccount(wse.generated.definitions.Turbo_DBSchema.DogAccount dogAccount){ this.dogAccount = dogAccount; return this;}
		public GetDogEventsRequestType() {}
		public GetDogEventsRequestType(XMLElement xml) { this.load(xml); }
		public GetDogEventsRequestType(
			wse.generated.definitions.Turbo_DBSchema.DogAccount dogAccount
			) {
			this.dogAccount = dogAccount;
		}
		// Additional
	} // class GetDogEventsRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #events} <ul><b>Type:</b> java.util.List&lt;wse.generated.definitions.Turbo_DBSchema.DogEvent&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetDogEventsResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<wse.generated.definitions.Turbo_DBSchema.DogEvent> events;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		
		protected void load_events(XMLElement xml) {
			this.events = parseComplexList(xml, "events", "wse:GetDogEvents", wse.generated.definitions.Turbo_DBSchema.DogEvent.class, 0, null);
		}
		protected void create_events(XMLElement xml) {
			printComplexList(xml, "events", "wse:GetDogEvents", this.events, 0, null);
		}
		protected void load_status(XMLElement xml) {
			this.status = parse(xml, "status", "wse:GetDogEvents", wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void create_status(XMLElement xml) {
			print(xml, "status", "wse:GetDogEvents", this.status, wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		public void load(XMLElement xml) {
			try {
				load_events(xml);
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetDogEvents':'GetDogEventsResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_events(xml);
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetDogEvents':'GetDogEventsResponseType':\n" + e.getMessage(), e);
			}
		}
		public GetDogEventsResponseType(GetDogEventsResponseType copy) { load(copy); }
		public void load(GetDogEventsResponseType copy) {
			if (copy == null) return;
			this.events = copy.events;
			this.status = copy.status;
		}
		public GetDogEventsResponseType events(java.util.List<wse.generated.definitions.Turbo_DBSchema.DogEvent> events){ this.events = events; return this;}
		public GetDogEventsResponseType status(Integer status){ this.status = status; return this;}
		public GetDogEventsResponseType() {}
		public GetDogEventsResponseType(XMLElement xml) { this.load(xml); }
		public GetDogEventsResponseType(
			java.util.List<wse.generated.definitions.Turbo_DBSchema.DogEvent> events,
			Integer status
			) {
			this.events = events;
			this.status = status;
		}
		// Additional
	} // class GetDogEventsResponseType
	
}
