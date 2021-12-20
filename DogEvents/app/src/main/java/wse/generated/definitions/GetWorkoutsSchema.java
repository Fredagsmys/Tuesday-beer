/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public class GetWorkoutsSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #SessionID} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetWorkoutsRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String SessionID;
		
		protected void load_SessionID(XMLElement xml) {
			this.SessionID = parse(xml, "SessionID", "wse:GetWorkouts", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_SessionID(XMLElement xml) {
			print(xml, "SessionID", "wse:GetWorkouts", this.SessionID, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		public void load(XMLElement xml) {
			try {
				load_SessionID(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetWorkouts':'GetWorkoutsRequestType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_SessionID(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetWorkouts':'GetWorkoutsRequestType':\n" + e.getMessage(), e);
			}
		}
		public GetWorkoutsRequestType(GetWorkoutsRequestType copy) { load(copy); }
		public void load(GetWorkoutsRequestType copy) {
			if (copy == null) return;
			this.SessionID = copy.SessionID;
		}
		public GetWorkoutsRequestType SessionID(String SessionID){ this.SessionID = SessionID; return this;}
		public GetWorkoutsRequestType() {}
		public GetWorkoutsRequestType(XMLElement xml) { this.load(xml); }
		public GetWorkoutsRequestType(
			String SessionID
			) {
			this.SessionID = SessionID;
		}
		// Additional
	} // class GetWorkoutsRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #workouts} <ul><b>Type:</b> java.util.List&lt;wse.generated.definitions.Turbo_DBSchema.Workout&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetWorkoutsResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<wse.generated.definitions.Turbo_DBSchema.Workout> workouts;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		
		protected void load_workouts(XMLElement xml) {
			this.workouts = parseComplexList(xml, "workouts", "wse:GetWorkouts", wse.generated.definitions.Turbo_DBSchema.Workout.class, 0, null);
		}
		protected void create_workouts(XMLElement xml) {
			printComplexList(xml, "workouts", "wse:GetWorkouts", this.workouts, 0, null);
		}
		protected void load_status(XMLElement xml) {
			this.status = parse(xml, "status", "wse:GetWorkouts", wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void create_status(XMLElement xml) {
			print(xml, "status", "wse:GetWorkouts", this.status, wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		public void load(XMLElement xml) {
			try {
				load_workouts(xml);
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetWorkouts':'GetWorkoutsResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_workouts(xml);
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetWorkouts':'GetWorkoutsResponseType':\n" + e.getMessage(), e);
			}
		}
		public GetWorkoutsResponseType(GetWorkoutsResponseType copy) { load(copy); }
		public void load(GetWorkoutsResponseType copy) {
			if (copy == null) return;
			this.workouts = copy.workouts;
			this.status = copy.status;
		}
		public GetWorkoutsResponseType workouts(java.util.List<wse.generated.definitions.Turbo_DBSchema.Workout> workouts){ this.workouts = workouts; return this;}
		public GetWorkoutsResponseType status(Integer status){ this.status = status; return this;}
		public GetWorkoutsResponseType() {}
		public GetWorkoutsResponseType(XMLElement xml) { this.load(xml); }
		public GetWorkoutsResponseType(
			java.util.List<wse.generated.definitions.Turbo_DBSchema.Workout> workouts,
			Integer status
			) {
			this.workouts = workouts;
			this.status = status;
		}
		// Additional
	} // class GetWorkoutsResponseType
	
}
