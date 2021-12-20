/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public class SaveWorkoutSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #SessionID} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #workout} <ul><b>Type:</b> wse.generated.definitions.Turbo_DBSchema.Workout <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class SaveWorkoutRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String SessionID;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.Turbo_DBSchema.Workout workout;
		
		protected void load_SessionID(XMLElement xml) {
			this.SessionID = parse(xml, "SessionID", "wse:SaveWorkout", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_SessionID(XMLElement xml) {
			print(xml, "SessionID", "wse:SaveWorkout", this.SessionID, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_workout(XMLElement xml) {
			this.workout = parseComplex(xml, "workout", "wse:SaveWorkout", wse.generated.definitions.Turbo_DBSchema.Workout.class, true);
		}
		protected void create_workout(XMLElement xml) {
			printComplex(xml, "workout", "wse:SaveWorkout", this.workout, true);
		}
		public void load(XMLElement xml) {
			try {
				load_SessionID(xml);
				load_workout(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:SaveWorkout':'SaveWorkoutRequestType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_SessionID(xml);
				create_workout(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:SaveWorkout':'SaveWorkoutRequestType':\n" + e.getMessage(), e);
			}
		}
		public SaveWorkoutRequestType(SaveWorkoutRequestType copy) { load(copy); }
		public void load(SaveWorkoutRequestType copy) {
			if (copy == null) return;
			this.SessionID = copy.SessionID;
			this.workout = copy.workout;
		}
		public SaveWorkoutRequestType SessionID(String SessionID){ this.SessionID = SessionID; return this;}
		public SaveWorkoutRequestType workout(wse.generated.definitions.Turbo_DBSchema.Workout workout){ this.workout = workout; return this;}
		public SaveWorkoutRequestType() {}
		public SaveWorkoutRequestType(XMLElement xml) { this.load(xml); }
		public SaveWorkoutRequestType(
			String SessionID,
			wse.generated.definitions.Turbo_DBSchema.Workout workout
			) {
			this.SessionID = SessionID;
			this.workout = workout;
		}
		// Additional
	} // class SaveWorkoutRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class SaveWorkoutResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		
		protected void load_status(XMLElement xml) {
			this.status = parse(xml, "status", "wse:SaveWorkout", wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void create_status(XMLElement xml) {
			print(xml, "status", "wse:SaveWorkout", this.status, wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		public void load(XMLElement xml) {
			try {
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:SaveWorkout':'SaveWorkoutResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:SaveWorkout':'SaveWorkoutResponseType':\n" + e.getMessage(), e);
			}
		}
		public SaveWorkoutResponseType(SaveWorkoutResponseType copy) { load(copy); }
		public void load(SaveWorkoutResponseType copy) {
			if (copy == null) return;
			this.status = copy.status;
		}
		public SaveWorkoutResponseType status(Integer status){ this.status = status; return this;}
		public SaveWorkoutResponseType() {}
		public SaveWorkoutResponseType(XMLElement xml) { this.load(xml); }
		public SaveWorkoutResponseType(
			Integer status
			) {
			this.status = status;
		}
		// Additional
	} // class SaveWorkoutResponseType
	
}
