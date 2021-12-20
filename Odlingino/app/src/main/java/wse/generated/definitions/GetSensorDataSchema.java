/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 10 August 2021 17:00:42 +0200
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.internal.IElement;

public class GetSensorDataSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #sensorID} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #date} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetSensorDataRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer sensorID;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String date;
		
		protected void load_sensorID(IElement xml) {
			this.sensorID = parse(xml, "sensorID", "wse:GetSensorData", wse.utils.types.xsd.xsd_int.class, true, null);
		}
		protected void create_sensorID(IElement xml) {
			print(xml, "sensorID", "wse:GetSensorData", this.sensorID, wse.utils.types.xsd.xsd_int.class, true, null);
		}
		protected void load_date(IElement xml) {
			this.date = parse(xml, "date", "wse:GetSensorData", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_date(IElement xml) {
			print(xml, "date", "wse:GetSensorData", this.date, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		public void load(IElement xml) {
			try {
				load_sensorID(xml);
				load_date(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetSensorData':'GetSensorDataRequestType':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_sensorID(xml);
				create_date(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetSensorData':'GetSensorDataRequestType':\n" + e.getMessage(), e);
			}
		}
		public GetSensorDataRequestType(GetSensorDataRequestType copy) { load(copy); }
		public void load(GetSensorDataRequestType copy) {
			if (copy == null) return;
			this.sensorID = copy.sensorID;
			this.date = copy.date;
		}
		public GetSensorDataRequestType sensorID(Integer sensorID){ this.sensorID = sensorID; return this;}
		public GetSensorDataRequestType date(String date){ this.date = date; return this;}
		public GetSensorDataRequestType() {}
		public GetSensorDataRequestType(IElement xml) { this.load(xml); }
		public GetSensorDataRequestType(
			Integer sensorID,
			String date
			) {
			this.sensorID = sensorID;
			this.date = date;
		}
		// Additional
	} // class GetSensorDataRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #value} <ul><b>Type:</b> Double <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #sensorType} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #sensorID} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #timeStamp} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class Data extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Double value;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer sensorType;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer sensorID;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String timeStamp;
		
		protected void load_value(IElement xml) {
			this.value = parse(xml, "value", "wse:GetSensorData", wse.utils.types.xsd.xsd_double.class, true, null);
		}
		protected void create_value(IElement xml) {
			print(xml, "value", "wse:GetSensorData", this.value, wse.utils.types.xsd.xsd_double.class, true, null);
		}
		protected void load_sensorType(IElement xml) {
			this.sensorType = parse(xml, "sensorType", "wse:GetSensorData", wse.utils.types.xsd.xsd_int.class, true, null);
		}
		protected void create_sensorType(IElement xml) {
			print(xml, "sensorType", "wse:GetSensorData", this.sensorType, wse.utils.types.xsd.xsd_int.class, true, null);
		}
		protected void load_sensorID(IElement xml) {
			this.sensorID = parse(xml, "sensorID", "wse:GetSensorData", wse.utils.types.xsd.xsd_int.class, true, null);
		}
		protected void create_sensorID(IElement xml) {
			print(xml, "sensorID", "wse:GetSensorData", this.sensorID, wse.utils.types.xsd.xsd_int.class, true, null);
		}
		protected void load_timeStamp(IElement xml) {
			this.timeStamp = parse(xml, "timeStamp", "wse:GetSensorData", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_timeStamp(IElement xml) {
			print(xml, "timeStamp", "wse:GetSensorData", this.timeStamp, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		public void load(IElement xml) {
			try {
				load_value(xml);
				load_sensorType(xml);
				load_sensorID(xml);
				load_timeStamp(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetSensorData':'Data':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_value(xml);
				create_sensorType(xml);
				create_sensorID(xml);
				create_timeStamp(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetSensorData':'Data':\n" + e.getMessage(), e);
			}
		}
		public Data(Data copy) { load(copy); }
		public void load(Data copy) {
			if (copy == null) return;
			this.value = copy.value;
			this.sensorType = copy.sensorType;
			this.sensorID = copy.sensorID;
			this.timeStamp = copy.timeStamp;
		}
		public Data value(Double value){ this.value = value; return this;}
		public Data sensorType(Integer sensorType){ this.sensorType = sensorType; return this;}
		public Data sensorID(Integer sensorID){ this.sensorID = sensorID; return this;}
		public Data timeStamp(String timeStamp){ this.timeStamp = timeStamp; return this;}
		public Data() {}
		public Data(IElement xml) { this.load(xml); }
		public Data(
			Double value,
			Integer sensorType,
			Integer sensorID,
			String timeStamp
			) {
			this.value = value;
			this.sensorType = sensorType;
			this.sensorID = sensorID;
			this.timeStamp = timeStamp;
		}
		// Additional
	} // class Data
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #data} <ul><b>Type:</b> java.util.List&lt;wse.generated.definitions.GetSensorDataSchema.Data&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * </ul>
	 */
	public static class GetSensorDataResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<wse.generated.definitions.GetSensorDataSchema.Data> data;
		
		protected void load_data(IElement xml) {
			this.data = parseComplexList(xml, "data", "wse:GetSensorData", wse.generated.definitions.GetSensorDataSchema.Data.class, 0, null);
		}
		protected void create_data(IElement xml) {
			printComplexList(xml, "data", "wse:GetSensorData", this.data, 0, null);
		}
		public void load(IElement xml) {
			try {
				load_data(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetSensorData':'GetSensorDataResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_data(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetSensorData':'GetSensorDataResponseType':\n" + e.getMessage(), e);
			}
		}
		public GetSensorDataResponseType(GetSensorDataResponseType copy) { load(copy); }
		public void load(GetSensorDataResponseType copy) {
			if (copy == null) return;
			this.data = copy.data;
		}
		public GetSensorDataResponseType data(java.util.List<wse.generated.definitions.GetSensorDataSchema.Data> data){ this.data = data; return this;}
		public GetSensorDataResponseType() {}
		public GetSensorDataResponseType(IElement xml) { this.load(xml); }
		public GetSensorDataResponseType(
			java.util.List<wse.generated.definitions.GetSensorDataSchema.Data> data
			) {
			this.data = data;
		}
		// Additional
	} // class GetSensorDataResponseType
	
}
