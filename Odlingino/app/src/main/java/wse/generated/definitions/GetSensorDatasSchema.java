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

public class GetSensorDatasSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #sensorID} <ul><b>Type:</b> java.util.List&lt;Integer&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * </ul>
	 */
	public static class GetSensorDatasRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<Integer> sensorID;
		
		protected void load_sensorID(IElement xml) {
			this.sensorID = parseList(xml, "sensorID", "wse:GetSensorDatas", wse.utils.types.xsd.xsd_int.class, 0, null);
		}
		protected void create_sensorID(IElement xml) {
			printList(xml, "sensorID", "wse:GetSensorDatas", this.sensorID, wse.utils.types.xsd.xsd_int.class, 0, null);
		}
		public void load(IElement xml) {
			try {
				load_sensorID(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetSensorDatas':'GetSensorDatasRequestType':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_sensorID(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetSensorDatas':'GetSensorDatasRequestType':\n" + e.getMessage(), e);
			}
		}
		public GetSensorDatasRequestType(GetSensorDatasRequestType copy) { load(copy); }
		public void load(GetSensorDatasRequestType copy) {
			if (copy == null) return;
			this.sensorID = copy.sensorID;
		}
		public GetSensorDatasRequestType sensorID(java.util.List<Integer> sensorID){ this.sensorID = sensorID; return this;}
		public GetSensorDatasRequestType() {}
		public GetSensorDatasRequestType(IElement xml) { this.load(xml); }
		public GetSensorDatasRequestType(
			java.util.List<Integer> sensorID
			) {
			this.sensorID = sensorID;
		}
		// Additional
	} // class GetSensorDatasRequestType
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
			this.value = parse(xml, "value", "wse:GetSensorDatas", wse.utils.types.xsd.xsd_double.class, true, null);
		}
		protected void create_value(IElement xml) {
			print(xml, "value", "wse:GetSensorDatas", this.value, wse.utils.types.xsd.xsd_double.class, true, null);
		}
		protected void load_sensorType(IElement xml) {
			this.sensorType = parse(xml, "sensorType", "wse:GetSensorDatas", wse.utils.types.xsd.xsd_int.class, true, null);
		}
		protected void create_sensorType(IElement xml) {
			print(xml, "sensorType", "wse:GetSensorDatas", this.sensorType, wse.utils.types.xsd.xsd_int.class, true, null);
		}
		protected void load_sensorID(IElement xml) {
			this.sensorID = parse(xml, "sensorID", "wse:GetSensorDatas", wse.utils.types.xsd.xsd_int.class, true, null);
		}
		protected void create_sensorID(IElement xml) {
			print(xml, "sensorID", "wse:GetSensorDatas", this.sensorID, wse.utils.types.xsd.xsd_int.class, true, null);
		}
		protected void load_timeStamp(IElement xml) {
			this.timeStamp = parse(xml, "timeStamp", "wse:GetSensorDatas", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_timeStamp(IElement xml) {
			print(xml, "timeStamp", "wse:GetSensorDatas", this.timeStamp, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		public void load(IElement xml) {
			try {
				load_value(xml);
				load_sensorType(xml);
				load_sensorID(xml);
				load_timeStamp(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetSensorDatas':'Data':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_value(xml);
				create_sensorType(xml);
				create_sensorID(xml);
				create_timeStamp(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetSensorDatas':'Data':\n" + e.getMessage(), e);
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
	 * 		{@link #data} <ul><b>Type:</b> java.util.List&lt;wse.generated.definitions.GetSensorDatasSchema.Data&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * </ul>
	 */
	public static class DataPacket extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<wse.generated.definitions.GetSensorDatasSchema.Data> data;
		
		protected void load_data(IElement xml) {
			this.data = parseComplexList(xml, "data", "wse:GetSensorDatas", wse.generated.definitions.GetSensorDatasSchema.Data.class, 0, null);
		}
		protected void create_data(IElement xml) {
			printComplexList(xml, "data", "wse:GetSensorDatas", this.data, 0, null);
		}
		public void load(IElement xml) {
			try {
				load_data(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetSensorDatas':'DataPacket':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_data(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetSensorDatas':'DataPacket':\n" + e.getMessage(), e);
			}
		}
		public DataPacket(DataPacket copy) { load(copy); }
		public void load(DataPacket copy) {
			if (copy == null) return;
			this.data = copy.data;
		}
		public DataPacket data(java.util.List<wse.generated.definitions.GetSensorDatasSchema.Data> data){ this.data = data; return this;}
		public DataPacket() {}
		public DataPacket(IElement xml) { this.load(xml); }
		public DataPacket(
			java.util.List<wse.generated.definitions.GetSensorDatasSchema.Data> data
			) {
			this.data = data;
		}
		// Additional
	} // class DataPacket
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #dataPackets} <ul><b>Type:</b> java.util.List&lt;wse.generated.definitions.GetSensorDatasSchema.DataPacket&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * </ul>
	 */
	public static class GetSensorDatasResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<wse.generated.definitions.GetSensorDatasSchema.DataPacket> dataPackets;
		
		protected void load_dataPackets(IElement xml) {
			this.dataPackets = parseComplexList(xml, "dataPackets", "wse:GetSensorDatas", wse.generated.definitions.GetSensorDatasSchema.DataPacket.class, 0, null);
		}
		protected void create_dataPackets(IElement xml) {
			printComplexList(xml, "dataPackets", "wse:GetSensorDatas", this.dataPackets, 0, null);
		}
		public void load(IElement xml) {
			try {
				load_dataPackets(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetSensorDatas':'GetSensorDatasResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_dataPackets(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetSensorDatas':'GetSensorDatasResponseType':\n" + e.getMessage(), e);
			}
		}
		public GetSensorDatasResponseType(GetSensorDatasResponseType copy) { load(copy); }
		public void load(GetSensorDatasResponseType copy) {
			if (copy == null) return;
			this.dataPackets = copy.dataPackets;
		}
		public GetSensorDatasResponseType dataPackets(java.util.List<wse.generated.definitions.GetSensorDatasSchema.DataPacket> dataPackets){ this.dataPackets = dataPackets; return this;}
		public GetSensorDatasResponseType() {}
		public GetSensorDatasResponseType(IElement xml) { this.load(xml); }
		public GetSensorDatasResponseType(
			java.util.List<wse.generated.definitions.GetSensorDatasSchema.DataPacket> dataPackets
			) {
			this.dataPackets = dataPackets;
		}
		// Additional
	} // class GetSensorDatasResponseType
	
}
