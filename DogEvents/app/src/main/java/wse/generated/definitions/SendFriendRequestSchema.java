/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public class SendFriendRequestSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #requester} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #reciever} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class SendFriendRequestRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String requester;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String reciever;
		
		protected void load_requester(XMLElement xml) {
			this.requester = parse(xml, "requester", "wse:SendFriendRequest", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_requester(XMLElement xml) {
			print(xml, "requester", "wse:SendFriendRequest", this.requester, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_reciever(XMLElement xml) {
			this.reciever = parse(xml, "reciever", "wse:SendFriendRequest", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_reciever(XMLElement xml) {
			print(xml, "reciever", "wse:SendFriendRequest", this.reciever, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		public void load(XMLElement xml) {
			try {
				load_requester(xml);
				load_reciever(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:SendFriendRequest':'SendFriendRequestRequestType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_requester(xml);
				create_reciever(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:SendFriendRequest':'SendFriendRequestRequestType':\n" + e.getMessage(), e);
			}
		}
		public SendFriendRequestRequestType(SendFriendRequestRequestType copy) { load(copy); }
		public void load(SendFriendRequestRequestType copy) {
			if (copy == null) return;
			this.requester = copy.requester;
			this.reciever = copy.reciever;
		}
		public SendFriendRequestRequestType requester(String requester){ this.requester = requester; return this;}
		public SendFriendRequestRequestType reciever(String reciever){ this.reciever = reciever; return this;}
		public SendFriendRequestRequestType() {}
		public SendFriendRequestRequestType(XMLElement xml) { this.load(xml); }
		public SendFriendRequestRequestType(
			String requester,
			String reciever
			) {
			this.requester = requester;
			this.reciever = reciever;
		}
		// Additional
	} // class SendFriendRequestRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class SendFriendRequestResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		
		protected void load_status(XMLElement xml) {
			this.status = parse(xml, "status", "wse:SendFriendRequest", wse.utils.types.xsd.xsd_int.class, true, null);
		}
		protected void create_status(XMLElement xml) {
			print(xml, "status", "wse:SendFriendRequest", this.status, wse.utils.types.xsd.xsd_int.class, true, null);
		}
		public void load(XMLElement xml) {
			try {
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:SendFriendRequest':'SendFriendRequestResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:SendFriendRequest':'SendFriendRequestResponseType':\n" + e.getMessage(), e);
			}
		}
		public SendFriendRequestResponseType(SendFriendRequestResponseType copy) { load(copy); }
		public void load(SendFriendRequestResponseType copy) {
			if (copy == null) return;
			this.status = copy.status;
		}
		public SendFriendRequestResponseType status(Integer status){ this.status = status; return this;}
		public SendFriendRequestResponseType() {}
		public SendFriendRequestResponseType(XMLElement xml) { this.load(xml); }
		public SendFriendRequestResponseType(
			Integer status
			) {
			this.status = status;
		}
		// Additional
	} // class SendFriendRequestResponseType
	
}
