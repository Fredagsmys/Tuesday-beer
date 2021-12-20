/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public class AcceptFriendRequestSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #accepter} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #requester} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class AcceptFriendRequestRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String accepter;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String requester;
		
		protected void load_accepter(XMLElement xml) {
			this.accepter = parse(xml, "accepter", "wse:AcceptFriendRequest", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_accepter(XMLElement xml) {
			print(xml, "accepter", "wse:AcceptFriendRequest", this.accepter, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_requester(XMLElement xml) {
			this.requester = parse(xml, "requester", "wse:AcceptFriendRequest", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_requester(XMLElement xml) {
			print(xml, "requester", "wse:AcceptFriendRequest", this.requester, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		public void load(XMLElement xml) {
			try {
				load_accepter(xml);
				load_requester(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:AcceptFriendRequest':'AcceptFriendRequestRequestType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_accepter(xml);
				create_requester(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:AcceptFriendRequest':'AcceptFriendRequestRequestType':\n" + e.getMessage(), e);
			}
		}
		public AcceptFriendRequestRequestType(AcceptFriendRequestRequestType copy) { load(copy); }
		public void load(AcceptFriendRequestRequestType copy) {
			if (copy == null) return;
			this.accepter = copy.accepter;
			this.requester = copy.requester;
		}
		public AcceptFriendRequestRequestType accepter(String accepter){ this.accepter = accepter; return this;}
		public AcceptFriendRequestRequestType requester(String requester){ this.requester = requester; return this;}
		public AcceptFriendRequestRequestType() {}
		public AcceptFriendRequestRequestType(XMLElement xml) { this.load(xml); }
		public AcceptFriendRequestRequestType(
			String accepter,
			String requester
			) {
			this.accepter = accepter;
			this.requester = requester;
		}
		// Additional
	} // class AcceptFriendRequestRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class AcceptFriendRequestResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		
		protected void load_status(XMLElement xml) {
			this.status = parse(xml, "status", "wse:AcceptFriendRequest", wse.utils.types.xsd.xsd_int.class, true, null);
		}
		protected void create_status(XMLElement xml) {
			print(xml, "status", "wse:AcceptFriendRequest", this.status, wse.utils.types.xsd.xsd_int.class, true, null);
		}
		public void load(XMLElement xml) {
			try {
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:AcceptFriendRequest':'AcceptFriendRequestResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:AcceptFriendRequest':'AcceptFriendRequestResponseType':\n" + e.getMessage(), e);
			}
		}
		public AcceptFriendRequestResponseType(AcceptFriendRequestResponseType copy) { load(copy); }
		public void load(AcceptFriendRequestResponseType copy) {
			if (copy == null) return;
			this.status = copy.status;
		}
		public AcceptFriendRequestResponseType status(Integer status){ this.status = status; return this;}
		public AcceptFriendRequestResponseType() {}
		public AcceptFriendRequestResponseType(XMLElement xml) { this.load(xml); }
		public AcceptFriendRequestResponseType(
			Integer status
			) {
			this.status = status;
		}
		// Additional
	} // class AcceptFriendRequestResponseType
	
}
