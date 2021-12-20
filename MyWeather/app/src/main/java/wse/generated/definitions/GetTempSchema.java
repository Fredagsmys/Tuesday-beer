/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public class GetTempSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #city} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetTempRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String city;
		
		protected void load_city(XMLElement xml) {
			this.city = parse(xml, "city", "wse:GetTemp", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_city(XMLElement xml) {
			print(xml, "city", "wse:GetTemp", this.city, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		public void load(XMLElement xml) {
			try {
				load_city(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetTemp':'GetTempRequestType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_city(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetTemp':'GetTempRequestType':\n" + e.getMessage(), e);
			}
		}
		public GetTempRequestType(GetTempRequestType copy) { load(copy); }
		public void load(GetTempRequestType copy) {
			if (copy == null) return;
			this.city = copy.city;
		}
		public GetTempRequestType city(String city){ this.city = city; return this;}
		public GetTempRequestType() {}
		public GetTempRequestType(XMLElement xml) { this.load(xml); }
		public GetTempRequestType(
			String city
			) {
			this.city = city;
		}
		// Additional
	} // class GetTempRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #temp} <ul><b>Type:</b> java.util.List&lt;Integer&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * </ul>
	 */
	public static class TempList extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<Integer> temp;
		
		protected void load_temp(XMLElement xml) {
			this.temp = parseList(xml, "temp", "wse:GetTemp", wse.utils.types.xsd.xsd_int.class, 0, null);
		}
		protected void create_temp(XMLElement xml) {
			printList(xml, "temp", "wse:GetTemp", this.temp, wse.utils.types.xsd.xsd_int.class, 0, null);
		}
		public void load(XMLElement xml) {
			try {
				load_temp(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetTemp':'TempList':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_temp(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetTemp':'TempList':\n" + e.getMessage(), e);
			}
		}
		public TempList(TempList copy) { load(copy); }
		public void load(TempList copy) {
			if (copy == null) return;
			this.temp = copy.temp;
		}
		public TempList temp(java.util.List<Integer> temp){ this.temp = temp; return this;}
		public TempList() {}
		public TempList(XMLElement xml) { this.load(xml); }
		public TempList(
			java.util.List<Integer> temp
			) {
			this.temp = temp;
		}
		// Additional
	} // class TempList
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #maxTemp} <ul><b>Type:</b> wse.generated.definitions.GetTempSchema.TempList <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #minTemp} <ul><b>Type:</b> wse.generated.definitions.GetTempSchema.TempList <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetTempResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.GetTempSchema.TempList maxTemp;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.GetTempSchema.TempList minTemp;
		
		protected void load_maxTemp(XMLElement xml) {
			this.maxTemp = parseComplex(xml, "maxTemp", "wse:GetTemp", wse.generated.definitions.GetTempSchema.TempList.class, true);
		}
		protected void create_maxTemp(XMLElement xml) {
			printComplex(xml, "maxTemp", "wse:GetTemp", this.maxTemp, true);
		}
		protected void load_minTemp(XMLElement xml) {
			this.minTemp = parseComplex(xml, "minTemp", "wse:GetTemp", wse.generated.definitions.GetTempSchema.TempList.class, true);
		}
		protected void create_minTemp(XMLElement xml) {
			printComplex(xml, "minTemp", "wse:GetTemp", this.minTemp, true);
		}
		public void load(XMLElement xml) {
			try {
				load_maxTemp(xml);
				load_minTemp(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetTemp':'GetTempResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_maxTemp(xml);
				create_minTemp(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetTemp':'GetTempResponseType':\n" + e.getMessage(), e);
			}
		}
		public GetTempResponseType(GetTempResponseType copy) { load(copy); }
		public void load(GetTempResponseType copy) {
			if (copy == null) return;
			this.maxTemp = copy.maxTemp;
			this.minTemp = copy.minTemp;
		}
		public GetTempResponseType maxTemp(wse.generated.definitions.GetTempSchema.TempList maxTemp){ this.maxTemp = maxTemp; return this;}
		public GetTempResponseType minTemp(wse.generated.definitions.GetTempSchema.TempList minTemp){ this.minTemp = minTemp; return this;}
		public GetTempResponseType() {}
		public GetTempResponseType(XMLElement xml) { this.load(xml); }
		public GetTempResponseType(
			wse.generated.definitions.GetTempSchema.TempList maxTemp,
			wse.generated.definitions.GetTempSchema.TempList minTemp
			) {
			this.maxTemp = maxTemp;
			this.minTemp = minTemp;
		}
		// Additional
	} // class GetTempResponseType
	
}
