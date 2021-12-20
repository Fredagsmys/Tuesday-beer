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

public class GetSensorIDsSchema {
	/**
	 */
	public static class GetSensorIDsRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		
		public void load(IElement xml) {
		}
		public void create(IElement xml) {
		}
		public GetSensorIDsRequestType(GetSensorIDsRequestType copy) { load(copy); }
		public void load(GetSensorIDsRequestType copy) {
			if (copy == null) return;
		}
		public GetSensorIDsRequestType(IElement xml) { this.load(xml); }
		public GetSensorIDsRequestType(
			) {
		}
		// Additional
	} // class GetSensorIDsRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #IDs} <ul><b>Type:</b> java.util.List&lt;Integer&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * </ul>
	 */
	public static class GetSensorIDsResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<Integer> IDs;
		
		protected void load_IDs(IElement xml) {
			this.IDs = parseList(xml, "IDs", "wse:GetSensorIDs", wse.utils.types.xsd.xsd_int.class, 0, null);
		}
		protected void create_IDs(IElement xml) {
			printList(xml, "IDs", "wse:GetSensorIDs", this.IDs, wse.utils.types.xsd.xsd_int.class, 0, null);
		}
		public void load(IElement xml) {
			try {
				load_IDs(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetSensorIDs':'GetSensorIDsResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_IDs(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetSensorIDs':'GetSensorIDsResponseType':\n" + e.getMessage(), e);
			}
		}
		public GetSensorIDsResponseType(GetSensorIDsResponseType copy) { load(copy); }
		public void load(GetSensorIDsResponseType copy) {
			if (copy == null) return;
			this.IDs = copy.IDs;
		}
		public GetSensorIDsResponseType IDs(java.util.List<Integer> IDs){ this.IDs = IDs; return this;}
		public GetSensorIDsResponseType() {}
		public GetSensorIDsResponseType(IElement xml) { this.load(xml); }
		public GetSensorIDsResponseType(
			java.util.List<Integer> IDs
			) {
			this.IDs = IDs;
		}
		// Additional
	} // class GetSensorIDsResponseType
	
}
