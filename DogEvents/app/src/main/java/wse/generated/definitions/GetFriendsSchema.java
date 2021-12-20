/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public class GetFriendsSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #sessionID} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetFriendsRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String sessionID;
		
		protected void load_sessionID(XMLElement xml) {
			this.sessionID = parse(xml, "sessionID", "wse:GetFriends", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_sessionID(XMLElement xml) {
			print(xml, "sessionID", "wse:GetFriends", this.sessionID, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		public void load(XMLElement xml) {
			try {
				load_sessionID(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetFriends':'GetFriendsRequestType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_sessionID(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetFriends':'GetFriendsRequestType':\n" + e.getMessage(), e);
			}
		}
		public GetFriendsRequestType(GetFriendsRequestType copy) { load(copy); }
		public void load(GetFriendsRequestType copy) {
			if (copy == null) return;
			this.sessionID = copy.sessionID;
		}
		public GetFriendsRequestType sessionID(String sessionID){ this.sessionID = sessionID; return this;}
		public GetFriendsRequestType() {}
		public GetFriendsRequestType(XMLElement xml) { this.load(xml); }
		public GetFriendsRequestType(
			String sessionID
			) {
			this.sessionID = sessionID;
		}
		// Additional
	} // class GetFriendsRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #friends} <ul><b>Type:</b> java.util.List&lt;wse.generated.definitions.Turbo_DBSchema.Friend&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetFriendsResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<wse.generated.definitions.Turbo_DBSchema.Friend> friends;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		
		protected void load_friends(XMLElement xml) {
			this.friends = parseComplexList(xml, "friends", "wse:GetFriends", wse.generated.definitions.Turbo_DBSchema.Friend.class, 0, null);
		}
		protected void create_friends(XMLElement xml) {
			printComplexList(xml, "friends", "wse:GetFriends", this.friends, 0, null);
		}
		protected void load_status(XMLElement xml) {
			this.status = parse(xml, "status", "wse:GetFriends", wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void create_status(XMLElement xml) {
			print(xml, "status", "wse:GetFriends", this.status, wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		public void load(XMLElement xml) {
			try {
				load_friends(xml);
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetFriends':'GetFriendsResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_friends(xml);
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetFriends':'GetFriendsResponseType':\n" + e.getMessage(), e);
			}
		}
		public GetFriendsResponseType(GetFriendsResponseType copy) { load(copy); }
		public void load(GetFriendsResponseType copy) {
			if (copy == null) return;
			this.friends = copy.friends;
			this.status = copy.status;
		}
		public GetFriendsResponseType friends(java.util.List<wse.generated.definitions.Turbo_DBSchema.Friend> friends){ this.friends = friends; return this;}
		public GetFriendsResponseType status(Integer status){ this.status = status; return this;}
		public GetFriendsResponseType() {}
		public GetFriendsResponseType(XMLElement xml) { this.load(xml); }
		public GetFriendsResponseType(
			java.util.List<wse.generated.definitions.Turbo_DBSchema.Friend> friends,
			Integer status
			) {
			this.friends = friends;
			this.status = status;
		}
		// Additional
	} // class GetFriendsResponseType
	
}
