/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public class GetAchievementsSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #sessionID} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetAchievementsRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String sessionID;
		
		protected void load_sessionID(XMLElement xml) {
			this.sessionID = parse(xml, "sessionID", "wse:GetAchievements", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_sessionID(XMLElement xml) {
			print(xml, "sessionID", "wse:GetAchievements", this.sessionID, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		public void load(XMLElement xml) {
			try {
				load_sessionID(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetAchievements':'GetAchievementsRequestType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_sessionID(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetAchievements':'GetAchievementsRequestType':\n" + e.getMessage(), e);
			}
		}
		public GetAchievementsRequestType(GetAchievementsRequestType copy) { load(copy); }
		public void load(GetAchievementsRequestType copy) {
			if (copy == null) return;
			this.sessionID = copy.sessionID;
		}
		public GetAchievementsRequestType sessionID(String sessionID){ this.sessionID = sessionID; return this;}
		public GetAchievementsRequestType() {}
		public GetAchievementsRequestType(XMLElement xml) { this.load(xml); }
		public GetAchievementsRequestType(
			String sessionID
			) {
			this.sessionID = sessionID;
		}
		// Additional
	} // class GetAchievementsRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #achievements} <ul><b>Type:</b> java.util.List&lt;wse.generated.definitions.Turbo_DBSchema.Achievement&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetAchievementsResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<wse.generated.definitions.Turbo_DBSchema.Achievement> achievements;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		
		protected void load_achievements(XMLElement xml) {
			this.achievements = parseComplexList(xml, "achievements", "wse:GetAchievements", wse.generated.definitions.Turbo_DBSchema.Achievement.class, 0, null);
		}
		protected void create_achievements(XMLElement xml) {
			printComplexList(xml, "achievements", "wse:GetAchievements", this.achievements, 0, null);
		}
		protected void load_status(XMLElement xml) {
			this.status = parse(xml, "status", "wse:GetAchievements", wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void create_status(XMLElement xml) {
			print(xml, "status", "wse:GetAchievements", this.status, wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		public void load(XMLElement xml) {
			try {
				load_achievements(xml);
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetAchievements':'GetAchievementsResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_achievements(xml);
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetAchievements':'GetAchievementsResponseType':\n" + e.getMessage(), e);
			}
		}
		public GetAchievementsResponseType(GetAchievementsResponseType copy) { load(copy); }
		public void load(GetAchievementsResponseType copy) {
			if (copy == null) return;
			this.achievements = copy.achievements;
			this.status = copy.status;
		}
		public GetAchievementsResponseType achievements(java.util.List<wse.generated.definitions.Turbo_DBSchema.Achievement> achievements){ this.achievements = achievements; return this;}
		public GetAchievementsResponseType status(Integer status){ this.status = status; return this;}
		public GetAchievementsResponseType() {}
		public GetAchievementsResponseType(XMLElement xml) { this.load(xml); }
		public GetAchievementsResponseType(
			java.util.List<wse.generated.definitions.Turbo_DBSchema.Achievement> achievements,
			Integer status
			) {
			this.achievements = achievements;
			this.status = status;
		}
		// Additional
	} // class GetAchievementsResponseType
	
}
