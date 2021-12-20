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

public class SendWaterCommandSchema {
	/**
	 */
	public static class SendWaterCommandRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		
		public void load(IElement xml) {
		}
		public void create(IElement xml) {
		}
		public SendWaterCommandRequestType(SendWaterCommandRequestType copy) { load(copy); }
		public void load(SendWaterCommandRequestType copy) {
			if (copy == null) return;
		}
		public SendWaterCommandRequestType(IElement xml) { this.load(xml); }
		public SendWaterCommandRequestType(
			) {
		}
		// Additional
	} // class SendWaterCommandRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class SendWaterCommandResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		
		protected void load_status(IElement xml) {
			this.status = parse(xml, "status", "wse:SendWaterCommand", wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void create_status(IElement xml) {
			print(xml, "status", "wse:SendWaterCommand", this.status, wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		public void load(IElement xml) {
			try {
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:SendWaterCommand':'SendWaterCommandResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:SendWaterCommand':'SendWaterCommandResponseType':\n" + e.getMessage(), e);
			}
		}
		public SendWaterCommandResponseType(SendWaterCommandResponseType copy) { load(copy); }
		public void load(SendWaterCommandResponseType copy) {
			if (copy == null) return;
			this.status = copy.status;
		}
		public SendWaterCommandResponseType status(Integer status){ this.status = status; return this;}
		public SendWaterCommandResponseType() {}
		public SendWaterCommandResponseType(IElement xml) { this.load(xml); }
		public SendWaterCommandResponseType(
			Integer status
			) {
			this.status = status;
		}
		// Additional
	} // class SendWaterCommandResponseType
	
}
