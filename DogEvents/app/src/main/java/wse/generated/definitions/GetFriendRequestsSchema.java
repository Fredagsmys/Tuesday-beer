/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public class GetFriendRequestsSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #sessionID} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetFriendRequestsRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String sessionID;
		
		protected void load_sessionID(XMLElement xml) {
			this.sessionID = parse(xml, "sessionID", "wse:GetFriendRequests", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_sessionID(XMLElement xml) {
			print(xml, "sessionID", "wse:GetFriendRequests", this.sessionID, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		public void load(XMLElement xml) {
			try {
				load_sessionID(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetFriendRequests':'GetFriendRequestsRequestType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_sessionID(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetFriendRequests':'GetFriendRequestsRequestType':\n" + e.getMessage(), e);
			}
		}
		public GetFriendRequestsRequestType(GetFriendRequestsRequestType copy) { load(copy); }
		public void load(GetFriendRequestsRequestType copy) {
			if (copy == null) return;
			this.sessionID = copy.sessionID;
		}
		public GetFriendRequestsRequestType sessionID(String sessionID){ this.sessionID = sessionID; return this;}
		public GetFriendRequestsRequestType() {}
		public GetFriendRequestsRequestType(XMLElement xml) { this.load(xml); }
		public GetFriendRequestsRequestType(
			String sessionID
			) {
			this.sessionID = sessionID;
		}
		// Additional
	} // class GetFriendRequestsRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #users} <ul><b>Type:</b> java.util.List&lt;String&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * </ul>
	 */
	public static class GetFriendRequestsResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<String> users;
		
		protected void load_status(XMLElement xml) {
			this.status = parse(xml, "status", "wse:GetFriendRequests", wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void create_status(XMLElement xml) {
			print(xml, "status", "wse:GetFriendRequests", this.status, wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void load_users(XMLElement xml) {
			this.users = parseList(xml, "users", "wse:GetFriendRequests", wse.utils.types.xsd.xsd_string.class, 0, null);
		}
		protected void create_users(XMLElement xml) {
			printList(xml, "users", "wse:GetFriendRequests", this.users, wse.utils.types.xsd.xsd_string.class, 0, null);
		}
		public void load(XMLElement xml) {
			try {
				load_status(xml);
				load_users(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetFriendRequests':'GetFriendRequestsResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_status(xml);
				create_users(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetFriendRequests':'GetFriendRequestsResponseType':\n" + e.getMessage(), e);
			}
		}
		public GetFriendRequestsResponseType(GetFriendRequestsResponseType copy) { load(copy); }
		public void load(GetFriendRequestsResponseType copy) {
			if (copy == null) return;
			this.status = copy.status;
			this.users = copy.users;
		}
		public GetFriendRequestsResponseType status(Integer status){ this.status = status; return this;}
		public GetFriendRequestsResponseType users(java.util.List<String> users){ this.users = users; return this;}
		public GetFriendRequestsResponseType() {}
		public GetFriendRequestsResponseType(XMLElement xml) { this.load(xml); }
		public GetFriendRequestsResponseType(
			Integer status,
			java.util.List<String> users
			) {
			this.status = status;
			this.users = users;
		}
		// Additional
	} // class GetFriendRequestsResponseType
	
}
