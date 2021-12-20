/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public class EditAchievementStateSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #achievement} <ul><b>Type:</b> wse.generated.definitions.Turbo_DBSchema.Achievement <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #sessionID} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class EditAchievementStateRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.Turbo_DBSchema.Achievement achievement;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String sessionID;
		
		protected void load_achievement(XMLElement xml) {
			this.achievement = parseComplex(xml, "achievement", "wse:EditAchievementState", wse.generated.definitions.Turbo_DBSchema.Achievement.class, true);
		}
		protected void create_achievement(XMLElement xml) {
			printComplex(xml, "achievement", "wse:EditAchievementState", this.achievement, true);
		}
		protected void load_sessionID(XMLElement xml) {
			this.sessionID = parse(xml, "sessionID", "wse:EditAchievementState", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_sessionID(XMLElement xml) {
			print(xml, "sessionID", "wse:EditAchievementState", this.sessionID, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		public void load(XMLElement xml) {
			try {
				load_achievement(xml);
				load_sessionID(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:EditAchievementState':'EditAchievementStateRequestType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_achievement(xml);
				create_sessionID(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:EditAchievementState':'EditAchievementStateRequestType':\n" + e.getMessage(), e);
			}
		}
		public EditAchievementStateRequestType(EditAchievementStateRequestType copy) { load(copy); }
		public void load(EditAchievementStateRequestType copy) {
			if (copy == null) return;
			this.achievement = copy.achievement;
			this.sessionID = copy.sessionID;
		}
		public EditAchievementStateRequestType achievement(wse.generated.definitions.Turbo_DBSchema.Achievement achievement){ this.achievement = achievement; return this;}
		public EditAchievementStateRequestType sessionID(String sessionID){ this.sessionID = sessionID; return this;}
		public EditAchievementStateRequestType() {}
		public EditAchievementStateRequestType(XMLElement xml) { this.load(xml); }
		public EditAchievementStateRequestType(
			wse.generated.definitions.Turbo_DBSchema.Achievement achievement,
			String sessionID
			) {
			this.achievement = achievement;
			this.sessionID = sessionID;
		}
		// Additional
	} // class EditAchievementStateRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class EditAchievementStateResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		
		protected void load_status(XMLElement xml) {
			this.status = parse(xml, "status", "wse:EditAchievementState", wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void create_status(XMLElement xml) {
			print(xml, "status", "wse:EditAchievementState", this.status, wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		public void load(XMLElement xml) {
			try {
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:EditAchievementState':'EditAchievementStateResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:EditAchievementState':'EditAchievementStateResponseType':\n" + e.getMessage(), e);
			}
		}
		public EditAchievementStateResponseType(EditAchievementStateResponseType copy) { load(copy); }
		public void load(EditAchievementStateResponseType copy) {
			if (copy == null) return;
			this.status = copy.status;
		}
		public EditAchievementStateResponseType status(Integer status){ this.status = status; return this;}
		public EditAchievementStateResponseType() {}
		public EditAchievementStateResponseType(XMLElement xml) { this.load(xml); }
		public EditAchievementStateResponseType(
			Integer status
			) {
			this.status = status;
		}
		// Additional
	} // class EditAchievementStateResponseType
	
}
